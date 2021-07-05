import java.util.Scanner;


public class Palin{

	public static void main(String[] args) {
		String str;

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide the string:");

		str = sc.nextLine();
		int flag=1, i, n = str.length();

		for(i=0;i<n/2;i++){
			if(str.charAt(i) != str.charAt(n-i-1) ){
				flag = 0;
				break;
			}
		}

		if(flag==1){
			System.out.println("Given String is a Palindrome");
		}
		else{
			System.out.println("Given String is NOT a Palindrome");
		}
	}

}
	