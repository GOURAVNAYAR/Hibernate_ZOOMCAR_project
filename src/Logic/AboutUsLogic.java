package Logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.AboutUs;
import Dto.My_Account;

import java.util.HashSet;
import java.util.Set;

public class AboutUsLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        My_Account mya = new My_Account();
        mya.setEmail("nayar@gmail.com");
        mya.setGender("Male");
        mya.setLicenseNumber(204578);
        mya.setMobileNumber(992689046);
        mya.setName("Gourav Nayar");
        mya.setPassword(12279);
        mya.setCurrentCity("Timarni");

        AboutUs aboutUs = new AboutUs();
        aboutUs.setAboutZoomcar_About("About Zoom Car: Zoom Car is a self-drive car rental service. Enjoy the freedom to rent and drive cars across the city.");
        aboutUs.setMyAccount(mya);

        Set<AboutUs> bd = new HashSet<>();
        bd.add(aboutUs);

        mya.setAboutUs(bd);

        session.save(mya);

        transaction.commit();
        session.close();
    }
}
