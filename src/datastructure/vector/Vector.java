package datastructure.vector;

import java.util.Arrays;

public class Vector {

    private Integer[] elementos;

    public Vector(int capacidade) {
        this.elementos = new Integer[capacidade];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
