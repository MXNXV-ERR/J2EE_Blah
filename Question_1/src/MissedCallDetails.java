import java.util.Calendar;
public class MissedCallDetails {
	Calendar cal;
	long phno;
	public MissedCallDetails(Calendar cal, long phno) {
		this.cal = cal;
		this.phno = phno;
	}
	@Override
	public String toString() {
		String name=DataBaseCaller.getName(phno);
		if(name==null)
			name="Private caller";
		return "\n\nName:"+name+"\nPh No:\n"+phno+"Time:"+cal.getTime();
	}

	
}
