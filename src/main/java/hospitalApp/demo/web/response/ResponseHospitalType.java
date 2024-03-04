package hospitalApp.demo.web.response;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ResponseHospitalType {
    List<HospitalTypeLookUpEntity> hospitalTypeList;
}
