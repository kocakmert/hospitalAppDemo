package hospitalApp.demo.web.request;

import hospitalApp.demo.entities.HospitalEntity;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RequestAddHospitalTest {

    @Test
    void test_RequestAddHospital(){
        RequestAddHospital request = new RequestAddHospital();
        HospitalEntity hospitalEntity = new HospitalEntity();

        hospitalEntity.setHospitalId(1L);
        hospitalEntity.setHospitalAdress("Test");
        hospitalEntity.setHospitalName("TST");
        hospitalEntity.setHospitalType(1);
        hospitalEntity.setPatient(new ArrayList<>());

        request.setHospital(hospitalEntity);
        request.getHospital();

        assertNotNull(request);
    }
}
