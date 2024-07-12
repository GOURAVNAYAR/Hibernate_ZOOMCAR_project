package Dto;

import java.util.Iterator;

import javax.persistence.*;

@Entity
@Table(name = "Rent_A_Car")
public class Rent_A_Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RentacarId")
    private int rentacarId;

    @Column(name = "Carname")
    private String carname;

    @Column(name = "Carmodal")
    private String carmodal;

    @Column(name = "PickupAddress")
    private String pickupAddress;

    @Column(name = "CarNumber")
    private int carNumber;

    @Column(name = "PanNumber")
    private int panNumber;

    @Column(name = "AccountNumber")
    private long accountNumber;

    @ManyToOne
    @JoinColumn(name = "myaccountId", nullable = false)
    private My_Account myAccount;

	public int getRentacarId(int i) {
		return rentacarId;
	}

	public void setRentacarId(int rentacarId) {
		this.rentacarId = rentacarId;
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

	public String getPickupAddress() {
		return pickupAddress;
	}

	public void setPickupAddress(String pickupAddress) {
		this.pickupAddress = pickupAddress;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public My_Account getMyAccount() {
		return myAccount;
	}

	public void setMyAccount(My_Account myAccount) {
		this.myAccount = myAccount;
	}

	public static Iterator<Rent_A_Car> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
