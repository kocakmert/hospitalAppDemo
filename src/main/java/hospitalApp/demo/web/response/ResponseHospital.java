package hospitalApp.demo.web.response;

import hospitalApp.demo.entities.HospitalEntity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ResponseHospital {
    List<HospitalEntity> hospitalList;
}
