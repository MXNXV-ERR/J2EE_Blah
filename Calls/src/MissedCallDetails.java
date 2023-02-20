import java.util.Calendar;

public class MissedCallDetails {
	Calendar cal;
	long phno;
	String name;
	public MissedCallDetails(Calendar cal, long phno, String name) {
		super();
		this.cal = cal;
		this.phno = phno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "MissedCallDetails [Time=" + cal.getTime() + ", phno=" + phno + ", name=" + name + "]";
	}
//	void display()
//	{
//		System.out.println("Time"+cal.getTime());
//		System.out.println("Number"+phno);
//		System.out.println("Name"+name);
//		
//	}
	
}
