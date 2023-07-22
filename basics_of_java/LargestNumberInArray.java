package com.main.intoduction;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={1,4,5,343,45,3,5};
		int max=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(max<x[i])
			max=x[i];
		}
		System.out.println(max);		
	}
}
