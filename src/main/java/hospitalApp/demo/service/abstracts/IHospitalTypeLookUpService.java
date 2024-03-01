package hospitalApp.demo.service.abstracts;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import java.util.List;

public interface IHospitalTypeLookUpService {
    List<HospitalTypeLookUpEntity> getAll();
}
