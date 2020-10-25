import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World Program");
		String str = "Pune is the City";
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("one2");
		ls.add("Two2");
		ls.add("Three3");
		ls.add("Four4");
		ls.add("Five6");

		
		for(String s : ls) {
			if(s.length() < 4)
				
			System.out.println(s);
		}
		
		String[] st = str.split(" ");
		for(String sp : st)
		{
			System.out.println(sp);
		}
			
		
		
	}

}
