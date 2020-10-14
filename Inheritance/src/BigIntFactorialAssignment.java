import java.math.BigInteger;
import java.util.Scanner;

public class BigIntFactorialAssignment {
	static BigInteger factorial(int n) 
	{ 
		
		BigInteger f = new BigInteger("1");
		
		for (int i = 2; i <= n; i++) 
			f = f.multiply(BigInteger.valueOf(i)); 

		return f; 
	} 

	
	public static void main(String args[]) throws Exception 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n = sc.nextInt();
		//int n = 1000; 
		System.out.println("Factorial "+n+" IS:\t"+factorial(n)); 
	} 

}
