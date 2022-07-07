package lab0707;

public class CompareObjects {

	public static void main(String[] args) {
		
		BeanClass_student s1 =new BeanClass_student("Rajas",19,"D",28);
		BeanClass_student s2 =new BeanClass_student("Pranav",19,"M",34);
		BeanClass_student s3 =new BeanClass_student("Rohit",19,"M",42);
		BeanClass_student s4 =new BeanClass_student("Shubham",19,"D",56);
		

		
		if(s1.equals(s4)) {
			System.out.println("Same");
//			System.out.println(s1.hashCode() +" " +s4.hashCode() );
		}
		else {
			System.out.println("not same");
		}

		
//		if(s1.equals(s4) && s1.hashCode()==s4.hashCode()) {
//			System.out.println(" Same and hashcode also same");
//			System.out.println(s1.hashCode() +" " +s4.hashCode() );
//		}
//		else {
//			System.out.println("not same");
//		}
		
				
	}

	
		
	

}