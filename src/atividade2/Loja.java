package atividade2;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Bala", 0.20, 1);
        
        Produto produto2 = new Produto("Refri", 5.00, 1);
        

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println(listaDeProdutos);

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Maça", 2.00, 1, "20/01/25");

        ArrayList<ProdutoPerecivel> listaPerecivel = new ArrayList<>();

        listaPerecivel.add(produtoPerecivel1);
        System.out.println(listaPerecivel);



    }
}
