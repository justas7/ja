import java.util.Scanner; 

public class UzduotisDesimt {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu: ");
		int a = obj.nextInt();
		
		System.out.println("Iveskite skaiciu: ");
		int b = obj.nextInt();
		
		System.out.println("Iveskite skaiciu: ");
		int c = obj.nextInt();
		
		if(a%2 == 0 || b%2 == 0 || c%2 == 0) {
			System.out.println("Taip");
		}else {
			System.out.println("Ne");
		}
	}
}
