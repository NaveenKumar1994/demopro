package demopro;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="Hello";
		
		StringBuffer sb = new StringBuffer(x);
		System.out.println(sb.equals(x));
		System.out.println(x.equals(sb));
	}

}
