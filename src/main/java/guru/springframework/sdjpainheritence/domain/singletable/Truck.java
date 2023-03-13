package guru.springframework.sdjpainheritence.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("truck")
public class Truck extends Vehicle {

    private String truckProp;

    public String getTruckProp() {
        return truckProp;
    }

    public void setTruckProp(String truckProp) {
        this.truckProp = truckProp;
    }
}
