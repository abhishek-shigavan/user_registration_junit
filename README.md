# User Registration Validation & Testing Validation Methods Using JUnit (Lambda Expression Is Used For Validation Method)

## Details :- 

1)  Controller  -- UserRegistrationMain --
                      This class takes User Input & pass these to Methods For Validation

2)  Exception --  UserRegistrationException --
                      This class contains custom exception for handling null value of registration field
                      
3)  Model --  UserRegistration  --
                  This class sets properties of registration field also give value when called
                  
4)  Service --  I)  UserRegistrationService --
                        This class contains methods to validate registration field data 
                II) UserValidationInter --
                        Defining Lambda Expression For Validation Meethod
                    
5)  Test  --  I)  TU_UserRegistration  --
                      This class contains Test Cases for all the validation methods     
              II) TU_EmailMultipleEntry --
                      This class contains Test Case for multiple entry of email id 
