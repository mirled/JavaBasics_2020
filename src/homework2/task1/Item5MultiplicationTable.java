package homework2.task1;

public class Item5MultiplicationTable {

    public static void main(String[] args) {
        for (int k = 0; k < 2; k++) {
            for (int i = 1; i < 11; i++) {
                for (int j = 2; j < 6; j++) {
                    System.out.printf("%3d x%2d=%2d",j+4*k,i,i*(j+4*k));
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
