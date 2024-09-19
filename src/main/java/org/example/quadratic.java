package org.example;

import java.util.Scanner;

class Pair {
    Double first;
    Double second;

    public Pair(Double first, Double second) {
        this.first = first;
        this.second = second;
    }
}

public class quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Аргумент a:");
        double numberA = scanner.nextDouble();
        System.out.println("Аргумент b:");
        double numberB = scanner.nextDouble();
        System.out.println("Аргумент c:");
        double numberC = scanner.nextDouble();

        Pair result = findRoots(numberA, numberB, numberC);
        result(result);

        scanner.close();
    }

    public static Pair findRoots(double numberA, double numberB, double numberC) {
        double discriminant = numberB * numberB - 4 * numberA * numberC;
        if (discriminant > 0) {
            double x1 = (-numberB + Math.sqrt(discriminant)) / (2 * numberA);
            double x2 = (-numberB - Math.sqrt(discriminant)) / (2 * numberA);
            return new Pair(x1, x2);
        } else if (discriminant == 0) {
            double x1 = -numberB / (2 * numberA);
            return new Pair(x1, null);
        } else {
            return new Pair(null, null);
        }
    }

    public static void result(Pair result) {
        if (result.first != null && result.second != null) {
            System.out.println("Корни уравнения: x1=" + result.first + " x2=" + result.second);
        } else if (result.first != null) {
            System.out.println("Корень уравнения: x1=" + result.first);
        } else {
            System.out.println("Нет вещественных корней");
        }
    }
}