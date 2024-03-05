package hospitalApp.demo.web.request;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RequestDeleteHospitalTest {

    @Test
    void test_RequestDeleteHospital(){
        RequestDeleteHospital request = new RequestDeleteHospital();
        request.setId(1L);
        request.getId();

        assertNotNull(request);
    }
}
