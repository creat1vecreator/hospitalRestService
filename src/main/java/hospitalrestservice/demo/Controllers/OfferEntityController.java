package hospitalrestservice.demo.Controllers;

import hospitalrestservice.demo.DTO.OfferEntityDto;
import hospitalrestservice.demo.Entities.OfferEntity;
import hospitalrestservice.demo.Services.OfferEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("offerings/")
public class OfferEntityController {

    OfferEntityService offerEntityService;

    @GetMapping("findBy/ServiceId/{serviceId}")
    public OfferEntity findByServiceId(@PathVariable Long serviceId) {
        return offerEntityService.findByServiceId(serviceId);
    }

    @GetMapping("findAllByPrice/{price}")
    public OfferEntity findAllByPrice(@PathVariable Double price) {
        return offerEntityService.findAllByPrice(price);
    }


    @GetMapping("findAllBy/Price{price}/And/Staff/{staff}")
    public List<OfferEntity> findAllByPriceAndStaff(@PathVariable Double price, @PathVariable String staff) {
        return offerEntityService.findAllByPriceAndStaff(price, staff);
    }

    @DeleteMapping("deleteBy/ServiceId/{serviceId}")
    public OfferEntity deleteByServiceId(@PathVariable Long serviceId) {
        return offerEntityService.deleteByServiceId(serviceId);
    }

    @DeleteMapping("deleteAllBy/Price/{price}/And/ProfitableOffers/{profitableOffers}")
    public List<OfferEntity> deleteAllByPriceAndProfitableOffers(@PathVariable Double price, @PathVariable String profitableOffers) {
        return offerEntityService.deleteAllByPriceAndProfitableOffers(price, profitableOffers);
    }

    @DeleteMapping("deleteAllBy/Staff/{staff}")
    public List<OfferEntity> deleteAllByStaff(@PathVariable String staff) {
        return offerEntityService.deleteAllByStaff(staff);
    }

    @PostMapping()
    public void createOffer(@RequestBody OfferEntity offerEntity) {
        offerEntityService.createOffer(offerEntity);
    }


    @PutMapping("updateOfferEntity/ProfitableOffers/{offerEntityDto}")
    public void updateOfferEntityProfitableOffers(@RequestBody @PathVariable OfferEntityDto offerEntityDto) {
        offerEntityService.updateOfferEntityProfitableOffers(offerEntityDto);
    }

    @PutMapping("updateOfferEntity/Staff/{offerEntityDto}")
    public void updateOfferEntityStaff(@RequestBody @PathVariable OfferEntityDto offerEntityDto) {
        offerEntityService.updateOfferEntityStaff(offerEntityDto);
    }
}


