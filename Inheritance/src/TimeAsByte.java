import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
class TimeByte implements Serializable {
	
	/**
	 * 
	 */
	private int hour,min,sec;
	public TimeByte()
	{
		this.hour=0;
		this.min=0;
		this.sec=0;
	}
	public TimeByte (int hour , int min, int sec)
	{
		 	this.hour=hour;
		 	this.min = min;
		 	this.sec = sec;
	}
	public TimeByte add(TimeByte time2)
	{
		TimeByte time3 = new TimeByte();
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
	public static TimeByte valueOf(String s){
		String temp[] = s.split(":");
		return new TimeByte(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
	}
}

public class TimeAsByte  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("TimeAsByte.dat");
		ArrayList <TimeByte> al = null;
		if(f.exists()){
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TimeAsByte.dat"))){
				//al = (TimeByte)ois.readObject();
				TimeByte sum = new TimeByte();
				al = (ArrayList<TimeByte>)ois.readObject();
				for(TimeByte t : al)
				{
					sum = sum.add(t);
					System.out.println(t);
				}
				al.add(sum);
			}catch(Exception e){
				System.out.println(e);
			}		
		}
		else {
				SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
				TimeByte t = TimeByte.valueOf(s.format(new Date()));
				al = new ArrayList<TimeByte>();
				al.add(t);
		}
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TimeAsByte.dat"))){
			oos.writeObject(al);
		}catch(Exception e){
			
		}	
}
}