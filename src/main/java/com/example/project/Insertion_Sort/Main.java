package com.example.project.Insertion_Sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5};
        int[] expected = {1, 2, 5, 5, 9};
        arr = InsertionSort.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
