package homework2.task1;

import java.util.Scanner;

public class Item3Power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int power = scanner.nextInt();
        double result = 1;
        for (int i = 1; i < power+1; i++) {
            result *= number;
        }
        System.out.println(number+" в степени "+power+" = "+result);
    }
}
