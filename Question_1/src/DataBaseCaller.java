import java.util.HashMap;
import java.util.Map;

public class DataBaseCaller {
	private static HashMap<Long, String> phBook=new HashMap<>();
	static
	{	//Some default values in Phone book
		phBook.put(6872687216l, "Person 1");
		phBook.put(6515466854l, "Person 2");
		phBook.put(6125411354l, "Person 3");
		phBook.put(6515141545l, "Person 4");
	}
	public static String getName(long phno)
	{
		return phBook.get(phno);
	}
	public static void addNewContact(String name,long phno)
	{
		phBook.put(phno, name);
	}
	public static void display() 
	{
		System.out.println("\n()()()()()()()()Phone book()()()()()()()()()");
		System.out.printf("| %-15s | %-12s |%n","Name","Phno");
		for (Map.Entry<Long,String> i : phBook.entrySet())
			System.out.printf("| %-15s | %-12s |%n",i.getValue(),i.getKey());
	}
	public static void delete(long phno)
	{
		if(phBook.remove(phno)==null)
			System.out.println("NO SUCH NUMBER");
		else
			System.out.println("Removing.........done");
	}
}
