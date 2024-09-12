package su.gild;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator();

        int left = in.nextInt();
        int right = in.nextInt();
        System.out.println(left + " + " + right + " = " + calc.plus(left, right));
        System.out.println(left + " - " + right + " = " + calc.minus(left, right));
        System.out.println(left + " * " + right + " = " + calc.multi(left, right));
    }
}