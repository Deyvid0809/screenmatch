package modelos;

import calculo.Classificavel;

public class Episodio implements Classificavel {
    
    private int numero;
    private String nome;
    private Serie serie;
    private int totalvisualizacoes;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalvisualizacoes() {
        return totalvisualizacoes;
    }

    public void setTotalvisualizacoes(int totalvisualizacoes) {
        this.totalvisualizacoes = totalvisualizacoes;
    }



    @Override
    public int getClassificacao() {
        if(totalvisualizacoes > 100){
            return 4;
        }else{
            return 2;
        }
        
    }
    

}
