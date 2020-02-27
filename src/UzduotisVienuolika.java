import java.util.Scanner;

public class UzduotisVienuolika {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu: ");
		int a = obj.nextInt();
		
		System.out.println("Iveskite skaiciu: ");
		int b = obj.nextInt();
		
		System.out.println("Iveskite skaiciu: ");
		int c = obj.nextInt();
		
		if(a >= 100 && b < 100 && c < 100) {
			System.out.println("Tik vienas didesnis uz 100");
		}else if(a < 100 && b >= 100 && c < 100) {
			System.out.println("Tik vienas didesnis uz 100");
		}else if(a < 100 && b < 100 && c >= 100) {
			System.out.println("Tik vienas didesnis uz 100");
		}else {
			System.out.println("Daugiau nei vienas didesnis uz 100");
		}
	}
}
