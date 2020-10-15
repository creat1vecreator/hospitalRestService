package hospitalrestservice.demo.Repositories;

import hospitalrestservice.demo.Entities.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface SampleRepo extends JpaRepository<Sample, Long> {
    Optional<Sample> findByName(String name);

    List<Sample> findAllByConsultationIn(List<String> consultation);

    List<Sample> findAll();
}
