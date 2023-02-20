import java.util.HashMap;

public class DataBaseCaller {
	static HashMap<Long, String> phBook=new HashMap<>();

	public static void create()
	{
		phBook.put(6872687216l, "Person 1");
		phBook.put(6515466854l, "Person 2");
		phBook.put(6125411354l, "Person 3");
		phBook.put(6515141545l, "Person 4");
	}
	public static void display() {
		// TODO Auto-generated method stub
		System.out.println("************Database Callers*********");
		System.out.println(phBook);
		
	}
}
