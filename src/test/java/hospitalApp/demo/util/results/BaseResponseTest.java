package hospitalApp.demo.util.results;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BaseResponseTest {

    @Test
    void test_ResponsePatientTest(){
        BaseResponse response = new BaseResponse();
        response.setMessage("TST-SUCCESS");
        response.setSuccess(true);

        response.getMessage();
        response.getSuccess();

        assertNotNull(response);
    }
}
