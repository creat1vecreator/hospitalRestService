package hospitalrestservice.demo.Entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity(name = "data")
@AllArgsConstructor
@NoArgsConstructor
public class Sample {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    @ElementCollection
    private List<String> consultation;
}
