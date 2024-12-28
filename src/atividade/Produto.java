package atividade;

public class Produto {

    private String nome;
    private double preco;
    private double desconto;
    private double valorDesconto;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
}
    public void setDesconto(int desconto){
        this.desconto = desconto;
    }

    public void calcularDesconto(){
        valorDesconto = preco - preco * (desconto/100);

        System.out.println("Prudto: " + nome);
        System.out.println("Produto valor original: " + preco);
        System.out.println("Produto com desconto de 20%: " + valorDesconto);


    }
    
}
