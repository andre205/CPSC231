public class Ch3Ex8
{
	public static void main(String[] argv)
	{	
		int T = 0;
		int O = 0;
		int G = 0;
		int D = 0;
		
		int toototal = 0;
		int goodtotal = 0;
	
		//TOO + TOO + TOO + TOO = GOOD
		//4 (TOO)
		
			//Iterate through each letter 1-9, check after each change for equality/solution
			for (int i = 0; i < 10; ++i)
			{
				D = i;
	
				for (int j = 0; j < 10; ++j)
				{
					G = j;		
					
					for (int k = 0; k < 10; ++k)
					{
						O = k;
							
						for (int l = 0; l <10; ++l)
						{
							T = l;
							
							toototal = 4 * ((100*T)+(10*O)+O);		
							goodtotal = ((1000*G)+(100*O)+(10*O)+D);
							
							//make sure unique then print solution
							if ((toototal == goodtotal) && (T != G) && (T != O) && (T != D) && (O != D) && (O != G) && (D != G))
							{
										
							System.out.println("SOLVED");
							System.out.println("T: " + T);
							System.out.println("O: " + O);
							System.out.println("G: " + G);
							System.out.println("D: " + D);									
							}	
						}
					}
				}
			}
	}
	
}