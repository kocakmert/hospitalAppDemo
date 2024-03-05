package hospitalApp.demo.web.response;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.entities.PatientEntity;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ResponsePatientTest {

    @Test
    void test_ResponsePatientTest(){
        ResponsePatient response = new ResponsePatient();
        List<PatientEntity> patientList = new ArrayList<>();
        PatientEntity patientEntity = new PatientEntity();

        patientEntity.setPatientId(1L);
        patientEntity.setPatientAge(20);
        patientEntity.setPatientAdress("TST");
        patientEntity.setPatientTc("12345678901");
        patientEntity.setPatientComplaint("TST");
        patientEntity.setPatientGender(2);
        patientEntity.setPatientFirstName("TST FİRST");
        patientEntity.setPatientLastName("TST LAST");
        patientEntity.setHospital(new HospitalEntity());

        patientList.add(patientEntity);

        response.setPatientList(patientList);
        response.getPatientList();

        assertNotNull(response);
    }
}
