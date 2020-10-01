package homework2.task1;

import java.util.Scanner;

public class Item1Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberForFactorial = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i < numberForFactorial; i++) {
            System.out.print(i+"*");
            factorial *= i;
        }
        factorial *= numberForFactorial;
        System.out.println(numberForFactorial+"="+factorial);
    }

}
