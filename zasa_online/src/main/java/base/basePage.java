package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class basePage {
protected WebDriver driver;
	
	public basePage(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	}
	
	
	public void scrollToRight(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(300, 0);");
	}
	
	public void clearUsingJS(WebDriver driver, WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='';", element);
	}

}
