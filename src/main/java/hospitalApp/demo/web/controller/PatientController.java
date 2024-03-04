package hospitalApp.demo.web.controller;

import hospitalApp.demo.service.abstracts.IPatientService;
import hospitalApp.demo.util.results.BaseResponse;
import hospitalApp.demo.web.request.RequestAddPatient;
import hospitalApp.demo.web.request.RequestDeletePatient;
import hospitalApp.demo.web.response.ResponsePatient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {

    private IPatientService service;

    @GetMapping("/getAllPatient")
    public ResponseEntity<ResponsePatient> getAllPatient(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping("/addPatient")
    public ResponseEntity<BaseResponse> addPatient(@RequestBody RequestAddPatient request){
        return new ResponseEntity<>(service.addPatient(request), HttpStatus.OK);
    }

    @PostMapping("/deletePatient")
    public ResponseEntity<BaseResponse> deleteHospital(@RequestBody RequestDeletePatient request){
        return  new ResponseEntity<>(service.deletePatient(request), HttpStatus.OK);
    }

    @GetMapping("/getPatientByHospital/{hospitalId}")
    public ResponseEntity<ResponsePatient> getPatientByHospital(@PathVariable Long hospitalId){
        return new ResponseEntity<>(service.getPatientByHospitalId(hospitalId), HttpStatus.OK);
    }

}
