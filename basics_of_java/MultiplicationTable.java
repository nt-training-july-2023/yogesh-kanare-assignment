package com.main.intoduction;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. ");
		int n=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(n+"*"+i+" ="+(n*i));
			i++;
		}				
	}

}
