package kian.springframework.mymsscbrewery.services;

import kian.springframework.mymsscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Kian")
                .build();
    }
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        log.debug("inside saveNewCustomer service");
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Kian Mo")
                .build();
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {
        //todo
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer");
    }
}
