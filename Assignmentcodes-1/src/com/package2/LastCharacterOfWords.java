package com.package2;
import java.util.*;
public class LastCharacterOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String str[]=input.split("\\s+");
		StringBuilder r=new StringBuilder();
		for(String w:str)
		{
			 char l='\0';
	            for (int i=w.length()-1;i>= 0; i--) {
	                char ch=w.charAt(i);
	                if(Character.isDigit(ch)) {
	                    break;
	                }
	                l=ch;
	                break;
	            }

	            if(l!='\0') {
	                r.append(l);
	            }
		}
		System.out.println(r);
	}

}
