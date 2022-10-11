package at.fhtw.swen3.services;

import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.*;
import java.util.Set;

@Service
@Slf4j
public class ParcelService {

    @Autowired
    private ParcelMapper parcelMapStruct;

    public void savePostalCode(@Valid Recipient recipient){

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Recipient>> violations = validator.validate(recipient);
        for (ConstraintViolation<Recipient> violation : violations) {
            log.error(violation.getMessage());
        }
    }
}