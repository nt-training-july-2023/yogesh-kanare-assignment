package com.main.intoduction;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int remainder=0;
		int reverse=0;
		while(n!=0)
		{
			remainder = n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		System.out.println(reverse);
	}

}
