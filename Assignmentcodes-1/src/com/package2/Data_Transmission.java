package com.package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Data_Transmission {
	public static boolean isPrime(int number) {
        if (number<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.replace(";", "");
        String stringNum[]=input.split(" ");
        List<Integer> primes = new ArrayList<>();
        
        for (String i:stringNum) {
            int number=Integer.parseInt(i);
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        if (primes.size() < 2) {
            System.out.println("Input should contain at least two prime numbers.");
            return;
        }
        Collections.sort(primes);
        int total=primes.size();
        int secondLargestPrime= primes.get(primes.size()-2);
        int t= total+secondLargestPrime;
        System.out.println(t);

	}

}
