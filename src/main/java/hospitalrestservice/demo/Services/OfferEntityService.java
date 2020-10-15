package hospitalrestservice.demo.Services;

import hospitalrestservice.demo.DTO.OfferEntityDto;
import hospitalrestservice.demo.Entities.OfferEntity;
import hospitalrestservice.demo.Repositories.OfferEntityRepository;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@Data
public class OfferEntityService {
    OfferEntityRepository offerEntityRepository;

    public OfferEntity findByServiceId(Long serviceId) {
        return offerEntityRepository.findByServiceId(serviceId).orElseThrow(RuntimeException::new);
    }

    public OfferEntity findAllByPrice(Double price) {
        return offerEntityRepository.findAllByPrice(price).orElseThrow(RuntimeException::new);
    }


    public List<OfferEntity> findAllByPriceAndStaff(Double price, String staff) {
        return offerEntityRepository.findAllByPriceAndStaff(price, staff);
    }

    public OfferEntity deleteByServiceId(Long serviceId) {
        return offerEntityRepository.deleteByServiceId(serviceId).orElseThrow(RuntimeException::new);
    }

    public List<OfferEntity> deleteAllByPriceAndProfitableOffers(Double price, String profitableOffers) {
        return offerEntityRepository.deleteAllByPriceAndProfitableOffers(price, profitableOffers);

    }

    public List<OfferEntity> deleteAllByStaff(String staff) {
        return offerEntityRepository.deleteAllByStaff(staff);
    }

    public void createOffer(OfferEntity offerEntity) {
        offerEntityRepository.save(offerEntity);
    }


    public void updateOfferEntityProfitableOffers(OfferEntityDto offerEntityDto) {
        var offerEntity = findByServiceId(offerEntityDto.getServiceId());
        offerEntity.setProfitableOffers(offerEntityDto.getProfitableOffers());
        offerEntityRepository.save(offerEntity);
    }

    public void updateOfferEntityStaff(OfferEntityDto offerEntityDto) {
        var offerEntity = findByServiceId(offerEntityDto.getServiceId());
        offerEntity.setStaff(offerEntityDto.getStaff());
        offerEntityRepository.save(offerEntity);
    }

}
