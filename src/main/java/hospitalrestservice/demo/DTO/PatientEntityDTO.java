package hospitalrestservice.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientEntityDTO {

   @NonNull
    private Long medicineCardId;

    private Character gender;

    String address;

    String review;

    @NonNull
    String appointedTime;

    @NonNull
    Integer phoneNumber;

    Byte visitEvaluation;

}
