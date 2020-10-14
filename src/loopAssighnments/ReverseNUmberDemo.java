package loopAssighnments;

public class ReverseNUmberDemo {
	
	public static void main(String args[])
	{
		int num=32;
	      int reverse =0;
	     
	      while( num != 0 )
	      {
	    	  reverse = reverse * 10;
	    	  reverse = reverse + num%10;
	          num = num/10;
	          
	      }

	      System.out.println("Reverse of input number is: "+reverse);
	}

}
