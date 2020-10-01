package homework2.task2;

import java.util.Scanner;

public class Item1PrintArray {

    public static void main(String[] args) {
        int[] myArray = createArray();
        System.out.println();
        printWithDoWhile(myArray);
        printWithWhile(myArray);
        printWithFor(myArray);
        printWithForeach(myArray);
    }

    public static int[] createArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите элемент массива");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static void printWithDoWhile(int[] myArray){
        if (myArray.length>0){
            int index = 0;
            do{
                System.out.print(myArray[index++]+" ");
            }while (index<myArray.length);
            System.out.println();
        }
    }

    private static void printWithWhile(int[] myArray){
        if (myArray.length>0){
            int index = 0;
            while (index<myArray.length){
                System.out.print(myArray[index++]+" ");
            }
            System.out.println();
        }
    }

    private static void printWithFor(int[] myArray){
        if (myArray.length>0){
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i]+" ");
            }
            System.out.println();
        }
    }

    private static void printWithForeach(int[] myArray){
        if (myArray.length>0){
            for (int i : myArray) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
