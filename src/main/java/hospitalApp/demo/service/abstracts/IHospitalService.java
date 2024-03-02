package hospitalApp.demo.service.abstracts;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.util.results.DataResult;
import hospitalApp.demo.util.results.Result;
import hospitalApp.demo.web.request.RequestAddHospital;
import hospitalApp.demo.web.request.RequestDeleteHospital;

import java.util.List;

public interface IHospitalService {

    DataResult<List<HospitalEntity>> getAll();
    Result addHospital(RequestAddHospital request );

    Result deleteHospital(RequestDeleteHospital request);
}
