import java.io.*;
import java.util.Scanner;

public class a6
{
	static boolean writeToFile = false;
	static String fileToWrite = "";
	
	//Ask about logging
	public static void showLogOptions()
	{
		System.out.println("Would you like to:");
		System.out.println("1. Print results to standard output?");
		System.out.println("2. Print results to a log file in addition to standard output?");
	}
	
	//Get the user's response (keep trying until they enter a # that is either 1 or 2)
	public static int getLogOption()
	{
		int option = 0;
		System.out.println("Please enter an integer response and press enter");	
		
		Scanner input = new Scanner(System.in);
		try 
		{
			option = input.nextInt();			
		}
		catch(Exception e)
		{
			System.out.println("Please try again.");
			getOption();			
		}
		
		if (option > 2 || option < 0)
		{
			System.out.println("Please try again.");
			getOption();
		}
		
		return option;
	}
	
	//Ask for logfilename and make sure write is set to true
	public static String getLogFile()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the log file. If it does not exist, it will be created. (Ex. logfile.txt)");
		String f = input.nextLine();
		writeToFile = true;
		fileToWrite = f;
		return f;
	}
	
	//Print the 6 options to the screen
	public static void showOptions()
	{
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("Select an option listed below:");
	System.out.println("1. List the contents of a directory");
	System.out.println("2. List the contents of a directory as well as all of its sub directories");
	System.out.println("3. Locate a file with a given name");
	System.out.println("4. Locate files with a given file extension");
	System.out.println("5. Concatenate the contents of 2 files and output the result to a third file");
	System.out.println("6. Exit");
	System.out.println("-------------EC-----------");
	System.out.println("7. Locate files that contain a given sequence of letters");
	System.out.println("8. Get the free space available in a given directory");
	System.out.println("9. Open the log file");
	}
	
	//Get the user's response (keep trying until they enter a #)
	public static int getOption()
	{
		int option = 0;
		System.out.println("Please enter an integer response and press enter");	
		
		Scanner input = new Scanner(System.in);
		try 
		{
			option = input.nextInt();			
		}
		catch(Exception e)
		{
			System.out.println("Please try again.");
			getOption();			
		}
		
		if (option > 9 || option < 0)
		{
			System.out.println("Please try again.");
			getOption();
		}
			
		return option;
	}
	
	public static void runOption1()
	{
		//Create logging and scanner objects
		Logging l = new Logging(fileToWrite, writeToFile);
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a path.");
		try
		{
			//Get path, see if it is a file, if not have them try again
			String path = input.nextLine();
			File f = new File(path);
			
			//if it is, list its contents. iterate through the string array and print each file
			String[] fileArray = f.list();

			for (int i=0; i<fileArray.length; ++i)
			{
				l.write(fileArray[i]);
			}
		}
		catch (Exception e)
		{
			System.out.println("Please try again.");
			runOption1();
		}		
	}
	
	//Same as option 1, but this one utilizes the printallcontents method defined below
	public static void runOption2()
	{	
		Logging l = new Logging(fileToWrite, writeToFile);
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a path.");
		try
		{
			String path = input.nextLine();
			File f = new File(path);
			printAllContents(f);
		}
		catch (Exception e)
		{
			System.out.println("Please try again.");
			runOption2();
		}	
	}
	//recursively prints directory's files as well (used in option 2)
	public static void printAllContents(File f)
	{
		Logging l = new Logging(fileToWrite, writeToFile);
		File[] fileArray = f.listFiles();
		for (int i=0; i<fileArray.length; ++i)
		{
			//if it's a file, print its name
			if (fileArray[i].isFile())
				l.write(fileArray[i].toString());
			//if it's not a file, its a dir, so print all its contents
			else
			{
				printAllContents(fileArray[i]);
			}		
		}
	}
	
	//Option 3 - uses searchForFile method defined below. Rerun if error.
	public static void runOption3()
	{
		Logging l = new Logging(fileToWrite, writeToFile);
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Please enter the name of the file to locate.");
			String file = input.nextLine();
			System.out.println("Please enter the folder to search in.");
			String folder = input.nextLine();
			
			System.out.println("Searching for files...");
			
			searchForFile(file, new File(folder));			
		}
		catch(Exception e)
		{
			System.out.println("Please try again");
			runOption3();
		}				
	}
	
	//Searches for a file name using a similar method to printallcontents
	public static void searchForFile(String fname, File searchfolder)
	{
		Logging l = new Logging(fileToWrite, writeToFile);
		File[] allfiles = searchfolder.listFiles();
			
		for (int i=0; i<allfiles.length; ++i)
		{
			//if file, compare name to search, if equal, print it
			if (allfiles[i].isFile())
			{
				if (fname.equalsIgnoreCase(allfiles[i].getName()))
					l.write("File found at: "+ allfiles[i].getParentFile());
			}
			//if dir, search that
			else
			{
				searchForFile(fname, allfiles[i]);
			}		
		}
	}
		
	//Searches for a file extension using a the same method as searchforfile
	public static void searchForExt(String fname, File searchfolder)
	{
		Logging l = new Logging(fileToWrite, writeToFile);
		File[] allfiles = searchfolder.listFiles();
			
		for (int i=0; i<allfiles.length; ++i)
		{
			//if file, compare name to search, if equal, print it
			if (allfiles[i].isFile())
			{
				//Only thing different - checks if file name CONTAINS the extension specified
				if (allfiles[i].getName().contains(fname))
					l.write("File found at: "+ allfiles[i].getParentFile());
			}
			//if dir, search that
			else
			{
				searchForExt(fname, allfiles[i]);
			}		
		}
	}
	
	//Option 4 (same as 3, but uses searchForExt
	public static void runOption4()
	{
		Logging l = new Logging(fileToWrite, writeToFile);
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Please enter the name of the extension to locate.");
			String ext = input.nextLine();
			System.out.println("Please enter the folder to search in.");
			String folder = input.nextLine();
			
			System.out.println("Searching for files...");
			
			searchForExt(ext, new File(folder));			
		}
		catch(Exception e)
		{
			System.out.println("Please try again");
			runOption4();
		}	
	}
	
	//Get the 3 file names, make br's for the 2 read files and a printwriter for the file to write
	//Print the contents of f1 to f3, then append f2.
	//If there is an error, rerun the option. (prompt for files again)
	public static void runOption5()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the first file.");
		String f1 = input.nextLine();
		System.out.println("Please enter the name of the second file.");
		String f2 = input.nextLine();
		System.out.println("Please enter the name of the third file to output to.");
		String f3 = input.nextLine();

		try
		{
		BufferedReader br = new BufferedReader(new FileReader(f1));
		BufferedReader br2 = new BufferedReader(new FileReader(f2));
		PrintWriter pw = new PrintWriter(new FileOutputStream(f3, true));
		
		String line = null;		
		while((line = br.readLine()) != null)
		{
			pw.println(line);
		}
		br.close();
		
		while((line = br2.readLine()) != null)
		{
			pw.println(line);
		}
		br2.close();
		pw.close();
		}
		catch(IOException e)
		{
		System.out.println(e);
		runOption5();
		}
		catch(Exception e)
		{
		System.out.println("ERROR");
		runOption5();
		}		
	}
	
	//Check if files contain these letters (already made it for the extension search so I figured I could repurpose it for this too)
	public static void runOption7()
	{
		Logging l = new Logging(fileToWrite, writeToFile);
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Please enter the phrase you would like the file to contain.");
			String combo = input.nextLine();
			System.out.println("Please enter the folder to search in.");
			String folder = input.nextLine();
			
			System.out.println("Searching for files...");
			
			searchForExt(combo, new File(folder));			
		}
		catch(Exception e)
		{
			System.out.println("Please try again");
			runOption7();
		}	
	}
	
	public static void runOption8()
	{
		Logging l = new Logging(fileToWrite, writeToFile);
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Please enter the directory you would like to find the space remaining in.");
			String dir = input.nextLine();
			
			File f = new File(dir);
			long freespace = f.getFreeSpace();
			l.write("Free space: " + freespace/1000000 + " megabytes");
				
		}
		catch(Exception e)
		{
			System.out.println("Please try again");
			runOption8();
		}	
	}
	
	//I found this on stackoverflow (the processbuilder part). Thought it would be cool to implement a way to access the log file easier
	public static void runOption9()
	{
		Scanner input = new Scanner(System.in);
		Logging l = new Logging(fileToWrite, writeToFile);
		
		try
		{
			//If they chose to log what they are doing already, open the file that they are logging to
			if (writeToFile)
			{
				l.write("OPENED LOG FILE");
				ProcessBuilder pb = new ProcessBuilder("Notepad.exe", fileToWrite);
				pb.start();
			}
			
			//if they are not currently logging (they chose 1 at the beginning), then ask what log file they want to open.
			else
			{
				System.out.println("Please enter the name of the log file");
				String fname = input.nextLine();
				
				l.write("OPENED LOG FILE");
				ProcessBuilder pb = new ProcessBuilder("Notepad.exe", fname);
				pb.start();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Please enter the name of an existing file");
			runOption9();
		}	
	}
}