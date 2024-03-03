package hospitalApp.demo.web.controller;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.service.abstracts.IHospitalService;
import hospitalApp.demo.util.results.DataResult;
import hospitalApp.demo.util.results.Result;
import hospitalApp.demo.web.request.RequestAddHospital;
import hospitalApp.demo.web.request.RequestDeleteHospital;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@RequestMapping("/hospital")
@CrossOrigin
public class HospitalController {
    private IHospitalService hospitalService;

    @GetMapping("/getAllHospital")
    public DataResult<List<HospitalEntity>> getAllHospital(){
        return hospitalService.getAll();
    }

    @PostMapping("/addHospital")
    public Result addHospital(@RequestBody RequestAddHospital request){
        return hospitalService.addHospital(request);
    }

    @PostMapping("/deleteHospital")
    public Result deleteHospital(@RequestBody RequestDeleteHospital request){
        return hospitalService.deleteHospital(request);
    }
}
