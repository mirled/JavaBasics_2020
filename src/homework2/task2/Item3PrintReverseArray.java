package homework2.task2;

public class Item3PrintReverseArray {

    public static void main(String[] args) {
        int[] myArray = Item1PrintArray.createArray();
        System.out.println();
        reversePrintWithDoWhile(myArray);
        reversePrintWithWhile(myArray);
        reversePrintWithFor(myArray);
        reversePrintWithForeach(myArray);
    }

    private static void reversePrintWithDoWhile(int[] myArray){
        if (myArray.length>0){
            int index = myArray.length-1;
            do{
                System.out.print(myArray[index--]+" ");
            }while (index>-1);
            System.out.println();
        }
    }

    private static void reversePrintWithWhile(int[] myArray){
        if (myArray.length>0){
            int index = myArray.length-1;
            while (index>-1){
                System.out.print(myArray[index--]+" ");
            }
            System.out.println();
        }
    }

    private static void reversePrintWithFor(int[] myArray){
        if (myArray.length>0){
            for (int i = myArray.length-1; i >-1; i--) {
                System.out.print(myArray[i]+" ");
            }
            System.out.println();
        }
    }

    private static void reversePrintWithForeach(int[] myArray){
        if (myArray.length>0){
            StringBuilder numbers = new StringBuilder();
            for (int i : myArray) {
                numbers.insert(0,i+" ");
            }
            System.out.println(numbers.toString());
        }
    }

}
