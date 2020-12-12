package com.pomi.forthlabs.fifthtask;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        if (!sc.hasNextInt()) {
            throw new RuntimeException("Stream not have integer");
        }
        int x = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int k = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, k);
                }

            }

        }
        System.out.println(list);
    }
}