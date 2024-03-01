package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import hospitalApp.demo.repository.HospitalTypeLookUpRepository;
import hospitalApp.demo.service.abstracts.IHospitalTypeLookUpService;
import hospitalApp.demo.util.results.DataResult;
import hospitalApp.demo.util.results.SuccessDataResult;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor =  @__(@Autowired))
public class HospitalTypeLookUpServiceImpl implements IHospitalTypeLookUpService {

    private  HospitalTypeLookUpRepository hospitalTypeLookUpRepository;

    @Override
    public DataResult<List<HospitalTypeLookUpEntity>> getAll() {
        return new SuccessDataResult<>(hospitalTypeLookUpRepository.findAll(), "Veri geldi");
    }
}
