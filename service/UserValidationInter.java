package com.userregistration.service;

import com.userregistration.exception.UserRegistrationException;

@FunctionalInterface
public interface UserValidationInter {
    //lambda expression of validation method
    public abstract boolean validateRegistration(String registrationField) throws UserRegistrationException;
}
