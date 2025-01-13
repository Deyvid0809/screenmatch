package atividade3;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();

        lista.add("Baleia");
        lista.add("Macaco");
        lista.add("Leão");

        for (Object item : lista) {
            System.out.println(item);
        }

    }
}
