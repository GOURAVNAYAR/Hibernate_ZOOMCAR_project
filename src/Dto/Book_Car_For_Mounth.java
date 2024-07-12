package Dto;

import javax.persistence.*;

@Entity
@Table(name = "Book_Car_For_Mounth")
public class Book_Car_For_Mounth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookcarformounthId")
    private int bookcarformounthId;

    @Column(name = "Date")
    private String date;

    @Column(name = "Location")
    private String location;

    @Column(name = "Time")
    private String time;

    @ManyToOne
    @JoinColumn(name = "myaccountId", nullable = false)
    private My_Account myAccount;

    // Getters and Setters
    public void setMyAccount(My_Account myAccount) {
        this.myAccount = myAccount;
    }

	public int getBookcarformounthId() {
		return bookcarformounthId;
	}

	public void setBookcarformounthId(int bookcarformounthId) {
		this.bookcarformounthId = bookcarformounthId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public My_Account getMyAccount() {
		return myAccount;
	}

   
}
