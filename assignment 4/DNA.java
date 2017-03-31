import java.io.*;

public class DNA
{
	public static void main(String[] files)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(files[0]));
			PrintWriter pw = new PrintWriter(new FileOutputStream(files[1]));
			
			String line = null;					
			while((line = br.readLine()) != null)
			{
				System.out.println(Complement(line));
				pw.println(Complement(line));
				System.out.println(revComplement(line));
				pw.println(revComplement(line));
			}
			
			br.close();		
			pw.close();
		}
			
		catch(IOException e)
		{
		System.out.println("IO ERROR");
		}
		catch(Exception e)
		{
		System.out.println("ERROR");
		}
	}
	
	public static String Complement(String s)
	{
		String comp = "";
		for (int i = 0; i < s.length(); ++i)
		{
			char c = s.charAt(i);
			
			if (c == 'A')
				comp += "T";
			else if (c == 'T')
				comp += "A";
			else if (c == 'G')
				comp += "C";
			else if (c == 'C')
				comp += "G";
		}
		return comp;	
	}

	public static String revComplement(String s)
	{
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			rev += s.charAt(i);
		}
		
		return Complement(rev);	
	}
}