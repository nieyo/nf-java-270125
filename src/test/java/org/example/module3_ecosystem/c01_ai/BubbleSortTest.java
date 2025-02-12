package org.example.module3_ecosystem.c01_ai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testBubbleSortWithNormalArray() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithDuplicateElements() {
        int[] arr = {3, 3, 2, 1, 2, 1};
        int[] expected = {1, 1, 2, 2, 3, 3};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }
}
