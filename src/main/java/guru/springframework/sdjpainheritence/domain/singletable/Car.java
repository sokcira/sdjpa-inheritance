package guru.springframework.sdjpainheritence.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class Car extends Vehicle {

    private String carTrimLevel;

    public String getCarTrimLevel() {
        return carTrimLevel;
    }

    public void setCarTrimLevel(String carTrimLevel) {
        this.carTrimLevel = carTrimLevel;
    }
}
