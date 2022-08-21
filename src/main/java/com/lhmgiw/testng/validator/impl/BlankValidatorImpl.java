package com.lhmgiw.testng.validator.impl;

import com.lhmgiw.testng.validator.BlankValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class BlankValidatorImpl implements ConstraintValidator<BlankValidator, Object> {
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return Objects.isNull(value);
    }
}
