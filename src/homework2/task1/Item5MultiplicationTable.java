package homework2.task1;

public class Item5MultiplicationTable {

    public static void main(String[] args) {
        final int BLOCKS = 2;
        final int INITIAL_VALUE = 2;
        final int COLUMNS = 4;
        final int MULTIPLIER = 10;
        for (int k = 0; k < BLOCKS; k++) {
            for (int i = 1; i < MULTIPLIER+1; i++) {
                for (int j = INITIAL_VALUE; j < INITIAL_VALUE+COLUMNS; j++) {
                    System.out.printf("%3d x%2d=%2d",j+COLUMNS*k,i,i*(j+COLUMNS*k));
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}