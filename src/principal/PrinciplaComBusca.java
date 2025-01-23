package principal;


import modelos.Titulo;
import modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrinciplaComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);

    String buscar = ler.next();

    String endereco = "https://www.omdbapi.com/?t=" + buscar + "&apikey=6cacc42";

        HttpClient client = HttpClient.newHttpClient();
   HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(endereco))
         .build();

    HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString()); 
    
    String json = response.body();

    System.out.println(json);

    Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create();

    
    TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
    System.out.println(meuTituloOmdb);
    Titulo meuTitulo = new Titulo(meuTituloOmdb);
    System.out.println(meuTitulo);


    }
    
}
