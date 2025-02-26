package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
       for (int i = 1; i < elements.length; i++) {
        int j = i - 1;
        while (j > -1 && elements[j] >= elements[j + 1]) {
            int temp = elements[j+1];
            elements[j+1] = elements[j];
            elements[j] = temp;
            j--;
        }
       }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            int j = i - 1;
            String temp = words.get(i);
            while (j > -1 && words.get(j).compareTo(temp) > 0) {
                words.set(j + 1, words.get(j));
                j--;
            }
            words.set(j + 1, temp);
        }
        return words;
    }


    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}