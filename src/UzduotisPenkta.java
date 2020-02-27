import java.util.Scanner;

public class UzduotisPenkta {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Pazimys: ");
		int x = obj.nextInt();
		
		switch(x) {
		case 10:
			System.out.println("Puikiai");
			break;
		case 9:
			System.out.println("Labai gerai");
			break;
		case 8:
			System.out.println("Gerai");
			break;
		case 7:
			System.out.println("Vidutiniskai");
			break;
		case 6:
			System.out.println("Reikia daugiau pastangu");
			break;
		case 5:
			System.out.println("Prastai");
			break;
		case 4:
			System.out.println("Patenkinamai");
			break;
		case 3:
			System.out.println("Nepatenkinamai");
			break;
		case 2:
			System.out.println("*_*");
			break;
		default:
			System.out.println("Nera tokio pazymio");
		}
	}
}
