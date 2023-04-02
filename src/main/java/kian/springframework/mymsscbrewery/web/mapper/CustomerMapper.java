package kian.springframework.mymsscbrewery.web.mapper;

import kian.springframework.mymsscbrewery.domain.Customer;
import kian.springframework.mymsscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @author Kian
 * @created 4/2/2023 - 7:09 AM
 */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
