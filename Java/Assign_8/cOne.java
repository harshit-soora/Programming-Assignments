package pOne;

import java.util.*;

public class cOne{

	//Without any acccess classifier default 
	//access will be package only 
	int  vOne = 1;
	String sOne = "Hello One";

	public void mOne(){
		System.out.println("Class cOne variables are-");
		System.out.println("vOne : " + this.vOne);
		System.out.println("sOne : " + this.sOne);
	}

	public static void main(String[] args) {
		cOne o = new cOne();
		o.mOne();
	}
} 