import java.util.Scanner;

public class UzduotisKeturiolika {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu: ");
		int a = obj.nextInt();
		
		System.out.println("Iveskite operatoriu: ");
		String c = obj.next();
		
		System.out.println("Iveskite skaiciu: ");
		int b = obj.nextInt();
		
		switch(c) {
		case "+":
			System.out.println(a + "+" + b + " = " +(a + b));
		break;
		case "-":
			System.out.println(a + "-" + b + " = " +(a - b));
		break;
		case "*":
			System.out.println(a + "*" + b + " = " + (a * b));
		break;
		case "/":
			System.out.println(a + "/" + b + " = " + (a / b));
		break;
		default:
			System.out.println("Klaida");
	}	
}
}
