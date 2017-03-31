import java.io.*;
import java.util.Scanner;

public class assignment6
{
	public static void main(String[] argv)
	{
		Logging l = new Logging("", true);
		
		a6.showLogOptions();

		if(a6.getLogOption() == 2)
		{
			l.setWriteFile(a6.getLogFile());
			l.setWriteTrue();
		}
		else
		{
			l.setWriteFalse();
		}
		
		Run();
	}
	
	public static void Run()
	{
		a6.showOptions();
		runOption(a6.getOption());
		Run();
	}
	
	public static void runOption(int option)
	{
		if (option == 1)
			a6.runOption1();
		else if (option == 2)
			a6.runOption2();
		else if (option == 3)
			a6.runOption3();
		else if (option == 4)
			a6.runOption4();
		else if (option == 5)
			a6.runOption5();
		else if (option == 6)
		{
			//EXIT
			System.exit(0);
		}
		else if (option == 7)
			a6.runOption7();
		else if (option == 8)
			a6.runOption8();
		else if (option == 9)
			a6.runOption9();
	}
	
}
