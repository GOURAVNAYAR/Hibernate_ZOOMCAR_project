package Logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Dto.Best_place_To_Vist_in_Bhopal;
import Dto.Popular_place;

import java.util.HashSet;
import java.util.Set;

public class Best_place_To_Vist_in_BhopalLogic {

    public static void main(String[] args) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Popular_place pp = new Popular_place();

        Best_place_To_Vist_in_Bhopal bb1 = new Best_place_To_Vist_in_Bhopal();
        bb1.setBestplaceToVistinBhopalLocation("Upper Lake");
        bb1.setPopularplace(pp);

        Best_place_To_Vist_in_Bhopal bb2 = new Best_place_To_Vist_in_Bhopal();
        bb2.setBestplaceToVistinBhopalLocation("Van Vihar National Park");
        bb2.setPopularplace(pp);

        Best_place_To_Vist_in_Bhopal bb3 = new Best_place_To_Vist_in_Bhopal();
        bb3.setBestplaceToVistinBhopalLocation("Bhojpur Temple");
        bb3.setPopularplace(pp);

        Best_place_To_Vist_in_Bhopal bb4 = new Best_place_To_Vist_in_Bhopal();
        bb4.setBestplaceToVistinBhopalLocation("Taj UL Masjid");
        bb4.setPopularplace(pp);

        Best_place_To_Vist_in_Bhopal bb5 = new Best_place_To_Vist_in_Bhopal();
        bb5.setBestplaceToVistinBhopalLocation("Sadar Manzil");
        bb5.setPopularplace(pp);

        Best_place_To_Vist_in_Bhopal bb6 = new Best_place_To_Vist_in_Bhopal();
        bb6.setBestplaceToVistinBhopalLocation("State Museum of MP");
        bb6.setPopularplace(pp);

        Set<Best_place_To_Vist_in_Bhopal> bd = new HashSet<>();
        bd.add(bb1);
        bd.add(bb2);
        bd.add(bb3);
        bd.add(bb4);
        bd.add(bb5);
        bd.add(bb6);

        pp.setBestPlacesToVisit(bd);

        session.save(pp);

        transaction.commit();
        session.close();
    }
}
