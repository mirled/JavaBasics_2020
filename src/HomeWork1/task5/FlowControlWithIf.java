package HomeWork1.task5;

import java.util.Scanner;

public class FlowControlWithIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        String expectedName1 = "Вася";
        String expectedName2 = "Анастасия";
        if (expectedName1.equals(inputName)){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if (expectedName2.equals(inputName)){
            System.out.println("Я тебя так долго ждал");
        }
        if (!expectedName1.equals(inputName)&&!expectedName2.equals(inputName)){
            System.out.println("Добрый день, а вы кто?");
        }
    }

}
