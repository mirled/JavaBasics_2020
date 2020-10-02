package homework2.task1;

public class Item4LongOverflow {

    public static void main(String[] args) {
        long a = 1L;
        int multiplier = 3;
        for (; a < Long.MAX_VALUE/multiplier+1; a *= multiplier);
        System.out.printf("Значение до переполнения = %d%n",a);
        System.out.printf("Значение после переполнения = %d%n",a*multiplier);
    }
}
