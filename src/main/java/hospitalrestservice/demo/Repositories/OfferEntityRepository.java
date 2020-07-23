package hospitalrestservice.demo.Repositories;

import hospitalrestservice.demo.Entities.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OfferEntityRepository extends JpaRepository<OfferEntity, Long> {

    Optional<OfferEntity> findByServiceId(Long serviceId);

    Optional<OfferEntity> findAllByPrice(Double price);

    List<OfferEntity> findAllByPriceAndStaff(Double price, String staff);


    Optional<OfferEntity> deleteByServiceId(Long serviceId);

    List<OfferEntity> deleteAllByPriceAndProfitableOffers(Double price, String profitableOffers);

    List<OfferEntity> deleteAllByStaff(String staff);

}
