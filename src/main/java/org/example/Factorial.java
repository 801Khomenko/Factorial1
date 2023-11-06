package org.example;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для обчислення факторіала: ");
        int n = scanner.nextInt();

        Factorial factorial = new Factorial();

        System.out.println(n + "! = " + factorial.calculateFactorial(n));
    }


    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new RuntimeException("Negative number - " + n);
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}