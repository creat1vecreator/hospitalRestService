package hospitalrestservice.demo.Controllers;

import hospitalrestservice.demo.DTO.PatientEntityDTO;
import hospitalrestservice.demo.Entities.PatientEntity;
import hospitalrestservice.demo.Services.PatientEntityService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("patient/")
public class PatientEntityController {

    private final PatientEntityService patientEntityService;

    @GetMapping("findBy/MedicineCardId/{medicineCardId}")
    public PatientEntity findByMedicineCardId(@PathVariable Long medicineCardId) {
        return patientEntityService.findByMedicineCardId(medicineCardId);
    }

    @GetMapping("findBy/FirstName/{firstName}/And/LastName/{lastName}")
    public PatientEntity findByFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
        return patientEntityService.findByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("findAllBy/Age/{age}/And/Diagnosis/{diagnosis}")
    public List<PatientEntity> findAllByAgeAndDiagnosis(@PathVariable Byte age, @PathVariable String diagnosis) {
        return patientEntityService.findAllByAgeAndDiagnosis(age, diagnosis);
    }

    @GetMapping("findAllBy/NumberOfVisits/{numberOfVisits}")
    public List<PatientEntity> findAllByNumberOfVisits(@PathVariable Short numberOfVisits) {
        return patientEntityService.findAllByNumberOfVisits(numberOfVisits);
    }

    @DeleteMapping("deleteByMedicineCardId/{medicineCardId}")
    public PatientEntity deleteByMedicineCardId(@PathVariable Long medicineCardId) {
        return patientEntityService.deleteByMedicineCardId(medicineCardId);
    }

    @DeleteMapping("deleteBy/FirstName/{firstName}/And/LastName/{lastName}")
    public PatientEntity deleteByFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
        return patientEntityService.deleteByFirstNameAndLastName(firstName, lastName);
    }

    @DeleteMapping("deleteAllBy/NumberOfVisits/{numberOfVisits}/And/Age/{age}")
    public List<PatientEntity> deleteAllByNumberOfVisitsAndAge(@PathVariable Short numberOfVisits, @PathVariable Byte age) {
        return patientEntityService.deleteAllByNumberOfVisitsAndAge(numberOfVisits, age);
    }

    @DeleteMapping("deleteAllByDiagnosis/{diagnosis}")
    public List<PatientEntity> deleteAllByDiagnosis(@PathVariable String diagnosis) {
        return patientEntityService.deleteAllByDiagnosis(diagnosis);
    }

    @PostMapping()
    public void createPatient(@RequestBody PatientEntity patientEntity) {
        patientEntityService.createPatient(patientEntity);
    }

    @PutMapping("updatePatientEntityDiagnosis/")
    public void updatePatientEntityDiagnosis(@RequestBody PatientEntityDTO patientEntityDTO) {
        patientEntityService.updatePatientEntityDiagnosis(patientEntityDTO);
    }

    @PutMapping("/updatePatientEntityNumberOfVisits/")
    public void updatePatientEntityNumberOfVisits(@RequestBody PatientEntityDTO patientEntityDTO) {
        patientEntityService.updatePatientEntityNumberOfVisits(patientEntityDTO);
    }
}



