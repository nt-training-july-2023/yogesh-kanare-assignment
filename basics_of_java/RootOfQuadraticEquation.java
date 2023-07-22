package com.main.intoduction;

import java.util.Scanner;

public class RootOfQuadraticEquation {
public static void main(String ar[])
{
	System.out.println("Quadratic equation roots");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a");
	int a=sc.nextInt();
	System.out.println("Enter value of b");
	int b=sc.nextInt();
	System.out.println("Enter value of c");
	int c=sc.nextInt();
	double discriminant=b*b-4*a*c;
	double root1=(-b+Math.pow(discriminant,0.5f))/(2*a);
	double root2=(-b-Math.pow(discriminant,0.5f))/(2*a);
	System.out.println("Root1 is :"+root1);
	System.out.println("Root2 is :"+root2);
}	
}
