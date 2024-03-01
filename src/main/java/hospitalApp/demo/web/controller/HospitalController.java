package hospitalApp.demo.web.controller;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.service.abstracts.IHospitalService;
import hospitalApp.demo.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@RequestMapping("/hospital")
public class HospitalController {
    private IHospitalService hospitalService;

    @PostMapping("/addHospital")
    public Result addHospital(@RequestBody HospitalEntity hospital){
        return hospitalService.addHospital(hospital);
    }
}
