package kian.springframework.mymsscbrewery.services;

import kian.springframework.mymsscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cet")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeed(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo
    }

    @Override
    public void deleteById(UUID beerId) {
      log.debug("delete the beer...");
    }
}
