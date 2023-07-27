//Create a program which can take input (int) (Ex -10 and display all the numbers below 10 that is 1-9) and 
//preform task - Reverse the list, Fibonacci, Sum of all number
	import java.util.*;

	//here we are doing sum of n numbers
	class Sum extends Thread
	{
		int x=10;
		int sum=0;
		public void sumMethod()
		{
			for(int i=1;i<x;i++)
			{
			sum=sum+i;
			}
		System.out.print("sum of "+x+" number is: "+sum);
		System.out.println("\n");
		}
		
		public void run()
		{
			sumMethod();
			try{
			Thread.sleep(8000);
		}catch(Exception e){}
		}
		}
		
	//here we are printing fabonacci series	
	class Fabonacci extends Thread
	{
		
		
		public void fabonacci()
		{
		int x=10;
		int a=0,b=1;int c=0;
		System.out.print("Fabonacci series is from 1 to 10 is: ");
		for(int i=1;i<=10;i++)
		{
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println("\n");
		}
		public void run()
		{
			try{
			Thread.sleep(6000);
		}catch(Exception e){}
			fabonacci();
		}
		}
	
	//here we are reversing list
	class ReverseList extends Thread
	{
		public void reverse()
		{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println("List before reversing : "+list);
		Collections.reverse(list);
		System.out.println("List after reversing : "+list);
		}
		
		public void run()
		{
			reverse();
			try{
			Thread.sleep(4000);
		}catch(Exception e){}
		}
		
		}
	
	class NumberPrint extends Thread
	{
	public void print()
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a no. : ");
	int x=sc.nextInt();
	System.out.println("number below 10 are: ");
	for(int i=1;i<x;i++)
	{
		System.out.print(i+"  ");
	}
	System.out.println();	
	}
	
	public void run()
	{
		print();
		try{
			Thread.sleep(2000);
		}catch(Exception e){}
	}
	}
	
	public class MyMain extends Thread
	{
	public static void main(String ar[])
	{
	NumberPrint numberPrint=new NumberPrint();
	numberPrint.start();
	
	ReverseList reverseList=new ReverseList();
	reverseList.start();
	
	Fabonacci fabonacci=new Fabonacci();
	fabonacci.start();
	
	Sum sum=new Sum();
	sum.start();
	}
	}