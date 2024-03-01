package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.repository.HospitalRepository;
import hospitalApp.demo.service.abstracts.IHospitalService;
import hospitalApp.demo.util.results.Result;
import hospitalApp.demo.util.results.SuccessResult;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor(onConstructor =  @__(@Autowired))
public class HospitalServiceImpl implements IHospitalService {

    private HospitalRepository hospitalRepository;

    @Override
    public Result addHospital(HospitalEntity hospital) {
        hospitalRepository.save(hospital);
        return new SuccessResult("Hastane Eklendi");
    }
}
