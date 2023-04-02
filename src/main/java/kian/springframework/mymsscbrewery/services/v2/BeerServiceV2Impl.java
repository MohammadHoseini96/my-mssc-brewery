package kian.springframework.mymsscbrewery.services.v2;

import kian.springframework.mymsscbrewery.web.model.enums.BeerStyleEnum;
import kian.springframework.mymsscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cet V2")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo
    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
