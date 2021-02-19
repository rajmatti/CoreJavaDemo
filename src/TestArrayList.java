import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("michael");
		al.add("james");
		al.add("andy");
		
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
           System.out.println(al.get(1));
           al.add(3, "Raj");  // adding element in specified index
           al.remove(0);  // delete the content
           al.set(1, "Java"); // replace existing content
           
           
		System.out.println("***** Display using For Each Loop");
		for(String i:al)  // for each loop
		{
			System.out.println(i);
		 }
	}

}
