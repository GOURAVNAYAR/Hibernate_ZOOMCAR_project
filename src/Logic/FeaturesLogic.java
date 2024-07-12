package Logic;

import Dto.Car_Detals;
import Dto.Features;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class FeaturesLogic {

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
		carDetails1.setTransmission("Automatic");

		// Create Features objects
		Features feature1 = new Features();
		feature1.setFeatureName("Sunroof");
		feature1.setCardetals(carDetails1); // Set the carDetails

		Features feature2 = new Features();
		feature2.setFeatureName("Leather Seats");
		feature2.setCardetals(carDetails1); // Set the carDetails

		// Add Features objects to a Set
		Features feature3 = new Features();
		feature1.setFeatureName("USB Charger");
		feature1.setCardetals(carDetails1); // Set the carDetails
		
		Features feature4 = new Features();
		feature2.setFeatureName("Bluetooth");
		feature2.setCardetals(carDetails1); // Set the carDetails
		
		// Add Features objects to a Set
		Features feature5 = new Features();
		feature1.setFeatureName("Music System");
		feature1.setCardetals(carDetails1); // Set the carDetails
		
		Features feature6 = new Features();
		feature2.setFeatureName("Voice Control");
		feature2.setCardetals(carDetails1); // Set the carDetails
		
		// Add Features objects to a Set
		Features feature7 = new Features();
		feature1.setFeatureName("AUX cable");
		feature1.setCardetals(carDetails1); // Set the carDetails
		
		Features feature8 = new Features();
		feature2.setFeatureName("Power Steering");
		feature2.setCardetals(carDetails1); // Set the carDetails
		
		// Add Features objects to a Set
		Features feature9 = new Features();
		feature1.setFeatureName("Two AirBags");
		feature1.setCardetals(carDetails1); // Set the carDetails
		
		Features feature10 = new Features();
		feature2.setFeatureName("Air Purifier");
		feature2.setCardetals(carDetails1); // Set the carDetails
		
		// Add Features objects to a Set
		Set<Features> features = new HashSet<>();
		features.add(feature1);
		features.add(feature2);
		features.add(feature3);
		features.add(feature4);
		features.add(feature5);
		features.add(feature6);
		features.add(feature7);
		features.add(feature8);
		features.add(feature9);
		features.add(feature10);

		// Set the features for carDetails
		carDetails1.setFeatures(features);

		// Save carDetails, which will also save the associated features
		session.save(carDetails1);

		// Commit the transaction
		transaction.commit();
		session.close();
		factory.close();
	}
}
