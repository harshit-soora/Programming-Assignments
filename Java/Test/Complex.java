import java.util.Scanner;
import java.util.Arrays;


public class Complex{

	public static void main(String[] args) {
		int a1, b1, a2, b2;

		//Complex number 1 : a1 + b1 * i
		//Complex number 2 : a2 + b2 * i

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the first complex number(a, b):");

		a1 = sc.nextInt();
		b1 = sc.nextInt();

		System.out.println("Provide the second complex number(a, b):");

		a2 = sc.nextInt();
		b2 = sc.nextInt();
		
		System.out.println("The addition of given complex number:");

		a1 += a2;
		b1 += b2;
		
		System.out.println(a1 + " + " + b1 + "i");
	}

}
	