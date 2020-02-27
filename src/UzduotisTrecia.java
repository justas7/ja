import java.util.Scanner;

public class UzduotisTrecia {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Prekes kaina: ");
		int x = obj.nextInt();
		
		System.out.println("Kiekis: ");
		int y = obj.nextInt();
		
		int nuolaida = (x*y)-(((x * y) * 20) / 100); 
		if(y>=3) {
			System.out.println("Suma: " + nuolaida);
		}else {
			System.out.println("Suma: " + x*y);
		}
	}
}
