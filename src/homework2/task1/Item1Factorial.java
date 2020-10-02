package homework2.task1;

import java.util.Scanner;

public class Item1Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberForFactorial = scanner.nextInt();
        if (numberForFactorial==0){
            System.out.println("0! = 1");
        } else {
            int factorial = 1;
            System.out.print(factorial);
            for (int i = 2; i < numberForFactorial + 1; i++) {
                System.out.print("*" + i);
                factorial *= i;
            }
            System.out.println(" = " + factorial);
        }
    }

}
