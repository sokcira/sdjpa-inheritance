package guru.springframework.sdjpainheritence.domain.msuperclass;

import jakarta.persistence.Entity;

@Entity
public class Customer extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
