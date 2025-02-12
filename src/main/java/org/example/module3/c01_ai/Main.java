package org.example.module3.c01_ai;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Test reverseString
        System.out.println("Reverse of 'Hello': " + reverseString("Hello"));

        // Test isPalindrome
        System.out.println("Is 'anna' a palindrome? " + isPalindrome("anna"));
        System.out.println("Is 'A man, a plan, a canal: Panama' a palindrome? " +
                isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Is 'race a car' a palindrome? " + isPalindrome("race a car"));

        // Test generatePrimes
        System.out.println("First 10 prime numbers: " + generatePrimes(10));
    }

    /**
     * Reverses the given string.
     * @param s The input string to be reversed.
     * @return The reversed string.
     */
    public static String reverseString(String s) {
        // Use StringBuilder to efficiently reverse the string
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Checks if the given string is a palindrome.
     * @param s The input string to be checked.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Check if the cleaned string is equal to its reverse
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    /**
     * Generates the first n prime numbers using the Sieve of Eratosthenes algorithm.
     * @param n The number of prime numbers to generate.
     * @return A list containing the first n prime numbers.
     */
    public static List<Integer> generatePrimes(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        List<Integer> primes = new ArrayList<>();
        boolean[] sieve = new boolean[n * 20]; // We'll generate more numbers than needed

        // Initialize the sieve
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = true;
        }

        // Perform the sieve operation
        for (int i = 2; i * i < sieve.length; i++) {
            if (sieve[i]) {
                for (int j = i * i; j < sieve.length; j += i) {
                    sieve[j] = false;
                }
            }
        }

        // Collect the prime numbers
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                primes.add(i);
                if (primes.size() == n) {
                    break;
                }
            }
        }

        return primes;
    }
}
