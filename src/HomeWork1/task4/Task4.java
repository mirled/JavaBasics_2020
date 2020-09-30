package HomeWork1.task4;

public class Task4 {

    public static void main(String[] args) {
        boolean weekday = Boolean.valueOf(args[0]);
        boolean vacation = Boolean.valueOf(args[1]);
        boolean willSleep = sleepIn(weekday,vacation);
        if (willSleep) {
            System.out.println("You can sleep all day long!!!");
        } else {
            System.out.println("Let's go to work!");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday||vacation;
    }

}
