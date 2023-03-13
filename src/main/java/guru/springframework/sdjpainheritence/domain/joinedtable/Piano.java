package guru.springframework.sdjpainheritence.domain.joinedtable;

import jakarta.persistence.Entity;

@Entity
public class Piano extends Instrument {

    private Integer numberOfKeys;

    public Integer getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(Integer numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
}
