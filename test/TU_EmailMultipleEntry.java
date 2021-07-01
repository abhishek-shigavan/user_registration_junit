package com.userregistration.test;
import com.userregistration.exception.UserRegistrationException;
import com.userregistration.service.UserRegistrationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TU_EmailMultipleEntry {

    private String emailToTest;
    private boolean expectedResult;

    public TU_EmailMultipleEntry(String email, boolean expectedResult){
        this.emailToTest = email;
        this.expectedResult = expectedResult;
    }
    public static Collection data(){
        return Arrays.asList(new Object[][] {   {  "abc@yahoo.com", true},
                {  "abc-100@yahoo.com", true},
                {  "abc.100@yahoo.com", true},
                {  "abc111@abc.com", true},
                {  "abc-100@abc.net", true},
                {  "abc.100@abc.com.au", true},
                {  "abc@1.com", true},
                {  "abc@gmail.com.com", true},
                {  "abc+100@gmail.com", true},
                {  "abc", false},
                {  "abc@.com.my", false},
                {  "abc123@gmail.a", false},
                {  "abc123@.com", false},
                {  "abc123@.com.com", false},
                {  ".abc@abc.com", false},
                {  "abc()*@gmail.com", false},
                {  "abc..2002@gmail.com", false},
                {  "abc@%*.com", false},
                {  "abc.@gmail.com", false},
                {  "abc@abc@gmail.com", false},
                {  "abc@gmail.com.1a", false},
                {  "abc@gmail.com.aa.au", false} });
    }
    @Test
    void validateEmail() throws UserRegistrationException {

        UserRegistrationService userService = new UserRegistrationService();
        try {

            boolean result = userService.validateEmailId(this.emailToTest);
            Assertions.assertEquals(this.expectedResult, result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
}
