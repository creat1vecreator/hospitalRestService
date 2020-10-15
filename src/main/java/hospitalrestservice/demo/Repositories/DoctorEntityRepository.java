package hospitalrestservice.demo.Repositories;

import hospitalrestservice.demo.Entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorEntityRepository extends JpaRepository<DoctorEntity, Long> {

    Optional<DoctorEntity> findByDoctorId(Long doctorId);

    Optional<DoctorEntity> findByFirstNameAndLastName(String firstName, String lastName);

    List<DoctorEntity> findAllByEducation(String education);

    List<DoctorEntity> findAllByAverageRate(Byte averageRate);

    Optional<DoctorEntity> deleteByLastName(String lastName);

    List<DoctorEntity> deleteAllByWorkSchedule(String workSchedule);

    List<DoctorEntity> deleteAllByAverageRateAndEducation(Byte averageRate, String education);

    Optional<DoctorEntity> deleteByDoctorId(Long doctorId);

}
