package com.package2;

import java.util.Scanner;

public class Space_Character_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Input: ");
		String str=sc.nextLine();
		int flag=0;
		int prev=1000;
		char res='\0';
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
				if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') && ((int)ch)<prev)
				{
					prev=(int)ch;
					res=ch;
					flag=1;
				}
			
		}
		if(flag==1)
			System.out.println(res);
		else
			System.out.println("Vowel do not exist");

	}

}
