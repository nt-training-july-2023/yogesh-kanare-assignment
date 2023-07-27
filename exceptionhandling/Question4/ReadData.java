//Create a Java program that reads data from a text file specified by the user. The program should handle potential exceptions
//such as the file not found, permission issues, or other file-related exceptions gracefully using proper exception
// handling techniques. Provide appropriate error messages for each type of exception.

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ReadData
{

public static void main(String ar[])
{
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter file name: ");
		String fileName=sc.next();
		
	FileReader fileReader=new FileReader("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/exceptionhandling/Question4/"+fileName+".txt");
	int x;
	while((x=fileReader.read())!=-1)
	{
		System.out.print((char)x+"");
	}
	fileReader.close();
	}
	catch(FileNotFoundException f1){
		System.out.println(f1);
	}
	catch(IOException i1){
		System.out.println(i1);
	}
}
}