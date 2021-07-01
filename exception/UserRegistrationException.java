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
        NULL_FIRST_NAME, NULL_LAST_NAME,
        NULL_EMAIL, NULL_MOBILE, NULL_PASSWORD
    }

    public UserRegistrationException(String message, ErrorCode error) {
        super(message);
        this.error = error;
    }
}
