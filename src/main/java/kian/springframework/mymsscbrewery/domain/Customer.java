package kian.springframework.mymsscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Kian
 * @created 4/2/2023 - 7:10 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    UUID id;
    String name;
}
