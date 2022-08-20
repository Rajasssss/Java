package execution;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Car;
import model.Person;
import util.Configuration;

public class App {

	public static void main(String[] args) {
		
		Person p1 =new Person();
		p1.setPname("Varun");
		p1.setCity("Mumbai");
		
		Person p2 =new Person();
		p2.setPname("Rohit");
		p2.setCity("Delhi");
		
		Person p3 =new Person();
		p3.setPname("Sanket");
		p3.setCity("Keral");
		
		Car c1 =new Car();
		c1.setCName("Celtos");
		c1.setPrice(600000);
		
		
		Car c2 =new Car();
		c2.setCName("Harrier");
		c2.setPrice(800000);
		
		
		Car c3 =new Car();
		c3.setCName("Creta");
		c3.setPrice(1500000);

		c1.setPerson(p1);
		c2.setPerson(p2);
		c3.setPerson(p3);
		System.out.println("*****Car has set to Person*****");
		
		p1.setCar(c1);
		p1.setCar(c2);
		p1.setCar(c3);
		System.out.println("*****Person has set to Car*****");
		
		

		Session session = Configuration.getSession();
		System.out.println("*****Session Begin*****");
		
		Transaction tx = session.beginTransaction();
		System.out.println("*****Transaction Begin*****");
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		System.out.println("*****Person Session saved*****");
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		System.out.println("*****Car session saved*****");
		
		tx.commit();
		System.out.println("*****Transaction commit*****");
		
		session.close();
		System.out.println("Done");
		

		
	}

}
