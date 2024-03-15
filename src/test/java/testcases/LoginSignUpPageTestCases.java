package testcases;

import org.testng.annotations.Test;

import pages.LoginSignupPage;
import utilities.BaseDriver;

public class LoginSignUpPageTestCases extends BaseDriver{
	
	
	LoginSignupPage loginSignUpPageObj = new LoginSignupPage();
	
	
	@Test
	public void loginSignupPageURLAssertion() throws InterruptedException{
		
		getDriver().get(loginSignUpPageObj.BASE_URL);
		loginSignUpPageObj.waitForElementToBeClickable(loginSignUpPageObj. LANDING_PAGE_SIGN_UP_AND_LOGIN_BUTTON, 5);
		loginSignUpPageObj.findElement(loginSignUpPageObj. LANDING_PAGE_SIGN_UP_AND_LOGIN_BUTTON).click();
		loginSignUpPageObj.assertionURL(loginSignUpPageObj.LOGIN_PAGE_URL);
		
		
	}
	
	@Test
	public void loginAndSignUpPageTextAssertion() {
		getDriver().get(loginSignUpPageObj.LOGIN_PAGE_URL);
		loginSignUpPageObj.waitForElementToBeClickable(loginSignUpPageObj.LOGIN_PART_TITTLE_TEXT_LOCATOR, 4);
		
		
		loginSignUpPageObj.assertionHard(loginSignUpPageObj.LOGIN_PART_TITTLE_TEXT_LOCATOR, loginSignUpPageObj.LOGIN_PART_TITTLE_TEXT);
//		loginSignUpPageObj.assertionHard(loginSignUpPageObj.LOGIN_EMAIL_ADDRESS_INPUT_FIELD, loginSignUpPageObj.EMAIL_INPUT_FIELD_PLACEHOLDER_TEXT);
//		loginSignUpPageObj.assertionHard(loginSignUpPageObj.LOGIN_PASSWORD_INPUT_FIELD, loginSignUpPageObj.SIGN_UP_PASSWORD_LABEL_TEXT);
//		
		loginSignUpPageObj.assertionHard(loginSignUpPageObj.SIGN_UP_PART_TEXT_LOCATOR, loginSignUpPageObj.SIGN_UP_PART_TEXT);
//		loginSignUpPageObj.assertionHard(loginSignUpPageObj.SIGN_UP_NAME_INPUT_FIELD, loginSignUpPageObj.NAME_INPUT_FIELD_PLACEHOLDER_TEXT);
//		loginSignUpPageObj.assertionHard(loginSignUpPageObj.SIGN_UP_EMAIL_INPUT_FIELD, loginSignUpPageObj.EMAIL_INPUT_FIELD_PLACEHOLDER_TEXT);
//		
		loginSignUpPageObj.takeScreenShotAllureAttach("Login and SignUp screen !!!!!");
		
	}

}
