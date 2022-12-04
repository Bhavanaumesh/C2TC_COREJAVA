package statickeyword;

public class Student3 {
	int rollno;
	String name;
	static String college="its";
	Student3(int r,String n)
	{
		rollno=r;
		name=n;
	}
void display()
{
	System.out.println(rollno+""+name+""+college);
}
	public static void main(String[] args) {
		Student3 s1=new Student3(111,"karan");
		Student3 s2=new Student3(222,"aryan");
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}
