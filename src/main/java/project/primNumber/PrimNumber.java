package project.primNumber;

import java.util.ArrayList;

public class PrimNumber {
    public static void main(String[] args) {

    }
    public boolean checkIfIsPrim(int numar) {
        boolean isPrime = true;
        for (int div = 2; div < numar / 2; div++) {
            if (numar % div == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public ArrayList<Integer> checkArrayOfPrime(int[] listArray) {
        ArrayList<Integer> rezultat = new ArrayList<>();
        for (int div = 0; div < listArray.length; div++) {
            if (checkIfIsPrim(listArray[div])) {
                rezultat.add(listArray[div]);
            }
        }
        return rezultat;
    }

    public ArrayList<Integer> getPrimesInIntervals(int listaFirst, int listaLast) {
        ArrayList<Integer> rezultat = new ArrayList<>();
        for(int i = listaFirst; i <= listaLast; i++ ){
            if(checkIfIsPrim(i)){
                rezultat.add(i);
            }
        }return  rezultat;


    }

}
