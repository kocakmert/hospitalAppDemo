package hospitalApp.demo.web.request;

import hospitalApp.demo.entities.PatientEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestAddPatient {
    PatientEntity patient;
}
