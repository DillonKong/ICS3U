import java.util.Scanner;

public class p140ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] x = new int [1];
		x [1] = Integer.parseInt(scan.nextLine());
		int length = x.length;
		
		for (int i = 0; i <= length; i ++){
	//	x.charAt(i);
		x [i] = new Character (x.charAt(i));
		}
		

	}
}
