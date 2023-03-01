package org.example.hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        do {
            arr.add(scanner.nextInt());
        } while ( arr.get(arr.size() - 1) != 0);
        for (Integer element: arr) {
            System.out.println(element);
        }
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > 0 && arr.get(i+1) < 0)
                sum+=arr.get(i);
        }
        System.out.println("Cумма:" + sum);
    }

}
