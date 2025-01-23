package atividade4;

public class Tituloa implements Comparable<Tituloa> {

    private String nome;



    public String getNome() {
        return nome;
    }

    

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Tituloa outroNome) {
        
        return this.getNome().compareTo(outroNome.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome();
    }

    
    
    
}
