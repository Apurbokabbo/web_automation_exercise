package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage{
	
	public String LANDING_PAGE_FOOTER_SUBSCRIPTION_LEBEL_TEXT = "Subscription";
	public String LANDING_PAGE_FOOTER_SUBSCRIPTION_INPUT_FIELD_PLACEHOLDER = "Your email address";
	public String LANDING_PAGE_FOOTER_SUBSCRIPTION_SUB_TITTLE_TEXT = "Get the most recent updates from \n our site and be updated your self...";
	public String SUBCRIPTION_SUCCESFUL_TOASTER_MESSAGE = "You have been successfully subscribed!";
	//public String a = "";
	
	public By LANDING_PAGE_FOOTER_SUBSCRIPTION_LEBEL_LOCATOR = By.xpath("//h2[contains(text(),'Subscription')]");
	public By LANDING_PAGE_FOOTER_SUBSCRIPTION_INPUT_FIELD = By.xpath("//input[@id='susbscribe_email']");
	public By LANDING_PAGE_FOOTER_SUBSCRIPTION_BUTTON = By.xpath("//button[@id='subscribe']");
	public By LANDING_PAGE_FOOTER_SUBSCRIPTION_SUB_TITTLE_TEXT_LOCATOR = By.xpath("//body[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/p[1]");
	public By LANDING_PAGE_TOP_BUTTON = By.xpath("//a[@id='scrollUp']");
	public By LANDING_PAGE_SUBCRIPTION_TOASTER_LOCATOR = By.xpath("//div[contains(text(),'You have been successfully subscribed!')]");

}
