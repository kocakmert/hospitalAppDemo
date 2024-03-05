package hospitalApp.demo.web.response;

import hospitalApp.demo.entities.HospitalEntity;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ResponseHospitalTest {
    @Test
    void test_ResponseHospital(){
        ResponseHospital response = new ResponseHospital();

        List<HospitalEntity> hospitalList = new ArrayList<>();
        HospitalEntity entity = new HospitalEntity();
        entity.setHospitalId(1L);
        entity.setHospitalAdress("Test");
        entity.setHospitalName("TST");
        entity.setHospitalType(1);
        entity.setPatient(new ArrayList<>());
        hospitalList.add(entity);

        response.setHospitalList(hospitalList);
        response.getHospitalList();

        assertNotNull(response);
    }
}
