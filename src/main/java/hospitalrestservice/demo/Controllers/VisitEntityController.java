package hospitalrestservice.demo.Controllers;

import hospitalrestservice.demo.DTO.VisitEntityDTO;
import hospitalrestservice.demo.Entities.VisitEntity;
import hospitalrestservice.demo.Services.VisitEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("visit/")
public class VisitEntityController {

    private final VisitEntityService visitEntityService;


    @GetMapping("{visitId}")
    List<VisitEntity> findAllByVisitId(@PathVariable Long visitId) {
        return visitEntityService.findAllByVisitId(visitId);
    }

    @GetMapping("getByVisitID/{visitId}")
    VisitEntity getByVisitId(@PathVariable Long visitId) {

        return visitEntityService.getByVisitId(visitId);
    }

    @GetMapping("getAllByVisitId/{visitId}")
    List<VisitEntity> getAllByVisitId(@PathVariable Long visitId) {
        return visitEntityService.getAllByVisitId(visitId);
    }

    @GetMapping("findByVisitId/{visitId}")
    public VisitEntity findByVisitId(@PathVariable Long visitId) {
        return visitEntityService.findByVisitId(visitId);
    }

    @GetMapping("findBy/FullNameOfDoctor/{fullNameOfDoctor}/And/FullNameOfPatient/{fullNameOfPatient}")
    public VisitEntity findByFullNameOfDoctorAndFullNameOfPatient(@PathVariable String fullNameOfDoctor, @PathVariable String fullNameOfPatient) {
        return visitEntityService.findByFullNameOfDoctorAndFullNameOfPatient(fullNameOfDoctor, fullNameOfPatient);
    }

    @GetMapping("findBy/Comments/{comments}AndDate/{date}")
    public List<VisitEntity> findByCommentsAndDate(@PathVariable String comments, @PathVariable String date) {
        return visitEntityService.findByCommentsAndAndDate(comments, date);
    }

    @GetMapping("findBy/GeneralSymptoms/{generalSymptoms}And/NumberOfCabinet/{numberOfCabinet}")
    public List<VisitEntity> findByGeneralSymptomsAndNumberOfCabinet(@PathVariable String generalSymptoms, @PathVariable Byte numberOfCabinet) {
        return visitEntityService.findByGeneralSymptomsAndNumberOfCabinet(generalSymptoms, numberOfCabinet);
    }


    @DeleteMapping("{visitId}")
    public VisitEntity deleteByVisitId(@PathVariable Long visitId) {
        return visitEntityService.deleteByVisitId(visitId);
    }

    @DeleteMapping("deleteBy/Date/{date}/And/NumberOfCabinet/{numberOfCabinet}")
    public VisitEntity deleteByDateAndNumberOfCabinet(@PathVariable String date, @PathVariable Byte numberOfCabinet) {
        return visitEntityService.deleteByDateAndNumberOfCabinet(date, numberOfCabinet);
    }

    @DeleteMapping("deleteAllBy/Comments/{comments}/AndAnd/Date/{date}")
    public List<VisitEntity> deleteAllByCommentsAndAndDate(@PathVariable String comments, @PathVariable @Validated String date) {
        return visitEntityService.deleteAllByCommentsAndAndDate(comments, date);
    }

    @DeleteMapping("deleteAllBy/GeneralSymptoms/{generalSymptoms}")
    public List<VisitEntity> deleteAllByGeneralSymptoms(@PathVariable String generalSymptoms) {
        return visitEntityService.deleteAllByGeneralSymptoms(generalSymptoms);
    }

    @PostMapping()
    public void createVisitEntity(@RequestBody VisitEntity visitEntity) {
        visitEntityService.createVisitEntity(visitEntity);
    }

    @PutMapping("updateVisitEntity/GeneralSymptoms/{visitEntityDTO}")
    public void updateVisitEntityGeneralSymptoms(@RequestBody @PathVariable VisitEntityDTO visitEntityDTO) {
        visitEntityService.updateVisitEntityGeneralSymptoms(visitEntityDTO);
    }

    @PutMapping("updateVisitEntity/Date/{visitEntityDTO}")
    public void updateVisitEntityDate(@PathVariable @RequestBody VisitEntityDTO visitEntityDTO) {
        visitEntityService.updateVisitEntityDate(visitEntityDTO);

    }
}

