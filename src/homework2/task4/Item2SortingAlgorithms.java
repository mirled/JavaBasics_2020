package homework2.task4;

import java.util.Arrays;

public class Item2SortingAlgorithms {

    static int[] bubbleSort(int[] arr){
        int[] arrSort = Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < arrSort.length-1; i++) {
            for (int j = 0; j < arrSort.length-1-i; j++) {
                if(arrSort[j+1]<arrSort[j]){
                    int temp = arrSort[j+1];
                    arrSort[j+1] = arrSort[j];
                    arrSort[j] = temp;
                }
            }
        }
        return arrSort;
    }

    static int[] shakerSort(int[] arr){
        int[] arrSort = Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < arrSort.length; i++) {
            for (int j = i; j < arrSort.length-1-i; j++) {
                if(arrSort[j+1]<arrSort[j]){
                    int temp = arrSort[j+1];
                    arrSort[j+1] = arrSort[j];
                    arrSort[j] = temp;
                }
            }
            for (int j = arrSort.length-1-i; j > i; j--) {
                if(arrSort[j-1]>arrSort[j]){
                    int temp = arrSort[j-1];
                    arrSort[j-1] = arrSort[j];
                    arrSort[j] = temp;
                }
            }
        }
        return arrSort;
    }
}
