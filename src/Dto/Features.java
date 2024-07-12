package Dto;

import javax.persistence.*;

@Entity
@Table(name = "Features")
public class Features {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "featureId")
    private int featureId;

    @Column(name = "featureName")
    private String featureName;

    @ManyToOne
    @JoinColumn(name = "cardetalsId", nullable = false)
    private Car_Detals cardetals;

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public Car_Detals getCardetals() {
        return cardetals;
    }

    public void setCardetals(Car_Detals cardetals) {
        this.cardetals = cardetals;
    }
}
