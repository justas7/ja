import java.util.Scanner;

public class UzduotisAntra {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Skaicius: ");
		int x = obj.nextInt();
		
		if(x>=4 && x%4==0) {
			System.out.println("Kvadrata sudaryti galima");			
		}else{
			System.out.println("Kvadrato sudaryti negalima");	
		}
	}
}
