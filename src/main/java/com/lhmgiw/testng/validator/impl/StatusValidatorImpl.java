package com.lhmgiw.testng.validator.impl;


import com.lhmgiw.testng.enums.StatusEnum;
import com.lhmgiw.testng.validator.StatusValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class StatusValidatorImpl implements ConstraintValidator<StatusValidator, String> {

    private StatusEnum[] subset;

    @Override
    public void initialize(StatusValidator constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(StatusEnum.getEnum(value));
    }
}
