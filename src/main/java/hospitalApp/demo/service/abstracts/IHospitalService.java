package hospitalApp.demo.service.abstracts;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.util.results.Result;

public interface IHospitalService {
    Result addHospital(HospitalEntity hospital);
}
