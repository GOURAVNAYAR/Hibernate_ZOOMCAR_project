package Dto;

import javax.persistence.*;

@Entity
@Table(name = "Best_place_To_Vist_in_Bhopal")
public class Best_place_To_Vist_in_Bhopal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true)
	private int bestplaceToVistinBhopalId;

	@Column(name = "BestplaceToVistinBhopalAbout")
	private String bestplaceToVistinBhopalLocation;

	@ManyToOne
	@JoinColumn(name = "Popular_placeId", nullable = false)
	private Popular_place popularplace;

	// Getters and Setters
	public int getBestplaceToVistinBhopalId() {
		return bestplaceToVistinBhopalId;
	}

	public void setBestplaceToVistinBhopalId(int bestplaceToVistinBhopalId) {
		this.bestplaceToVistinBhopalId = bestplaceToVistinBhopalId;
	}

	public String getBestplaceToVistinBhopalLocation() {
		return bestplaceToVistinBhopalLocation;
	}

	public void setBestplaceToVistinBhopalLocation(String bestplaceToVistinBhopalLocation) {
		this.bestplaceToVistinBhopalLocation = bestplaceToVistinBhopalLocation;
	}

	public Popular_place getPopularplace() {
		return popularplace;
	}

	public void setPopularplace(Popular_place popularplace) {
		this.popularplace = popularplace;
	}
}
