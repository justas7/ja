import java.util.Scanner;

public class UzduotisSeptyni {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Kampas: ");
		int x = obj.nextInt();
		
		if(x==90) {
			System.out.println("Statusis");
		}else if(x==180) {
			System.out.println("Istiestinis");
		}else if(x==360) {
			System.out.println("Pilnutinis");
		}else if(x<0) {
			System.out.println("Kampo dydis turi buti teigiamas skaicius");
		}else {
			System.out.println("Pavadinimo nera");
		}
	}
}
