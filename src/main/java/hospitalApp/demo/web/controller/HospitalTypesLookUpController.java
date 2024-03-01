package hospitalApp.demo.web.controller;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import hospitalApp.demo.service.abstracts.IHospitalTypeLookUpService;
import hospitalApp.demo.web.dto.HospitalTypeLookUpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/hospitalTypes")
public class HospitalTypesLookUpController {

    private IHospitalTypeLookUpService hospitalTypeLookUpService;

    @Autowired
    public HospitalTypesLookUpController(IHospitalTypeLookUpService hospitalTypeLookUpService) {
        this.hospitalTypeLookUpService = hospitalTypeLookUpService;
    }

    @GetMapping(path = "/getHospitalTypeAll")
    public List<HospitalTypeLookUpEntity> getHospitalTypeAll(){
        return  hospitalTypeLookUpService.getAll();
    }
}
