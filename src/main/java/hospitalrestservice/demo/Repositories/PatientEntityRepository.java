package hospitalrestservice.demo.Repositories;

import hospitalrestservice.demo.Entities.PatientEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientEntityRepository extends JpaRepository<PatientEntity, Long> {

    Optional<PatientEntity> findByMedicineCardId(Long medicineCardId);

    Optional<PatientEntity> findByFirstNameAndLastName(String firstName, String lastName);

    List<PatientEntity> findAllByAgeAndDiagnosis(Byte age, String diagnosis);

    List<PatientEntity> findAllByNumberOfVisits(Short numberOfVisits);


    Optional<PatientEntity> deleteByMedicineCardId(Long medicineCardId);

    Optional<PatientEntity> deleteByFirstNameAndLastName(String firstName, String lastName);

    List<PatientEntity> deleteAllByNumberOfVisitsAndAge(Short numberOfVisits, Byte age);

    List<PatientEntity> deleteAllByDiagnosis(String diagnosis);



}
