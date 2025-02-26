package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
       int loop = 0;
       for (int i = 1; i < elements.length; i++) {
        int j = i - 1;
        while (j > -1 && elements[j] >= elements[j + 1]) {
            loop++;
            int temp = elements[j+1];
            elements[j+1] = elements[j];
            elements[j] = temp;
            j--;
        }
       }
       System.out.println("INSERTION SORT: Number of loop iterations: " + loop);
        return elements;
    }

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int loop = 0;
        for (int i = 0; i < elements.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                loop++;
                if (elements[j] < elements[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIdx];
            elements[minIdx] = temp;
        } 
        System.out.println("SELECTION SORT: Number of loop iterations: " + loop);
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int loop = 0;
        for (int i = 1; i < words.size(); i++) {
            int j = i - 1;
            String temp = words.get(i);
            while (j > -1 && words.get(j).compareTo(temp) > 0) {
                loop++;
                words.set(j + 1, words.get(j));
                j--;
            }
            words.set(j + 1, temp);
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + loop);
        return words;
    }
    
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int loop = 0;
        for (int i = 0; i < words.size(); i++) {    
            int minIdx = i;
            for (int j = i + 1; j < words.size(); j++) {
                loop++;
                if (words.get(j).compareTo(words.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            String word = words.set(minIdx, words.get(i));
            words.set(i, word);

        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + loop);
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