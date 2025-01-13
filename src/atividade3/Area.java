package atividade3;

import java.util.ArrayList;

public class Area {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 10;

        Quadrado quadrado = new Quadrado();

        quadrado.lado = 5;

        ArrayList<Forma> listDeForma = new ArrayList<>();

        listDeForma.add(circulo);
        listDeForma.add(quadrado);

        for (Forma forma : listDeForma) {
            System.out.println("Área:" + forma.calcularArea());
        }

    }
    
}
