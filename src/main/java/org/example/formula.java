package org.example;

import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = findSum();
        System.out.println(result);

        scanner.close();
    }

    public static double findSum() {
        int numberN = 2;
        double sum = 0;
        double currentMember;

        do {
            currentMember = 1.0 / (numberN * numberN + numberN - 2);
            sum += currentMember;
            numberN++;
        } while (currentMember >= 0.000001);

        return sum;
    }
}