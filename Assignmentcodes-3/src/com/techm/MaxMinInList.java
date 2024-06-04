package com.techm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinInList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers=new ArrayList<>();

        System.out.println("Please enter 5 integers:");

        for (int i=0;i<5;i++) {
            System.out.print("Enter integer "+(i+1)+": ");
            int number=scanner.nextInt();
            numbers.add(number);
        }

   
        int max=numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        int min=numbers.stream().mapToInt(Integer::intValue).min().orElse(0);

        System.out.println("Maximum value in the list: "+max);
        System.out.println("Minimum value in the list: "+min);

    }
}
