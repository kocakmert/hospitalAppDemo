package hospitalApp.demo.web.request;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RequestDeletePatientTest {

    @Test
    void test_RequestDeletePatient(){
        RequestDeletePatient request = new RequestDeletePatient();
        request.setPatientId(1L);
        request.getPatientId();

        assertNotNull(request);
    }
}
