package loopAssighnments;

public class PrimeWithoutFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 25;
		
		for(int i=2; i < num; i++)
		{
			if(num%i == 0)
			{
				System.out.println(num+ " Is NOT PRIME:");
				break;
			
			}
			
				else {
					System.out.println(num +"  IS PRIME");
					break;
				}
			}
			
		

	}

}
