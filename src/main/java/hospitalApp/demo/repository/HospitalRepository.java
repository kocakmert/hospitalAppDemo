package hospitalApp.demo.repository;

import hospitalApp.demo.entities.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface HospitalRepository extends JpaRepository<HospitalEntity,Long> , JpaSpecificationExecutor<HospitalEntity> {
}
