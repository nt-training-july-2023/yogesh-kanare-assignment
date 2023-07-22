package com.main.intoduction;

public class MatrixAddition {

	public static void main(String[] args) {

	int x[][]= {{1,2,3},{3,2,3},{3,2,3}};
	int y[][]= {{7,2,6},{3,2,0},{3,2,3}};
	int z[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			z[i][j]=x[i][j]+y[i][j];
			System.out.print(z[i][j]+" ");
		}	
	System.out.println();
	}
	}
	}

