package hospitalApp.demo.web.response;

import hospitalApp.demo.entities.HospitalTypeLookUpEntity;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ResponseHospitalTypeTest {

    @Test
    void test_ResponseHospitalType(){
        ResponseHospitalType response = new ResponseHospitalType();

        List<HospitalTypeLookUpEntity> hospitalTypeList = new ArrayList<>();
        HospitalTypeLookUpEntity entity = new HospitalTypeLookUpEntity();

        entity.setId(1L);
        entity.setName("TST");
        hospitalTypeList.add(entity);

        response.setHospitalTypeList(hospitalTypeList);
        response.getHospitalTypeList();

        assertNotNull(response);
    }
}
