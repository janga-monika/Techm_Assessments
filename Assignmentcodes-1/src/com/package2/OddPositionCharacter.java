package com.package2;

import java.util.Scanner;

public class OddPositionCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for (int i=1;i<str.length();i+=2) {
            System.out.print(str.charAt(i));
        }

	}

}
