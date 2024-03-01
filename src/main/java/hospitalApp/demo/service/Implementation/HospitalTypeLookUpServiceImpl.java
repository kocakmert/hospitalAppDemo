package hospitalApp.demo.service.Implementation;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import hospitalApp.demo.repository.HospitalTypeLookUpRepository;
import hospitalApp.demo.service.abstracts.IHospitalTypeLookUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalTypeLookUpServiceImpl implements IHospitalTypeLookUpService {

    private  HospitalTypeLookUpRepository hospitalTypeLookUpRepository;
    @Autowired
    public HospitalTypeLookUpServiceImpl(HospitalTypeLookUpRepository hospitalTypeLookUpRepository) {
        super();
        this.hospitalTypeLookUpRepository = hospitalTypeLookUpRepository;
    }

    @Override
    public List<HospitalTypeLookUpEntity> getAll() {
        return hospitalTypeLookUpRepository.findAll();
    }
}
