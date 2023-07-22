package com.main.intoduction;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=n-1;
		int fact=n;
		while(i>1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println(fact);
	}

}
