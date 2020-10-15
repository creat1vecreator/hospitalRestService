package hospitalrestservice.demo.Services;

import hospitalrestservice.demo.Entities.Sample;
import hospitalrestservice.demo.Repositories.SampleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {
    private final SampleRepo sampleRepo;

    public List<Sample> find(List<String> consultation) {
        return sampleRepo.findAllByConsultationIn(consultation);
    }

    public List<Sample> findAll() {
        return sampleRepo.findAll();
    }
}
