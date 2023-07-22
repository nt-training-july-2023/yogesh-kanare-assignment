package com.main.intoduction;

import java.util.Scanner;

public class SumOfFirstnNumber {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n");
	int n=sc.nextInt();
	int i=1;
	int sum=0;
	while(i<=n)
	{
		sum=sum+i;
		i++;
	}
	System.out.println("Sum of first "+n+"number is : "+sum);
}
}
