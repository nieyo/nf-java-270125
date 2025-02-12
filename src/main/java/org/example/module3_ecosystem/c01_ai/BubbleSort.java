package org.example.module3_ecosystem.c01_ai;

/**
 * This class demonstrates the implementation of the Bubble Sort algorithm.
 */
public class BubbleSort {

    /**
     * The main method to demonstrate the Bubble Sort algorithm.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Initialize the array to be sorted
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Print the original array
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Sort the array using Bubble Sort
        bubbleSort(numbers);

        // Print the sorted array
        System.out.println("\nSorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;

            // One pass of bubble sort
            for (int i = 1; i < n; i++) {
                // If this pair is out of order
                if (arr[i - 1] > arr[i]) {
                    // Swap them and remember something changed
                    swap(arr, i - 1, i);
                    swapped = true;
                }
            }
            // Optimize: reduce the array size as the largest element is now at the end
            n--;
        } while (swapped);
    }

    /**
     * Swaps two elements in an array.
     * @param arr The array containing the elements.
     * @param i The index of the first element.
     * @param j The index of the second element.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
