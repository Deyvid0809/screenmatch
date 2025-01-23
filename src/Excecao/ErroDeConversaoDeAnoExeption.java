package Excecao;

public class ErroDeConversaoDeAnoExeption extends RuntimeException {

    private String mensagem;

    public ErroDeConversaoDeAnoExeption(String mnesagem) {
        this.mensagem = mnesagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

    

}
