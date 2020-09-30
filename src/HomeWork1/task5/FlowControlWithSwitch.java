package HomeWork1.task5;

import java.util.Scanner;

public class FlowControlWithSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        final String expectedName1 = "Вася";
        final String expectedName2 = "Анастасия";
        switch (inputName){
            case expectedName1: System.out.println("Привет!\nЯ тебя так долго ждал");
            break;
            case expectedName2: System.out.println("Я тебя так долго ждал");
            break;
            default: System.out.println("Добрый день, а вы кто?");
        }
    }

}
