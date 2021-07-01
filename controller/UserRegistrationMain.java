package com.userregistration.controller;

import com.userregistration.exception.UserRegistrationException;
import com.userregistration.model.UserRegistration;
import com.userregistration.service.UserRegistrationService;
import java.util.Scanner;

/**
 * UserRegistrationMain --  This class Takes Registration field
 *                          details form user and pass these details
 *                          to methods to validate
 *
 * @author Abhishek Shigavan
 */
public class UserRegistrationMain extends UserRegistrationService {

    static Scanner sc = new Scanner(System.in);
    /**
     * This method get registration field details
     * from user & set the field properties
     *
     * @return No return
     */
    public static void getUserDetails() throws UserRegistrationException {

        UserRegistration userDetails = new UserRegistration();
        //Taking registration details
        System.out.println("Enter First Name : ");
        userDetails.setF_Name(sc.next());

        System.out.println("Enter Last Name : ");
        userDetails.setL_Name(sc.next());

        System.out.println("Enter E-mail Id : ");
        userDetails.setEmailId(sc.next());

        System.out.println("Enter Mobile No : ");
        userDetails.setMob_No(sc.next());

        System.out.println("Enter Password : ");
        userDetails.setPassword(sc.next());

        validatedUserDetails(userDetails);
    }
    /**
     * This method pass field details to validate
     * & according to result of validation prints results
     *
     * @param userDeatils
     * @return No return
     */
    public static void validatedUserDetails(UserRegistration userDeatils) throws UserRegistrationException {

        UserRegistrationService service = new UserRegistrationService();
        try {
            if (service.validateFirstName(userDeatils.getF_Name())) {
                System.out.println("First Name is Valid");
            }
            else {
                System.out.println("Invalid First Name");
            }

            if(service.validateLastName(userDeatils.getL_Name())) {
                System.out.println("Last Name is Valid");
            }
            else {
                System.out.println("Invalid Last Name");
            }

            if(service.validateEmailId(userDeatils.getEmailId())) {
                System.out.println("Email Id is Valid");
            }
            else {
                System.out.println("Invalid Email Id");
            }

            if(service.validateMobNo(userDeatils.getMob_No())) {
                System.out.println("Mobile Number is Valid");
            }
            else {
                System.out.println("Invalid Mobile Number");
            }

            if(service.validatePassword(userDeatils.getPassword())) {
                System.out.println("Password is Valid");
            }
            else {
                System.out.println("Invalid Password");
            }
        }
        catch(UserRegistrationException error){

            error.printStackTrace();
        }
    }

    public static void main(String[] args) throws UserRegistrationException {

        getUserDetails();

    }
}
