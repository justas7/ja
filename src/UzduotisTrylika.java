import java.util.Scanner;

public class UzduotisTrylika {
	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
		
	System.out.println("Iveskite menesi: ");
	int x = obj.nextInt();
	
	if(x >= 6 && x < 9) {
		System.out.println("Vasara");
	}else if(x >= 3 && x < 6) {
		System.out.println("Pavasaris");
	}else if (x >= 9 && x < 12) {
		System.out.println("Ruduo");
	}else if (x == 1 || x == 2 || x == 12) {
		System.out.println("Ziema");
	}else {
		System.out.println("Tokio menesio nera");
	}
}
}