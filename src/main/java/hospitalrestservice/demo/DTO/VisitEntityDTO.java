package hospitalrestservice.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitEntityDTO {

    @NonNull
    Long visitId;

    @NonNull
    String fullNameOfPatient;

    @NonNull
    String fullNameOfDoctor;

    @NonNull
    String date;

    String generalSymptoms;

    @NonNull
    Byte numberOfCabinet;

    String comments;


}

