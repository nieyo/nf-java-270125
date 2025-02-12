# Bubble Sort Demo

This project demonstrates the implementation of the Bubble Sort algorithm in Java.

## Overview

The Bubble Sort algorithm is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

## Classes

### BubbleSortDemo

This class contains the main method to demonstrate the Bubble Sort algorithm and the implementation of the algorithm itself.

#### Methods

1. `main(String[] args)`
    - Demonstrates the use of the Bubble Sort algorithm by sorting a sample array and printing the results.

2. `bubbleSort(int[] arr)`
    - Implements the Bubble Sort algorithm to sort an array of integers in ascending order.
    - Parameters:
        - `arr`: The array to be sorted.

3. `swap(int[] arr, int i, int j)`
    - A helper method to swap two elements in an array.
    - Parameters:
        - `arr`: The array containing the elements.
        - `i`: The index of the first element.
        - `j`: The index of the second element.

## Usage

To use this demo:

1. Compile the Java file: javac BubbleSortDemo.java

2. Run the compiled class: java BubbleSortDemo

The program will output the original unsorted array and the sorted array after applying the Bubble Sort algorithm.

## Testing

A JUnit test class `BubbleSortDemoTest` is provided to verify the correctness of the `bubbleSort` method. It includes test cases for various scenarios such as:

- Normal unsorted array
- Already sorted array
- Reverse sorted array
- Array with duplicate elements
- Empty array
- Array with a single element

To run the tests, ensure you have JUnit 5 in your classpath and execute the test class.

## Time Complexity

The time complexity of Bubble Sort is O(n^2) in the worst and average cases, where n is the number of items being sorted. This makes it inefficient on large lists, and generally performs worse than the similar insertion sort.

## Space Complexity

Bubble Sort has a space complexity of O(1) because it only uses a constant amount of additional memory space regardless of the input size.

## Conclusion

While Bubble Sort is not the most efficient sorting algorithm for large datasets, it is simple to understand and implement, making it a good introduction to sorting algorithms.