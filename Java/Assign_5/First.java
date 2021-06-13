import java.util.Scanner;


public class First{

	public int x=0;

	public void show(){
		System.out.println("Class variable is: " + this.x);
	}

	public static void main(String[] args) {
		
		//1. Adding two numbers
		System.out.println("Please enter two integers to add:");
		int a, b, sum;
		Scanner	sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		sum = a+b;
		System.out.println("Sum of two numbers " + a + " and " + b + " is: " + sum); 


		//2. Class and Instance Variable
		First f = new First();
		f.x = 10;
		f.show();

	}
}