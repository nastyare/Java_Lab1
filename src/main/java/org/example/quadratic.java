package org.example;

import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты квадратного уравнения (ax^2 + bx + c = 0):");
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: х1 = " + root1 + ", х2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: " + root);
        } else {
            System.out.println("Нет вещественных корней");
        }
    }
}