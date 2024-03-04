package hospitalApp.demo.service.abstracts;

import hospitalApp.demo.entities.PatientEntity;
import hospitalApp.demo.util.results.BaseResponse;
import hospitalApp.demo.web.request.RequestAddPatient;
import hospitalApp.demo.web.request.RequestDeletePatient;
import hospitalApp.demo.web.response.ResponsePatient;

public interface IPatientService {

    ResponsePatient getAll();

    BaseResponse addPatient(RequestAddPatient request );

    BaseResponse deletePatient(RequestDeletePatient request);

    ResponsePatient getPatientByHospitalId(Long hospitalId);

}
