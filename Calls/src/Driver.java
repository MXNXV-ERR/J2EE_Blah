import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {
	private Driver() {
		// TODO Auto-generated constructor stub
		DataBaseCaller.create();
	}
	public static void main(String[] args) {
		//DataBaseCaller book=new DataBaseCaller();
		Driver d=new Driver();
		Scanner sc= new Scanner(System.in);
		LinkedList<MissedCallDetails> miss=new LinkedList<>();
		Calendar cal=Calendar.getInstance();
		while(true)
		{
			System.out.println("****Menu*******");
			System.out.println("1.New Contact\n2.New missed Call\n3.Display phBook\n4.Dsiplay missed call\n5.Del contact\n6.EXIT\nEnter your choice:");
			int i=sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Enter  ph no");
				long key=sc.nextLong();
				System.out.println("Enter name");
				String value=sc.next();
				DataBaseCaller.phBook.put(key, value);
				break;
			case 2:
				if(miss.size()==2)
					miss.removeFirst();
				System.out.println("Enter missed call number");
				long phno=sc.nextLong(); 
				String name;
				if(DataBaseCaller.phBook.get(phno)==null)
					name="Private caller";
				else
					name=DataBaseCaller.phBook.get(phno);
				miss.add(new MissedCallDetails(cal, phno, name));
				break;
			case 3:DataBaseCaller.display();
				break;
			case 4:System.out.println("Misssed call details");
				for (MissedCallDetails m : miss) {
				System.out.println(m);
			}
				break;
			case 5:
				break;
			case 6:System.exit(0);
			default:System.out.println("Why?????jus Why???");
				break;
			}
		}
	}
}
