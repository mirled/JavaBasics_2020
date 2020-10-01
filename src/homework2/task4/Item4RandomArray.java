package homework2.task4;

import java.util.Random;

public class Item4RandomArray {

    public static void main(String[] args) {
        final int maxSize = 10;
        final int maxNumber = 10;
        int[] randomArray = createRamdomArray(maxSize,maxNumber);
        Item3Tests.printTests(randomArray);
    }

    private static int[] createRamdomArray(int maxSize,int maxNumber){
        Random rand = new Random();
        int size = rand.nextInt(maxSize+1);
        int[] randArr = new int[size];
        for (int i = 0; i < size; i++) {
            randArr[i] = rand.nextInt(maxNumber+1);
        }
        return randArr;
    }

}
