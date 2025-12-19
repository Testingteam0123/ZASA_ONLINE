package tests;
	
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import Utilities.ExtentTestListener;
import base.baseTest;
import pages.loginPage;

@Listeners(ExtentTestListener.class)
public class loginTest extends baseTest {
	
	 Faker f= new Faker();
		 String firstname=f.name().firstName();
		String lastname=f.name().lastName();
		String mail=f.internet().emailAddress();
		String no="9"+f.phoneNumber().subscriberNumber(8);
	
    @Test(priority = 1)
    public void verifyLaunch() throws Exception {
       ExtentTest test= ExtentTestListener.getTest();
        try {
        	test.info("Check the title of the page");
        String expectedTitle = "BM Store";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equals(expectedTitle)) {
            test.pass("Title matched: " + actualTitle);
        }else {
            test.fail("Title did not match. Expected: " + expectedTitle + ", but got: " + actualTitle);
        }
        }
        catch(Exception e)
        {
        	test.fail("Failed"+e.getMessage());
        	throw e;
        }
    }
   
    @Test(priority = 2)
  	public void verifyTheSignUpFunctionality()
  	{
  		 ExtentTest test= ExtentTestListener.getTest();
  		 loginPage lp= new loginPage(driver);
  		 
  		 
  		 try
  		 {
  			 test.info("Check the signup functionality");
  			 lp.clickLogin();
  			 lp.clickSignUp();
  			 lp.enterFirstNameInput(firstname);
  			 lp.enterLastNameInput(lastname);
  			 lp.enterSignupEmailInput(mail);
  			 lp.enterSignupPasswordInput(p.getProperty("pass"));
  			 lp.enterConfirmPasswordInput(p.getProperty("pass"));
  			 lp.enterPhoneInput(no);
  			 lp.selectRandomCountry(p.getProperty("country"));
  			 lp.selectRandomCity(p.getProperty("city"));
  			 lp.clickSignUpButton();
  			 test.pass("Signup functionality is working fine");
  			
  			 
  		 }
  		 catch(Exception e)
  		 {
  			 test.fail("Failed"+e.getMessage());
  			 throw e;
  		 }
  	}
    
    
    @Test(priority = 3)
    public void verifyTheSignInFunctionality()
    {
    	 ExtentTest test= ExtentTestListener.getTest();
  		 loginPage lp= new loginPage(driver);
  		 
  		 
  		 try
  		 {
  			 test.info("Check the signin functionality");
  			 //lp.clickLogin();
  			 lp.clickSignInTab();
  			 lp.enterSigninEmailInput(mail);
  			 lp.enterSigninPasswordInput(p.getProperty("pass"));
  			 lp.clickSigninButton();
  			 test.pass("Signin functionality is working fine");
  			 test.info("Select the School and enter the student details");
  			 lp.selectSchool();
  			 lp.searchStudent(p.getProperty("admissionNo"));
  			 lp.clickProceedButton();
  			 test.pass("Student detail has been entered and SignIn successfully");
  			
  			 
  		 }
  		 catch(Exception e)
  		 {
  			 test.fail("Failed"+e.getMessage());
  			 throw e;
  		 }
    }

}
