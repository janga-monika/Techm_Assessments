package com.package2;
import java.util.*;
import java.lang.*;

public class Unique_Characters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Input: ");
		String str=sc.nextLine();
		StringBuilder result = new StringBuilder();

        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch))==-1) 
            {
                result.append(ch);
            }
        }
		System.out.println(result);
	}

}
