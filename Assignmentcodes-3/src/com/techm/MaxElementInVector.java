package com.techm;
import java.util.Collections;
import java.util.Vector;
import java.util.*;

public class MaxElementInVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Elements :");
        int n=sc.nextInt();
        Vector<Integer> vector=new Vector<>();
        for(int i=0;i<n;i++)
        {
        	int e=sc.nextInt();
        	vector.add(e);
        }

        
        int max=Collections.max(vector);
        System.out.println("The maximum element in the Vector is: "+max);
    }
}
