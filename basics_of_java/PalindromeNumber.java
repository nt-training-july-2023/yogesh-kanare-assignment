package com.main.intoduction;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original=n;
		int remainder=0;
		int sum=0;
		while(n!=0)
		{
			remainder=n%10;
			sum=sum*10+remainder;
			n=n/10;
			
		}
		
		if(sum==original)
			System.out.println("Palindrom no");
		else
			System.out.println("not Palindrom no");
	}

}
