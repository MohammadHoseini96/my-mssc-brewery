package kian.springframework.mymsscbrewery.web.mapper;

import kian.springframework.mymsscbrewery.domain.Beer;
import kian.springframework.mymsscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author Kian
 * @created 4/2/2023 - 6:53 AM
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
