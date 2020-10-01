package homework2.task2;

public class Item2EverySecondElement {

    public static void main(String[] args) {
        final int indexToPrint = 2;
        int[] myArray = Item1PrintArray.createArray();
        System.out.println();
        printEverySecondElement(myArray,indexToPrint);
    }

    private static void printEverySecondElement(int[] myArray,int indexToPrint){
        if(indexToPrint<=myArray.length) {
            for (int i = indexToPrint - 1; i < myArray.length; i += indexToPrint) {
                System.out.print(myArray[i]+" ");
            }
            System.out.println();
        }
    }

}
