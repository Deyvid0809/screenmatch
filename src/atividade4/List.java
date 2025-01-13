package atividade4;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(70);
        numeros.add(29);
        numeros.add(58);

        System.out.println("Lista:" + numeros);

        Collections.sort(numeros);

        System.out.println("Lista ordenada:" + numeros);

    }
}
