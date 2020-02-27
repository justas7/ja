import java.util.Scanner;

public class UzduotisAstuoni {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Ar skaicius yra trizenklis? ");
		int x = obj.nextInt();
		
		if(x>=100 && x<1000) {
			System.out.println("Taip");
		}else {
			System.out.println("Ne");
		}
	
}
}