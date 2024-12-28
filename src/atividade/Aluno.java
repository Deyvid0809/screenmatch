package atividade;

public class Aluno {

    private String nome;
    private int nota;
    private int quantidadeMedia;
    private int media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public int getQuantidadeMedia() {
        return quantidadeMedia;
    }

    

    

    public void setQuantidadeMedia(int quantidadeMedia){

        this.quantidadeMedia = quantidadeMedia;
    }



    public int calcularMedia(){
        media = nota/quantidadeMedia;
        return media;
    }

    public void exibirFichaDoAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());
    }
    
}
