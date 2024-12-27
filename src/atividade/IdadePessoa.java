package atividade;

public class IdadePessoa {
    
    private String nome;
    private int idade;
    private String resultado;

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    

    
    public String verificacaoIdade(){
        if (idade >= 18) {

            resultado = "Verdade";
            return resultado;
            
        }else{
            resultado = "Falso";
            return resultado;
        }


    }
    

}
