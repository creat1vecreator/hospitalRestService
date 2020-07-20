package hospitalrestservice.demo.Controllers;

import hospitalrestservice.demo.DTO.PatientEntityDTO;
import hospitalrestservice.demo.Entities.PatientEntity;
import hospitalrestservice.demo.Services.PatientEntityService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@NoArgsConstructor
public class PatientEntityController {
    PatientEntityService patientEntityService;

    @GetMapping("medicineCard/{medicineCardId}")
    PatientEntity findByMedicineCardId(@PathVariable Long medicineCardId) {
        return patientEntityService.findByMedicineCardId(medicineCardId);
    }

    @GetMapping("firstName/{firstName}")
    List<PatientEntity> findAllByFirstName(@PathVariable String firstName) {
        return patientEntityService.findAllByFirstName(firstName);
    }

    @GetMapping("phoneNumber/{phoneNumber}/address/{address}")
    List<PatientEntity> findByPhoneNumberAndAddress(@PathVariable Long phoneNumber, @PathVariable String address) {
        return patientEntityService.findByPhoneNumberAndAddress(phoneNumber, address);
    }

    @GetMapping("appointedTime/{appointedTime}")
    PatientEntity findByPhoneNumber(@PathVariable String appointedTime) {
        return patientEntityService.findByAppointedTime(appointedTime);
    }

    @DeleteMapping("address/{address}")
    PatientEntity deleteAllByAddress(@PathVariable String address) {
        return patientEntityService.deleteAllByAddress(address);
    }

    @DeleteMapping("secondName/{secondName}")
    List<PatientEntity> deleteAllBySecondName(@PathVariable String secondName) {
        return patientEntityService.deleteAllBySecondName(secondName);
    }

    @DeleteMapping("gender/{gender}/visitEvaluation/{visitEvaluation}")
    List<PatientEntity> deleteAllByGenderAndVisitEvaluation(@PathVariable Character gender, @PathVariable Byte visitEvaluation) {
        return patientEntityService.deleteAllByGenderAndVisitEvaluation(gender, visitEvaluation);
    }

    @DeleteMapping("gender/{gender}/appointedTime/{appointedTime}")
    List<PatientEntity> deleteByAppointedTimeAndGender(@PathVariable Character gender, @PathVariable String appointedTime) {
        return patientEntityService.deleteByAppointedTimeAndGender(appointedTime, gender);
    }

    @PostMapping()
    public void createPatientEntity(PatientEntity patientEntity) {
        patientEntityService.createPatientEntity(patientEntity);
    }

    @PutMapping("appointedTime")

    public void updatePatientAppointedTime(PatientEntityDTO patientEntityDTO) {
        patientEntityService.updatePatientAppointedTime(patientEntityDTO);
    }

    @PutMapping("review")
    public void updatePatientReview(PatientEntityDTO patientEntityDTO) {
        patientEntityService.updatePatientReview(patientEntityDTO);
    }
}

