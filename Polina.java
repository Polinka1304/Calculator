package no1;

import java.util.Scanner;

public class Polina {
    public static void main(String[] args) {
        for (;;) {
            Scanner in = new Scanner(System.in);
            System.out.println("Операнд 1:");
            double num1 = in.nextDouble();
            System.out.println("Арифметическая операция:");
            String operation = in.next();
            System.out.println("Операнд 2:");
            double num2 = in.nextDouble();
            double result = 0;
            switch (operation) {
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("На ноль делить нельзя!!!");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Некорректная операция");
            }
            System.out.printf("Результат:%f\n", result);
        }
    }
}