package Logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.Book_Car_For_Mounth;
import Dto.Car_Detals;
import Dto.Pay;

public class PayLogic {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		 Car_Detals carDetails1 = new Car_Detals();
         carDetails1.setCardetalsId(1);
         carDetails1.setCaravarge("25");
         carDetails1.setCarmodal("2022");
         carDetails1.setCarname("XUV-700");
         carDetails1.setCarprice("500");
         carDetails1.setCartype("Luxury");
         carDetails1.setFueltype("Petrol");
         carDetails1.setSeats("8 ");
         
         Pay pay = new Pay();
         pay.setPayId(101);
         pay.setNetBanking("No");
         pay.setMobile("992654772");
         pay.setCreditAtmcard("Yes");

         Set<Pay> pa = new HashSet<>();
         pa.add(pay);
        

         carDetails1.setPay(pa);
         session.save(carDetails1);

         
		 transaction.commit();
	        session.close();
}
}
