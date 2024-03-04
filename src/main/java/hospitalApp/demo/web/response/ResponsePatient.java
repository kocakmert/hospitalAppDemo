package hospitalApp.demo.web.response;

import hospitalApp.demo.entities.PatientEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ResponsePatient{
    List<PatientEntity> patientList;
}
