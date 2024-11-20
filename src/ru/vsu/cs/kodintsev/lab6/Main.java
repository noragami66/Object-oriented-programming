package ru.vsu.cs.kodintsev.lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите название операции (ADD, SUBTRACT, MULTIPLY, DIVIDE): ");
        String operationName = scanner.next().toUpperCase();

        try {
            Operation operation = Operation.valueOf(operationName);

            double result = operation.apply(num1, num2);

            System.out.println("Результат: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Неправильное название операции");
        }
    }
}
