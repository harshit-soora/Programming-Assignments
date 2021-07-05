import java.util.Scanner;


class Bank{
	public String name;
	public long accno;
	public double p;

	//Constructor
	public Bank(String name, long ac_no, double amount){
		this.name = name;
		this.accno = ac_no;
		this.p = amount;
	}

	public void display(){
		System.out.println("Name of customer: " + this.name );
		System.out.println("Account number: " + this.accno );
		System.out.println("Principal Amount: Rs. " + this.p );
		System.out.println("\n");
	}
}


public class Account extends Bank{

	//Constructor
	public Account(String name, long ac_no, double amount){
		super(name, ac_no, amount);
		//This should be the first statement when you enherit from a class
	}

	public void deposit(double amt){
		super.p += amt;
	}

	public void withdraw(double amt){
		if(super.p < amt){
			System.out.println("INSUFFICIENT BALANCE");
		}
		else{
			super.p -= amt;
		}

		if(super.p < 500){
			super.p = super.p - (500 - super.p) / 10;
		}
	}

	public void display(){
		super.display();
	}

	//this represents variable in current class 
	//super represents variable in parent class
	//We first call constructor of super call
	//which will help us to access its variables using "super"
	
	public static void main(String[] args) {
		Account A = new Account("Ram", 1234567890,  0);
		A.display();

		A.deposit(1000);
		A.display();

		A.withdraw(500);
		A.display();

		A.withdraw(100);
		A.display();

		A.withdraw(500);
		A.display();
	}
}