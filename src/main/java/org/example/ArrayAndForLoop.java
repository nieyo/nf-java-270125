package org.example;

import java.util.Scanner;

public class ArrayAndForLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers2 = {20,19,18,17,16,15,14,13,12,11};
        int[] numbersSum = new int[10];
        arrayOutput(numbers);
        System.out.println("-----");

        int sum = 0;
        int highestNumber = numbers[0];

        // find shorter array to prevent ArrayIndexOutOfBoundsException
        // numbers.length < numbers2.length ? int index = numbers.length : int index = numbers2.length

        for (int i = 0; i < numbers.length; i++) {
            // sum
            sum += numbers[i];
            // highest number
            if(numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
            // addition of arrays
            numbersSum[i] = numbers[i] + numbers2[i];
        }


        System.out.println("sum: " + sum);
        System.out.println("highest number: " + highestNumber);
        System.out.println("-----");
        arrayOutput(numbersSum);

        System.out.println("-----");

        // Bonus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Wort ein:");
        String input = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        //char[] zeichenArray = input.toCharArray();
        //arrayOutput(zeichenArray);


    }

    public  static void arrayOutput(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
