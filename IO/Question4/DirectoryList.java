//Write a Java program to get a list of all file/directory names from the directory: C://Documents.

import java.io.File;
class DirectoryList
{
	// static void files(allfile[],int fileIndex)
	// {
		
	// }
	public static void main(String ar[])
	{
	
	String maindirectoryPath="C:\\Users\\yoges\\OneDrive\\Desktop\\NucleusTeq_Assignments";	
	
	File mainDirectoryName=new File(maindirectoryPath);
	
	if(mainDirectoryName.exists()&&mainDirectoryName.isDirectory())
	{
		File allfiles[]=mainDirectoryName.listFiles();
		for(File files:allfiles)
		{
			if(files.isFile())
			System.out.println("File :   "+files);
		else 
		if(files.isDirectory())
		{
			System.out.println("Directory: "+files);
		}
		}
		
	}
	}
	}