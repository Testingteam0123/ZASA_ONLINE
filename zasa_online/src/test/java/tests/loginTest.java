package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.baseTest;
import pages.loginPage;

public class loginTest extends baseTest {
	public static ExtentReports reports;
    public static ExtentTest test;
    public static ExtentSparkReporter report;
    public static String screenShot;
	
    @Test(priority = 1)
    public void verifyLaunch() throws Exception {
        test=reports.createTest("verify the Online Store Launch");
        
        p.load(stream);
        PageFactory.initElements(driver, loginPage.class);
        String expectedTitle = "BM Store";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equals(expectedTitle)) {
            test.pass("Title matched: " + actualTitle);
        }else {
            test.fail("Title did not match. Expected: " + expectedTitle + ", but got: " + actualTitle);
        }
    }
    @Test(priority = 2)
    public void verifyTheHeading() throws Exception {
        test=reports.createTest("verify the Online Store Heading and Message");
        PageFactory.initElements(driver, loginPage.class);
       //Verify the page heading
        String expectedHeading = "Welcome to BM Store";
        String actualHeading = loginPage.welcomeHeading.getText();
        if(actualHeading.equals(expectedHeading)) {
            test.pass("Heading matched: " + actualHeading);
        }else {
            test.fail("Heading did not match. Expected: " + expectedHeading + ", but got: " + actualHeading, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver, screenShot)).build());
        }  

        test.info("Message Verification");
        String expectedMessage = "Your one-stop shop for school uniforms, books, and essentials.";
        String actualMessage = loginPage.message.getText();
        if(actualMessage.equals(expectedMessage)) {
            test.pass("Message matched: " + actualMessage);
        }else {
            test.fail("Message did not match. Expected: " + expectedMessage + ", but got: " + actualMessage, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver, screenShot)).build());
        }

    }

    @Test(priority = 3)
    public void verifyLoginButton() throws Exception {
        test=reports.createTest("verify the Online Store Login Button");
        PageFactory.initElements(driver, loginPage.class);
        if(loginPage.loginButton.isDisplayed()) {
            test.pass("Login Button is displayed");
        }else {
            test.fail("Login Button is not displayed", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver, screenShot)).build());
        }
    }
    @Test(priority = 4)
    public void verifySignupTab() throws Exception {
        test=reports.createTest("verify the Online Store Signup Tab");
        PageFactory.initElements(driver, loginPage.class);
        loginPage.loginButton.click();
        if(loginPage.signUpTab.isDisplayed()) {
            test.pass("Signup Tab is displayed");
        }else {
            test.fail("Signup Tab is not displayed", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver, screenShot)).build());
        }
    }
    @Test(priority = 5)
    public void verifySignupInputs() throws Exception {
        try{
        test=reports.createTest("verify the Online Store Signup Input Fields");
        PageFactory.initElements(driver, loginPage.class);
        //loginPage.loginButton.click();
        loginPage.signUpTab.click();
        loginPage.firstNameInput.isDisplayed();
        test.pass("First Name Input Field is displayed");
        loginPage.firstNameInput.sendKeys(p.getProperty("firstName"));
        test.pass("Entered First Name");
        loginPage.lastNameInput.isDisplayed();
        test.pass("Last Name Input Field is displayed");
        loginPage.lastNameInput.sendKeys(p.getProperty("lastName"));
        test.pass("Entered Last Name");
        loginPage.signupEmailInput.isDisplayed();
        test.pass("Email Input Field is displayed");
        loginPage.signupEmailInput.sendKeys(p.getProperty("email"));
        test.pass("Entered Email");
        loginPage.signupPasswordInput.isDisplayed();
        test.pass(" Password Input Field is displayed");
        loginPage.signupPasswordInput.sendKeys(p.getProperty("password"));
        test.pass("Entered Password");
        loginPage.confirmPasswordInput.isDisplayed();
        test.pass("Confirm Password Input Field is displayed");
        loginPage.confirmPasswordInput.sendKeys(p.getProperty("confirmpassword"));
        test.pass("Entered Confirm Password");
        loginPage.phoneInput.isDisplayed();
        test.pass("Phone Number Input Field is displayed");
        loginPage.phoneInput.sendKeys(p.getProperty("phone"));
        test.pass("Entered Phone Number");
        loginPage.countryDropdown.isDisplayed();
        test.pass("Country Dropdown is displayed");
        loginPage.countryDropdown.click();
        for (WebElement country : loginPage.countryList) {
            if (country.getText().equalsIgnoreCase(p.getProperty("country"))) {
                country.click();
                break;
                
            }
        }
        test.pass("Country is selected");
                
        loginPage.cityDropdown.isDisplayed();
        test.pass("City Dropdown is displayed");
        loginPage.cityDropdown.click();
        for (WebElement city : loginPage.cityList) {
            if (city.getText().equalsIgnoreCase(p.getProperty("city"))) {
                city.click();
                break;
                
            }
        }
        test.pass("Selected City"); 
        loginPage.signUpButton.isDisplayed();
        test.pass("Sign Up Button is displayed");
        loginPage.signUpButton.click();
        test.pass("Clicked on Sign Up Button");
        String succ=loginPage.signUpSuccessmessage.getText();
        System.out.println(succ+"aaaaaaaaaaaa");

              
        }catch(Exception e) {
            test.fail("Exception occurred: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver, screenShot)).build());
        }
    }
    @Test(priority = 6)
    public void verifySignIn() throws Exception {
        try{
        test=reports.createTest("verify the Online Store Sign In after Signup");
        PageFactory.initElements(driver, loginPage.class);
        loginPage.loginButton.click();
        loginPage.signInTab.click();
        loginPage.signinEmailInput.isDisplayed();
        test.pass("Signin Email Input Field is displayed");
        loginPage.signinEmailInput.sendKeys(p.getProperty("email"));
        test.pass("Entered Signin Email");
        loginPage.signinPasswordInput.isDisplayed();
        test.pass("Signin Password Input Field is displayed");
        loginPage.signinPasswordInput.sendKeys(p.getProperty("password"));
        test.pass("Entered Signin Password");
        loginPage.signinButton.isDisplayed();
        test.pass("Signin Button is displayed");
        loginPage.signinButton.click();
        test.pass("Clicked on Signin Button");
        loginPage.studentRadioButton.isDisplayed();
        test.pass("Student Radio Button is displayed");
        loginPage.studentRadioButton.click();
        test.pass("Student is selected");
        loginPage.continueButton.isDisplayed();
        test.pass("Continue Button is displayed");
        loginPage.continueButton.click();
        test.pass("Clicked on Continue Button");
        String signinsucc=loginPage.signinSuccessMessage.getText();
        System.out.println(signinsucc+"success");
        test.pass("The success Message is displayed: " + signinsucc);   

        }catch(Exception e) {
            test.fail("Exception occurred: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver, screenShot)).build());
        }
    }
	

}
