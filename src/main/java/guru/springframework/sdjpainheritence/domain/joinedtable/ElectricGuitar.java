package guru.springframework.sdjpainheritence.domain.joinedtable;

import jakarta.persistence.Entity;

@Entity
public class ElectricGuitar extends Guitar {

    private Integer numberOfButtons;

    public Integer getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(Integer numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }
}
