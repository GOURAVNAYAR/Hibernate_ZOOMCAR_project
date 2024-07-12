package Logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.Book_Car_For_Day;
import Dto.My_Account;

import java.util.HashSet;
import java.util.Set;

public class Book_Car_For_DayLogic {

	
    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        My_Account mya = new My_Account();
        mya.setEmail("nayargmail.com");
        mya.setGender("Male");
        mya.setLicenseNumber(204578);
        mya.setMobileNumber(992689046);
        mya.setName("Gourav Nayar");
        mya.setPassword(12279);
        mya.setCurrentCity("Timarni");

        Book_Car_For_Day bc1 = new Book_Car_For_Day();
        bc1.setDate("2024-08-24");
        bc1.setLocation("Bhopal Station");
        bc1.setTime("11:00");
        bc1.setMyAccount(mya); 

        Book_Car_For_Day bc2 = new Book_Car_For_Day();
        bc2.setDate("2024-08-25");
        bc2.setLocation("Rani Kamlapati Station");
        bc2.setTime("11:15");
        bc2.setMyAccount(mya); 
        
        Book_Car_For_Day bc3 = new Book_Car_For_Day();
        bc3.setDate("2024-08-26");
        bc3.setLocation("Bhopal");
        bc3.setTime("12:00");
        bc3.setMyAccount(mya); 
        
        Set<Book_Car_For_Day> bd = new HashSet<>();
        bd.add(bc1);
        bd.add(bc2);
        bd.add(bc3);

        mya.setBookCarForDay(bd);
        session.save(mya); 

        transaction.commit();
        session.close();
    }
}
