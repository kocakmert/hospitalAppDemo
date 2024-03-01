package hospitalApp.demo.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "HOSPITAL")
@Getter
@Setter
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SEQ_HOSPITAL")
    @SequenceGenerator(name = "SEQ_HOSPITAL" , sequenceName = "SEQ_HOSPITAL" , allocationSize = 1 )
    @Column(name="HOSPITAL_ID")
    private Long  hospitalId;
    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;
    @Column(name = "HOSPITAL_ADRESS")
    private String hospitalAdress;
    @Column(name = "HOSPITAL_TYPE")
    private Integer hospitalType;
}
