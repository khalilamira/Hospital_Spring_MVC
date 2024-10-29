package tn.amira.hopitaldemospringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.amira.hopitaldemospringmvc.entites.Patient;
import tn.amira.hopitaldemospringmvc.repository.PatientRepository;

import java.util.Date;

@SpringBootApplication
public class HopitalDemoSpringMvcApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalDemoSpringMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"khalil",new Date(),false,34));
        patientRepository.save(new Patient(null,"Jad",new Date(),false,456));
        patientRepository.save(new Patient(null,"Maryem",new Date(),false,346));
    }

}
