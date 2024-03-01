package hospitalApp.demo.service.abstracts;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import hospitalApp.demo.util.results.DataResult;

import java.util.List;

public interface IHospitalTypeLookUpService {
    DataResult<List<HospitalTypeLookUpEntity>> getAll();
}
