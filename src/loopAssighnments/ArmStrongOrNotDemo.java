package loopAssighnments;

public class ArmStrongOrNotDemo {
	public static void main(String[] args) {

        int n = 153, num, temp, total = 0;

        num = n;
        while (num != 0)
        {
            temp = num % 10;
            System.out.println("Temp:"+temp);
            total = total + temp*temp*temp;
            System.out.println("Total:"+total);
            num= num/ 10;
            System.out.println("Num:"+num);
        }

        if(total == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }

}
