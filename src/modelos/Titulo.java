package modelos;

import com.google.gson.annotations.SerializedName;

import Excecao.ErroDeConversaoDeAnoExeption;

public class Titulo implements Comparable<Titulo> {

    
    

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo() {
        // Construtor sem argumentos necessário para o Gson funcionar
    }

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibiFichaTecnica(){

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

    }

    public void avalia(double  nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(Titulo:" + nome + " AnoDeLancamento:" + anoDeLancamento + " Duração:" + duracaoEmMinutos + ")";
    }

            
                public Titulo(TituloOmdb meuTituloOmdb) {
                    this.nome = meuTituloOmdb.title();
                    if(meuTituloOmdb.year().length() > 4){
                        throw new ErroDeConversaoDeAnoExeption("Não consegui converter o ano, porque tem mais de 4 caracteris.");
                    }
                    this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year().substring(0,4));
                    this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    
}
