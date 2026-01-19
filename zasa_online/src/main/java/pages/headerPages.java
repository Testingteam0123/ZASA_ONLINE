package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.basePage;
import utilities.waitHelper;

public class headerPages extends basePage {

	waitHelper wait = new waitHelper(driver);

	public headerPages(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//button[text()='Login'])[1]")
	private WebElement loginButton;

	@FindBy(xpath = "(//div[text()= 'Sign in'])[1]")
	private WebElement signInTab;

	@FindBy(name = "signinEmail")
	private WebElement signinEmailInput;

	@FindBy(name = "signinPassword")
	private WebElement signinPasswordInput;

	@FindBy(xpath = "//button[text()='Login and Select Student']")
	private WebElement signinButton;

	@FindBy(xpath = "//input[@name='rememberMe']")
	private WebElement rememberBtn;

	@FindBy(xpath = "(//div[contains(@class,'w-4 h-4')])[2]")
	private WebElement selectStudentBtn;

	@FindBy(xpath = "//button[text()='Select & Continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//button[text()='About Us']")
	private WebElement aboutUsBtn;

	@FindBy(xpath = "//div[@class='text-black text-2xl font-semibold']")
	private WebElement zasaBtton;

	@FindBy(xpath = "//h1")
	private WebElement heading;

	@FindBy(xpath = "//button[text()='Exchange']")
	private WebElement exchangeBtn;

	@FindBy(xpath = "//button[text()='Return']")
	private WebElement returnBtn;
	
	@FindBy(xpath = "//button[text()='Contact']")
	private WebElement contactBtn;
	
	@FindBy(xpath ="//div[@class='relative h-80 overflow-hidden']")
	private WebElement schoolUniformBtn;
	
	@FindBy(xpath ="//button[contains(@class,'text-white hover')]")
	private WebElement cancelBtn;
	
    @FindBy(xpath ="(//button[text()='Add to cart'])[1]")
	private WebElement productAddToCartBtn;
	
	
	@FindBy(xpath ="(//div[@class='relative group']//div)[1]")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//div[contains(text(),'No more products in cart')]")
	private WebElement emptyCartMessage;
	
	@FindBy(xpath="//table//tbody//tr//td//span[@class='font-medium']")
	private List<WebElement> productNames;
	
	@FindBy(xpath="//div[contains(@class,'absolute top-[-6px]')]")
	private WebElement cartCount;
	
	@FindBy(xpath="//button[text()='Products']")
	private WebElement productBtn;
	
	@FindBy(xpath="//button[@title='Delete']")
	private WebElement clearCartBtn;

	public void clickLogin() {
		loginButton.click();
	}

	public void clickSignInTab() {
		signInTab.click();
	}

	public void enterSigninEmailInput(String email) {
		signinEmailInput.sendKeys(email);
	}

	public void enterSigninPasswordInput(String pass) {
		signinPasswordInput.sendKeys(pass);
	}

	public void clickSigninButton() {
		rememberBtn.click();
		signinButton.click();
	}

	public void selectStudent() {
		wait.waitForOverlayToDisappear();
		wait.visibilityOf(selectStudentBtn, 5);
		selectStudentBtn.click();
	}

	public void clickContinue() {
		continueBtn.click();
	}

	public void clickAboutUs() {
		aboutUsBtn.click();
	}

	public String getHeading() {
		wait.visibilityOf(heading, 0);
		return heading.getText();
	}

	public void logoClick() {
		zasaBtton.click();
	}
	
	public void clickExchange()
	{
		exchangeBtn.click();
	}
	
	public void clickReturn()
	{
		returnBtn.click();
	}
	
	public void clickContact()
	{
		contactBtn.click();
	}
	
	public void clickSchoolUniform()
	{
		schoolUniformBtn.click();
	}
	
	public void clickProductAddtoCart()
	{
		productAddToCartBtn.click();
		cancelBtn.click();
	}
	
	public void clickAddtoCartOption()
	{
		addToCartBtn.click();
	}
	
	

	public boolean isEmptyCartMessageDisplayed() {
	    return emptyCartMessage.isDisplayed();
	}
	
	public String getEmptyCartMessage()
	{
		return emptyCartMessage.getText();
	}
	
	
	public int getCartCount()
	{
        return Integer.parseInt(cartCount.getText().trim());                
	}
	
	public void clickProductBtn()
	{
		productBtn.click();
	}
	
	public void clickClearCart()
	{
		clearCartBtn.click();
	}
}
