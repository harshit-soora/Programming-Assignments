import java.util.*;


public class overloading{

	public static void calculate(int m, char ch){
		if(ch=='s'){
			System.out.println("Checking if given integer is divisible by 7");

			if(m % 7 == 0)
				System.out.println("YES\n");
			else
				System.out.println("NO\n");
		}
		else{
			System.out.println("Checking if last digit is 7");

			if(m % 10 == 7)
				System.out.println("YES\n");
			else
				System.out.println("NO\n");
		}
	}


	//Overloaded
	public static void calculate(int a, int b, char ch){
		if(ch=='g'){
			System.out.println("The greater of two integer is-");	
			System.out.println(Math.max(a, b)+"\n");
		}
		else{
			System.out.println("The smaller of two integer is-");
			System.out.println(Math.min(a, b)+"\n");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter one integer- ");
		int x = sc.nextInt();

		sc.nextLine();
		//Skip the new line charater after Integer input

		//('s' to check divisible by 7 else check if last digit is 7 or not)
		System.out.print("Enter one charater- ");
		char ch = sc.next().charAt(0);

		calculate(x, ch);
		sc.nextLine();



		System.out.print("Enter two integers- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();

		//(''g to display greater among the two else smaller)
		System.out.print("Enter one charater- ");
		ch = sc.next().charAt(0);

		calculate(a, b, ch);
	}
}