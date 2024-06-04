package com.package2;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Input: ");
		int num=sc.nextInt();
		
		if(num>0) {
			int sqrt=(int)Math.sqrt(num);
			if(sqrt*sqrt==num)
				System.out.println("TRUE");
			else
				System.out.println("FALSE");
		}

	}

}
