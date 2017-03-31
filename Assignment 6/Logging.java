import java.io.*;
import java.util.Scanner;

public class Logging
{
	static boolean writeToFile;
	static String fileToWrite;
	
	public Logging()
	{
		writeToFile = false;
		fileToWrite = "";	
	}
	
	public Logging(String file, boolean write)
	{
		writeToFile = write;
		fileToWrite = file;
	}
		
	public void setWriteTrue()
	{
		writeToFile = true;
	}
	
	public void setWriteFalse()
	{
		writeToFile = false;
	}
	
	public void setWriteFile(String s)
	{
		fileToWrite = s;
	}
	
	public void write(String s)
	{
		System.out.println(s);
		
		if (writeToFile == true)
		{		
			try
			{	
				PrintWriter pw = new PrintWriter(new FileOutputStream(fileToWrite, true));			
				pw.println(s);
				pw.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not found. Please specify an existing file.");
			}
			catch(Exception e)
			{
				System.out.println("ERROR");
			}
		}
	}
		



}