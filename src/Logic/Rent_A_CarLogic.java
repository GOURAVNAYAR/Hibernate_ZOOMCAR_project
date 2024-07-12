package Logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.My_Account;
import Dto.Rent_A_Car;

import java.util.HashSet;
import java.util.Set;

public class Rent_A_CarLogic {

    public static void main(String[] args) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create My_Account instance
        My_Account myAccount = new My_Account();
        myAccount.setEmail("gouravnayar@example.com");
        myAccount.setMobileNumber(1234567890);
        myAccount.setName("John Doe");
        myAccount.setGender("Male");
        myAccount.setCurrentCity("New York");
        myAccount.setPassword(123456);
        myAccount.setLicenseNumber(987654321);

        // Create Rent_A_Car instances
        Rent_A_Car rentACar1 = new Rent_A_Car();
        rentACar1.setCarname("Toyota Camry");
        rentACar1.setCarmodal("Sedan");
        rentACar1.setPickupAddress("123 Main Street");
        rentACar1.setCarNumber(12345);
        rentACar1.setPanNumber(98765);
        rentACar1.setAccountNumber(987654321);
        rentACar1.setMyAccount(myAccount);

        Rent_A_Car rentACar2 = new Rent_A_Car();
        rentACar2.setCarname("Honda Civic");
        rentACar2.setCarmodal("Sedan");
        rentACar2.setPickupAddress("123 Main Street");
        rentACar2.setCarNumber(54321);
        rentACar2.setPanNumber(98765);
        rentACar2.setAccountNumber(987654321);
        rentACar2.setMyAccount(myAccount);

        Set<Rent_A_Car> rentACars = new HashSet<>();
        rentACars.add(rentACar1);
        rentACars.add(rentACar2);

        // Set Rent_A_Car instances to My_Account
        myAccount.setRentACar(rentACars);

        // Save My_Account (should cascade to Rent_A_Car instances)
        session.save(myAccount);

        transaction.commit();
        session.close();
    }
}
