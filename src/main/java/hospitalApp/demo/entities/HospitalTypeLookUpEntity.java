package hospitalApp.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "HOSPITAL_TYPE_LOOK_UP")
@Getter
@Setter
public class HospitalTypeLookUpEntity {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
}
