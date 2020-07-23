package hospitalrestservice.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "OFFER_ENTITY")
public class OfferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long serviceId;

    @Column
    Double price;

    @Column
    String staff;

    @Column
    String profitableOffers;

}
