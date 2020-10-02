package homework2.task1;

import java.util.Scanner;

public class Item2ProductOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int product = 1;
        for (; number/10>0 ; number /= 10){
            System.out.print(number%10+"*");
            product *= number%10;
        }
        System.out.println(number+"="+product*number);
    }

}
