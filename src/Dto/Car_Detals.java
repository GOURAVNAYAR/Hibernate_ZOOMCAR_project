package Dto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Car_Detals")
public class Car_Detals {

    @Id
    @Column(name = "cardetalsId")
    private int cardetalsId;

    @Column(name = "carname")
    private String carname;

    @Column(name = "carmodal")
    private String carmodal;

    @Column(name = "caravarge")
    private String caravarge;

    @Column(name = "carprice")
    private String carprice;

    @Column(name = "Transmission")
    private String transmission;

    @Column(name = "Seats")
    private String seats;

    @Column(name = "cartype")
    private String cartype;

    @Column(name = "Fueltype")
    private String fueltype;

    @OneToMany(mappedBy = "cardetals", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Features> features;

    @OneToMany(mappedBy = "carDetails", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Favourites_car> favouritescar;

    @OneToMany(mappedBy = "carDetails", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Pay> pay;

    public int getCardetalsId() {
        return cardetalsId;
    }

    public void setCardetalsId(int cardetalsId) {
        this.cardetalsId = cardetalsId;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarmodal() {
        return carmodal;
    }

    public void setCarmodal(String carmodal) {
        this.carmodal = carmodal;
    }

    public String getCaravarge() {
        return caravarge;
    }

    public void setCaravarge(String caravarge) {
        this.caravarge = caravarge;
    }

    public String getCarprice() {
        return carprice;
    }

    public void setCarprice(String carprice) {
        this.carprice = carprice;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public Set<Features> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Features> features) {
        this.features = features;
    }

    public Set<Favourites_car> getFavouritescar() {
        return favouritescar;
    }

    public void setFavouritescar(Set<Favourites_car> favouritescar) {
        this.favouritescar = favouritescar;
    }

    public Set<Pay> getPay() {
        return pay;
    }

    public void setPay(Set<Pay> pay) {
        this.pay = pay;
    }
}
