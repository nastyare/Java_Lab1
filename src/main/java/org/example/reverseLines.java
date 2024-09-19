package org.example;

public class reverseLines {
    public static void main(String[] args) {
        String reverseWord = "Spider lily";
        System.out.println(reversing(reverseWord));
    }

    public static String reversing(String reverse) {
        int length = reverse.length();
        StringBuilder reversing = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversing.append(reverse.charAt(i));
        }
        return reversing.toString();
    }
}