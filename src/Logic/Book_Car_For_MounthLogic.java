package Logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.Book_Car_For_Mounth;
import Dto.My_Account;
import Dto.Car_Detals;

import java.util.HashSet;
import java.util.Set;

public class Book_Car_For_MounthLogic {
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

        Book_Car_For_Mounth bc1 = new Book_Car_For_Mounth();
        bc1.setBookcarformounthId(1);
        bc1.setDate("01-08-2024");
        bc1.setLocation("Bhopal Station");
        bc1.setTime("11.00");
        bc1.setMyAccount(mya);

        Book_Car_For_Mounth bc2 = new Book_Car_For_Mounth();
        bc2.setBookcarformounthId(2);
        bc2.setDate("10-08-2024");
        bc2.setLocation("Rani Kamlapati Station");
        bc2.setTime("11.15");
        bc2.setMyAccount(mya);

        Book_Car_For_Mounth bc3 = new Book_Car_For_Mounth();
        bc3.setBookcarformounthId(3);
        bc3.setDate("29-08-2024");
        bc3.setLocation("BJP Office");
        bc3.setTime("12.00");
        bc3.setMyAccount(mya);

        Book_Car_For_Mounth bc4 = new Book_Car_For_Mounth();
        bc4.setBookcarformounthId(4);
        bc4.setDate("25-08-2024");
        bc4.setLocation("New Market Gate no.1");
        bc4.setTime("01.00");
        bc4.setMyAccount(mya);

        Set<Book_Car_For_Mounth> bd = new HashSet<>();
        bd.add(bc1);
        bd.add(bc2);
        bd.add(bc3);
        bd.add(bc4);

        mya.setBookCarForMounth(bd);
        session.save(mya);

        transaction.commit();
        session.close();
    }
}
