package hospitalApp.demo.repository;

import hospitalApp.demo.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientRepository extends JpaRepository<PatientEntity,Long>, JpaSpecificationExecutor<PatientEntity> {
}
