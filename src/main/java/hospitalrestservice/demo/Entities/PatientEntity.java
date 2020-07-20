package hospitalrestservice.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PATIENT_ENTITY")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicineCardId;

    @Column
    Long phoneNumber;

    @Column
    String firstName;

    @Column
    String secondName;

    @Column
    private Character gender;

    @Column
    String address;

    @Column
    String review;

    @Column
    String appointedTime;

    @Column
    Byte visitEvaluation;
}
