package demopro;

public class Singleton {

	private static Singleton new_instance = null;
	public String str;

	private Singleton() {
		str = "Single String";
	}

	public static Singleton getInstance() {
		if (new_instance == null) {

			new_instance = new Singleton();
		}
		return new_instance;
	}

}
