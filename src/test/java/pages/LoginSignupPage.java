package pages;

import org.openqa.selenium.By;

public class LoginSignupPage extends BasePage{
	
	public String  LOGIN_PAGE_URL = "https://automationexercise.com/login";
	public String  LOGIN_PART_TITTLE_TEXT= "Login to your account";
	public String  SIGN_UP_PART_TEXT = "New User Signup!";
	public String  SIGN_UP_INFORMATION_PAGE_TITTLE_TEXT= "Enter Account Information";
	public String  SIGN_UP_TITTLE_LABEL_TEXT= "Title";
	public String  SIGN_UP_EMAIL_INPUT_FIELD_LABEL_TEXT= "Email";
	public String  SIGN_UP_PASSWORD_LABEL_TEXT= "Password";
	public String  SIGN_UP_DATE_OF_BIRTH_LABEL_TEXT= "Date of Birth";
	public String  SIGN_UP_NEWSLETTER_CHECKBOX_TEXT= "Sign up for our newsletter!";
	public String  SIGN_UP_PARTNERS_CHECKBOX_TEXT= "Receive special offers from our partners!";
	public String  SIGN_UP_ADDRESS_INFORMATION_TEXT= "Address Information";
	public String  SIGN_UP_ADDRESS_INFO_FIRST_NAME_LABEL_TEXT= "First name";
	public String  SIGN_UP_ADDRESS_INFO_LAST_NAME_LABEL_TEXT= "Last name";
	public String  SIGN_UP_ADDRESS_INFO_COMPANY_LABEL_TEXT= "Company";
	public String  SIGN_UP_ADDRESS_INFO_MOBILE_NUMBER_LABEL_TEXT= "Mobile Number";
	public String  SIGN_UP_ADDRESS_INFO_ZIPCODE_LABEL_TEXT= "Zipcode";
	public String  SIGN_UP_ADDRESS_INFO_CITY_LABEL_TEXT= "City";
	public String  SIGN_UP_ADDRESS_INFO_STATE_LABEL_TEXT= "State";
	public String  SIGN_UP_ADDRESS_INFO_COUNTRY_LABEL_TEXT= "Country";
	public String  SIGN_UP_ADDRESS_INFO_ADDRESS_INFO_TEXT= "(Street address, P.O. Box, Company name, etc.)";
	public String  SIGN_UP_ADDRESS_INFO_ADDRESS_LABEL_TEXT= "Address";
	public String  SIGN_UP_ADDRESS_INFO_ADDRESS_2_LABEL_TEXT= "Address 2";
	
	public String  SIGN_UP_SUCCESFULLY_PAGE_TITTLE_TEXT ="Account Created!";
	public String  SIGN_UP_SUCCESFULLY_PAGE_SUB_TITTLE_LINE_1_TEXT ="Congratulations! Your new account has been successfully created!";
	public String  SIGN_UP_SUCCESFULLY_PAGE_SUB_TITTLE_LINE_2_TEXT ="You can now take advantage of member privileges to enhance your online shopping experience with us.";

