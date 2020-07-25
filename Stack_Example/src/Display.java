import java.util.LinkedList;

public class Display {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String> (); 
		
		names.push("John");
		names.push("Michael");
		names.push("Jay");
		
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
	}

}
