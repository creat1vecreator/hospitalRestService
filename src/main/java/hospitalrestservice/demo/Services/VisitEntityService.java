package hospitalrestservice.demo.Services;

import hospitalrestservice.demo.DTO.VisitEntityDTO;
import hospitalrestservice.demo.Entities.VisitEntity;
import hospitalrestservice.demo.Repositories.VisitEntityRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Data
public class VisitEntityService {
    VisitEntityRepository visitEntityRepository;

    public List<VisitEntity> findAllByVisitId(Long visitId) {
        return visitEntityRepository.findAllByVisitId(visitId);
    }

    public VisitEntity getByVisitId(Long visitId) {
        return visitEntityRepository.getByVisitId(visitId).orElseThrow(RuntimeException::new);
    }

    public List<VisitEntity> getAllByVisitId(Long visitId) {
        return visitEntityRepository.getAllByVisitId(visitId);
    }

    public VisitEntity findByVisitId(Long visitId) {
        return visitEntityRepository.findByVisitId(visitId).orElseThrow(RuntimeException::new);
    }

    public VisitEntity findByFullNameOfDoctorAndFullNameOfPatient(String fullNameOfDoctor, String fullNameOfPatient) {
        return visitEntityRepository.findByFullNameOfDoctorAndFullNameOfPatient(fullNameOfDoctor, fullNameOfPatient).orElseThrow(RuntimeException::new);
    }

    public List<VisitEntity> findByCommentsAndAndDate(String comments, String date) {
        return visitEntityRepository.findByCommentsAndDate(comments, date);
    }

    public List<VisitEntity> findByGeneralSymptomsAndNumberOfCabinet(String generalSymptoms, Byte numberOfCabinet) {
        return visitEntityRepository.findByGeneralSymptomsAndNumberOfCabinet(generalSymptoms, numberOfCabinet);
    }


    public VisitEntity deleteByVisitId(Long visitId) {
        return visitEntityRepository.deleteByVisitId(visitId).orElseThrow(RuntimeException::new);
    }

    public VisitEntity deleteByDateAndNumberOfCabinet(String date, Byte numberOfCabinet) {
        return visitEntityRepository.deleteByDateAndNumberOfCabinet(date, numberOfCabinet).orElseThrow(RuntimeException::new);
    }

    public List<VisitEntity> deleteAllByCommentsAndAndDate(String comments, String date) {
        return visitEntityRepository.deleteAllByCommentsAndAndDate(comments, date);
    }

    public List<VisitEntity> deleteAllByGeneralSymptoms(String generalSymptoms) {
        return visitEntityRepository.deleteAllByGeneralSymptoms(generalSymptoms);
    }

    public void createVisitEntity(VisitEntity visitEntity) {
        visitEntityRepository.save(visitEntity);
    }

    public void updateVisitEntityGeneralSymptoms(VisitEntityDTO visitEntityDTO) {
        var visitEntity = getByVisitId(visitEntityDTO.getVisitId());
        visitEntity.setGeneralSymptoms(visitEntityDTO.getGeneralSymptoms());
        visitEntityRepository.save(visitEntity);
    }

    public void updateVisitEntityDate(VisitEntityDTO visitEntityDTO) {
        var entity = findByVisitId(visitEntityDTO.getVisitId());
        entity.setDate(visitEntityDTO.getDate());
        visitEntityRepository.save(entity);
    }
}

