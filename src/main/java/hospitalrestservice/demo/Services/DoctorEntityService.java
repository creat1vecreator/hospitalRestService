package hospitalrestservice.demo.Services;

import hospitalrestservice.demo.DTO.DoctorEntityDTO;
import hospitalrestservice.demo.Entities.DoctorEntity;
import hospitalrestservice.demo.Repositories.DoctorEntityRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Data
public class DoctorEntityService {

    private final DoctorEntityRepository doctorEntityRepository;

    public DoctorEntity findByDoctorId(Long doctorId) {
        return doctorEntityRepository.findByDoctorId(doctorId).orElseThrow(RuntimeException::new);
    }

    public DoctorEntity findByFirstNameAndLastName(String firstName, String lastName) {
        return doctorEntityRepository.findByFirstNameAndLastName(firstName, lastName).orElseThrow(RuntimeException::new);
    }

    public List<DoctorEntity> findAllByEducation(String education) {
        return doctorEntityRepository.findAllByEducation(education);
    }

    public List<DoctorEntity> findAllByAverageRate(Byte averageRate) {
        return doctorEntityRepository.findAllByAverageRate(averageRate);
    }

    public DoctorEntity deleteByDoctorId(Long doctorId) {
        return doctorEntityRepository.deleteByDoctorId(doctorId).orElseThrow(RuntimeException::new);

    }

    public DoctorEntity deleteByLastName(String lastName) {
        return doctorEntityRepository.deleteByLastName(lastName).orElseThrow(RuntimeException::new);
    }

    public List<DoctorEntity> deleteAllByWorkSchedule(String workSchedule) {
        return doctorEntityRepository.deleteAllByWorkSchedule(workSchedule);
    }

    public List<DoctorEntity> deleteAllByAverageRateAndEducation(Byte averageRate, String education) {
        return doctorEntityRepository.deleteAllByAverageRateAndEducation(averageRate, education);
    }

    public void createDoctorEntity(DoctorEntityDTO doctorEntityDTO) {
        doctorEntityRepository.save(DoctorEntity
                .builder()
                .averageRate(doctorEntityDTO.getAverageRate())
                .education(doctorEntityDTO.getEducation())
                .build());
    }

    public void updateDoctorEntityEducation(DoctorEntityDTO doctorEntityDTO) {
        var doctorEntity = findByDoctorId(doctorEntityDTO.getDoctorId());
        doctorEntity.setEducation(doctorEntityDTO.getEducation());
        doctorEntityRepository.save(doctorEntity);
    }

    public void updateDoctorEntityWorkSchedule(DoctorEntityDTO doctorEntityDTO) {
        var doctorEntity = findByDoctorId(doctorEntityDTO.getDoctorId());
        doctorEntity.setWorkSchedule(doctorEntityDTO.getWorkSchedule());
        doctorEntityRepository.save(doctorEntity);
    }
}