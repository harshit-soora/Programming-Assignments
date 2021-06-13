
public class time{

	public int HH;
	public int MM;
	public int SS;

	public time(){
		this.HH = 9;
		this.MM = 37;
		this.SS = 1;
	}

	public void display(){
		System.out.println("Current time is ");
		
		if(this.HH < 10)
			System.out.print("0" + this.HH + ":");
		else
			System.out.print(this.HH + ":");

		if(this.MM < 10)
			System.out.print("0" + this.MM + ":");
		else
			System.out.print(this.MM + ":");

		if(this.SS < 10)
			System.out.print("0" + this.SS);
		else
			System.out.print(this.SS);

		System.out.println("");
	}

	public void add_time(time t){
		this.SS += t.SS;

		int carry = 0;
		if(this.SS > 60){
			this.SS -= 60;
			carry = 1;
		}

		this.MM += t.MM + carry;
		carry = 0;
		if(this.MM > 60){
			this.MM -= 60;
			carry = 1;
		}

		this.HH += t.HH + carry;
		if(this.HH > 24){
			this.HH -= 24;

			System.out.println("A new have risen");
		}
		
	}

	public void sub_time(time t){
		this.HH -= t.HH;
		this.MM -= t.MM;
		this.SS -= t.SS;
	}

	public static void main(String[] args) {
		
		System.out.println("Time t1 -");
		time t1 = new time();
		t1.display();
		System.out.println("");

		System.out.println("Time t2 -");
		time t2 = new time();
		t2.display();
		System.out.println("");

		System.out.println("Adding time -");
		t1.add_time(t2);

		System.out.println("Storing into new Time t3 -");
		time t3 = t1;
		t3.display();
	}
}