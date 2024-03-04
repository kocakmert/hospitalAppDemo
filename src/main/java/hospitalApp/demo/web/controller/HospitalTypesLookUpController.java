package hospitalApp.demo.web.controller;

import hospitalApp.demo.service.abstracts.IHospitalTypeLookUpService;
import hospitalApp.demo.web.response.ResponseHospitalType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospitalTypes")
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@CrossOrigin
public class HospitalTypesLookUpController {

    private IHospitalTypeLookUpService hospitalTypeLookUpService;

    @GetMapping(path = "/getHospitalTypeAll")
    public ResponseEntity<ResponseHospitalType> getHospitalTypeAll(){
        return new ResponseEntity<>(hospitalTypeLookUpService.getAll(), HttpStatus.OK);
    }
}
