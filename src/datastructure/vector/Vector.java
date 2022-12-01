package datastructure.vector;

import java.util.Arrays;

public class Vector {

    private String[] elementos;
    private int tamanho;

    public Vector(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
        Primeiro método pouco eficiente, não esta dando o tamanho real do vetor e sem tratamento de excecoes

        public void adiciona(String elemento) {
        for (int i=0; i<elemento.length(); i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }
    */

    /*
        Segundo método eficiente com tratamento de Exception, mas ainda não é o ideal

        public void adiciona(String elemento) throws Exception {
        if (tamanho < elementos.length) {
            elementos[tamanho] =  elemento;
            tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }*/

//    Metodo com booleano, caso adicionar retorna true, e caso n adicionar retorna falso, assim sabendo que o vetor não tem tamanho suficiente
//    para adicionar mais elementos
    public boolean adiciona(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] =  elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i=0; i<tamanho-1; i++) {
            sb.append(elementos[i]);
            sb.append(", ");
        }

        if (tamanho>0) {
            sb.append(elementos[tamanho-1]);
        }
        sb.append("]");

        return sb.toString();
    }
}
