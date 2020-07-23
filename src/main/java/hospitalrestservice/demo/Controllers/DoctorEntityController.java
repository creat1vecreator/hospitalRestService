package hospitalrestservice.demo.Controllers;

import hospitalrestservice.demo.DTO.DoctorEntityDTO;
import hospitalrestservice.demo.Entities.DoctorEntity;
import hospitalrestservice.demo.Services.DoctorEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("doctor/")
public class DoctorEntityController {


    private final DoctorEntityService doctorEntityService;

    @GetMapping("findByDoctorId/{doctorId}/")
    public DoctorEntity findByDoctorId(@PathVariable @Validated Long doctorId) {
        return doctorEntityService.findByDoctorId(doctorId);
    }

    @GetMapping("findBy/FirstName/{firstName}/And/LastName/{lastName}/")
    public DoctorEntity findByFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
        return doctorEntityService.findByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("findAllBy/Education/{education}/")
    public List<DoctorEntity> findAllByEducation(@PathVariable String education) {
        return doctorEntityService.findAllByEducation(education);
    }

    @GetMapping("findAllByAverageRate/{averageRate}/")
    public List<DoctorEntity> findAllByAverageRate(@PathVariable Byte averageRate) {
        return doctorEntityService.findAllByAverageRate(averageRate);
    }

    @DeleteMapping("{doctorId}")
    public DoctorEntity deleteByDoctorId(@PathVariable Long doctorId) {
        return doctorEntityService.deleteByDoctorId(doctorId);

    }

    @DeleteMapping("deleteBy/LastName/{lastName}/")
    public DoctorEntity deleteByLastName(@PathVariable String lastName) {
        return doctorEntityService.deleteByLastName(lastName);
    }

    @DeleteMapping("deleteAllBy/WorkSchedule/{workSchedule}/")
    public List<DoctorEntity> deleteAllByWorkSchedule(@PathVariable String workSchedule) {
        return doctorEntityService.deleteAllByWorkSchedule(workSchedule);
    }

    @DeleteMapping("deleteAllBy/AverageRate/{averageRate}/And/Education/{education}")
    public List<DoctorEntity> deleteAllByAverageRateAndEducation(@PathVariable Byte averageRate, @PathVariable String education) {
        return doctorEntityService.deleteAllByAverageRateAndEducation(averageRate, education);
    }

    @PostMapping()
    public void createDoctorEntity(@RequestBody DoctorEntity doctorEntity) {
        doctorEntityService.createDoctorEntity(doctorEntity);
    }

    @PutMapping("updateDoctorEntity/Education")
    public void updateDoctorEntityEducation(@RequestBody DoctorEntityDTO doctorEntityDTO) {
        doctorEntityService.updateDoctorEntityEducation(doctorEntityDTO);
    }

    @PutMapping("updateDoctorEntity/workSchedule")
    public void updateDoctorEntityWorkSchedule(@RequestBody DoctorEntityDTO doctorEntityDTO) {
        doctorEntityService.updateDoctorEntityWorkSchedule(doctorEntityDTO);
    }

}
