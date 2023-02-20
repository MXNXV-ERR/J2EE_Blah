import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
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
				long phno=sc.nextLong();
				System.out.println("Enter name");
				String name=sc.next();
				DataBaseCaller.addNewContact(name, phno);
				break;
			case 2:
				if(miss.size()==10)
					miss.removeFirst();
				System.out.println("Enter missed call number");
				phno=sc.nextLong(); 
				miss.add(new MissedCallDetails(cal,phno));
				break;
			case 3:DataBaseCaller.display();
				break;
			case 4:System.out.println("Misssed call details::");
				for (MissedCallDetails m : miss)
					System.out.println(m);
				break;
			case 5:System.out.println("Enter phone number to delete");
				phno=sc.nextLong();
				DataBaseCaller.delete(phno);
				break;
			case 6:System.exit(0);
			default:System.out.println("Why?????jus Why???");
				break;
			}
		}
	}
}
