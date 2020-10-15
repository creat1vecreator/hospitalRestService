package hospitalrestservice.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferEntityDto {

    @NonNull
    Long serviceId;

    Double price;

    String staff;

    @NonNull
    String profitableOffers;

}
