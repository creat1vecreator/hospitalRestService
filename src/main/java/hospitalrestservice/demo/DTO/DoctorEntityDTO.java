package hospitalrestservice.demo.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Data
@Builder
public class DoctorEntityDTO {

    @NonNull
    Long doctorId;

    String firstName;

    String lastName;

    String workSchedule;

    Byte averageRate;

    @NonNull
    String speciality;

    String education;


}
