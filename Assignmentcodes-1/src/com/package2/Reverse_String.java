package com.package2;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Input: ");
		String str=sc.nextLine();
		
		StringBuilder reversed = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--) 
        {
            char ch=Character.toLowerCase(str.charAt(i));
            reversed.append(ch);
        }
        System.out.println(reversed);
	}

}
