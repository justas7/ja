import java.util.Scanner;

public class UzduotisDvylika {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu: ");
		int x = obj.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("Sauleta");
			break;
		case 2:
			System.out.println("Lietinga");
			break;
		case 3:
			System.out.println("Vejuota");
			break;
		case 4:
			System.out.println("Sniegas");
			break;
		default:
			System.out.println("Tokio kodo nera");
		}
	}
}
