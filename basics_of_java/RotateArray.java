package com.main.intoduction;

class Demo
{
	public static void reverse(int x[],int position,int n)
	{
		int i,j=n-1;
		for(i=position;i<j;i++,j--)
		{
			int t=x[i];
			x[i]=x[j];
			x[j]=t;
		}
	}
}

public class RotateArray {

	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7};
		int size=x.length;
		int position=3;
		Demo.reverse(x, 0, size);
		Demo.reverse(x, 0, position);
		Demo.reverse(x, position, size);
		for(int i:x)
		{
			System.out.print(i+" ");
		}
	}

}
