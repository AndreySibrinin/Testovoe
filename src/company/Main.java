package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите арифметическую операцию следующего вида: a + b, a - b, a * b, a / b");
        System.out.println("a и b  - числа от 1 до 10, или от I до X включительно");

        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator(1, 10);


        String expression = in.nextLine();
        String result = calculator.calculate(expression);
        System.out.println(result);


    }
}
