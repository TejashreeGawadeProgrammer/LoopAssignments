package loopAssighnments;

import java.util.Scanner;

public class PrimeUptoN {
	public static void main(String args[])
	{
		
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int num = scan.nextInt();
        
        System.out.println("List of the prime number Upto " + num);
        for (int n=2; n<=num; n++)
        {
        	boolean flag = false;
        	for(int i=2; i<= n/2; i++)
        	{
        		if(n% i == 0)
        		{
        			flag=true;
        			break;
        		}
        	}
        	if(flag == false)
        	{
        		System.out.println("Prime NO:"+n);
        	}
        }
        
	}

}
