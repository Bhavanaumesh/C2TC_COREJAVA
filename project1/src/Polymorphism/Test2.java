package Polymorphism;

public class Test2 {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		System.out.println("SBI rate of interest : "+s.getRateOfInterest());
		System.out.println("ICICIrate of interest : "+i.getRateOfInterest());
		System.out.println("Axis rate of interest : "+a.getRateOfInterest());
	}

}
