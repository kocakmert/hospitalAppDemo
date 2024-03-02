package hospitalApp.demo.repository;

import hospitalApp.demo.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientEntity,Long>, JpaSpecificationExecutor<PatientEntity> {

    @Query("From PatientEntity where hospital.hospitalId = :hospitalId")
    List<PatientEntity> getByHospital(Long hospitalId);
}
