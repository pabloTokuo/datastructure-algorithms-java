package application;

import datastructure.vector.Vector;

public class Program5 {
    public static void main(String[] args) {


        Vector vect = new Vector(10);

        vect.adiciona("elemento 1");
        vect.adiciona("elemento 2");
        vect.adiciona("elemento 3");

        System.out.println(vect.busca(15));

    }
}
