package kian.springframework.mymsscbrewery.domain;

import kian.springframework.mymsscbrewery.web.model.enums.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author Kian
 * @created 4/2/2023 - 6:45 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastModifiedDate;
}
