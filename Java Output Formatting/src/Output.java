import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next(); 
            int x=sc.nextInt();
            
            String y = String.format("%03d", x);
            String z = String.format("%-15s", s1);
            System.out.println(z + y);
        }
        System.out.println("================================");
        sc.close();
}
}
