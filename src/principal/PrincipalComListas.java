package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2020);

         ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item);
            if(item instanceof Filme filme){
            System.out.println("Classificação: " + filme.getClassificacao());}
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();

        buscarPorArtista.add("Marco");
        buscarPorArtista.add("Jenifer");
        buscarPorArtista.add("Ana");
        System.out.println(buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }


}
