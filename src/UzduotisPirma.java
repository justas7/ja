import java.util.Scanner;

public class UzduotisPirma {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Skaicius: ");
		int x = obj.nextInt();
		
		if(x>0) {
			System.out.println(Math.sqrt(x));
		}else {
			System.out.println("Klaida");
		}

	}

}
