package org.example;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checking(input);

        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }

        scanner.close();
    }

    public static boolean checking(String str) {
        String newString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = new StringBuilder(newString).reverse().toString();

        return newString.equals(reversedString);
    }
}
