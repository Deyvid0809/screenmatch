package atividade;

import java.util.Scanner;

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

        /*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar 
        e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto. */

        Produto loja = new Produto();

        loja.setNome("Celular");
        loja.setPreco(2500);
        loja.setDesconto(20);
        loja.calcularDesconto();
        
        /*Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar
         e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno. */

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        int quantidadeMedia = 0;
        int mediaNota = 0;
        String alunoNome = "";

        Aluno aluno = new Aluno();

        while (opcao != 4) {
            
        System.out.println("Opções: 1 - Nome do aluno 2 - Nota 3 - Dados do aluno 4 - Sair:");
        opcao = leitura.nextInt();
        
        switch (opcao) {
            case 1 -> 
                {
                System.out.println("Digite o nome do aluno:");
                leitura.nextLine();
                alunoNome = leitura.nextLine();
                aluno.setNome(alunoNome);
                
                }
            case 2 -> 
                {
                System.out.println("Digite a nota para calculo da média:");
                int nota = leitura.nextInt();
                mediaNota += nota;
                quantidadeMedia ++;
                aluno.setNota(mediaNota);
                aluno.setQuantidadeMedia(quantidadeMedia);

                break;
                }
            case 3 ->
                {
                aluno.exibirFichaDoAluno();
                break;
                }
            case 4 -> 
                {
                System.out.println("Obrigado por utilizar nossos serviços!!");
                break;
                }  
        
        }
        }
    leitura.close();


    /*Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters 
    para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro. */

        Livro livro = new Livro();

        livro.setAutor("Ricardo");
        livro.setTitulo("Achado inesperado");

        livro.exibirDetalhes();

    }

}
