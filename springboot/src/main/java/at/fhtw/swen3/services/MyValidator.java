package at.fhtw.swen3.services;

import lombok.extern.slf4j.Slf4j;

import javax.validation.*;
import java.util.Set;

@Slf4j
public class MyValidator {
    static ValidatorFactory getValidatorFactory() {
        return Validation.buildDefaultValidatorFactory();
    }

    Validator getValidator() {
        return getValidatorFactory().getValidator();
    }

    <T> Set<ConstraintViolation<T>> validate(T o) {
        return getValidator().validate(o);

        /*
        Validator validator = getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(o);
        violations.forEach(v -> log.error(v.getMessage()));
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }*/
    }

}
