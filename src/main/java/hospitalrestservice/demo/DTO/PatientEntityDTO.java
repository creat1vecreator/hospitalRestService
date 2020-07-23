package hospitalrestservice.demo.DTO;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
public class PatientEntityDTO {


    Long medicineCardId;

    Long phoneNumber;

    String firstName;

    String lastName;

    Character gender;

    String diagnosis;

    Short numberOfVisits;

    Byte age;


}
