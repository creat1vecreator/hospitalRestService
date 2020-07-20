package hospitalrestservice.demo.Repositories;

import hospitalrestservice.demo.Entities.PatientEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientEntityRepository extends JpaRepository<PatientEntity, Long> {

    Optional<PatientEntity> findByMedicineCardId(Long medicineCardId);

    List<PatientEntity> findAllByFirstName(String firstName);

    List<PatientEntity> findByPhoneNumberAndAddress(Long phoneNumber, String Address);

    Optional<PatientEntity> findByAppointedTime(String appointedTime);

    Optional<PatientEntity> deleteAllByAddress(String address);

    List<PatientEntity> deleteAllBySecondName(String secondName);

    List<PatientEntity> deleteAllByGenderAndVisitEvaluation(Character gender, Byte visitEvaluation);

    List<PatientEntity> deleteByAppointedTimeAndGender(String appointedTime, Character gender);

}
