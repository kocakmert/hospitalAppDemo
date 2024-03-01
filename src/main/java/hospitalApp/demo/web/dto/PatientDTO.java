package hospitalApp.demo.web.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDTO {
    private Long patientId;
    private String patientFirstName;
    private String patientLastName;
    private Integer patientGender;
    private Integer patientAge;
    private String patientTc;
    private String patientAdress;
    private String patientComplaint;
    private Long hospitalId;
}
