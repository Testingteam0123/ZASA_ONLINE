package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.loginPage;


public class baseTest {
	public  WebDriver driver;
	//protected Properties p;
	public static FileInputStream stream;
	public  static Properties p;
	
	@BeforeClass
	
	public void setup() throws IOException {
		
		stream = new FileInputStream("config.properties");
        p = new Properties();
        p.load(stream);

		String browser = p.getProperty("browser");
		String url = p.getProperty("url");
		System.out.println(browser+"äaaaaaaaaaa");
		System.out.println(url+"äaaaaaaaaaa");

		if (browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid browser");
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//loginPage login = new loginPage(driver);
		//login.VerifySignInFunctionality(p.getProperty("email"), p.getProperty("password"));
	    //login.loginAdmin(p.getProperty("adminEmail"), p.getProperty("adminPassword"));
	}
	
	public static String takeScreenshot(WebDriver driver, String testName)
	{
		String timestamp= new SimpleDateFormat("ddMMyyyy_HH-mm-ss").format(new Date());
		
		String folderPath = System.getProperty("user.dir") + "/test-output/Screenshots/";
	    File folder = new File(folderPath);
	    if (!folder.exists()) {
	        folder.mkdirs();
	    }
		
	    String filePath = folderPath + testName + "_" + timestamp + ".png";
		
		 try {
		        FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(filePath));
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return filePath;
	}
	
	
	
	//@AfterClass
	public void dropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}
