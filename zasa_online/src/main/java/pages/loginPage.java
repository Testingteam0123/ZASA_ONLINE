package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.basePage;
import utilities.waitHelper;

public class loginPage extends basePage {
	waitHelper wait = new waitHelper(driver);

	public loginPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//h1[text()='Welcome to ZASA Store']")
	private WebElement welcomeHeading;
	
    @FindBy(xpath="//p[text()='Your one-stop shop for school uniforms, books, and essentials.']")
    private WebElement message;
    
    @FindBy (xpath="(//button[text()='Login'])[1]")
    private WebElement loginButton;

    /*Signup Locators */
    @FindBy(xpath="//div[contains(text(), 'Sign Up')]")
    private WebElement signUpTab;
    
    @FindBy(name = "firstName")
    private WebElement firstNameInput;
    
    @FindBy(name = "lastName")
    private WebElement lastNameInput;
    
    @FindBy(name = "email")
    private WebElement signupEmailInput;
    
    @FindBy(name = "password")
    private WebElement signupPasswordInput;
    
    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordInput;
    
    @FindBy(name = "phone")
    private WebElement phoneInput;
    
    @FindBy(xpath = "//div[text()='Select Country']")
    private WebElement countryDropdown;
    
    @FindBy(xpath = "//li[contains(@class,'px-4 py-2')]")
    private List<WebElement> countryList;
  ////li[@class='px-4 py-2 hover:bg-gray-100 cursor-pointer']
    
    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement cityDropdown;
    
    @FindBy(xpath = "//ul[contains(@class,'max-h-[150px]')]//li")//*[contains(@class,'max-h-[150px]')]
    private List<WebElement> cityList;
    
    @FindBy(xpath = "//button[normalize-space()='Sign Up']")
    private WebElement signUpButton;
    
    @FindBy(xpath = "//div[contains(@class,'overflow-y-auto')]")
    private WebElement modalScroll;
    

    /*
     * Signin Locators 
     */
    @FindBy(xpath="(//div[text()= 'Sign in'])[1]")
    private WebElement signInTab;
    
    @FindBy(name="signinEmail")
    private WebElement signinEmailInput;
    
    @FindBy(name="signinPassword")
    private WebElement signinPasswordInput;
    
    @FindBy(xpath="//button[text()='Login and Select Student']")
    private WebElement signinButton;
    
    @FindBy(xpath="//input[@name='rememberMe']")
    private WebElement rememberBtn;
    
    @FindBy(xpath="(//button[text()='Select School'])[2]")
    private WebElement selectSchoolBtn;
    
    @FindBy(xpath="//input[@placeholder='Enter Admission Number']")
    private WebElement enterAdmissionNo;
    
    @FindBy(xpath="//button[text()='Search']")
    private WebElement searchStudent;
    
    @FindBy(xpath="//div[contains(@class,'w-4 h-4')]")
    private WebElement studentRadioButton;
    
    @FindBy (xpath="//button[text()='Select & Proceed']")
    private WebElement proceedButton;
    
    @FindBy (xpath="//h1")
    private WebElement heading;
    
   
    
    
    // ======================
	// METHODS
	// ======================
    
    public String titleName()
    {
    	return welcomeHeading.getText();
    }
    
    public String messageText()
    {
    	return message.getText();
    }
    
    public void clickLogin()
    {
    	loginButton.click();
    }
    
    public void clickSignUp()
    {
    	signUpTab.click();
    }
    
    public void enterFirstNameInput(String name)
    {
    	firstNameInput.sendKeys(name);
    }

	
	public void enterLastNameInput(String name)
	{
		lastNameInput.sendKeys(name);
	}
	
	public void enterSignupEmailInput(String email)
	{
		signupEmailInput.sendKeys(email);
	}
	
	public void enterSignupPasswordInput(String pass)
	{
		signupPasswordInput.sendKeys(pass);
	}
	
	public void enterConfirmPasswordInput(String pass)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(confirmPasswordInput).perform();
		confirmPasswordInput.sendKeys(pass);
	}
	
	public void enterPhoneInput(String no)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(phoneInput).perform();
		phoneInput.click();
		phoneInput.sendKeys(no);
	}
	
	public void selectRandomCountry(String country) 
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(countryDropdown).perform();
	    countryDropdown.click();

	    for (WebElement option : countryList) {
	        if (option.getText().contains(country)) {
	        	
	            option.click();
	        }
	    
	    }
	    
	}
	 
	public void clickcountryDropdown() {
		countryDropdown.click();
	}
	
	
	public void clickCityDropdown() {
		cityDropdown.click();
	}
	
	    
   public void selectRandomCity(String city) 
	 {
	   Actions actions=new Actions(driver);
		actions.moveToElement(cityDropdown).perform();
	    	cityDropdown.click();

		    for (WebElement option : cityList) {
		        if (option.getText().contains(city)) {
		            option.click();
		            break;
		        }
		        
		    }	    
	}
	  public void clickSignUpButton()
	  {
		  JavascriptExecutor js = (JavascriptExecutor) driver;

		    js.executeScript(
		        "arguments[0].scrollTop = arguments[0].scrollHeight",
		        modalScroll
		    );

		  wait.elementToBeClickable(signUpButton, 10);
		  signUpButton.click();
	  }
	  
	 
	  
	  
	  public void clickSignInTab()
	  {
		  signInTab.click();
	  }
	  
	  public void enterSigninEmailInput(String email)
	  {
		  signinEmailInput.sendKeys(email);
	  }
	  
	  public void enterSigninPasswordInput(String pass)
	  {
		  signinPasswordInput.sendKeys(pass);
	  }
	  
	  public void clickSigninButton()
	  {
		  rememberBtn.click();
		  signinButton.click();
	  }
	  
	  public void selectSchool()
	  {
		  selectSchoolBtn.click();
	  }
	  
	  public void searchStudent(String Student) 
	  {
		  enterAdmissionNo.sendKeys(Student);  
		  searchStudent.click();
		  
	  }
	  
	  
	  public void clickProceedButton()
      {
		  studentRadioButton.click();
		  proceedButton.click();  
	  }
	  
	  public String getHeading()
	  {
		  wait.visibilityOf(heading, 0);
		  return heading.getText();
	  }
	  

}



