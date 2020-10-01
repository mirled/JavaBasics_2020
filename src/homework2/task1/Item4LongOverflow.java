package homework2.task1;

public class Item4LongOverflow {

    public static void main(String[] args) {
        long a = 1L;
        for (; a < Long.MAX_VALUE/3+1; a *= 3);
        System.out.printf("Значение до переполнения = %d%n",a);
        System.out.printf("Значение после переполнения = %d%n",a*3);
    }
}
