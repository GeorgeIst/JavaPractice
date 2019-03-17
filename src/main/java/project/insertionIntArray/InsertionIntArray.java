package project.insertionIntArray;

public class InsertionIntArray {


    public void sort(int[] arrToSort) {
        for(int i =1; i <arrToSort.length; i++){
            int j = i-1;
            int key =arrToSort[i];
            while(j>=0 && arrToSort[j]>key){
                arrToSort[j+1] = arrToSort[j];
                j--;
            }
            arrToSort[j+1] = key;
        }

    }
}
