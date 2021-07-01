package com.userregistration.test;

import com.userregistration.exception.UserRegistrationException;
import com.userregistration.service.UserRegistrationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void whenValidFirstNameGivenReturnTrue() throws UserRegistrationException {

        String firstName = "Abcde";
        try {
            boolean flag = userService.validateFirstName(firstName);

            boolean result = flag;
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid first name & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidFirstNameGivenReturnFalse() throws UserRegistrationException {

        String firstName = "abcd";
        try {
            boolean flag = userService.validateFirstName(firstName);

            boolean result = flag;
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
    void whenFirstNameIsGivenNullShouldThrowExceptionWith_NULL_FIRST_NAME_ErrorCode() {

        try{
            //creating exception with NULL_FIRST_NAME error code
            userService.validateFirstName(null);
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(UserRegistrationException.ErrorCode.NULL_FIRST_NAME,err_code.error);
        }
    }
    /**
     * Giving valid last name & checking
     * validation method return true / not
     */
    @Test
    void whenValidLastNameGivenReturnTrue() throws UserRegistrationException{

        String lastName = "Shigavan";
        try {
            boolean flag = userService.validateLastName(lastName);

            boolean result = flag;
            Assertions.assertTrue(result);
        } catch (UserRegistrationException error) {
            error.printStackTrace();
        }
    }
    /**
     * Giving Invalid last name & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidLastNameGivenReturnFalse() throws UserRegistrationException {

        String lastName = "wxyz";
        try {
            boolean flag = userService.validateLastName(lastName);

            boolean result = flag;
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
    void whenLastNameIsGivenNullShouldThrowExceptionWith_NULL_LAST_NAME_ErrorCode() {

        try{
            //creating exception with NULL_LAST_NAME error code
            userService.validateLastName(null);
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(UserRegistrationException.ErrorCode.NULL_LAST_NAME,err_code.error);
        }
    }
    /**
     * Giving valid email id  & checking
     * validation method return true / not
     */
    @Test
    void whenValidEmailIdGivenReturnTrue() throws UserRegistrationException {

        String email = "abc@gmail.com.in";
        try {
            boolean flag = userService.validateEmailId(email);

            boolean result = flag;
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
    void whenInValidEmailIdGivenReturnFalse() throws UserRegistrationException {

        String email = "abc@gmail.10.in";
        try {
            boolean flag = userService.validateEmailId(email);

            boolean result = flag;
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
    void whenEmailIdIsGivenNullShouldThrowExceptionWith_NULL_EMAIL_ErrorCode() {

        try{
            //creating exception with NULL_EMAIL error code
            userService.validateEmailId(null);
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(UserRegistrationException.ErrorCode.NULL_EMAIL,err_code.error);
        }
    }
    /**
     * Giving valid mobile number & checking
     * validation method return true / not
     */
    @Test
    void whenValidMobileNoGivenReturnTrue() throws UserRegistrationException {

        String mobileNo = "91 9874561230";
        try {
            boolean flag = userService.validateMobNo(mobileNo);

            boolean result = flag;
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
    void whenInValidMobileNoGivenReturnFalse() throws UserRegistrationException {

        String mobileNo = "987456";
        try {
            boolean flag = userService.validateMobNo(mobileNo);

            boolean result = flag;
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
    void whenMobileNoIsGivenNullShouldThrowExceptionWith_NULL_MOBILE_ErrorCode() {

        try{
            //creating exception with NULL_MOBILE error code
            userService.validateMobNo(null);
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(UserRegistrationException.ErrorCode.NULL_MOBILE,err_code.error);
        }
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordGivenReturnTruePassPart1() throws UserRegistrationException {

        String password = "abcdefgh";
        try {
            boolean flag = userService.validatePasswordPart1(password);

            boolean result = flag;
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
    void whenInValidPasswordGivenReturnFalsePassPart1() throws UserRegistrationException {

        String password = "abcdgh";
        try {
            boolean flag = userService.validatePasswordPart1(password);

            boolean result = flag;
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
    void whenValidPasswordGivenReturnTruePassPart2() throws UserRegistrationException {

        String password = "qweRty123";
        try {
            boolean flag = userService.validatePasswordPart2(password);

            boolean result = flag;
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
    void whenInValidPasswordGivenReturnFalsePassPart2() throws UserRegistrationException {

        String password = "qwerty123";
        try {
            boolean flag = userService.validatePasswordPart2(password);

            boolean result = flag;
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
    void whenValidPasswordGivenReturnTruePassPart3() throws UserRegistrationException {

        String password = "Qwerty123";
        try {
            boolean flag = userService.validatePasswordPart3(password);

            boolean result = flag;
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
    void whenInValidPasswordGivenReturnFalsePassPart3() throws UserRegistrationException {

        String password = "qwertyQwerty";
        try {
            boolean flag = userService.validatePasswordPart3(password);

            boolean result = flag;
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
    void whenValidPasswordGivenReturnTruePassPart4() throws UserRegistrationException {

        String password = "Qwerty@1234";
        try {
            boolean flag = userService.validatePasswordPart4(password);

            boolean result = flag;
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
    void whenInValidPasswordGivenReturnFalsePassPart4() throws UserRegistrationException {

        String password = "Qwerty1234";
        try {
            boolean flag = userService.validatePasswordPart4(password);

            boolean result = flag;
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
    void whenValidPasswordGivenReturnTrue() throws UserRegistrationException {

        String password = "Qwerty@123";
        try {
            boolean flag = userService.validatePassword(password);

            boolean result = flag;
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
    void whenInValidPasswordGivenReturnFalse() {

        String password = "Qw@!12";
        try {
            boolean flag = userService.validatePassword(password);

            boolean result = flag;
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException error){
            error.printStackTrace();
        }
    }
    /**
     * This method creates exception by giving Password value null
     * & checking it is giving NULL_PASSWORD error code / not
     */
    @Test
    void whenPasswordIsGivenNullShouldThrowExceptionWith_NULL_PASSWORD_ErrorCode() {

        try{
            //creating exception with NULL_PASSWORD error code
            userService.validatePassword(null);
        }
        catch (UserRegistrationException err_code){
            //matching expected error code with actual error code
            Assertions.assertEquals(UserRegistrationException.ErrorCode.NULL_PASSWORD,err_code.error);
        }
    }
}
