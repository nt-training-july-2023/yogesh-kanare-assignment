/*
 * Write a Java method that reads data from a text file specified by the user. 
 * The method should take the filename as a parameter and use the finally block to 
 * ensure that any resources (e.g., file streams) are closed properly, regardless of 
 * whether an IOException occurred during file reading or not.
 */
package exceptionhandling.q8.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileRead {

	static Reader fileRead;
	static BufferedReader readFile;
	static String line;
	public static void main(String[] args)throws IOException {
	try
	{
	System.out.print("Enter file name: ");
	
	//taking file name from user
	Scanner sc=new Scanner(System.in);
	String file=sc.next();
	
	fileRead=new FileReader("C:\\Users\\yoges\\eclipse-workspace\\javaprograms\\src\\exceptionhandling\\q8\\"+file+".txt");	
	readFile=new BufferedReader(fileRead);
	line=readFile.readLine();
	while(line!=null)
	{
		System.out.println(line);
		line=readFile.readLine();
	}
	}
	catch(IOException e)
	{
		e.getMessage();
	}
	finally
	{	
			try
			{
			fileRead.close();
			readFile.close();
			}
			catch(NullPointerException e1)
			{
				System.out.println("file not available");
			}			
			System.out.println("File closed successfully");
	}
}
}
