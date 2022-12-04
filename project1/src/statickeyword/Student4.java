package statickeyword;

public class Student4 {
	int rollno;
	String name;
	static String college;
	static
	{
		college="ITIS";
	}
	Student4(int r , String n) {
		rollno=r;
		name=n;
	}
	static void change() {
		college="BBDIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student4 s1=new Student4(111,"Karan");
		Student4 s2=new Student4(222,"Aryan");
		change();
		s1.display();
		s2.display();
	}

}
