package com.main.intoduction;

import java.util.Scanner;

public class AreaOfTriangle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Program for Area of triangle");
	Scanner sc =new Scanner(System.in);	
	System.out.println("Enter base value:" );
	float base=sc.nextFloat();
	System.out.println("Enter height value:");
	float height=sc.nextFloat();
	float area=(float)(0.5*base*height);
	System.out.println("The Area of triangle is: "+area);
	}

}
