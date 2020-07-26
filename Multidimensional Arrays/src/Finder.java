
public class Finder {

	public static void main(String[] args) {
		int[][] a = {
				{1, 4, 7},
				{8, 5, 2, 55, 89},
				{9, 6, 3}
		};
		
		for(int i=0; i< a.length; i++) {
			for(int j = 0; j<a[i].length; j++){
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}
