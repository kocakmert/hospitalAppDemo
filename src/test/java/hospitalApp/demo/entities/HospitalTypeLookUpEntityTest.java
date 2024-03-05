package hospitalApp.demo.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HospitalTypeLookUpEntityTest {

    @Test
    void test_HospitalTypeLookUpEntity(){
        HospitalTypeLookUpEntity entity = new HospitalTypeLookUpEntity();
        entity.setId(1L);
        entity.setName("TST");

        entity.getId();
        entity.getName();

        assertNotNull(entity);
    }
}
