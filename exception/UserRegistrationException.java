package com.userregistration.exception;
/**
 * MoodAnalyserException -- Creating Custom exception to handle
 *                          exception cause by methods of UserRegistration
 *
 * @author Abhishek Shigavan
 */
public class UserRegistrationException extends Exception{

    public  ErrorCode error;
    //Defining error code for different types of error
    public enum ErrorCode{
        EMPTY_FIRST_NAME, EMPTY_LAST_NAME,
        EMPTY_EMAIL, EMPTY_MOBILE, EMPTY_PASSWORD
    }

    public UserRegistrationException(String message, ErrorCode error) {
        super(message);
        this.error = error;
    }
}
