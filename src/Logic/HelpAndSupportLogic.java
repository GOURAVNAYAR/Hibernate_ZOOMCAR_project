package Logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.HelpAndSupport;
import Dto.My_Account;

public class HelpAndSupportLogic {

    public static void main(String[] args) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create My_Account instance
        My_Account account = new My_Account();
        account.setEmail("test@example.com");
        account.setMobileNumber(1234567890L);
        account.setName("John Doe");
        account.setGender("Male");
        account.setCurrentCity("New York");
        account.setPassword(12345L);
        account.setLicenseNumber(987654);

        // Save the My_Account instance first to generate its ID
        session.save(account);

        // Create HelpAndSupport instances
        HelpAndSupport support1 = new HelpAndSupport();
        support1.setQuestion("");
        support1.setMyAccount(account); // Set the My_Account instance

        

        Set<HelpAndSupport> helpAndSupportSet = new HashSet<>();
        helpAndSupportSet.add(support1);

        // Set the HelpAndSupport instances to the My_Account instance
        account.setHelpAndSupport(helpAndSupportSet);

        // Save the My_Account instance along with associated HelpAndSupport instances
        session.save(account);

        transaction.commit();
        session.close();
    }
}
