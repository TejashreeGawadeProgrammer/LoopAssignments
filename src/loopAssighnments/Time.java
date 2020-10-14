package loopAssighnments;

public class Time {
int hour,min,sec;
	public Time()
	{
		hour=0;
		min=0;
		sec=0;
	}
	public Time (int h , int m, int s)
	{
		 	hour=h;
		 	min=m;
		 	sec=s;
	}
	void display()
	{
		System.out.println(hour+":"+min+":"+sec);
	}
	public Time add(Time time2)
	{
		 Time time3 = new Time();
	        time3.sec = sec + time2.sec;
	        time3.min = min + time2.min;
	        time3.hour = hour + time2.hour;
		return time3;
		
	}
	 
}
class AddTime{
	public static void main(String args[])
	{
		Time time1=new Time(2,45,45);
		Time time2=new Time(3,45,45);
		Time time3=new Time();
		
		time3 = time1.add(time2);
		time1.display();
		time2.display();
		time3.display();
	}
}
