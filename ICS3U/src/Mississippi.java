

public class Mississippi {

	public static void main(String[] args) {

		letterM (); 
		letterI();
		letterS();
		letterS();
		letterI();
		letterS();
		letterS();
		letterI();
		letterP();
		letterP();
		letterI();
	}

	public static void letterM (){
		System.out.println("M      M");
		System.out.println("MM    MM");
		System.out.println("M M  M M");
		System.out.println("M  M   M");
		System.out.println("M      M");
		System.out.println("M      M");
		System.out.println("M      M");
		System.out.println("");
	}
	public static void letterI(){
		System.out.println("IIIII");
		for (int i = 0; i < 5; i ++)
		System.out.println("  I");
		System.out.println("IIIII");
		System.out.println("");
	}
	public static void letterS(){
		System.out.println(" SSSSS");
		System.out.println("S     S");
		System.out.println("S");
		System.out.println(" SSSSS");
		System.out.println("      S");
		System.out.println("      S");
		System.out.println(" SSSSS");
		System.out.println("");
	}
	public static void letterP(){
		System.out.println(" PPPPP");
		System.out.println("P     P");
		System.out.println("P      P");
		System.out.println("P     P");
		System.out.println(" PPPPP");
		for (int i = 0; i < 3; i ++)
		{
			System.out.println("P");
		}
		System.out.println("");
	}
}
