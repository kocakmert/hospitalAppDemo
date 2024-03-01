package hospitalApp.demo.web.dto;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class HospitalDTO {
    private Long  hospitalId;
    private String hospitalName;
    private String hospitalAdress;
    private Integer hospitalType;
}