	//public String  SIGN_UP_= "";
	
	
	public By TOP_MENU_LOGIN_BUTTON =By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
	public By LOGIN_BUTTON = By.xpath("//button[contains(text(),'Login')]");	
	public By SIGN_UP_BUTTON = By.xpath("//button[contains(text(),'Signup')]");
	//public By a = By.id("");
	public By LOGIN_EMAIL_ADDRESS_INPUT_FIELD = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]");                                                                                                
	public By LOGIN_PASSWORD_INPUT_FIELD = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]");                                                                                                
	public By LOGIN_PART_TITTLE_TEXT_LOCATOR = By.xpath("//h2[contains(text(),'Login to your account')]");                                                                                                
	public By SIGN_UP_PART_TEXT_LOCATOR = By.xpath("//h2[contains(text(),'New User Signup!')]");                                                                                                
	public By SIGN_UP_NAME_INPUT_FIELD = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]");                                                                                                
	public By SIGN_UP_EMAIL_INPUT_FIELD = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]");                                                                                                
	public By SIGN_UP_INFORMATION_TITTLE_LOCATOR = By.xpath("//b[contains(text(),'Enter Account Information')]");                                                                                                
	public By SIGN_UP_TITTLE_LABEL_LOCATOR = By.xpath("//label[contains(text(),'Title')]");                                                                                                
	public By SIGN_UP_CREATE_ACCOUNT_BUTTON = By.xpath("//button[contains(text(),'Create Account')]");                                                                                                
	public By SIGN_UP_GENDER_MR_RADIO_BUTTON = By.xpath("//input[@id='id_gender1']");                                                                                                
	public By SIGN_UP_GENDER_MRS_RADIO_BUTTON = By.xpath("//input[@id='id_gender2']");                                                                                                
	public By SIGN_UP_INFORMATION_PAGE_NAME_INPUT_FIELD = By.xpath("//input[@id='name']");                                                                                                
	public By SIGN_UP_INFORMATITON_PAGE_EMAIL_INPUT_FIELD_LABEL = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/label[1]");                                                                                                
	public By SIGN_UP_INFORMATION_PAGE_EMAIL_INPUT_FIELD = By.xpath("//input[@id='email']");                                                                                                
	public By SIGN_UP_INFORMATION_PAGE_PASSWORD_LABEL = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/label[1]");                                                                                                
	public By SIGN_UP_INFORMATION_PAGE_PASSWORD_INPUT_FEILD = By.xpath("//input[@id='password']");                                                                                                
	public By SIGN_UP_INFORMATION_PAGE_DATE_OF_BIRTH_LABEL = By.xpath("//label[contains(text(),'Date of Birth')]");                                                                                                
	public By SIGN_UP_DATE_OF_BIRTH_DAY_INPUT_FIELD = By.xpath("//select[@id='days']");                                                                                                
	public By SIGN_UP_DATE_OF_BIRTH_DAY_LOCATOR = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/select[1]/option[8]");                                                                                                
	public By SIGN_UP_DATE_OF_BIRTH_MONTH_INPUT_FIELD = By.xpath("//select[@id='months']");                                                                                                
	public By SIGN_UP_DATE_OF_BIRTH_MONTH_LOCATOR = By.xpath("//option[contains(text(),'August')]");                                                                                                
	public By SIGN_UP_DATE_OF_BIRTH_YEAR_INPUT_FIELD = By.xpath("//select[@id='years']");                                                                                                
	public By SIGN_UP_DATE_OF_BIRTH_YEAR_LOCATOR = By.xpath("//option[contains(text(),'1999')]");                                                                                                
	public By SIGN_UP_CHECKBOX_LOCATOR_NEWSLETTER = By.xpath("//label[contains(text(),'Sign up for our newsletter!')]");                                                                                                
	public By SIGN_UP_CHECKBOX_LOCATOR_PARTNERS = By.xpath("//label[contains(text(),'Receive special offers from our partners!')]");                                                                                                
	public By SIGN_UP_SIGN_UP_ADDRESS_INFORMATION_TEXT_LOCATOR = By.xpath("//b[contains(text(),'Address Information')]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_FIRST_NAME_LABEL= By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/label[1]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_FIRSTNAME_INPUT_FIELD= By.xpath("//input[@id='first_name']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_LAST_NAME_LABEL_TEXT_LOCATOR= By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/label[1]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_LAST_NAME_INPUT_FIELD= By.xpath("//input[@id='last_name']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_COMPAY_LABEL_LOCATOR= By.xpath("//label[contains(text(),'Company')]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_COMPAY_INPUT_FIELD= By.xpath("//input[@id='company']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_ADDRESS_INFO_TEXT_LOCATOR= By.xpath("//span[contains(text(),'(Street address, P.O. Box, Company name, etc.)')]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_ADDRESS_INPUT_FIELD= By.xpath("//input[@id='address1']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_ADDRESS_2_LABEL_LOCATOR= By.xpath("//label[contains(text(),'Address 2')]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_ADDRESS_2_INPUT_FIELD= By.xpath("//input[@id='address2']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_COUNTRY_LABEL_LOCATOR=By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[6]/label[1]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_COUNTRY_INPUT_FEILD= By.xpath("//select[@id='country']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_COUNTRY_INPUT= By.xpath("//option[contains(text(),'New Zealand')]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_STATE_LABEL_LOCATOR= By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[7]/label[1]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_STATE_INPUT_FIELD= By.xpath("//input[@id='state']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_CITY_LABEL_LOCATOR= By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[8]/label[1]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_CITY_INPUT_FIELD= By.xpath("//input[@id='city']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_ZIPCODE_LABEL_LOCATOR= By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[9]/label[1]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_ZIPCODE_INPUT_FIELD= By.xpath("//input[@id='zipcode']");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_MOBILE_NUMBER_LABEL_LOCATOR= By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[10]/label[1]");                                                                                                
	public By SIGN_UP_ADDRESS_INFO_MOBILE_NUMBER_INPUT_FIELD= By.xpath("//input[@id='mobile_number']");                                                                                                
	                                                                                               
	public By SIGN_UP_SUCCESFULLY_PAGE_TITTLE_TEXT_LOCATOR = By.xpath("//b[contains(text(),'Account Created!')]");                                                                                                
	public By SIGN_UP_SUCCESFULLY_PAGE_SUB_TITTLE_1 = By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]");                                                                                                
	public By SIGN_UP_SUCCESFULLY_PAGE_SUB_TITTLE_LINE_2 = By.xpath("//p[contains(text(),'You can now take advantage of member privileges to')]");                                                                                                
	public By SIGN_UP_SUCCESFULLY_PAGE_CONTINUE_BUTTON = By.xpath("//a[contains(text(),'Continue')]");                                                                                                
	public By SIGN_UP_SUCCESFULLY_PAGE = By.xpath("");                                                                                                
}
