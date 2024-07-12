package Dto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "My_Account")
public class My_Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "myaccountId")
    private int myaccountId;

    @Column(name = "Email")
    private String email;

    @Column(name = "mobileNumber")
    private long mobileNumber;

    @Column(name = "Name")
    private String name;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "currentCity")
    private String currentCity;

    @Column(name = "password")
    private long password;

    @Column(name = "licenseNumber")
    private int licenseNumber;

    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AboutUs> aboutUs;

    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Book_Car_For_Mounth> bookCarForMounth;

    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Book_Car_For_Day> bookCarForDay;

    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<HelpAndSupport> helpAndSupport;

    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Rent_A_Car> rentACar;
    
    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Popular_place> popularplace;

    // Getters and Setters
    public void setAboutUs(Set<AboutUs> aboutUs) {
        this.aboutUs = aboutUs;
        for (AboutUs about : aboutUs) {
            about.setMyAccount(this);
        }
    }

    public void setBookCarForMounth(Set<Book_Car_For_Mounth> bookCarForMounth) {
        this.bookCarForMounth = bookCarForMounth;
        for (Book_Car_For_Mounth bookCar : bookCarForMounth) {
            bookCar.setMyAccount(this);
        }
    }

    public void setBookCarForDay(Set<Book_Car_For_Day> bookCarForDay) {
        this.bookCarForDay = bookCarForDay;
        for (Book_Car_For_Day bookCar : bookCarForDay) {
            bookCar.setMyAccount(this);
        }
    }

    public void setHelpAndSupport(Set<HelpAndSupport> helpAndSupport) {
        this.helpAndSupport = helpAndSupport;
        for (HelpAndSupport support : helpAndSupport) {
            support.setMyAccount(this);
        }
    }

    public void setRentACar(Set<Rent_A_Car> rentACar) {
        this.rentACar = rentACar;
        for (Rent_A_Car rentCar : rentACar) {
            rentCar.setMyAccount(this);
        }
    }

	public int getMyaccountId() {
		return myaccountId;
	}

	public void setMyaccountId(int myaccountId) {
		this.myaccountId = myaccountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public long getPassword() {
		return password;
	}

	public void setPassword(long password) {
		this.password = password;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Set<AboutUs> getAboutUs() {
		return aboutUs;
	}

	public Set<Book_Car_For_Mounth> getBookCarForMounth() {
		return bookCarForMounth;
	}

	public Set<Book_Car_For_Day> getBookCarForDay() {
		return bookCarForDay;
	}

	public Set<HelpAndSupport> getHelpAndSupport() {
		return helpAndSupport;
	}

	public Set<Rent_A_Car> getRentACar() {
		return rentACar;
	}

	public void setPopularplace(Set<Popular_place> bd) {
		// TODO Auto-generated method stub
		
	}

   
}
