package com.package2;
import java.util.*;
import java.lang.*;
public class Vowels_Consonants_Count {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Input: ");
	String str=sc.nextLine();
	int vowel=0,consonent=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(Character.isLetter(ch))
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				vowel+=1;
			else
				consonent+=1;
		}
	}
	
	System.out.println("Vowels="+vowel+"\nConsonent="+consonent);
	}

}
