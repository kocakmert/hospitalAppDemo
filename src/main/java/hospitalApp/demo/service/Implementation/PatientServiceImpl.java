package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.entities.PatientEntity;
import hospitalApp.demo.repository.PatientRepository;
import hospitalApp.demo.service.abstracts.IPatientService;
import hospitalApp.demo.util.results.DataResult;
import hospitalApp.demo.util.results.Result;
import hospitalApp.demo.util.results.SuccessDataResult;
import hospitalApp.demo.util.results.SuccessResult;
import hospitalApp.demo.web.request.RequestAddPatient;
import hospitalApp.demo.web.request.RequestDeletePatient;
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
    public DataResult<List<PatientEntity>> getAll() {
        return new SuccessDataResult<>(patientRepository.findAll(), "Veri geldi");
    }

    @Override
    public Result addPatient(RequestAddPatient request) {
        String responseMessage = "";
        PatientEntity newPatientEntity = request.getPatient();
        if(newPatientEntity.getPatientId() != null){
            Optional<PatientEntity> optionalPatient = patientRepository.findById(newPatientEntity.getPatientId());
            if(optionalPatient.isPresent()){
                patientRepository.save(newPatientEntity);
                responseMessage = "Güncelleme Başarılı";
            }
        }else{
            patientRepository.save(newPatientEntity);
            responseMessage = "Kaydetme Başarılı";
        }
        return new SuccessResult(responseMessage);
    }

    @Override
    public Result deletePatient(RequestDeletePatient request) {
        Optional<PatientEntity> optionalPatient = patientRepository.findById(request.getPatientId());
        if(optionalPatient.isPresent()){
            patientRepository.deleteById(request.getPatientId());
        }
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public DataResult<List<PatientEntity>> getPatientByHospitalId(Long hospitalId) {
        return new SuccessDataResult<>(patientRepository.getByHospital(hospitalId), "Veri geldi");
    }
}
