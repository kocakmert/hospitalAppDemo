package hospitalApp.demo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "PATIENT")
@Getter
@Setter
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SEQ_PATIENT")
    @SequenceGenerator(name = "SEQ_PATIENT" , sequenceName = "SEQ_PATIENT" , allocationSize = 1 )
    @Column(name = "PATIENT_ID")
    private Long patientId;
    @Column(name = "PATIENT_FIRST_NAME")
    private String patientFirstName;
    @Column(name = "PATIENT_LAST_NAME")
    private String patientLastName;
    @Column(name = "PATIENT_GENDER")
    private Integer patientGender;
    @Column(name = "PATIENT_AGE")
    private Integer patientAge;
    @Column(name = "PATIENT_TC")
    private String patientTc;
    @Column(name = "PATIENT_ADRESS")
    private String patientAdress;
    @Column(name = "PATIENT_COMPLAINT")
    private String patientComplaint;
    @Column(name = "HOSPITAL_ID")
    private Long hospitalId;
}
