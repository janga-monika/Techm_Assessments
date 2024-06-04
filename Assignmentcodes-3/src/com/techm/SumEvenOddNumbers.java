package com.techm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();

        System.out.println("Please enter 5 integers:");

        for (int i=0;i<5;i++) {
            System.out.print("Enter integer "+(i+1)+": ");
            int number = scanner.nextInt();
            l.add(number);
        }

   
        int sumEven= l.stream()
                             .filter(n -> n % 2 == 0)
                             .mapToInt(Integer::intValue)
                             .sum();

       
        int sumOdd=l.stream()
                            .filter(n -> n % 2 != 0)
                            .mapToInt(Integer::intValue)
                            .sum();

        System.out.println("The sum of all even numbers is: "+sumEven);
        System.out.println("The sum of all odd numbers is: "+sumOdd);
    }
}
