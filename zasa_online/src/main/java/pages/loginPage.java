package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.basePage;
import utilities.waitHelper;

public class loginPage extends basePage {
	waitHelper wait = new waitHelper(driver);

	public loginPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath="//h1[text()='Welcome to School Shop'']")
	public static WebElement welcomeHeading;
    @FindBy(xpath="//p[text()='Your one-stop shop for school uniforms, books, and essentials.']")
    public static WebElement message;
    @FindBy (xpath="(//button[text()='Login'])[1]")
    public static WebElement loginButton;

    /*Signup Locators */
    @FindBy(xpath="//div[contains(text(), 'Sign Up')]")
    public static WebElement signUpTab;
    @FindBy(name = "firstName")
    public static WebElement firstNameInput;
    @FindBy(name = "lastName")
    public static WebElement lastNameInput;
    @FindBy(name = "email")
    public static WebElement signupEmailInput;
    @FindBy(name = "password")
    public static WebElement signupPasswordInput;
    @FindBy(name = "confirmPassword")
    public static WebElement confirmPasswordInput;
    @FindBy(name = "phone")
    public static WebElement phoneInput;
    @FindBy(xpath = "//div[text()='Select Country']")
    public static WebElement countryDropdown;
    @FindBy(xpath = "//li[@class='px-4 py-2 hover:bg-gray-100 cursor-pointer']")
    public static List<WebElement> countryList;
  
    @FindBy(xpath = "//div[text()='Select City']")
    public static WebElement cityDropdown;
    @FindBy(xpath = "//li[@class='px-4 py-2 hover:bg-gray-100 cursor-pointer']")
    public static List<WebElement> cityList;
    @FindBy(xpath = "//button[contains(text(),'Sign Up')]")
    public static WebElement signUpButton;
    @FindBy(xpath="//div[text()='Signup successfull!']")
    public static WebElement signUpSuccessmessage;

    /*
     * Signin Locators 
     */
    @FindBy(xpath="(//div[text()= 'Sign in'])[1]")
    public static WebElement signInTab;
    @FindBy(name="signinEmail")
    public static WebElement signinEmailInput;
    @FindBy(name="signinPassword")
    public static WebElement signinPasswordInput;
    @FindBy(xpath="//button[text()='Login and Select Student']")
    public static WebElement signinButton;
    @FindBy(xpath="(//div[@class='w-4 h-4 sm:w-5 sm:h-5 rounded-full border-2 border-gray-300 flex items-center justify-center flex-shrink-0'])[1]")
    public static WebElement studentRadioButton;
    @FindBy (xpath="//button[text()='Select & Continue']")
    public static WebElement continueButton;
    @FindBy(xpath = "//div[text()='Signin successfull!']")
    public static WebElement signinSuccessMessage;
    

	
		
	
	

}


