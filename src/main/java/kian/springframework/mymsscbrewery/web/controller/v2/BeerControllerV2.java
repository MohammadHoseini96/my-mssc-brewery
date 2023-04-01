package kian.springframework.mymsscbrewery.web.controller.v2;

import kian.springframework.mymsscbrewery.services.v2.BeerServiceV2;
import kian.springframework.mymsscbrewery.web.model.v2.BeerDtoV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {
    private final BeerServiceV2 beerService;

    // We can use project lombok's requiredArgsConstructor and it will create the below constructor for us
//    public BeerControllerV2(BeerServiceV2 beerService) {
//        this.beerService = beerService;
//    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody BeerDtoV2 beerDto) {
        log.debug("ins handle post ...");


        // val is the same as var, except that it should make the variable as final
        val savedDto = beerService.saveNewBeer(beerDto);
//        BeerDtoV2 savedDto = beerService.saveNewBeer(beerDto);

        // we can use project lombok's val when we don't know the type we!
        var headers = new HttpHeaders();
//        HttpHeaders headers = new HttpHeaders();

        headers.add("Location","/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("beerId") UUID beerId) {
        beerService.deleteById(beerId);
    }


    // One way of returning customized errors to clients is this.
    // I comment this out so we can use @ControllerAdvise in MvcExceptionHandler class
//    @ExceptionHandler(ConstraintViolationException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public Map<String, String> handleViolationError(ConstraintViolationException ex) {
//        Map<String, String> errors = new HashMap<>();
//
//        ex.getConstraintViolations().forEach(constraintViolation -> {
//            errors.put(constraintViolation.getPropertyPath().toString(), constraintViolation.getMessage());
//        });
//
//        return errors;
//    }

}
