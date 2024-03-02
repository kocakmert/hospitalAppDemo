package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.repository.HospitalRepository;
import hospitalApp.demo.repository.PatientRepository;
import hospitalApp.demo.service.abstracts.IHospitalService;
import hospitalApp.demo.util.results.DataResult;
import hospitalApp.demo.util.results.Result;
import hospitalApp.demo.util.results.SuccessDataResult;
import hospitalApp.demo.util.results.SuccessResult;
import hospitalApp.demo.web.request.RequestAddHospital;
import hospitalApp.demo.web.request.RequestDeleteHospital;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor(onConstructor =  @__(@Autowired))
public class HospitalServiceImpl implements IHospitalService {

    private HospitalRepository hospitalRepository;

    @Override
    public DataResult<List<HospitalEntity>> getAll() {
        return new SuccessDataResult<>(hospitalRepository.findAll(), "Veri geldi");
    }

    @Override
    public Result addHospital(RequestAddHospital request) {
        String responseMessage = "";
        HospitalEntity newHospitalEntity = request.getHospital();
        if(newHospitalEntity.getHospitalId() != null){
            Optional<HospitalEntity> optionalHospital = hospitalRepository.findById(newHospitalEntity.getHospitalId());
            if(optionalHospital.isPresent()){
                hospitalRepository.save(newHospitalEntity);
                responseMessage = "Güncelleme Başarılı";
            }
        }else{
            hospitalRepository.save(newHospitalEntity);
            responseMessage = "Kaydetme Başarılı";
        }
        return new SuccessResult(responseMessage);
    }

    @Override
    public Result deleteHospital(RequestDeleteHospital request) {
        Optional<HospitalEntity> optionalHospital = hospitalRepository.findById(request.getId());
        if(optionalHospital.isPresent()){
            hospitalRepository.deleteById(request.getId());
        }
        return new SuccessResult("Silme Başarılı");
    }
}
