package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Utilities.ExtentTestListener;
import base.baseTest;
import pages.footerPages;

@Listeners(ExtentTestListener.class)
public class footerTests extends baseTest {

	@Test(priority = 1)
	public void verifyTheFooterFAQSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the footer section of FAQ section");
			fp.clickFaq();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "FAQ");
			test.pass("FAQ is opened successfully");

			test.info("Checking the FAQ section details");
			String actualHead = fp.getSubHeading();
			Assert.assertEquals(actualHead, "Account");

			fp.clickCustomerSupport();
			String actualHead1 = fp.getSubHeading();
			Assert.assertEquals(actualHead1, "Customer Support");

			fp.clickDeliveryCollection();
			String actualHead2 = fp.getSubHeading();
			Assert.assertEquals(actualHead2, "Delivery & Collection");

			fp.clickOrders();
			String actualHead3 = fp.getSubHeading();
			Assert.assertEquals(actualHead3, "Orders");

			fp.clickPayments();
			String actualHead4 = fp.getSubHeading();
			Assert.assertEquals(actualHead4, "Payments");

			fp.clickProducts();
			String actualHead5 = fp.getSubHeading();
			Assert.assertEquals(actualHead5, "Products");

			fp.clickReturnsRefunds();
			String actualHead6 = fp.getSubHeading();
			Assert.assertEquals(actualHead6, "Returns & Refunds");

			fp.clickwhereIsMyOrder();
			String actualHead7 = fp.getSubHeading();
			Assert.assertEquals(actualHead7, "Where is my order?");
			test.pass("All FAQ details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2)
	public void verifyTheFooterTermsAndCondtionSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Terms and Condtion section details");
			fp.logoClick();
			fp.clickTermsAndcondtion();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "Terms and Conditions");
			test.pass("Terms and Condtion details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 3)
	public void verifyTheFooterExchangePolicySectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Exchange Policy section details");
			fp.logoClick();
			fp.clickExchangePolicy();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "Exchange Policy");
			test.pass("Exchange Policy details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 4)
	public void verifyTheFooterReturnPolicySectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Return Policy section details");
			fp.logoClick();
			fp.clickReturnPolicy();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "Return Policy");
			test.pass("Return Policy details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 5)
	public void verifyTheFooterDeliverySectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Delivery section details");
			fp.logoClick();
			fp.clickDelivery();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "Delivery");
			test.pass("Delivery details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 6)
	public void verifyTheFooterSecurePaymentSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Secure Payment section details");
			fp.logoClick();
			fp.clickSecurePayment();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "Secure Payment");
			test.pass("Secure Payment details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 7)
	public void verifyTheFooterAboutUsSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the About Us section details");
			fp.logoClick();
			fp.clickAboutUs();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "About Us");
			test.pass("About Us details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	//@Test(priority = 8)
	public void verifyTheFooterContactUsSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Contact Us section details");
			fp.logoClick();
			fp.clickContactUs();
//			String actualHeading = fp.getHeading();
//			Assert.assertEquals(actualHeading, "About Us");
			test.pass("Contact Us details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 9)
	public void verifyTheFooterOurStoresSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Our stores section details");
			fp.logoClick();
			fp.clickOurStores();
			String actualHeading = fp.getHeading();
			Assert.assertEquals(actualHeading, "Our Stores");
			test.pass("Our Stores details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 10)
	public void verifyTheFooterOrderTrackingSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Order Tracking section details");
			fp.logoClick();
			fp.clickOrderTracking();
			String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("order-tracking"), 
					"Order Tracking page did not open. URL: " + url);

			test.pass("Order Tracking details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 11)
	public void verifyTheFooterSignInSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the sign in section details");
			fp.logoClick();
			fp.clickSignIn();
			test.pass("Sign in details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 12)
	public void verifyTheFooterCreateAccountSectionDetails() {
		ExtentTest test = ExtentTestListener.getTest();
		footerPages fp = new footerPages(driver);
		try {
			test.info("Checking the Create Account section details");
			fp.logoClick();
			fp.clickCreateAccount();
			test.pass("Create Account details are showing properly");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

}
