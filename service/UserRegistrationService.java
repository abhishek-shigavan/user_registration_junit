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
    /**
     * This method validates First Name
     *
     * @param f_Name - First Name
     * @return true
     */
    public boolean validateFirstName(String f_Name) throws UserRegistrationException {

        boolean flag = false;
        //first letter compulsory capital and
        //should have minimum 3 letters
        String regexPattern = "^[A-Z][a-z]{2,}";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (f_Name == null) {
                throw new UserRegistrationException("First Name value is null",UserRegistrationException.ErrorCode.NULL_FIRST_NAME);
            }

            Matcher match = pattern.matcher(f_Name);
            flag = match.matches();

            return flag;
        }
        catch (Exception e){
               throw new UserRegistrationException("First Name value is null",UserRegistrationException.ErrorCode.NULL_FIRST_NAME);
        }
    }
    /**
     * This method validates Last Name
     *
     * @param l_Name - Last Name
     * @return true
     */
    public boolean validateLastName(String l_Name) throws UserRegistrationException{

        boolean flag = false;
        //first letter compulsory capital and
        //should have minimum 3 letters
        String regexPattern = "^[A-Z][a-z]{2,}";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (l_Name == null) {
                throw new UserRegistrationException("Last Name Value is null", UserRegistrationException.ErrorCode.NULL_LAST_NAME);
            }

            Matcher match = pattern.matcher(l_Name);
            flag = match.matches();

            return flag;
        }
        catch (Exception e){
            throw new UserRegistrationException("Last Name Value is null", UserRegistrationException.ErrorCode.NULL_LAST_NAME);
        }
    }
    /**
     * This method validates Email Id
     *
     * @param emailId - Email Id
     * @return true
     */
    public boolean validateEmailId(String emailId) throws UserRegistrationException {

        boolean flag = false;
        //Username is compulsory before @ can have username with ._- in between / without it
        //@ domain name compulsory
        //after domain one tld is compulsory another one is optional
        String regexPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@([a-z0-9]{3,12})\\.([a-z]{2,6})(\\.[a-z]{2,3})?$";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (emailId == null) {
                throw new UserRegistrationException("Email Id Value is null", UserRegistrationException.ErrorCode.NULL_EMAIL);
            }

            Matcher match = pattern.matcher(emailId);
            flag = match.matches();

            return flag;
        }
        catch(Exception error){
            throw new UserRegistrationException("Email Id Value is null", UserRegistrationException.ErrorCode.NULL_EMAIL);
        }
    }
    /**
     * This method validates Mobile Number
     *
     * @param mob_No - Mobile Number
     * @return true
     */
    public boolean validateMobNo(String mob_No) throws UserRegistrationException{

        boolean flag = false;
        //country code is optional
        //if given then have to give space after country code
        //mobile no must be 10 digits
        String regexPattern = "(0\s|91\s)?[1-9][0-9]{9}";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (mob_No == null) {
                throw new UserRegistrationException("Mobile No Value is Null", UserRegistrationException.ErrorCode.NULL_MOBILE);
            }

            Matcher match = pattern.matcher(mob_No);
            flag = match.matches();

            return flag;
        }
        catch (Exception error){
            throw new UserRegistrationException("Mobile No Value is null", UserRegistrationException.ErrorCode.NULL_MOBILE);
        }
    }
    /**
     * This method validates Password
     *
     * @param password
     * @return true
     */
    public boolean validatePasswordPart1(String password) throws UserRegistrationException {

        boolean flag = false;
        //minimum 8 characters
        String regexPattern = "^[a-zA-Z0-9]{8,}";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (password == null) {
                throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
            }

            Matcher match = pattern.matcher(password);
            flag = match.matches();

            return flag;
        }
        catch (Exception error){
            throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
        }
    }
    /**
     * This method validates Password
     *
     * @param password
     * @return true
     */
    public boolean validatePasswordPart2(String password) throws UserRegistrationException {

        boolean flag = false;
        //minimum 8 characters
        //at least one upper case
        String regexPattern = "^(?=.*?[A-Z])[a-zA-Z0-9]{8,}$";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (password == null) {
                throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
            }

            Matcher match = pattern.matcher(password);
            flag = match.matches();

            return flag;
        }
        catch (Exception error){
            throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
        }
    }
    /**
     * This method validates Password
     *
     * @param password
     * @return true
     */
    public boolean validatePasswordPart3(String password) throws UserRegistrationException {

        boolean flag = false;
        //minimum 8 characters
        //at least one upper case
        //at least one number
        String regexPattern = "^(?=.*?[A-Z])(?=.*?[0-9])[a-zA-Z0-9]{8,}";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (password == null) {
                throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
            }

            Matcher match = pattern.matcher(password);
            flag = match.matches();

            return flag;
        }
        catch (Exception error){
            throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
        }
    }
    /**
     * This method validates Password
     *
     * @param password
     * @return true
     */
    public boolean validatePasswordPart4 (String password) throws UserRegistrationException {

        boolean flag = false;
        //minimum 8 characters , at least one upper case
        //at least one number, one special character
        String regexPattern = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (password == null) {
                throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
            }

            Matcher match = pattern.matcher(password);
            flag = match.matches();

            return flag;
        }
        catch (Exception error){
            throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
        }
    }
    /**
     * This method validates Password
     *
     * @param password
     * @return true
     */
    public boolean validatePassword(String password) throws UserRegistrationException{

        boolean flag = false;
        //minimum 8 characters , at least 1 uppercase character
        //atleast one special character, number, lowercase character
        String regexPattern = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$";
        try {
            Pattern pattern = Pattern.compile(regexPattern);

            if (password == null) {
                throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
            }

            Matcher match = pattern.matcher(password);
            flag = match.matches();

            return flag;
        }
        catch (Exception error){
            throw new UserRegistrationException("Password Value is null", UserRegistrationException.ErrorCode.NULL_PASSWORD);
        }
    }
}
