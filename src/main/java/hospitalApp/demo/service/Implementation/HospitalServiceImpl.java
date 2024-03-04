package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.repository.HospitalRepository;
import hospitalApp.demo.service.abstracts.IHospitalService;
import hospitalApp.demo.util.results.*;
import hospitalApp.demo.web.request.RequestAddHospital;
import hospitalApp.demo.web.request.RequestDeleteHospital;
import hospitalApp.demo.web.response.ResponseHospital;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor =  @__(@Autowired))
public class HospitalServiceImpl implements IHospitalService {

    private HospitalRepository hospitalRepository;

    @Override
    public ResponseHospital getAll() {
        ResponseHospital response = new ResponseHospital();
        response.setHospitalList(hospitalRepository.findAll());
        return response;
    }

    @Override
    public BaseResponse addHospital(RequestAddHospital request) {
        BaseResponse response = new BaseResponse();
        try{
            HospitalEntity newHospitalEntity = request.getHospital();
            if(newHospitalEntity.getHospitalId() != null){
                Optional<HospitalEntity> optionalHospital = hospitalRepository.findById(newHospitalEntity.getHospitalId());
                if(optionalHospital.isPresent()){
                    hospitalRepository.save(newHospitalEntity);
                    response.setSuccess(true);
                    response.setMessage("Güncelleme Başarılı");
                }
            }else{
                hospitalRepository.save(newHospitalEntity);
                response.setSuccess(true);
                response.setMessage("Kaydetme Başarılı");
            }
        }catch (Exception e){
            response.setSuccess(false);
            response.setMessage("Hata" + e.getMessage());
        }
        return response;
    }

    @Override
    public BaseResponse deleteHospital(RequestDeleteHospital request) {
        BaseResponse response = new BaseResponse();
        try {
            Optional<HospitalEntity> optionalHospital = hospitalRepository.findById(request.getId());
            if(optionalHospital.isPresent()){
                hospitalRepository.deleteById(request.getId());
                response.setSuccess(true);
                response.setMessage("Silme Başarılı");
            }
        }catch (Exception e){
            response.setSuccess(false);
            response.setMessage("Hata" + e.getMessage());
        }
        return response;
    }
}
