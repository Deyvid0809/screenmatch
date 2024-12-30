package atividade;

public class Livro {

    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Autor: " + getAutor());
        System.out.println("Livro: " + getTitulo()); 
    }
    
}
