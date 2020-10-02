package homework2.task4;

import java.util.Arrays;

public class Item2SortingAlgorithms {
    static int[] bubbleSort(int[] arr){
        int[] arrSort = Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < arrSort.length-1; i++) {
            for (int j = i+1; j < arrSort.length; j++) {
                if(arrSort[j]<arrSort[i]){
                    int temp = arrSort[j];
                    arrSort[j] = arrSort[i];
                    arrSort[i] = temp;
                }
            }
        }
        return arrSort;
    }

    static int[] shakerSort(int[] arr){
        int[] arrSort = Arrays.copyOf(arr,arr.length);
        for (int i = 0,k=arrSort.length-1; i < k; i++,k--) {
            for (int j = i+1; j < k+1; j++) {
                if(arrSort[j]<arrSort[i]){
                    int temp = arrSort[j];
                    arrSort[j] = arrSort[i];
                    arrSort[i] = temp;
                }
            }
            for (int j = k-1; j > i ; j--) {
                if(arrSort[j]>arrSort[k]){
                    int temp = arrSort[j];
                    arrSort[j] = arrSort[k];
                    arrSort[k] = temp;
                }
            }
        }
        return arrSort;
    }
}
