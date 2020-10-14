import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RationalNumber{
	protected int num,den;
	
	public RationalNumber() {
		this.num = 0;
		this.den = 1;
	}
    
    public RationalNumber(int num, int den)
    {
        this.num = num;		
        this.den = den;		
    }

   

	public String toString()
    {
        return "(" + this.num + "/" + this.den + ")";
    }
    
    public RationalNumber add(RationalNumber rno1)
    {
    	RationalNumber result = new RationalNumber();
        result.num = this.num * rno1.den + rno1.num * this.den;
    	result.den = this.den * rno1.den;
    	result.simplyfy();
        return result;
    }
    public RationalNumber sub(RationalNumber rno1)
    {
    	RationalNumber result = new RationalNumber();
        result.num = this.num * rno1.den - rno1.num * this.den;
        result.den = this.den * rno1.den;
        result.simplyfy();
        return result;
    }
    public RationalNumber mul(RationalNumber rno1)
    {
    	RationalNumber result = new RationalNumber();
    	result.num = this.num * rno1.num ;
        result.den = this.den * rno1.den;
        result.simplyfy();
        return result;
    }
    public RationalNumber div(RationalNumber rno1)
    {
    	RationalNumber result = new RationalNumber();
    	result.num = this.num * rno1.den ;
        result.den = this.den * rno1.num;
        result.simplyfy();
        return result;
    }
    
    public int hashCode(){
    	return this.num + this.den;
	}
	public boolean equals(Object obj){
		return (this.hashCode() == obj.hashCode());
	} 
	public static RationalNumber valueOf(String s){
		String temp[] = s.split("/");
		return new RationalNumber(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
	}
	public int getGCD(int num, int den)
	{
		int gcd = 0;
		int i;
		if(num > den)
		{
			gcd = num;
		}
		else {
			gcd = den;
		}
		for(i=gcd;i>=1;i--) {
			if(num%i == 0 && den%i == 0) {
				break;
			}
		}
		return i;
	}
	
	public void simplyfy()
	{
		int gcd = getGCD(this.num, this.den);
		this.num /= gcd;
		this.den /= gcd;
	}
	
}

public class RationalDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int choice;
		
		RationalNumber n1, n2, res;
        RationalNumber r1 = new RationalNumber();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Enter 1st Rational Number (no1/no2) : ");	
			n1 = RationalNumber.valueOf(br.readLine());
			System.out.print("Enter 2nd Rational Number (no1/no2) : ");	
			n2 = RationalNumber.valueOf(br.readLine());
        do {
	    System.out.println("Rational Number Operation: ");
	    System.out.println("1			:			Addition ");
	    System.out.println("2			:			Subtraction ");
	    System.out.println("3			:			Multiplication ");
	    System.out.println("4			:			Division ");
	    System.out.println("5			:			Simplify ");
	    System.out.println("6			:			HashCodeEquality ");
	    System.out.println("7			:			Exit ");
	    System.out.println("Your Choice: ");
	    choice = Integer.parseInt(br.readLine());
	    
	    switch (choice) {
	    case 1:		 res = n1.add(n2);
        			 System.out.println("Addition Is :"+n1+" + "+n2+" = "+res);
        			 
        			 break;
	    
	    case 2:		 res = n1.sub(n2);
	    			 System.out.println("Subtraction Is :"+n1+" - "+n2+" = "+res);	
	      
	    			 break;
	    			 
	    case 3:		 res = n1.mul(n2);
		 			 System.out.println("Multiplication Is :"+n1+" * "+n2+" = "+res);	

		 			 break;
	    case 4:		 res = n1.div(n2);
		 			 System.out.println("Multiplication Is :"+n1+" / "+n2+" = "+res);	

		             break;
	    case 5:		 
	    			 r1.simplyfy();
	    			 break;
	    case 6:		 
	    			 System.out.println(" hashcode for n1 = " + n1.hashCode());
	    			 System.out.println(" hashcode for n1 = " + n2.hashCode());
	    			 System.out.println("Checking equality between n1 and n2 = " + n1.equals(n2));
		 			 break;
	    default: 	 
	    			 System.out.println("Invalid Choice.....");
	    			 break;
	  }
     }while(choice != 7) ;
    }catch(Exception e){
    	System.out.println(e);}
   }

}