package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {4,9,10,11,15,21,28,30,31,32,33,43,53,66,77,78,81,83,93,95};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {4,9,10,11,15,21,28,30,31,32,33,43,53,66,77,78,81,83,93,95};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

    }
}
