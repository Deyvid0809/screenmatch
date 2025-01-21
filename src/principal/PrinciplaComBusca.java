package principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

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
    
    System.out.println(response.body());

    }
    
}
