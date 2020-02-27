import java.util.Scanner;

public class UzduotisDevyni {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu: ");
		int a = obj.nextInt();
		
		System.out.println("Iveskite skaiciu: ");
		int b = obj.nextInt();
		
		System.out.println("Iveskite skaiciu: ");
		int c = obj.nextInt();
		
		if((a+b)>c) {
			System.out.println("Trikampi sudaryti galima");
		}else {
			System.out.println("Trikampio sudaryti negalima");
		}
	}
}
