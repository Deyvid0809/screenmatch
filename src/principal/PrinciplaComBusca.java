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
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import org.ietf.jgss.GSSContext;

public class PrinciplaComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        String buscar = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

        while (!buscar.equalsIgnoreCase("sair")) {
            
            System.out.println("Digite um Filme:");
            buscar = ler.next();
            

            if(buscar.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + buscar + "&apikey=6cacc42";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

            HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString()); 
    
            String json = response.body();

            System.out.println(json);

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Meu titulo é:");
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);
                } 
            catch(NumberFormatException e){
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            }
}       
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("listaDeFilmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizo corretamente!");
    


    }
    
}
