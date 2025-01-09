package principal;
import calculo.CalculadoraDeTempo;
import calculo.FiltroRecomendacao;
import java.util.ArrayList;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;
public class Principal {
    public static void main(String[] args) {
        
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Toal de avaliações:" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2020);
        lost.exibiFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisódio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalvisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);

        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDFilmes = new ArrayList<>();

        listaDFilmes.add(filmeDoPaulo);
        listaDFilmes.add(meuFilme);
        listaDFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDFilmes.size());
        System.out.println("Primeiro filme: " + listaDFilmes.get(0).getNome());
        System.out.println(listaDFilmes);
        System.out.println("toString do filme:" + listaDFilmes.get(0).toString());

        

    }
}
