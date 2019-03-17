package project.kLargestElements;


import project.bubbleSort.BubbleSort;

import java.util.Arrays;

public class KLargestElements {
    public static void main(String[] args) {

        int[] listaNumere = new int[]{100, 4, 17, 7, 25, 3, 13};
        int max;

        BubbleSort sort = new BubbleSort();
        int[] array = sort.sortareArray(listaNumere);
        System.out.println(Arrays.toString(listaNumere));



        int k =3;
        for(int i = 0; i < k; i++ ){
            max = getMax(listaNumere);
            System.out.println(max);
            listaNumere= removeMax(max, listaNumere);


    }

    }
    private static int getMax(int[] listaNumere) {
        int max = 0;
        int min = 0;

        for (int i = 0; i <= listaNumere.length - 1; i++) {
            if (max == 0 && min == 0) {
                max = listaNumere[i];
                min = listaNumere[i];
            } else {
                if (max <= listaNumere[i]) {
                    max = listaNumere[i];
                } else if (min >= listaNumere[i]) {
                    min = listaNumere[i];
                }
            }
        }
        return max;
    }
    private static int[] removeMax(int element, int[] listVeche) {
        int index = 0;
        int[] arrayNou = new int[listVeche.length-1];
        for(int i = 0; i<listVeche.length; i++){
            if(element != listVeche[i]){
                arrayNou[index] = listVeche[i];
                index ++;
            }

        } return arrayNou;

    }
}

