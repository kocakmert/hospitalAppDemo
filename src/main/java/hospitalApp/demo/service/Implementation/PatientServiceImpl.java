package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.entities.PatientEntity;
import hospitalApp.demo.repository.PatientRepository;
import hospitalApp.demo.service.abstracts.IPatientService;
import hospitalApp.demo.util.results.*;
import hospitalApp.demo.web.request.RequestAddPatient;
import hospitalApp.demo.web.request.RequestDeletePatient;
import hospitalApp.demo.web.response.ResponsePatient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor(onConstructor =  @__(@Autowired))
public class PatientServiceImpl  implements IPatientService {

    private PatientRepository patientRepository;

    @Override
    public ResponsePatient getAll() {
        ResponsePatient response = new ResponsePatient();
        List<PatientEntity> patientList = patientRepository.findAll();
        response.setPatientList(patientList);
        return response;
    }

    @Override
    public BaseResponse addPatient(RequestAddPatient request) {
        BaseResponse response = new BaseResponse();
        PatientEntity newPatientEntity = request.getPatient();
        try{
            if(newPatientEntity.getPatientId() != null){
                Optional<PatientEntity> optionalPatient = patientRepository.findById(newPatientEntity.getPatientId());
                if(optionalPatient.isPresent()){
                    patientRepository.save(newPatientEntity);
                    response.setSuccess(true);
                    response.setMessage("Güncelleme Başarılı");
                }
            }else{
                patientRepository.save(newPatientEntity);
                response.setSuccess(true);
                response.setMessage("Kaydetme Başarılı");
            }
        }catch (Exception e){
            response.setSuccess(false);
            response.setMessage("Hata Alındı" + e.getMessage());
        }
        return response;
    }

    @Override
    public BaseResponse deletePatient(RequestDeletePatient request) {
        BaseResponse response = new BaseResponse();
        try {
            Optional<PatientEntity> optionalPatient = patientRepository.findById(request.getPatientId());
            if(optionalPatient.isPresent()){
                patientRepository.deleteById(request.getPatientId());
                response.setSuccess(true);
                response.setMessage("Silme Başarılı");
            }
        }catch (Exception e){
            response.setSuccess(true);
            response.setMessage("Silme İşleminde Hata oluştu" + e.getMessage());
        }
        return  response;
    }

    @Override
    public ResponsePatient getPatientByHospitalId(Long hospitalId) {
        ResponsePatient response = new ResponsePatient();
        response.setPatientList(patientRepository.getByHospital(hospitalId));
        return  response;
    }
}
