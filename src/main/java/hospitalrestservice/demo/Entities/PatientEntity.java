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
    Long medicineCardId;

    @Column
    Long phoneNumber;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    Character gender;

    @Column
    String diagnosis;

    @Column
    Short numberOfVisits;

    @Column
    Byte age;
}
