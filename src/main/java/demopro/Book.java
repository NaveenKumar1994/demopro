package demopro;

import java.util.HashMap;
import java.util.Map;

public class Book {
	
	int id, quantity;
	String name,author;
	
	public Book(int id, int quantity, String name, String author) {
		this.id =id;
		this.name=name;
		this.author= author;
		this.quantity= quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", quantity=" + quantity + ", name=" + name + ", author=" + author + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Book> hm=new HashMap<Integer, Book>();
		Book book = new Book(10, 2, "Maths","K.S" );
		Book book2= new Book(20, 1, "Science","B.J");
		Book book3= new Book(30, 4, "History","S.G");
		
		hm.put(101, book);
		hm.put(102, book2);
		hm.put(103, book3);
		
		//Traversing
		for(Map.Entry<Integer, Book> map : hm.entrySet()){
			System.out.println(map.getKey()+" "+ map.getValue());
			/*
			 * int key = map.getKey(); Book b= map.getValue(); System.out.println(key +
			 * " Details");
			 * 
			 * System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
			 */
		}
	}

}
