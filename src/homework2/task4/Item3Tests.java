package homework2.task4;

import java.util.Arrays;

public class Item3Tests {

    public static void main(String[] args) {
        int[][] tests = {{1,2,3,4,5,6},
                        {6,5,4,3,2,1},
                        {3,6,4,2,8,6,3},
                        {1,1,1,1},
                        {9,1,5,99,9,9},
                        {}
                        };
        for (int[] test : tests) {
            printTests(test);
        }
    }

    static void printTests(int[] testArray){
        System.out.println("    Bubble sort");
        System.out.println(Arrays.toString(testArray)+" -> "+Arrays.toString(Item2SortingAlgorithms.bubbleSort(testArray)));
        System.out.println("    Shaker sort");
        System.out.println(Arrays.toString(testArray)+" -> "+Arrays.toString(Item2SortingAlgorithms.shakerSort(testArray)));
        System.out.println();
    }

}
