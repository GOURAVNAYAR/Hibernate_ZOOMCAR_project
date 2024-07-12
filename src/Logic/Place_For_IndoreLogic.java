package Logic;

import Dto.Popular_place;
import Dto.Place_For_Indore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.HashSet;
import java.util.Set;

public class Place_For_IndoreLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create Popular_place instance
        Popular_place popularPlace = new Popular_place();

        // Create Place_For_Indore instances
        Place_For_Indore place1 = new Place_For_Indore();
        place1.setPlaceForEducationAbout("Upper Lake");
        place1.setPopularPlace(popularPlace);

        Place_For_Indore place2 = new Place_For_Indore();
        place2.setPlaceForEducationAbout("Van Vihar National Park");
        place2.setPopularPlace(popularPlace);

        // Add Place_For_Indore instances to a Set
        Set<Place_For_Indore> placesForIndore = new HashSet<>();
        placesForIndore.add(place1);
        placesForIndore.add(place2);

        // Set the places for Popular_place
        popularPlace.setPlacesForIndore(placesForIndore);

        // Save the Popular_place (cascades to Place_For_Indore)
        session.save(popularPlace);

        // Commit the transaction
        transaction.commit();

       

        session.close();
    }
}
