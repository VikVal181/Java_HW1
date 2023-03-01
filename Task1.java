package org.example.hw1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim().replaceAll("\\s+"," ");
        String[] wordArray = str.split(" ");

        StringBuilder myNewStr = new StringBuilder();

        for (int i = wordArray.length - 1; i >= 0; i--) {
            myNewStr.append(wordArray[i]);
           if (i != 0)
               myNewStr.append(" ");
        }
        System.out.println(myNewStr);
    }
}
