package atividade;

public class ContaBancaria {
    
    private int numeroDaConta;
    private double saldo;
    public String titular;

    public void getNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void getSaldo(double saldo){
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Conta: " + numeroDaConta);
    }


}
