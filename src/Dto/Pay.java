package Dto;
import Dto.Car_Detals;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pay")
public class Pay {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payId")
	private int payId;

	@Column(name = "creditAtmcard")
	private String creditAtmcard;

	@Column(name = "Mobile")
	private String Mobile;

	@Column(name = "NetBanking")
	private String NetBanking;

	@ManyToOne
	@JoinColumn(name = "cardetalsId", nullable = false, referencedColumnName = "cardetalsId")
	private Car_Detals cardetals; 

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public String getCreditAtmcard() {
		return creditAtmcard;
	}

	public void setCreditAtmcard(String creditAtmcard) {
		this.creditAtmcard = creditAtmcard;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getNetBanking() {
		return NetBanking;
	}

	public void setNetBanking(String netBanking) {
		NetBanking = netBanking;
	}

	public Car_Detals getCardetals() {
		return cardetals;
	}

	public void setCardetals(Car_Detals cardetals) {
		this.cardetals = cardetals;
	}

}
