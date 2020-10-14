import java.io.*;
class TimeAssign {
	private int hour,min,sec;
	public TimeAssign()
	{
		this.hour=0;
		this.min=0;
		this.sec=0;
	}
	public TimeAssign (int hour , int min, int sec)
	{
		 	this.hour=hour;
		 	this.min = min;
		 	this.sec = sec;
	}
	public TimeAssign add(TimeAssign time2)
	{
		TimeAssign time3 = new TimeAssign();
	    time3.sec = this.sec + time2.sec;
	    time3.min = this.min + time2.min;
	    time3.hour = this.hour + time2.hour;
		if(time3.sec>=60){
			time3.sec -= 60;
			time3.min++;
		}
		if(time3.min>=60){
			time3.min -= 60;
			time3.hour++;
		}
		return time3;
	}
	public String toString(){
		return this.hour+":"+this.min+":"+this.sec; 
	}
	public int hashCode(){
		return this.hour*3600 + this.min*60+this.sec;
	}
	public boolean equals(Object obj){
		return (this.hashCode() == obj.hashCode());
	} 
	public static TimeAssign valueOf(String s){
		String temp[] = s.split(":");
		return new TimeAssign(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
	}
}

class AddTime{
	public static void main(String args[])
	{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Enter 1st time (hh:min:sec) : ");	
			TimeAssign t1 = TimeAssign.valueOf(br.readLine());
			System.out.print("Enter 2nd time (hh:min:sec) : ");	
			TimeAssign t2 = TimeAssign.valueOf(br.readLine());
			TimeAssign sum = t1.add(t2);
			System.out.println(t1);
			System.out.println(t2);
			System.out.println(sum);
		}catch(Exception e){
			System.out.println(e);
		}
				
	}
}