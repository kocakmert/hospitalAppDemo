package hospitalApp.demo.entities;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HospitalEntityTest {

    @Test
    void test_HospitalEntity(){
        HospitalEntity hospitalEntity = new HospitalEntity();

        hospitalEntity.setHospitalId(1L);
        hospitalEntity.setHospitalAdress("Test");
        hospitalEntity.setHospitalName("TST");
        hospitalEntity.setHospitalType(1);
        hospitalEntity.setPatient(new ArrayList<>());

        hospitalEntity.getHospitalId();
        hospitalEntity.getHospitalAdress();
        hospitalEntity.getHospitalName();
        hospitalEntity.getHospitalType();
        hospitalEntity.getPatient();

        assertNotNull(hospitalEntity);
    }
}
