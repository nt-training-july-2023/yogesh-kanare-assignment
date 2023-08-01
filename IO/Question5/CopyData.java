//Write a Java program that copies the content of one text file to another. The program should take the filenames
// of the source and destination files as user input. Implement exception
// handling to deal with potential IOExceptions that may occur during file reading and writing. Provide appropriate error 
//messages for file-related exceptions
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
class CopyData
{

public static void main(String ar[])
{
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter file name having data: ");
		String fileName1=sc.next();//myfile1
		
		System.out.print("Enter file name in which data have to be copy: ");
		String fileName2=sc.next();//myfile2
		
	FileReader fileReader=new FileReader("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/IO/Question5/"+fileName1+".txt");
	FileWriter fileWriter=new FileWriter("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/IO/Question5/"+fileName2+".txt",true);
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