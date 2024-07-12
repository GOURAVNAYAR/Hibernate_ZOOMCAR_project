package Dto;

import javax.persistence.*;

@Entity
@Table(name = "Favourites_car")
public class Favourites_car {

    @Id
    @Column(name = "FavouritescarId")
    private int favouritescarId;

    @Column(name = "FavouritescarName")
    private String favouritescarName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cardetalsId", nullable = false)
    private Car_Detals carDetails;

    public int getFavouritescarId() {
        return favouritescarId;
    }

    public void setFavouritescarId(int favouritescarId) {
        this.favouritescarId = favouritescarId;
    }

    public String getFavouritescarName() {
        return favouritescarName;
    }

    public void setFavouritescarName(String favouritescarName) {
        this.favouritescarName = favouritescarName;
    }

    public Car_Detals getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(Car_Detals carDetails) {
        this.carDetails = carDetails;
    }

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
}
