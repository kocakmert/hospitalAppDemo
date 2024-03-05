package hospitalApp.demo.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PatientEntityTest {

    @Test
    void test_PatientEntity(){
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

        patientEntity.getPatientId();
        patientEntity.getPatientAge();
        patientEntity.getPatientAdress();
        patientEntity.getPatientTc();
        patientEntity.getPatientComplaint();
        patientEntity.getPatientGender();
        patientEntity.getPatientFirstName();
        patientEntity.getPatientLastName();
        patientEntity.getHospital();

        assertNotNull(patientEntity);
    }
}
