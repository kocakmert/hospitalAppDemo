package hospitalApp.demo.web.controller;

import hospitalApp.demo.service.abstracts.IHospitalService;
import hospitalApp.demo.util.results.BaseResponse;
import hospitalApp.demo.web.request.RequestAddHospital;
import hospitalApp.demo.web.request.RequestDeleteHospital;
import hospitalApp.demo.web.response.ResponseHospital;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@RequestMapping("/hospital")
@CrossOrigin
public class HospitalController {
    private IHospitalService hospitalService;

    @GetMapping("/getAllHospital")
    public ResponseEntity<ResponseHospital> getAllHospital(){
        return new ResponseEntity<>(hospitalService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/addHospital")
    public ResponseEntity<BaseResponse> addHospital(@RequestBody RequestAddHospital request){
        return new ResponseEntity<>(hospitalService.addHospital(request), HttpStatus.OK);
    }

    @PostMapping("/deleteHospital")
    public ResponseEntity<BaseResponse> deleteHospital(@RequestBody RequestDeleteHospital request){
        return new ResponseEntity<>(hospitalService.deleteHospital(request), HttpStatus.OK);
    }
}
