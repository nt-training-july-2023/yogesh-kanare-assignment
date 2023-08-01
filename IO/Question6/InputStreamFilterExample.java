package javaprograms.io.Question6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputStreamFilterExample {

	public static void main(String ar[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter file name having data: ");
			String fileName1=sc.next();//myfile1
			
			System.out.print("Enter file name in which data have to be copy: ");
			String fileName2=sc.next();//myfile2
			
		FileReader fileReader=new FileReader("C:\\Users\\yoges\\eclipse-workspace\\javaprograms\\src\\javaprograms\\io\\Question6\\"+fileName1+".txt");
		FileWriter fileWriter=new FileWriter("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/exceptionhandling/Question6/"+fileName2+".txt",true);
		int x;
		while((x=fileReader.read())!=-1)
		{
			fileWriter.write((char)x);
		}
		fileReader.close();
		fileWriter.close();
		}
		catch(FileNotFoundException f1){
			System.out.println(f1);
		}
		catch(IOException i1){
			System.out.println(i1);
		}
		System.out.println("Data inserted successfully");
	}

}
