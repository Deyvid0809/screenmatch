package atividade4;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class PesquisaLivro {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome do livro:");
        String buscarLivro = ler.next();
        System.out.println("Nome do Autor:");
        String buscarAutor = ler.next();

        String busca = "https://www.googleapis.com/books/v1/volumes?q=" + buscarLivro + "+inauthor:" + buscarAutor + "&AIzaSyAalqF0CBvuIc1OiscsNDvE-graMq3Mro4";

         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(busca))
         .build();

         HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
