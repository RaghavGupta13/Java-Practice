
public class NumberShapes {
	

	public static void main(String[] args) {	
		
		class Number{
			int number;
			
			public boolean isSquare() {
				int y = 1;
				int sqNumber = 1;
				
				while(sqNumber < number) {
					sqNumber = sqNumber ^ 2;
					sqNumber++;
					
				}
				if(sqNumber == number) {
					return true;
				}
				else {
					return false;
				}
			}
			
			public boolean isTriangular(){
				int x = 1;
				int triangularNumber = 1;
		
				while (triangularNumber < number) {
					x++;
					triangularNumber = triangularNumber + x;
				}
				
		
				if(triangularNumber == number) {
					return true;
				}else {
					return false;
				} 
			}
		}
		
		Number num = new Number();
		num.number = 144;
		
		System.out.println("Is it a square number? " + num.isSquare());	
		System.out.println("Is it a triangular number? " + num.isTriangular());
	}
}
			
			
		
