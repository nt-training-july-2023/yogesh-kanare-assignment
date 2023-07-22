package com.main.intoduction;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		x=++x + x++;
		System.out.println("x  :"+x);
		
		System.out.println("----------");
		
		int a=10;int b=20;int c=30;
		c=a + b + c + a++ + b++ + ++a + ++b;
		//10+20+30+10(11)+20(21)+12+22
		System.out.println(a);//12
		System.out.println(b);//22
		System.out.println(c);//124
		
		System.out.println("----------");
		
		int d=0;
		d=d++ - --d + ++d - d--;
		//0(1)-0+1-1(0)
		System.out.println(d);//0
		System.out.println("----------");
	
	
	}

}
