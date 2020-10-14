package loopAssighnments;

public class ArmstrongUptoLimit {
	public static void main(String[] args) {

        int n = 153, num, temp, total = 0;

        num = n;
        System.out.print("Armstrong numbers from 1 to 500:");

        for(int i = 1; i <= 500; i++)
        {
        num = i;
        while (num != 0)
        {
            temp = num % 10;
            //System.out.println("Temp:"+temp);
            total = total + temp*temp*temp;
            //System.out.println("Total:"+total);
            num= num/ 10;
            //System.out.println("Num:"+num);
        }

        if(total == i)
        {
            System.out.println(i + " ,");
        }
        total=0;
    }
	}
}
