import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Stack;
class RevertLine
{
		static String line;
		static Stack<String> revert=new Stack<>();
		static FileWriter write;
		static FileReader read;
		static BufferedReader bufferedReader;
	public static void main(String ae[])
	{
		try
		{ 
		//file where data is present
		read=new FileReader("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/IO/Question3/originalfile.txt");
		bufferedReader=new BufferedReader(read);
		
		//file where data have to be stored in reverse order
		write=new FileWriter("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/IO/Question3/revertfile.txt");
		
		//in stack the data is pushed
		while((line=bufferedReader.readLine())!=null)
		{
			revert.push(line);
		}
		
		//data is stored in reverfile.txt 
		while(!revert.isEmpty())
		{
			write.write(revert.pop()+"\n");
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	finally
	{
		try{
			read.close();
			bufferedReader.close();
			write.close();
		}catch(Exception e){}
	}		
		System.out.println("file copied in reverse order");
	}
}