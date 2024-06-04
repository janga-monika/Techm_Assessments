package com.techm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertListToLowercase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> strings=new ArrayList<>();

        // Take input strings from the user
        System.out.println("Please enter 5 strings:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string "+(i+1)+": ");
            String str = scanner.nextLine();
            strings.add(str);
        }

 
        List<String> lowercaseStrings=strings.stream()
                                               .map(String::toLowerCase)
                                               .collect(Collectors.toList());

   
        System.out.println("List of strings in lowercase: "+lowercaseStrings);

    }
}
