package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import base.baseTest;
import pages.headerPages;

@Listeners(ExtentTestListener.class)
public class headerTests extends baseTest {

	@Test(priority = 2)
	public void verifyTheSignInFunctionality() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);

		try {
			test.info("Check the signin functionality");
			hp.clickLogin();
			hp.clickSignInTab();
			hp.enterSigninEmailInput(p.getProperty("mail"));
			hp.enterSigninPasswordInput(p.getProperty("pass"));
			hp.clickSigninButton();
			test.pass("Signin functionality is working fine");
			test.info("Select the student");
			hp.selectStudent();
			hp.clickContinue();
			test.pass("Student has been selected and SignIn successfully");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	// @Test(priority = 1)
	public void verifyTheHeaderAboutUsSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);
		try {
			test.info("Checking the About Us section details");
			hp.clickAboutUs();
			String actualHeading = hp.getHeading();
			Assert.assertEquals(actualHeading, "About Us");
			test.pass("About Us details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	// @Test(priority = 3)
	public void verifyTheHeaderExchangeSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);
		try {
			test.info("Checking the Exchange section details");
			hp.clickExchange();
			String actualHeading = hp.getHeading();
			Assert.assertEquals(actualHeading, "Exchange Details");
			test.pass("Exchange Details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	// @Test(priority = 3)
	public void verifyTheHeaderReturnSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);
		try {
			test.info("Checking the Return section details");
			hp.clickReturn();
			String actualHeading = hp.getHeading();
			Assert.assertEquals(actualHeading, "Return Details");
			test.pass("Return Details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	// @Test(priority = 4)
	public void verifyTheHeaderContactUsSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);
		try {
			test.info("Checking the Contact Us section details");
			hp.clickContact();
			String actualHeading = hp.getHeading();
			Assert.assertEquals(actualHeading, "Contact Us");
			test.pass("Contact Us details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 5)
	public void verifyTheAddToCartFunctionWithNoProduct() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);
		try {
			test.info("Checking cart funtion with no products added to cart");
			hp.clickSchoolUniform();
			hp.clickAddtoCartOption();

			String actualMessage = hp.getEmptyCartMessage();
			Assert.assertEquals(actualMessage, "No more products in cart");

			test.pass("No product message is showing properly when no products are added in the cart fuction");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 6)
	public void verifyTheAddToCartFunctionWithProductAdded() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);
		try {
			test.info("Checking cart funtion with products added to cart");
			hp.clickProductBtn();
			int before = hp.getCartCount();
			hp.clickProductAddtoCart();
			int after = hp.getCartCount();
			hp.clickAddtoCartOption();

			Assert.assertTrue(after > before);

			test.pass("Checked with products added in the cart fuction");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 7)
	public void verifyTheClearCartFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		headerPages hp = new headerPages(driver);
		try {
			test.info("Checking the clear cart in the cart");
			hp.clickClearCart();
			String actualMessage = hp.getEmptyCartMessage();
			Assert.assertEquals(actualMessage, "No more products in cart");
			
			test.pass("Clear cart function is working fine");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

}
