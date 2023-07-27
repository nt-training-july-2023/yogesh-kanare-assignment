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
		read=new FileReader("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/IO/Question3/originalfile.txt");
		bufferedReader=new BufferedReader(read);
		
		 write=new FileWriter("C:/Users/yoges/OneDrive/Desktop/NucleusTeq_Assignments/IO/Question3/revertfile.txt");
		while((line=bufferedReader.readLine())!=null)
		{
			revert.push(line);
		}
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