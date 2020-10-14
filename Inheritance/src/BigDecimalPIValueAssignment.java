import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalPIValueAssignment {
	
	
	public static void main(String args[]) {
   
    BigDecimal pi = new BigDecimal(Math.PI);
     
    System.out.println("Pi Value = "+pi);
    pi = pi.setScale(1000,RoundingMode.CEILING);
    System.out.println("Pi Value upto 1000 = "+pi);
   
	}
}
