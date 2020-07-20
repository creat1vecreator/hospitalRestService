package hospitalrestservice.demo.Services;

import hospitalrestservice.demo.DTO.PatientEntityDTO;
import hospitalrestservice.demo.Entities.PatientEntity;
import hospitalrestservice.demo.Repositories.PatientEntityRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
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

    public List<PatientEntity> findAllByFirstName(String firstName) {
        return patientEntityRepository.findAllByFirstName(firstName);
    }

    public List<PatientEntity> findByPhoneNumberAndAddress(Long phoneNumber, String address) {
        return patientEntityRepository.findByPhoneNumberAndAddress(phoneNumber, address);
    }

    public PatientEntity findByAppointedTime(String appointedTime) {
        return patientEntityRepository.findByAppointedTime(appointedTime).orElseThrow(RuntimeException::new);
    }

    public PatientEntity deleteAllByAddress(String address) {
        return patientEntityRepository.deleteAllByAddress(address).orElseThrow(RuntimeException::new);
    }

    public List<PatientEntity> deleteAllByGenderAndVisitEvaluation(Character gender, Byte visitEvaluation) {
        return patientEntityRepository.deleteAllByGenderAndVisitEvaluation(gender, visitEvaluation);
    }

    public List<PatientEntity> deleteByAppointedTimeAndGender(String appointedTime, Character gender) {
        return patientEntityRepository.deleteByAppointedTimeAndGender(appointedTime, gender);
    }

    public void createPatientEntity(PatientEntity patientEntity) {
        patientEntityRepository.save(patientEntity);
    }

    public List<PatientEntity> deleteAllBySecondName(String secondName) {
        return patientEntityRepository.deleteAllBySecondName(secondName);
    }


    public void updatePatientAppointedTime(PatientEntityDTO patientEntityDTO) {
        var patientEntity = findByMedicineCardId(patientEntityDTO.getMedicineCardId());
        patientEntityDTO.setAppointedTime(patientEntityDTO.getAppointedTime());
    }

    public void updatePatientReview(PatientEntityDTO patientEntityDTO) {
        var patientEntity = findByMedicineCardId(patientEntityDTO.getMedicineCardId());
        patientEntity.setReview(patientEntityDTO.getReview());
        patientEntityRepository.save(patientEntity);

    }
}
