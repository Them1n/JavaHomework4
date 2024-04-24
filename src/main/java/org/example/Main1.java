package org.example;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbersAsString = input.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i=0; i < numbersAsString.length; i++) {
            numbers[i]= Integer.parseInt(numbersAsString[i]);
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
