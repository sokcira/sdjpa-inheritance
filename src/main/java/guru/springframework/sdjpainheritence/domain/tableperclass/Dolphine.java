package guru.springframework.sdjpainheritence.domain.tableperclass;

import jakarta.persistence.Entity;

@Entity
public class Dolphine extends Mammal {

    private String dolphineSpecie;

    public String getDolphineSpecie() {
        return dolphineSpecie;
    }

    public void setDolphineSpecie(String dolphineSpecie) {
        this.dolphineSpecie = dolphineSpecie;
    }
}
