package Logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.My_Account;
import Dto.Popular_place;


public class Popular_placeLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        My_Account mya = new My_Account();
        mya.setMyaccountId(1044);
        mya.setEmail("nayargmail.com");
        mya.setGender("Male");
        mya.setLicenseNumber(204578);
        mya.setMobileNumber(992689046);
        mya.setName("Gourav Nayar");
        mya.setPassword(12279);
        mya.setCurrentCity("Timarni");

        Popular_place pp = new Popular_place();
        pp.setPopular_placeId(1);
        pp.setMyAccount(mya);
        
        Set<Popular_place> bd = new HashSet<>();
        bd.add(pp);

        mya.setPopularplace(bd);

        session.save(mya);

        transaction.commit();
        session.close();
    }
}
