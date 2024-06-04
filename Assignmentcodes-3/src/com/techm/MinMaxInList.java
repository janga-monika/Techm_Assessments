package com.techm;

import java.util.*;
import java.util.Collections;

public class MinMaxInList {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.out.println("Please enter 5 integers:");
        for (int i=0;i<5;i++) {
            System.out.print("Enter integer "+(i + 1)+": ");
            int number = scanner.nextInt();
            l.add(number);
        }

 
        int min=Collections.min(l);
        int max=Collections.max(l);

       
        System.out.println("The minimum element in the list is: "+min);
        System.out.println("The maximum element in the list is: "+max);
    }
}
