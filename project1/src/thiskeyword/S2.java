package thiskeyword;

public class S2 {
	void m(S2 a)
	{
		System.out.println("method is involved");
	}
	void p()
	{
		m(this);
	}
}

