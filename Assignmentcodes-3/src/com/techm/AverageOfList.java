package com.techm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageOfList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();

        // Take 5 integer inputs from the user
        System.out.println("Please enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer "+(i + 1)+": ");
            int number=scanner.nextInt();
            l.add(number);
        }
        double avg=l.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println("The average of the list is: "+avg);
    }
}
