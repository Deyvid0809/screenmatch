package atividade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        
        Tituloa titulo = new Tituloa();

        titulo.setNome("Argos");
        
        Tituloa titulo1 = new Tituloa();

        titulo1.setNome("Vitor");

        Tituloa titulo2 = new Tituloa();

        titulo2.setNome("Ana");

        ArrayList<Tituloa> listaDTitulos = new ArrayList<>();

        listaDTitulos.add(titulo);
        listaDTitulos.add(titulo1);
        listaDTitulos.add(titulo2);

        System.out.println(listaDTitulos);

        Collections.sort(listaDTitulos);

        System.out.println(listaDTitulos);

        
        List<String> listaPolimorfica;

        listaPolimorfica = new LinkedList<>();
        
        listaPolimorfica.add("Pão");
        listaPolimorfica.add("Manteiga");
        listaPolimorfica.add("Mortandela");

        System.out.println("LinkedList:" + listaPolimorfica);

        listaPolimorfica = new ArrayList<>();

        listaPolimorfica.add("Pão1");
        listaPolimorfica.add("Manteiga1");
        listaPolimorfica.add("Mortandela1");

        
        System.out.println("ArrayList:" + listaPolimorfica);
        

    }
}
