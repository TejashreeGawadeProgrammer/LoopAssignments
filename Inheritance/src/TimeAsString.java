import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
class Time {
	private int hour,min,sec;
	public Time()
	{
		this.hour=0;
		this.min=0;
		this.sec=0;
	}
	public Time (int hour , int min, int sec)
	{
		 	this.hour=hour;
		 	this.min = min;
		 	this.sec = sec;
	}
	public Time add(Time time2)
	{
		Time time3 = new Time();
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
	public static Time valueOf(String s){
		String temp[] = s.split(":");
		return new Time(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
	}
}

class TimeAsString{
	public static void main(String args[])
	{
		File f = new File("timeAsString.txt");
		Time t = null;
		if(f.exists()){
		try(BufferedReader b = new BufferedReader(new FileReader(f))){
		String line = "";
		t = new Time();
		while( (line = b.readLine())!=null){
		Time t1 = Time.valueOf(line);
		System.out.println(t1);
		t = t.add(t1);
		}
		}
		catch(Exception e){
		System.out.println(e);
		}
		}
		else{
		SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
		t = Time.valueOf(s.format(new Date()));
		}
		try(FileWriter fw = new FileWriter(f , true)){
		fw.write(t.toString()+"\n");

		}
		catch(Exception e){
		System.out.println(e);
		}	
	}
}