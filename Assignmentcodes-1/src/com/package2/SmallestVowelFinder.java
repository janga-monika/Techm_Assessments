package com.package2;

import java.util.Scanner;

public class SmallestVowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase(); 
        char smallestVowel = findSmallestVowel(input);
        System.out.println("The smallest vowel in the given string is: " + smallestVowel);
    }

    public static char findSmallestVowel(String str) {
        char smallestVowel = Character.MAX_VALUE; 

        for (char ch : str.toCharArray()) {
            if (isVowel(ch) && ch < smallestVowel) {
                smallestVowel = ch;
            }
        }

        return smallestVowel;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
