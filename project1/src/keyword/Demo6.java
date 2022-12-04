package keyword;

public class Demo6 {
	void m()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		Demo6 obj=new Demo6();
		System.out.println(obj);
		obj.m();

	}

}
