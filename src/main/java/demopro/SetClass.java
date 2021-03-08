package demopro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count[] = { 10,21, 21, 23, 40 };
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < 5; i++) {
			s.add(count[i]);
		}
		System.out.println(s);

		
		  TreeSet<Integer> t = new TreeSet<Integer>(s);
		  System.out.println("Elements are : "+t);
		  System.out.println((Integer)t.first());
		  System.out.println((Integer)t.last());
		 
	}

}
