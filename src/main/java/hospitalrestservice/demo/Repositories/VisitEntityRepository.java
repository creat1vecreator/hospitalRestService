package hospitalrestservice.demo.Repositories;

import hospitalrestservice.demo.Entities.VisitEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VisitEntityRepository extends JpaRepository<VisitEntity, Long> {

    Optional<VisitEntity> findByVisitId(Long visitId);

    List<VisitEntity> findAllByVisitId(Long visitId);

    Optional<VisitEntity> getByVisitId(Long visitId);

    List<VisitEntity> getAllByVisitId(Long visitId);

    Optional<VisitEntity> findByFullNameOfDoctorAndFullNameOfPatient(String fullNameOfDoctor, String fullNameOfPatient);

    List<VisitEntity> findByCommentsAndDate(String comments, String date);

    List<VisitEntity> findByGeneralSymptomsAndNumberOfCabinet(String generalSymptoms, Byte numberOfCabinet);


    Optional<VisitEntity> deleteByVisitId(Long visitId);

    Optional<VisitEntity> deleteByDateAndNumberOfCabinet(String date, Byte numberOfCabinet);

    List<VisitEntity> deleteAllByCommentsAndAndDate(String comments, String date);

    List<VisitEntity> deleteAllByGeneralSymptoms(String generalSymptoms);


}
