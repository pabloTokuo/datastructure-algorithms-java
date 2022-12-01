package application;

import datastructure.vector.Vector;

public class Program4 {
    public static void main(String[] args) {

        Vector vect = new Vector(10);

        vect.adiciona("elemento 1");
        vect.adiciona("elemento 2");
        vect.adiciona("elemento 3");

        System.out.println(vect.tamanho());
        System.out.println(vect);


    }
}
