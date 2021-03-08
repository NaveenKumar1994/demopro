package demopro;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a = new ArrayList<String>();
		a.add("John");
		a.add("Jonny");
		a.add("David");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("coke");
		al.add("pepsi");
		ArrayList<String> e = new ArrayList<String>();
		
		System.out.println("ArrayList elements are :");
		System.out.println(a.get(2));
		a.add(2,"Dani");
		System.out.println(a);
		System.out.println("2 ArrayList elements are :"+al);
		a.addAll(2,al);
		System.out.println(a.contains("Johne"));
		
	}

}
