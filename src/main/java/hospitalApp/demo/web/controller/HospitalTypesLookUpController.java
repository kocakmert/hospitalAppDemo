package hospitalApp.demo.web.controller;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import hospitalApp.demo.service.abstracts.IHospitalTypeLookUpService;
import hospitalApp.demo.util.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/hospitalTypes")
@AllArgsConstructor(onConstructor =  @__(@Autowired))
public class HospitalTypesLookUpController {

    private IHospitalTypeLookUpService hospitalTypeLookUpService;

    @GetMapping(path = "/getHospitalTypeAll")
    public DataResult<List<HospitalTypeLookUpEntity>> getHospitalTypeAll(){
        return hospitalTypeLookUpService.getAll();
    }
}
