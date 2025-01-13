package atividade3;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        
        Animal animal = new Cachorro();

        animal.setNome("Cachorro");
        animal.setIdade(5);

        

        

        if(animal instanceof Cachorro)
        {Cachorro cachorro = (Cachorro) animal;}
        else{
            System.out.println("Não");
        }
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        produto1.setPreco(10);
        produto2.setPreco(5);
        produto3.setPreco(5);
        produto4.setPreco(5);

        ArrayList<Produto> listDeProdutos = new ArrayList<>();

        listDeProdutos.add(produto1);
        listDeProdutos.add(produto2);
        listDeProdutos.add(produto3);
        listDeProdutos.add(produto4);


        double valor = 0;

        for (Produto itens : listDeProdutos) {
            valor += itens.getPreco();
            

        }

        double media = valor/listDeProdutos.size();
        System.out.println(media);



        ContaBancaria conta1 = new ContaBancaria(50, 19.00);
        ContaBancaria conta2 = new ContaBancaria(60, 15.00);
        ContaBancaria conta3 = new ContaBancaria(80, 1000.00);
        ContaBancaria conta4 = new ContaBancaria(90, 100.00);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);


        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        for (ContaBancaria conta : listaContas) {
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());


    }
}
