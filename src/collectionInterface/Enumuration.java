package collectionInterface;

import java.util.Enumeration;
import java.util.Vector;

public class Enumuration {
	
	public static void main(String[] args) {
		 Vector<String> v = new Vector();
		 v.add("a");
		 v.add("b");
		 v.add("c");
		 Enumeration<String> elements = v.elements();
		 
		 while(elements.hasMoreElements())
		 {
			 String nextElement = elements.nextElement();
			 System.out.println(nextElement);
		 }
	}

}
