package loopAssighnments;

public class PrimeNoDemo {
	
	public static void main(String args[]) {
		int num = 21;
		boolean flag = false;
		
		for(int i=2; i < num; i++)
		{
			if(num%i == 0)
			{
				System.out.println(num+ " Is NOT PRIME:");
				flag=true;
				break;
			
			}
		}
		if(flag==false)
		{
			System.out.println(num +" Is PRIME");
		}
		
	}

}
