package atividade;

public class Teste {
    
    public static void main(String[] args) {
        
        /*Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). 
        Implemente métodos getters e setters para os atributos privados. */

        ContaBancaria conta = new ContaBancaria();

        conta.getNumeroDaConta(1210);
        conta.getSaldo(130.0);
        conta.titular = "Davi F.";

        conta.exibirConta();


        /*Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar 
        e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não. */


        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setIdade(17);
        pessoa.setNome("Davi F.");

        System.out.println("Maior de idade:" + pessoa.verificacaoIdade());


        

    }

}
