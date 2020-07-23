package hospitalrestservice.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "VISIT_ENTITY")
public class VisitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long visitId;

    @Column
    String fullNameOfPatient;

    @Column
    String fullNameOfDoctor;

    @Column
    String date;

    @Column
    String generalSymptoms;

    @Column
    Byte numberOfCabinet;

    @Column
    String comments;


}
