package com.userregistration.service;
import com.userregistration.exception.UserRegistrationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UserRegistrationService  --  Contains methods for validating
 *                              User Registration Fields
 *
 * @author Abhishek Shigavan
 */
public class UserRegistrationService {
    //regex pattern for all fields
    //first letter compulsory capital and should have minimum 3 lett
    final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
    //first letter compulsory capital and should have minimum 3 letters
    final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
    //Username is compulsory before @ can have ._- in between username / without it
    //@ domain name compulsory...after domain one tld is compulsory another one is optional
    final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@([a-z0-9]{3,12})\\.([a-z]{2,6})(\\.[a-z]{2,3})?$";
    //country code is optional ...if given then have to give space after country code
    //mobile no must be 10 digits
    final String MOBILE_REGEX = "(0\s|91\s)?[1-9][0-9]{9}";
    //minimum 8 characters / numbers
    final String PASSWORD_TYPE1_REGEX = "^[a-zA-Z0-9]{8,}";
    //minimum 8 characters / numbers ....at least one upper case
    final String PASSWORD_TYPE2_REGEX= "^(?=.*?[A-Z])[a-zA-Z0-9]{8,}$";
    //minimum 8 characters...at least one upper case ...at least one number
    final String PASSWORD_TYPE3_REGEX= "^(?=.*?[A-Z])(?=.*?[0-9])[a-zA-Z0-9]{8,}";
    //minimum 8 characters , at least 1 uppercase character
    //atleast one special character, number, lowercase character
    final String PASSWORD_FINAL_REGEX= "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$";

    /**
     * This method validates First Name by matching given first name with
     * predefine regex pattern of first name
     * Also throws exception when first name value is empty
     *
     * @param f_Name - First Name value
     * @return true if value matches with pattern else false
     */
    public UserValidationInter validateFirstName = (String f_Name) -> {
        boolean result = false;
        try {
            if (f_Name.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT",UserRegistrationException.ErrorCode.EMPTY_FIRST_NAME);
            }
            result = Pattern.compile(FIRST_NAME_REGEX).matcher(f_Name).matches();
        }
        catch (UserRegistrationException e){
               throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT",UserRegistrationException.ErrorCode.EMPTY_FIRST_NAME);
        }
        return result;
    };
    /**
     * This method validates Last Name by matching given last name with the
     * predefine regex pattern of last name
     * Also throws exception when last name value is empty
     *
     * @param l_Name - Last Name value
     * @return true if value mathes the pattern else false
     */
    public UserValidationInter validateLastName = (String l_Name) -> {
        boolean result = false;
        try {
            if (l_Name.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_LAST_NAME);
            }
           result = Pattern.compile(LAST_NAME_REGEX).matcher(l_Name).matches();
        }
        catch (UserRegistrationException e){
            throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_LAST_NAME);
        }
        return result;
    };
    /**
     * This method validates Email Id by matching the given email id with
     * predefine regex pattern of email id
     * Also throws exception when given email id value is empty
     *
     * @param emailId - Email Id value
     * @return true if matches with pattern else false
     */
    public UserValidationInter validateEmailId = (String emailId) -> {
        boolean result = false;
        try {
            if (emailId.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_EMAIL);
            }
            result = Pattern.compile(EMAIL_REGEX).matcher(emailId).matches();
        }
        catch(UserRegistrationException e){
            throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_EMAIL);
        }
        return result;
    };
    /**
     * This method validates Mobile Number by matching given mobile no with
     * perdefined regex pattern of mobile number
     * Also throws the exception when given mobile number is empty
     *
     * @param mob_No - Mobile Number value
     * @return true if matches with pattern else false
     */
    public UserValidationInter validateMobNo = (String mob_No) -> {
        boolean result = false;
        try {
            if (mob_No.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_MOBILE);
            }
            result = Pattern.compile(MOBILE_REGEX).matcher(mob_No).matches();
        }
        catch (UserRegistrationException e){
            throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_MOBILE);
        }
        return result;
    };
    /**
     * This method validates Password by matching the given password with
     * predefined regex pattern for password
     * Also throws exception when password is empty
     *
     * @param password - value of password
     * @return true if given password matches with pattern else false
     */
    public UserValidationInter validatePasswordType1 = (String password) -> {
        boolean result = false;
        try {
            if (password.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
            }
            result = Pattern.compile(PASSWORD_TYPE1_REGEX).matcher(password).matches();
        }
        catch (UserRegistrationException e){
            throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
        }
        return result;
    };
    /**
     * This method validates Password by matching the given password with
     * predefined regex pattern for password
     * Also throws exception when password is empty
     *
     * @param password - value of password
     * @return true if given password matches with pattern else false
     */
    public UserValidationInter validatePasswordType2 = (String password) -> {
        boolean result = false;
        try {
            if (password.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
            }
            result = Pattern.compile(PASSWORD_TYPE2_REGEX).matcher(password).matches();
        }
        catch (UserRegistrationException e){
            throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
        }
        return result;
    };
    /**
     * This method validates Password by matching the given password with
     * predefined regex pattern for password
     * Also throws exception when password is empty
     *
     * @param password - value of password
     * @return true if given password matches with pattern else false
     */
    public UserValidationInter validatePasswordType3 = (String password) -> {
        boolean result = false;
        try {
            if (password.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
            }
            result = Pattern.compile(PASSWORD_TYPE3_REGEX).matcher(password).matches();
        }
        catch (UserRegistrationException e){
            throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
        }
        return result;
    };
    /**
     * This method validates Password by matching the given password with
     * predefined regex pattern for password
     * Also throws exception when password is empty
     *
     * @param password - value of password
     * @return true if given password matches with pattern else false
     */
    public UserValidationInter validatePassword = (String password) -> {
        boolean result = false;
        try {
            if (password.length() == 0) {
                throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
            }
            result =  Pattern.compile(PASSWORD_FINAL_REGEX).matcher(password).matches();
        }
        catch (UserRegistrationException e){
            throw new UserRegistrationException("EXCEPTION OCCURED..PLZ ENTER CORRECT INPUT", UserRegistrationException.ErrorCode.EMPTY_PASSWORD);
        }
        return result;
    };
}
