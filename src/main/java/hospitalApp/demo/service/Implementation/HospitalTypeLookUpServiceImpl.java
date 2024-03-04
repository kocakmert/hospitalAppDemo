package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.repository.HospitalTypeLookUpRepository;
import hospitalApp.demo.service.abstracts.IHospitalTypeLookUpService;
import hospitalApp.demo.web.response.ResponseHospitalType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor =  @__(@Autowired))
public class HospitalTypeLookUpServiceImpl implements IHospitalTypeLookUpService {

    private  HospitalTypeLookUpRepository hospitalTypeLookUpRepository;

    @Override
    public ResponseHospitalType getAll() {
        ResponseHospitalType response = new ResponseHospitalType();
        response.setHospitalTypeList(hospitalTypeLookUpRepository.findAll());
        return response;
    }
}
