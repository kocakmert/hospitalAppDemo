package hospitalApp.demo.web.controller;

import hospitalApp.demo.entities.PatientEntity;
import hospitalApp.demo.service.abstracts.IPatientService;
import hospitalApp.demo.util.results.DataResult;
import hospitalApp.demo.util.results.Result;
import hospitalApp.demo.web.request.RequestAddPatient;
import hospitalApp.demo.web.request.RequestDeletePatient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@RequestMapping("/patient")
public class PatientController {

    private IPatientService service;

    @GetMapping("/getAllPatient")
    public DataResult<List<PatientEntity>> getAllHospital(){
        return service.getAll();
    }

    @PostMapping("/addPatient")
    public Result addPatient(@RequestBody RequestAddPatient request){
        return service.addPatient(request);
    }

    @PostMapping("/deletePatient")
    public Result deleteHospital(@RequestBody RequestDeletePatient request){
        return service.deletePatient(request);
    }

    @GetMapping("/getPatientByHospital/{hospitalId}")
    public DataResult<List<PatientEntity>> getPatientByHospital(@PathVariable Long hospitalId){
        return service.getPatientByHospitalId(hospitalId);
    }
}
