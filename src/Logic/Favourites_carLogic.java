package Logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.Car_Detals;
import Dto.Favourites_car;

public class Favourites_carLogic {

    public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

        // Create Car_Detals object
        Car_Detals carDetails1 = new Car_Detals();
        carDetails1.setCardetalsId(1111);
        carDetails1.setCaravarge("25");
        carDetails1.setCarmodal("2022");
        carDetails1.setCarname("XUV-700");
        carDetails1.setCarprice("500");
        carDetails1.setCartype("Luxury");
        carDetails1.setFueltype("Petrol");
        carDetails1.setSeats("8");

        // Create Favourites_car objects
        Favourites_car favouriteCar1 = new Favourites_car();
        favouriteCar1.setFavouritescarId(1);
        favouriteCar1.setFavouritescarName("Ferrari");
        favouriteCar1.setCarDetails(carDetails1); // Set the carDetails

        Favourites_car favouriteCar2 = new Favourites_car();
        favouriteCar2.setFavouritescarId(2);
        favouriteCar2.setFavouritescarName("Lamborghini");
        favouriteCar2.setCarDetails(carDetails1); // Set the carDetails

        // Add Favourites_car objects to a Set
        Set<Favourites_car> favouritescar = new HashSet<>();
        favouritescar.add(favouriteCar1);
        favouritescar.add(favouriteCar2);

        // Set the features for carDetails
        carDetails1.setFavouritescar(favouritescar);

        // Save carDetails, which will also save the associated favourite cars
        session.save(carDetails1);

        // Commit the transaction
        transaction.commit();
        session.close();
        factory.close();
    }
}
