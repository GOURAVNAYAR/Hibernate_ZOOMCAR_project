package Dto;

import javax.persistence.*;

@Entity
@Table(name = "Place_For_Indore")
public class Place_For_Indore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlaceForEducationId")
    private int placeForEducationId;
    
    @Column(name = "Place_For_EducationAbout")
    private String placeForEducationAbout;

    @ManyToOne
    @JoinColumn(name = "popular_placeId", nullable = false)
    private Popular_place popularPlace;

    // Getters and Setters
    public int getPlaceForEducationId() {
        return placeForEducationId;
    }

    public void setPlaceForEducationId(int placeForEducationId) {
        this.placeForEducationId = placeForEducationId;
    }

    public String getPlaceForEducationAbout() {
        return placeForEducationAbout;
    }

    public void setPlaceForEducationAbout(String placeForEducationAbout) {
        this.placeForEducationAbout = placeForEducationAbout;
    }

    public Popular_place getPopularPlace() {
        return popularPlace;
    }

    public void setPopularPlace(Popular_place popularPlace) {
        this.popularPlace = popularPlace;
    }
}
