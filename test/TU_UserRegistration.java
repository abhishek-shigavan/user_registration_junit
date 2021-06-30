package com.userregistration.test;

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
    /**
     * Giving valid first name & checking
     * validation method return true / not
     */
    @Test
    void whenValidFirstNameGivenReturnTrue() {

        UserRegistrationService userService = new UserRegistrationService();
        String firstName = "Abhishek";
        boolean flag = userService.validateFirstName(firstName);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid first name & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidFirstNameGivenReturnFalse() {

        UserRegistrationService userService = new UserRegistrationService();
        String firstName = "ab";
        boolean flag = userService.validateFirstName(firstName);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid last name & checking
     * validation method return true / not
     */
    @Test
    void whenValidLastNameGivenReturnTrue() {

        UserRegistrationService userService = new UserRegistrationService();
        String lastName = "Shigavan";
        boolean flag = userService.validateLastName(lastName);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid last name & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidLastNameGivenReturnFalse() {

        UserRegistrationService userService = new UserRegistrationService();
        String lastName = "wxyz";
        boolean flag = userService.validateLastName(lastName);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid email id  & checking
     * validation method return true / not
     */
    @Test
    void whenValidEmailIdGivenReturnTrue() {

        UserRegistrationService userService = new UserRegistrationService();
        String email = "abc@gmail.com.in";
        boolean flag = userService.validateEmailId(email);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving InValid email id & checking
     * validation method return false / not
     */
    @Test
    void whenInValidEmailIdGivenReturnFalse() {

        UserRegistrationService userService = new UserRegistrationService();
        String email = "abc@gmail.10.in";
        boolean flag = userService.validateEmailId(email);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid mobile number & checking
     * validation method return true / not
     */
    @Test
    void whenValidMobileNoGivenReturnTrue() {

        UserRegistrationService userService = new UserRegistrationService();
        String mobileNo = "91 9874561230";
        boolean flag = userService.validateMobNo(mobileNo);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid mobile number & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidMobileNoGivenReturnFalse() {

        UserRegistrationService userService = new UserRegistrationService();
        String mobileNo = "987456";
        boolean flag = userService.validateMobNo(mobileNo);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordGivenReturnTruePassPart1() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "abcdefgh";
        boolean flag = userService.validatePasswordPart1(password);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordGivenReturnFalsePassPart1() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "abcdgh";
        boolean flag = userService.validatePasswordPart1(password);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordGivenReturnTruePassPart2() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "qweRty123";
        boolean flag = userService.validatePasswordPart2(password);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordGivenReturnFalsePassPart2() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "qwerty123";
        boolean flag = userService.validatePasswordPart2(password);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordGivenReturnTruePassPart3() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "Qwerty123";
        boolean flag = userService.validatePasswordPart3(password);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordGivenReturnFalsePassPart3() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "qwertyQwerty";
        boolean flag = userService.validatePasswordPart3(password);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordGivenReturnTruePassPart4() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "Qwerty@1234";
        boolean flag = userService.validatePasswordPart4(password);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordGivenReturnFalsePassPart4() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "Qwerty1234";
        boolean flag = userService.validatePasswordPart4(password);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
    /**
     * Giving valid password & checking
     * validation method return true / not
     */
    @Test
    void whenValidPasswordGivenReturnTrue() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "Qwerty@123";
        boolean flag = userService.validatePassword(password);

        boolean result = flag;
        Assertions.assertTrue(result);
    }
    /**
     * Giving Invalid password & checking
     * validation method returns false / not
     */
    @Test
    void whenInValidPasswordGivenReturnTrue() {

        UserRegistrationService userService = new UserRegistrationService();
        String password = "Qw@!12";
        boolean flag = userService.validatePassword(password);

        boolean result = flag;
        Assertions.assertFalse(result);
    }
}
