package guru.springframework.sdjpainheritence.domain.bootstrap;

import guru.springframework.sdjpainheritence.domain.joinedtable.ElectricGuitar;
import guru.springframework.sdjpainheritence.domain.repositories.ElectrikGuitarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoad implements CommandLineRunner {

    private final ElectrikGuitarRepository egRepository;

    public DataLoad(ElectrikGuitarRepository egRepository) {
        this.egRepository = egRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadElectricGuittar();
    }

    private void loadElectricGuittar() {
        ElectricGuitar eg = new ElectricGuitar();
        eg.setNumberOfButtons(10);
        eg.setNumberOfSnaren(0);
        egRepository.save(eg);
    }
}
