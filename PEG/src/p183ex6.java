import java.util.Scanner;

public class p183ex6 {
//Pascal's Triangle
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		
		int r, num;
	    for (int i = 0; i < t; i++) {
	        num = 1;
	        r = i + 1;
	        
	        for (int x = 0; x <= i; x++) {
	            if (x > 0) {
	                num = num * (r - x) / x;    
	            }
	            System.out.print(num);
	        }
	        System.out.println();
	    }
	}
}
