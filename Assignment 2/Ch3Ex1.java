import java.lang.Math; 
import java.util.Scanner;  

public class Ch3Ex1 
	{  
    public static void main(String[] argv) 
		{  
        System.out.print("Please enter a number to find the sqaure root: ");  
        Scanner input = new Scanner(System.in);  
        
		//establish input and variables
        double r;  
        double n = input.nextDouble();  
        double guess = n/2;  
        double pre = 0.0;  
           
		//repeat forumla until within 1%
        while(Math.abs(pre-guess) > (guess/100))  
                {  
                    pre = guess;  
                    r = n/guess;  
                    guess = (guess+r)/2;  
                }  
          
		//display result
        System.out.printf("%.2f%n",guess);
    }  
}