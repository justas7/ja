import java.util.Scanner;

public class UzduotisSesi {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Skaicius: ");
		int x = obj.nextInt();
		
		if(x>0) {
			System.out.println("Teigiamas");
		}else if(x<0) {
			System.out.println("Neigiamas");
		}else if (x == 0) {
			System.out.println("Nulis");
		}else {
			System.out.println("Klaida");
		}
}
}