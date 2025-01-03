import calculo.CalculadoraDeTempo;
import modelos.Filme;
import modelos.Serie;
public class Principal {
    public static void main(String[] args) {
        
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Toal de avaliações:" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2020);
        lost.exibiFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisódio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        

    }
}
