package hospitalApp.demo.web.request;

import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.entities.PatientEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RequestAddPatientTest {
    @Test
    void test_RequestAddPatient(){
        RequestAddPatient request = new RequestAddPatient();
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

        request.setPatient(patientEntity);
        request.getPatient();

        assertNotNull(request);
    }
}
