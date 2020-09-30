package HomeWork1.task1;

public class Task1 {

    public static void main(String[] args) {
        // ПУНКТ 1.2
        byte a = 42; //      101010
        byte b = 15; //        1111
        System.out.println("a = "+a+" b = "+b);
        System.out.println("~a = "+~a);//       a = 101010; b = 1111; result = 11010101
        System.out.println("~b = "+~b);//        a = 101010; b = 1111; result = 11110000
        System.out.println("a & b = "+(a & b));//a = 101010; b = 1111; result = 1010
        System.out.println("a &= b   a = "+(a &= b));// a = 101010; b = 1111; result(a) = 1010
        a = 42;
        System.out.println("b &= a   b = "+(b &= a));// a = 101010; b = 1111; result(b) = 1010
        b = 15;
        System.out.println("a | b = "+(a | b));// a = 101010; b = 1111; result = 101111
        System.out.println("a |= b   a = "+(a |= b));// a = 101010; b = 1111; result(a) = 101111
        a = 42;
        System.out.println("b |= a   b = "+(b |= a));// a = 101010; b = 1111; result(b) = 101111
        b = 15;
        System.out.println("a ^ b = "+(a ^ b));// a = 101010; b = 1111; result = 100101
        System.out.println("a ^= b   a = "+(a ^= b));// a = 101010; b = 1111; result(a) = 100101
        a = 42;
        System.out.println("b ^= a   b = "+(b ^= a));// a = 101010; b = 1111; result(b) = 100101
        b = 15;
        System.out.println("a >> b = "+(a >> b));// a = 101010; b = 1111; result = 0;
        System.out.println("b >> a = "+(b >> a));// a = 101010; b = 1111; result = 0
        System.out.println("a >>= b   a = "+(a >>= b));// a = 101010; b = 1111; result(a) = 0
        a = 42;
        System.out.println("b >>= a   b = "+(b >>= a));// a = 101010; b = 1111; result(b) = 0
        b = 15;
        System.out.println("a >>> b = "+(a >>> b));// a = 101010; b = 1111; result = 0;
        System.out.println("b >>> a = "+(b >>> a));// a = 101010; b = 1111; result = 0
        System.out.println("a >>>= b   a = "+(a >>>= b));// a = 101010; b = 1111; result(a) = 0
        a = 42;
        System.out.println("b >>>= a   b = "+(b >>>= a));// a = 101010; b = 1111; result(b) = 0
        b = 15;
        System.out.println("a << b = "+(a << b));// a = 101010; b = 1111; result = 00000000_00010101_00000000_00000000;
        //Т.к левый операнд преобразуется до int сдвиг влево производится на число равное пяти младшим битам правого операнда
        System.out.println("b << a = "+(b << a));//a = 101010; b = 1111; result = 00000000_00000000_00111100_00000000;
        //При присваивании переменной типа byte число обрезается до 8 младших бит
        System.out.println("a <<= b   a = "+(a <<= b));// a = 101010; b = 1111; result(a) = 00000000;
        a = 42;
        System.out.println("b <<= a   b = "+(b <<= a));// a = 101010; b = 1111; result(b) = 00000000;
        b = 15;
        System.out.println();
        System.out.println();

        // ПУНКТ 1.3
        a = -42; //      11010110
        b = -15; //      11110001
        System.out.println("a = "+a+" b = "+b);
        System.out.println("~a = "+~a);//        a = 11010110; b = 11110001; result = 101001
        System.out.println("~b = "+~b);//        a = 11010110; b = 11110001; result = 1110
        System.out.println("a & b = "+(a & b));//a = 11010110; b = 11110001; result = 11010000
        System.out.println("a &= b   a = "+(a &= b));// a = 11010110; b = 11110001; result(a) = 11010000
        a = -42;
        System.out.println("b &= a   b = "+(b &= a));// a = 11010110; b = 11110001; result(b) = 11010000
        b = -15;
        System.out.println("a | b = "+(a | b));// a = 11010110; b = 11110001; result = 11110111
        System.out.println("a |= b   a = "+(a |= b));// a = 11010110; b = 11110001; result(a) = 11110111
        a = -42;
        System.out.println("b |= a   b = "+(b |= a));// a = 11010110; b = 11110001; result(b) = 11110111
        b = -15;
        System.out.println("a ^ b = "+(a ^ b));// a = 11010110; b = 11110001; result = 100111
        System.out.println("a ^= b   a = "+(a ^= b));// a = 11010110; b = 11110001; result(a) = 100111
        a = -42;
        System.out.println("b ^= a   b = "+(b ^= a));// a = 11010110; b = 11110001; result(b) = 100111
        b = -15;
        System.out.println("a >> b = "+(a >> b));// a = 11010110; b = 11110001; result = 11111111
        System.out.println("b >> a = "+(b >> a));// a = 11010110; b = 11110001; result = 11111111
        System.out.println("a >>= b   a = "+(a >>= b));// a = 11010110; b = 11110001; result = 11111111
        a = -42;
        System.out.println("b >>= a   b = "+(b >>= a));// a = 11010110; b = 11110001; result = 11111111
        b = -15;
        //Т.к левый операнд преобразуется до int сдвиг вправо производится на число равное пяти младшим битам правого операнда
        System.out.println("a >>> b = "+(a >>> b));// a = 11010110; b = 11110001; result = 00000000_00000000_01111111_11111111
        System.out.println("b >>> a = "+(b >>> a));// a = 11010110; b = 11110001; result = 00000000_00000000_00000011_11111111
        //При присваивании переменной типа byte число обрезается до 8 младших бит
        System.out.println("a >>>= b   a = "+(a >>>= b));// a = 11010110; b = 11110001; result(a) = 11111111
        a = -42;
        System.out.println("b >>>= a   b = "+(b >>>= a));// a = 11010110; b = 11110001; result(b) = 11111111
        b = -15;
        //Т.к левый операнд преобразуется до int сдвиг вправо производится на число равное пяти младшим битам правого операнда
        System.out.println("a << b = "+(a << b));// a = 11010110; b = 11110001; result = 11111111_10101100_00000000_00000000
        System.out.println("b << a = "+(b << a));//a = 11010110; b = 11110001; result = 11111100_01000000_00000000_00000000
        //При присваивании переменной типа byte число обрезается до 8 младших бит
        System.out.println("a <<= b   a = "+(a <<= b));// a = 11010110; b = 11110001; result(a) =0
        a = -42;
        System.out.println("b <<= a   b = "+(b <<= a));// a = 11010110; b = 11110001; result(b) =0
        b = -15;

        // ПУНКТ 1.5
        //ПОБИТОВЫЕ ОПЕРАЦИИ ВЫПОЛНЯЮТСЯ ТОЛЬКО С ЦЕЛОЧИСЛЕННЫМИ ТИПАМИ
    }

}
