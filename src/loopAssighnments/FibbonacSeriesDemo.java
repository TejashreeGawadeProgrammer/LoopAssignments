package loopAssighnments;

public class FibbonacSeriesDemo {

	public static void main(String[] args) {
		int num=6;
		int f1;
		int f2=0,f3=1;
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(" "+f3+" ");
			f1=f2;
			f2=f3;
			f3=f2+f1;
		}
		

	}

}
