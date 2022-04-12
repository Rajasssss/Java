package mypack1;

public class OverMethod {
	static void Area(double r) {
		System.out.println("Area of circle is : " +(3.14*r*r));
	}
	
	static void Area(double l ,double w) {
		System.out.println("Area of Reactangle is : " +(l*w));
	}
	
	static void Area(double l ,double w ,double h) {
		System.out.println("Area of box : " +((2*l*w)+(2*l*h)+(2*h*w)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverMethod m = new OverMethod();
		
		m.Area(2);
		m.Area(4,5);
		m.Area(1,2,3);
	}

}
