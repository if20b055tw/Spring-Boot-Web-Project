package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.services.MyValidator;
import at.fhtw.swen3.services.ParcelService;
import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.validation.*;
import java.util.Arrays;
import java.util.Set;

@RequiredArgsConstructor
@Slf4j
public class ParcelServiceImpl implements ParcelService {

    private final ParcelMapper parcelMapStruct;

    private final MyValidator myValidator;


    public void savePostalCode(@Valid Recipient recipient) {



        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Recipient>> violations = validator.validate(recipient);
        for (ConstraintViolation<Recipient> violation : violations) {
            if (recipient.getCountry().equals("Österreich") || recipient.getCountry().equals("Austria")) {
                log.error(violation.getMessage());
            }

            if (!Arrays.asList("postalCode", "street", "name", "city").contains(String.valueOf(violation.getPropertyPath()))) {
                log.error(violation.getMessage());
            }
        }
    }

    @Override
    public void submitNewParcel() {

    }
}