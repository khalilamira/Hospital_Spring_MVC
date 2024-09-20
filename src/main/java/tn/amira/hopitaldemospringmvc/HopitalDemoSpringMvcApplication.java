package tn.amira.hopitaldemospringmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.amira.hopitaldemospringmvc.entites.Patient;

import java.util.Date;

@SpringBootApplication
public class HopitalDemoSpringMvcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HopitalDemoSpringMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("JAD");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);

        Patient patient2 = Patient.builder()
                .nom("Khalil")
                .dateNaissance(new Date())
                .malade(true)
                .build();
    }

}
