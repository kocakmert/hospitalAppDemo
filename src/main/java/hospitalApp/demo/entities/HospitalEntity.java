package hospitalApp.demo.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "HOSPITAL")
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","patient"})
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "seq_hospital")
    @SequenceGenerator(name = "seq_hospital" , sequenceName = "seq_hospital" , allocationSize = 1 )
    @Column(name="HOSPITAL_ID")
    private Long  hospitalId;
    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;
    @Column(name = "HOSPITAL_ADRESS")
    private String hospitalAdress;
    @Column(name = "HOSPITAL_TYPE")
    private Integer hospitalType;
    @OneToMany(mappedBy = "hospital",cascade = CascadeType.ALL)
    private List<PatientEntity> patient;
}
