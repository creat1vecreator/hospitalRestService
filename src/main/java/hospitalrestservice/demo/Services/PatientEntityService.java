package hospitalrestservice.demo.Services;

import hospitalrestservice.demo.DTO.PatientEntityDTO;
import hospitalrestservice.demo.Entities.PatientEntity;
import hospitalrestservice.demo.Repositories.PatientEntityRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@Service
public class PatientEntityService {
    PatientEntityRepository patientEntityRepository;

    public PatientEntity findByMedicineCardId(Long medicineCardId) {
        return patientEntityRepository.findByMedicineCardId(medicineCardId).orElseThrow(RuntimeException::new);
    }

    public PatientEntity findByFirstNameAndLastName(String firstName, String lastName) {
        return patientEntityRepository.findByFirstNameAndLastName(firstName, lastName).orElseThrow(RuntimeException::new);
    }

    public List<PatientEntity> findAllByAgeAndDiagnosis(Byte age, String diagnosis) {
        return patientEntityRepository.findAllByAgeAndDiagnosis(age, diagnosis);
    }

    public List<PatientEntity> findAllByNumberOfVisits(Short numberOfVisits) {
        return patientEntityRepository.findAllByNumberOfVisits(numberOfVisits);
    }

    public PatientEntity deleteByMedicineCardId(Long medicineCardId) {
        return patientEntityRepository.deleteByMedicineCardId(medicineCardId).orElseThrow(RuntimeException::new);
    }

    public PatientEntity deleteByFirstNameAndLastName(String firstName, String lastName) {
        return patientEntityRepository.deleteByFirstNameAndLastName(firstName, lastName).orElseThrow(RuntimeException::new);
    }

    public List<PatientEntity> deleteAllByNumberOfVisitsAndAge(Short numberOfVisits, Byte age) {
        return patientEntityRepository.deleteAllByNumberOfVisitsAndAge(numberOfVisits, age);
    }

    public List<PatientEntity> deleteAllByDiagnosis(String diagnosis) {
        return patientEntityRepository.deleteAllByDiagnosis(diagnosis);
    }

    public void createPatient(PatientEntity patientEntity) {
        patientEntityRepository.save(patientEntity);
    }

    public void updatePatientEntityDiagnosis(PatientEntityDTO patientEntityDTO) {
        var patientEntity = findByMedicineCardId(patientEntityDTO.getMedicineCardId());
        patientEntity.setDiagnosis(patientEntityDTO.getDiagnosis());
        patientEntityRepository.save(patientEntity);
    }


    public void updatePatientEntityNumberOfVisits(PatientEntityDTO patientEntityDTO) {
        var patientEntity = findByMedicineCardId(patientEntityDTO.getMedicineCardId());
        patientEntity.setNumberOfVisits(patientEntityDTO.getNumberOfVisits());
        patientEntityRepository.save(patientEntity);
    }

}


