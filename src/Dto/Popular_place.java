package Dto;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Popular_place")
public class Popular_place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "popular_placeId")
    private int popular_placeId;

    @ManyToOne
    @JoinColumn(name = "myaccountId", nullable = false)
    private My_Account myAccount;

    @OneToMany(mappedBy = "popularplace", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Best_place_To_Vist_in_Bhopal> bestPlacesToVisit;
    
    @OneToMany(mappedBy = "popularPlace", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Place_For_Indore> placesForIndore;

    // Getters and Setters
    public int getPopular_placeId() {
        return popular_placeId;
    }

    public void setPopular_placeId(int popular_placeId) {
        this.popular_placeId = popular_placeId;
    }

    public My_Account getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(My_Account myAccount) {
        this.myAccount = myAccount;
    }

    public Set<Best_place_To_Vist_in_Bhopal> getBestPlacesToVisit() {
        return bestPlacesToVisit;
    }

    public void setBestPlacesToVisit(Set<Best_place_To_Vist_in_Bhopal> bestPlacesToVisit) {
        this.bestPlacesToVisit = bestPlacesToVisit;
    }

	public void setPlacesForIndore(Set<Place_For_Indore> placesForIndore2) {
		// TODO Auto-generated method stub
		
	}

	public Set<Place_For_Indore> getPlacesForIndore() {
		// TODO Auto-generated method stub
		return null;
	}
}
