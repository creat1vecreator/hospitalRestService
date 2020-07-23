package hospitalrestservice.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "DOCTOR_ENTITY")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String workSchedule;

    @Column
    private Byte averageRate;

    @Column
    private String speciality;

    @Column
    private String education;


}
