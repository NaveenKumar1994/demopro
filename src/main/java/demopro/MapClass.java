package demopro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h = new HashSet<String>();
		h.add("Naveen");
		h.add("Kumar");
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Jonny");
		m.put(2, "John");
		m.put(4, "Ketty");
		m.put(3, "Kee");

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(11, "AAA");
		hm.put(22, "BB");
		
		Iterator<String> it = h.iterator();
		for(String s : h)
			System.out.println(s);
		Iterator<Integer> i = hm.keySet().iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
		System.out.println("----------------------------");
		for(Map.Entry<Integer,String> entry: m.entrySet())
			System.out.println(entry.getKey()+" -- "+entry.getValue());
	
	}

}
