package homework2.task1;

import java.util.Scanner;

public class Item2ProductOfDigits {

    public static void main(String[] args) {
        final int RADIX = 10;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int product = 1;
        for (; number/RADIX>0 ; number /= RADIX){
            System.out.print(number%RADIX+"*");
            product *= number%RADIX;
        }
        product *= number;
        System.out.println(number+"="+product);
    }

}
