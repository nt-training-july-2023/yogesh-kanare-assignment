package com.main.intoduction;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no.");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int originalNo=n;
		int size=0;
		while(n!=0)
		{
			n=n/10;
			size++;
		}
		System.out.println(size);
		int sum=0;
		int remainder;
		while(m!=0)
		{
			remainder=m%10;
			sum=sum+(int)Math.pow(remainder, size);
			m=m/10;
		}
		System.out.println(sum);
		if(originalNo==sum)
			System.out.println("No is armstrong");
		else
			System.out.println("No is not armstrong");
	}

}
