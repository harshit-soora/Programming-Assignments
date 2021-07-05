import java.util.Scanner;


class Student{
	public String name;
	public String rollNo;
	public int sub_marks_1;
	public int sub_marks_2;

	public Student(String name, String roll, int sub_marks_1, int sub_marks_2){
		System.out.println("\nCalling Student constructor.");
		this.name = name;
		this.rollNo = roll;
		this.sub_marks_1 = sub_marks_1;
		this.sub_marks_2 = sub_marks_2;
	}
}

class Exam extends Student{

	//Constructor
	public Exam(String name, String roll, int sub_marks_1, int sub_marks_2){		
		super(name, roll, sub_marks_1, sub_marks_2);
		//This should be the first statement when you enherit from a class
		System.out.println("Calling Exam constructor.");
	}

	public int add_marks(){
		System.out.println("Adding  marks for " + super.name );
		
		int total = super.sub_marks_1 + super.sub_marks_2;
		return total;
	}
}


public class Result extends Exam{

	public int total_marks;

	//Constructor
	//This should be the first statement when you enherit from a class
	public Result(String name, String roll, int sub_marks_1, int sub_marks_2){
		super(name, roll, sub_marks_1, sub_marks_2);
		System.out.println("Calling Result constructor.\n");
		this.total_marks = 0; 
	}

	public static void main(String[] args) {
		Result r1 = new Result("Swarnali", "181001201024", 90, 95);

		r1.total_marks = r1.add_marks();

		System.out.println("\nShowing student details-");
		System.out.println("Name : " + r1.name);
		System.out.println("Roll No. : " + r1.rollNo);
		System.out.println("Marks in subject 1 : " + r1.sub_marks_1);
		System.out.println("Marks in subject 2 : " + r1.sub_marks_2);
		System.out.println("Total marks : " + r1.total_marks);


		//  Interactive version
		System.out.println("\n\n--This is interative version--\n");
		Result r2;
		String name, roll;
		Scanner sc = new Scanner(System.in);
		int subj_1, subj_2;

		System.out.println("\nPlease enter student details-");
		System.out.println("Name : ");
		name = sc.next();

		System.out.println("Roll No. : ");
		roll = sc.next();

		System.out.println("Marks in subject 1 : ");
		subj_1 = sc.nextInt();

		System.out.println("Marks in subject 2 : ");
		subj_2 = sc.nextInt();

		r2 = new Result(name, roll, subj_1, subj_2);
		r2.total_marks = r2.add_marks();

		System.out.println("\nShowing student details-");
		System.out.println("Name : " + r2.name);
		System.out.println("Roll No. : " + r2.rollNo);
		System.out.println("Marks in subject 1 : " + r2.sub_marks_1);
		System.out.println("Marks in subject 2 : " + r2.sub_marks_2);
		System.out.println("Total marks : " + r2.total_marks);

		System.out.println("\nAll marks are out of 100");
	}
}