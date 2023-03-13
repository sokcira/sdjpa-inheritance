package guru.springframework.sdjpainheritence.domain.joinedtable;

import jakarta.persistence.Entity;

@Entity
public class Guitar extends Instrument {

    private Integer numberOfSnaren;

    public Integer getNumberOfSnaren() {
        return numberOfSnaren;
    }

    public void setNumberOfSnaren(Integer numberOfSnaren) {
        this.numberOfSnaren = numberOfSnaren;
    }
}
