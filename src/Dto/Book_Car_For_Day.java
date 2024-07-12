package Dto;

import javax.persistence.*;

@Entity
@Table(name = "Book_Car_For_Day")
public class Book_Car_For_Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookcarfordayId")
    private int bookcarfordayId;

    @Column(name = "Date")
    private String date;

    @Column(name = "Time")
    private String time;

    @Column(name = "Location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "myaccountId", nullable = false)
    private My_Account myAccount;

    // Getters and Setters

    public int getBookcarfordayId() {
        return bookcarfordayId;
    }

    public void setBookcarfordayId(int bookcarfordayId) {
        this.bookcarfordayId = bookcarfordayId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public My_Account getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(My_Account myAccount) {
        this.myAccount = myAccount;
    }

	public void setCarDetails(Car_Detals carDetails) {
		// TODO Auto-generated method stub
		
	}
}
