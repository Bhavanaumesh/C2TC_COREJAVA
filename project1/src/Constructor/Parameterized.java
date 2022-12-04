package Constructor;

public class Parameterized {
	int id;
	String name;
	float salary;
	Parameterized(int id,String name,float salary){
		System.out.println("user defined no argument"+"constructor executed");
	}
	void display() { 
		System.out.println(id + " " + name + " " + salary);
		
	}

}
