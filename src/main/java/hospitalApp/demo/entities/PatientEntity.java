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
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "seq_patient")
    @SequenceGenerator(name = "seq_patient" , sequenceName = "seq_patient" , allocationSize = 1 )
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
    @ManyToOne()
    @JoinColumn(name = "hospital_Id")
    private HospitalEntity hospital;
}
