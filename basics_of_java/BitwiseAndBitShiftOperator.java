package com.main.intoduction;

public class BitwiseAndBitShiftOperator {

	public static void main(String[] args) {
		
		//unary bitwise operator
		int x=10;
		System.out.println(~x);//-11
		
		System.out.println("----------");
		
		//signed left shift
		int y=20;
		System.out.println(y<<3);//160
		
		System.out.println("----------");
		
		//signed right shift
		int z=20;
		System.out.println(z>>3);//2
		
		System.out.println("----------");
		
		//signed right shift
		int a=32;
		System.out.println("a  "+(a>>>3));//4
		
		System.out.println("----------");
		
		//signed right shift with negative no.
		int b=-13;
		System.out.println(b>>2);//-4
		
		System.out.println("----------");
		//unsigned right shift with negative no.
		System.out.println(b>>>2);//1073741820
		
		System.out.println("----------");
		//Bitwise exclusive OR(XoR)
		b=10;
		System.out.println(b^2);//8
		
		System.out.println("----------");
		//Bitwise inclusive OR
		b=10;
		int c=5;
		System.out.println(b|c);//15
	}

}
