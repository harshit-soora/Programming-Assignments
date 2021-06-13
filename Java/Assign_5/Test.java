import java.util.Scanner;


class Demo{
	public Demo(){
		System.out.println("You are in dummy class");
	}

}


public class Test{
	public Test(){
		System.out.println("You are in original class");
	}

	public static void show(Test t){
		System.out.println("You are inside method");
	}

	public static void main(String[] args) {

		//Remember non static method of a class don't exist till we 
		//create a object of that class, for same reason we need to 
		//make the method `show` static

		//3. (a) Passing same class method
		System.out.println("Calling for Test class's object-(Own Object)");
		Test t1 = new Test();
		show(t1);

		//3. (b) Passing different class method
		System.out.println("Calling for Demo class's object-(Different Object)");
		Demo d1 = new Demo();
		//show(d1);
		/*
			error: incompatible types: Demo cannot be converted to Test
		*/

	}
}