package tn.amira.hopitaldemospringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.amira.hopitaldemospringmvc.entites.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
