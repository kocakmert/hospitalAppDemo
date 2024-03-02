package hospitalApp.demo.service.abstracts;

import hospitalApp.demo.entities.PatientEntity;
import hospitalApp.demo.util.results.DataResult;
import hospitalApp.demo.util.results.Result;
import hospitalApp.demo.web.request.RequestAddPatient;
import hospitalApp.demo.web.request.RequestDeletePatient;
import java.util.List;

public interface IPatientService {

    DataResult<List<PatientEntity>> getAll();

    Result addPatient(RequestAddPatient request );

    Result deletePatient(RequestDeletePatient request);

    DataResult<List<PatientEntity>> getPatientByHospitalId(Long hospitalId);
}
