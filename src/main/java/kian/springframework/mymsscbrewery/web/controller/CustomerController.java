package kian.springframework.mymsscbrewery.web.controller;

import kian.springframework.mymsscbrewery.services.CustomerService;
import kian.springframework.mymsscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<CustomerDto> handlePost(@RequestBody @Valid CustomerDto customerDto) {
        CustomerDto savedCustomerDto = customerService.saveNewCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer" + savedCustomerDto.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody @Valid CustomerDto customerDto) {
        customerService.updateCustomer(customerDto);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerId") UUID customerId) {
        customerService.deleteById(customerId);
    }

    // One way of returning customized errors to clients is this.
    // I comment this out so we can use @ControllerAdvise in MvcExceptionHandler class
//    @ExceptionHandler(ConstraintViolationException.class)
//    public ResponseEntity<List<String>> handleViolationError(ConstraintViolationException ex) {
//        List<String> errors = new ArrayList<>();
//
//        ex.getConstraintViolations().forEach(constraintViolation -> {
//            errors.add(constraintViolation.getPropertyPath() + " : " + constraintViolation.getMessage());
//        });
//
//        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//    }

}
