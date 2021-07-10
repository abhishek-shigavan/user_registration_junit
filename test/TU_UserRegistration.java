package com.userregistration.test;

import com.userregistration.exception.UserRegistrationException;
import com.userregistration.service.UserRegistrationService;
import com.userregistration.service.UserValidationInter;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.userregistration.exception.UserRegistrationException.ErrorCode.*;

/**
 * TU_UserRegistration  --  Test Case For All User
 *                          Registration Fields
 *
 * @author --  Abhishek Shigavan
 */
public class TU_UserRegistration {

    UserRegistrationService userService = new UserRegistrationService();
    /**
     * Giving valid first name & checking
     * validation method return true / not
     */
    @Test
    void whenValidFirstNameGivenShouldReturnTrue() {
        String firstName = "Abcd";
        try {
            boolean result = userService.validateFirstName.validateRegistration(firstName);
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error){
            System.out.println(error.getMessage());
        }
    }
    /**
     * Giving Invalid first name & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidFirstNameGivenShouldReturnFalse() throws UserRegistrationException {
        String firstName = "abcd";
        try {
            boolean result = userService.validateFirstName.validateRegistration(firstName);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * This method creates exception by giving First Name
     * value null & checking it is giving NULL_FIRST_NAME error code / not
     */
    @Test
    void whenGivenFirstNameIsEmptyShouldThrowExceptionWith_EMPTY_FIRST_NAME_ErrorCode() {
        try{
            //creating exception with NULL_FIRST_NAME error code
            userService.validateFirstName.validateRegistration("");
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(EMPTY_FIRST_NAME,err_code.error);
        }
    }
    /**
     * Giving valid last name & checking
     * validation method return true / not
     */
    @Test
    void whenValidLastNameGivenShouldReturnTrue() throws UserRegistrationException{
        String lastName = "Shigavan";
        try {
            boolean result = userService.validateLastName.validateRegistration(lastName);
            Assertions.assertTrue(result);
        } 
        catch (UserRegistrationException error) {
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid last name & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidLastNameGivenShouldReturnFalse() throws UserRegistrationException {
        String lastName = "wxyz";
        try {
            boolean result = userService.validateLastName.validateRegistration(lastName);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * This method creates exception by giving Last Name value null
     * & checking it is giving NULL_LAST_NAME error code / not
     */
    @Test
    void whenGivenLastNameIsEmptyShouldThrowExceptionWith_EMPTY_LAST_NAME_ErrorCode() {
        try{
            //creating exception with NULL_LAST_NAME error code
            userService.validateLastName.validateRegistration("");
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(EMPTY_LAST_NAME,err_code.error);
        }
    }
    /**
     * Giving valid email id  & checking
     * validation method return true / not
     */
    @Test
    void whenValidEmailIdGivenShouldReturnTrue() throws UserRegistrationException {
        String email = "abc@gmail.com.in";
        try {
            boolean result = userService.validateEmailId.validateRegistration(email);
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * Giving InValid email id & checking
     * validation method return false / not
     */
    @Test
    void whenInValidEmailIdGivenShouldReturnFalse() throws UserRegistrationException {
        String email = "abc@gmail.10.in";
        try {
            boolean result = userService.validateEmailId.validateRegistration(email);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * This method creates exception by giving Email Id value null
     * & checking it is giving NULL_EMAIL error code / not
     */
    @Test
    void whenGivenEmailIdIsEmptyShouldThrowExceptionWith_EMPTY_EMAIL_ErrorCode() {
        try{
            //creating exception with NULL_EMAIL error code
            userService.validateEmailId.validateRegistration("");
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(EMPTY_EMAIL,err_code.error);
        }
    }
    /**
     * Giving valid mobile number & checking
     * validation method return true / not
     */
    @Test
    void whenValidMobileNoGivenShouldReturnTrue() throws UserRegistrationException {
        String mobileNo = "91 9874561230";
        try {
            boolean result = userService.validateMobNo.validateRegistration(mobileNo);
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid mobile number & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidMobileNoGivenShouldReturnFalse() throws UserRegistrationException {
        String mobileNo = "987456";
        try {
            boolean result = userService.validateMobNo.validateRegistration(mobileNo);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * This method creates exception by giving Mobile Number value null
     * & checking it is giving NULL_MOBILE error code / not
     */
    @Test
    void whenGivenMobileNoIsEmptyShouldThrowExceptionWith_EMPTY_MOBILE_ErrorCode() {
        try{
            //creating exception with NULL_MOBILE error code
            userService.validateMobNo.validateRegistration("");
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(EMPTY_MOBILE,err_code.error);
        }
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordType1GivenShouldReturnTrue() throws UserRegistrationException {
        String password = "abcdefgh";
        try {
            boolean result = userService.validatePasswordType1.validateRegistration(password);
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordType1GivenShouldReturnFalse() throws UserRegistrationException {
        String password = "abcdgh";
        try {
            boolean result = userService.validatePasswordType1.validateRegistration(password);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error) {
            error.printStackTrace();
        }
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordType2GivenShouldReturnTrue() throws UserRegistrationException {
        String password = "qweRty123";
        try {
            boolean result = userService.validatePasswordType2.validateRegistration(password);
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error) {
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordType2GivenShouldReturnFalse() throws UserRegistrationException {
        String password = "qwerty123";
        try {
            boolean result = userService.validatePasswordType2.validateRegistration(password);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error) {
            error.printStackTrace();
        }
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordType3GivenShouldReturnTrue() throws UserRegistrationException {
        String password = "Qwerty123";
        try {
            boolean result = userService.validatePasswordType3.validateRegistration(password);
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordType3GivenShouldReturnFalse() throws UserRegistrationException {
        String password = "qwertyQwerty";
        try {
            boolean result = userService.validatePasswordType3.validateRegistration(password);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error) {
            error.printStackTrace();
        }
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordGivenShouldReturnTrue() throws UserRegistrationException {
        String password = "Qwerty@123";
        try {
            boolean result = userService.validatePassword.validateRegistration(password);
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error) {
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordGivenShouldReturnFalse() {
        String password = "Qw@!12";
        try {
            boolean result = userService.validatePassword.validateRegistration(password);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * This method creates exception by giving Password value null
     * & checking it is giving EMPTY_PASSWORD error code / not
     */
    @Test
    void whenGivenPasswordIsEmptyShouldThrowExceptionWith_EMPTY_PASSWORD_ErrorCode() {
        try{
            //creating exception with EMPTY_PASSWORD error code
            userService.validatePassword.validateRegistration("");
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            System.out.println(err_code.error);
            Assertions.assertEquals(EMPTY_PASSWORD,err_code.error);
        }
    }
}
