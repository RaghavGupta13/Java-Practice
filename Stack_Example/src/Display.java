import java.util.LinkedList;

public class Display {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String> (); 
		
		names.add("John");
		names.add("Michael");
		names.add("Jay");
		
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}

}
