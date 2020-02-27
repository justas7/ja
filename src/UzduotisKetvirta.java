import java.util.Scanner;

public class UzduotisKetvirta {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Deziu kiekis: ");
		int n = obj.nextInt();
		
		System.out.println("Masinos talpa: ");
		int m = obj.nextInt();
		
		int k = n / m;
		
		if(n % m != 0) {
			System.out.println("Vaziavimai:  "+ (k + 1));
		}else {
			System.out.println("Vaziavimai:  " + k);
		}

	}

}
