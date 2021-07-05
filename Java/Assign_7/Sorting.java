import java.util.Scanner;
import java.util.Arrays;


public class Sorting{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Provide the size of array:");

		int n = sc.nextInt();
		String [] arr = new String[n];
		
		sc.nextLine();
		//Skip the new line charater after Integer input

		int i;
		System.out.println("Start giving "+ n + " strings perline :");

		for(i=0;i<n;i++){
			arr[i] = sc.nextLine();
		}

		//Using inbuils function in Java for sorting 
		Arrays.sort(arr);

		
		System.out.println("Array after sorting is :");
		for(i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

	}

}
	