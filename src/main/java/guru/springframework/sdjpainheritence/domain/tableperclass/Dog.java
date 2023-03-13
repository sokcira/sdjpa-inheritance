package guru.springframework.sdjpainheritence.domain.tableperclass;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Mammal {

    private String dogSpecie;

    public String getDogSpecie() {
        return dogSpecie;
    }

    public void setDogSpecie(String dogSpecie) {
        this.dogSpecie = dogSpecie;
    }
}
