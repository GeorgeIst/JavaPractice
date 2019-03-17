package project.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sortareArray(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < (lista.length - i - 1); j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        return lista;
    }


}
