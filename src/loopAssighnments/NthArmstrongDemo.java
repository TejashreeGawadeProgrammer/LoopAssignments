package loopAssighnments;

import java.util.Scanner;

public class NthArmstrongDemo {
	public static void main(String[] args) {

        int n1,n2 ,num, temp, total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        n1 = sc.nextInt();
        System.out.println("Enter the second number ::");
        n2 = sc.nextInt();

        System.out.print("First Armstrong numbers from n1 to n2:");

        for(int i = n1; i <= n2; i++)
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
