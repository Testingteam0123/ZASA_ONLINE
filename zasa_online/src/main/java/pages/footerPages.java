package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.basePage;
import utilities.waitHelper;

public class footerPages extends basePage{

	waitHelper wait = new waitHelper(driver);
	
	public footerPages(WebDriver driver) {
		super(driver);
	}
	
	
	//customer Service
	//FAQ
	@FindBy(xpath="//a[text()='FAQ']")
	private WebElement faqBtn;
	
	@FindBy(xpath="//span[text()='Customer Support']")
	private WebElement customerSupportBtn;
	
	
	@FindBy(xpath="//span[text()='Delivery & Collection']")
	private WebElement deliveryCollectionBtn;
	
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement ordersBtn;
	
	@FindBy(xpath="//span[text()='Payments']")
	private WebElement paymentsBtn;
	
	@FindBy(xpath="//span[text()='Products']")
	private WebElement productsBtn;
	
	@FindBy(xpath="//span[text()='Returns & Refunds']")
	private WebElement returnsRefundsBtn;
	
	@FindBy(xpath="//span[text()='Where is my order?']")
	private WebElement whereIsMyOrderBtn;
	
	//Terms and Conditions
	@FindBy(xpath="//a[text()='Terms and Conditions']")
	private WebElement termsAndcondtionBtn;
	
	//Exchange Policy
	@FindBy(xpath="//a[text()='Exchange Policy']")
	private WebElement exchangePolicyBtn;
	
	//Return Policy
	@FindBy(xpath="//a[text()='Return Policy']")
	private WebElement returnPolicyBtn;
	
	//Delivery
	@FindBy(xpath="//a[text()='Delivery']")
	private WebElement deliveryBtn;
	
	//Secure Payment
	@FindBy(xpath="//a[text()='Secure Payment']")
	private WebElement securePaymentBtn;
	
	@FindBy(xpath="//div[@class='text-black text-2xl font-semibold']")
	private WebElement zasaBtton;
	
    @FindBy (xpath="//h1")
	private WebElement heading;
    
    @FindBy (xpath="//h2")
	private WebElement subHeading;
	
	
	//Our company
    @FindBy (xpath="//a[text()='About Us']")
	private WebElement aboutUsBtn;
    
    @FindBy (xpath="//a[text()='Contact Us']")
	private WebElement ContactUsBtn;
    
    @FindBy (xpath="//a[text()='Our Stores']")
	private WebElement ourStoresBtn;
    
    
    //My Account
    @FindBy (xpath="//a[text()='Order Tracking']")
	private WebElement orderTrackingBtn;
    
    @FindBy (xpath="//a[text()='Sign In']")
	private WebElement signBtn;
    
    @FindBy (xpath="//a[text()='Create Account']")
	private WebElement createAccountBtn;
	
	
	
	
	
	
	
	
	public void clickFaq()
	{
		faqBtn.click();
	}
	
	public void clickCustomerSupport()
	{
		customerSupportBtn.click();
	}
	
	public void clickDeliveryCollection()
	{
		deliveryCollectionBtn.click();
	}
	
	public void clickProducts()
	{
		productsBtn.click();
	}
	

	public void clickOrders()
	{
		ordersBtn.click();
	}
	
	
	public void clickReturnsRefunds()
	{
		returnsRefundsBtn.click();
	}
	
	public void clickwhereIsMyOrder()
	{
		whereIsMyOrderBtn.click();
	}
	
	public void clickPayments()
	{
		paymentsBtn.click();
	}
	
	public void clickTermsAndcondtion()
	{
		termsAndcondtionBtn.click();
	}
	
	public void clickExchangePolicy()
	{
		exchangePolicyBtn.click();
	}
	
	public void clickReturnPolicy()
	{
		returnPolicyBtn.click();
	}
	
	public void clickDelivery()
	{
		deliveryBtn.click();
	}
	
	public void clickSecurePayment()
	{
		securePaymentBtn.click();
	}
	
	public void logoClick()
	{
		zasaBtton.click();
	}
	
	  public String getHeading()
	  {
		  wait.visibilityOf(heading, 3);
		  return heading.getText();
	  }
	
	  public String getSubHeading()
	  {
		  wait.visibilityOf(subHeading, 3);
		  return subHeading.getText();
	  }
	  
	  public void clickAboutUs()
	  {
		  aboutUsBtn.click();
	  }
	  
	  public void clickContactUs()
	  {
		  ContactUsBtn.click();
		  driver.navigate().refresh();
	  }
	  
	  public void clickOurStores()
	  {
		  ourStoresBtn.click();
	  }
	  
	  public void clickOrderTracking()
	  {
		  orderTrackingBtn.click();
	  }
	  
	  public void clickSignIn()
	  {
		  signBtn.click();
		  driver.navigate().refresh();
	  }
	  
	  public void clickCreateAccount()
	  {
		  createAccountBtn.click();
		  driver.navigate().refresh();
	  }
}
