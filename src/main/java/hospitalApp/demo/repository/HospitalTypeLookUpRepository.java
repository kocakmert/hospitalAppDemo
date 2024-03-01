package hospitalApp.demo.repository;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import hospitalApp.demo.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HospitalTypeLookUpRepository extends JpaRepository<HospitalTypeLookUpEntity,Long> , JpaSpecificationExecutor<PatientEntity> {
}
