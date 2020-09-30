package HomeWork1.task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int numberOfDigits = 10;
        int[] digits = new int[numberOfDigits];
        for (int i = 0; i < digits.length; i++) {
            Scanner scanner = new Scanner(System.in);
            digits[i] = scanner.nextInt();
        }
        String pnoneNumber = createPhoneNumber(digits);
        System.out.println(pnoneNumber);
    }

    static String createPhoneNumber(int[] dig){
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",dig[0],dig[1],dig[2],dig[3],dig[4],dig[5],dig[6],dig[7],dig[8],dig[9]);//(XXX) XXX-XXXX
    }

}
