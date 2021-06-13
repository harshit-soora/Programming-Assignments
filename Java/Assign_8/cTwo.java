package pTwo;

//Make sure this import else it will not work
//This will import every class in package pOne
//We can call specific as pOne.cOne
import pOne.*;
import java.util.*;


class cTwo extends cOne{

	//Without any acccess classifier default 
	//access will be package only 
	int  vTwo = 2;
	String sTwo = "Hello Two";

	void mTwo(){
		System.out.println("Class cTwo variables are-");
		System.out.println("vTwo : " + this.vTwo);
		System.out.println("sTwo : " + this.sTwo);
	}


	void inheritMethod(){
		System.out.println("\nParents class variables are-");

		//We won't be able to access varibles of Parent class
		//as the access modifier is package or default
		/*
			//cTwo.java:30: error: vOne is not public in cOne; cannot be accessed from outside package
			System.out.println("vOne : " + super.vOne);
			System.out.println("sOne : " + super.sOne);
		*/

		//We can only call the method as it is public 
		//thus making it accessible outside the package
		System.out.println("Parents class method-");
		super.mOne();
	}


	public static void main(String[] args) {
		cTwo t = new cTwo();

		t.mTwo();
		t.inheritMethod();

		//But what we can do instead is create a obj of parent class here
		
		/*
		cOne o = new cOne();
		System.out.println("Varibale:: vOne " + o.vOne);
		System.out.println("Varibale:: sOne " + o.sOne);
		*/
		
		//This will result in error as scope of these varibles is package only
	}
} 