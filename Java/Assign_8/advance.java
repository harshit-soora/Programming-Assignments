import java.util.*;

public class advance {

	public void arithmetic(int a, int b){
		int c=0;

		/* 
			a/b can result in exception
		*/

		try{
			c = a/b; 
			System.out.println("Value of c is : " + c);
		}
		catch(ArithmeticException e){
			System.out.println("[Exception] " + e);
			System.out.println("Value of c is INF");
		}
	}


	public void outOfBound(){

		int arr[]= {0, 5, 10};

		try  {    
        	System.out.println(arr[-1]); 
        	//may throw exception   
        }   
        catch(ArrayIndexOutOfBoundsException e)  {  
            System.out.println("[Exception] " + e);  
        }  

        String str = "Hello World";

        try  {    
        	System.out.println(str.charAt(15)); 
        	//may throw exception   
        }   
        catch(StringIndexOutOfBoundsException e)  {  
            System.out.println("[Exception] " + e);  
        } 
	}


	public static void main(String[] args) {
		advance a = new advance();
		Scanner sc = new Scanner(System.in);

		//Arithmetic Exception
		System.out.println("Let us see Airthmetic Exception");
		System.out.print("Enter two numbers-");
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		a.arithmetic(x,  y);


		//Array and String IndexOutOfBoundsException
		System.out.println("\nLet us see Array and String index out of bound Exception");
		a.outOfBound();
	}
}

