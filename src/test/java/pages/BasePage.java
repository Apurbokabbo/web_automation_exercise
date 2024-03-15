package pages;

import static org.testng.Assert.assertEquals;
import static utilities.BaseDriver.getDriver;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import io.qameta.allure.Allure;

public class BasePage {
	
	public String[] domains = { "gmail.com", "yahoo.com", "hotmail.com", "outlook.com",
	"example.com" };
	public String[] names = { "john", "alice", "bob", "emma", "sam", "lisa", "mike", "sara" };

	public String BASE_URL = "https://automationexercise.com/";
	public By a = By.id("");
	public By PAGE_TOP_BUTTON = By.xpath("//body/a[@id='scrollUp']/i[1]");
	public By LANDING_PAGE_SIGN_UP_AND_LOGIN_BUTTON = By
			.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
	public By b = By.xpath("");

	public WebElement findElement(By locator) {
		return getDriver().findElement(locator);
	}

	public void clickOn(By locator) {
		findElement(locator).click();
	}

	public void writeText(By locator, String text) {
		findElement(locator).sendKeys(text);
	}

	public String getText(By locator) {
		return findElement(locator).getText();
	}

	public String getUrl() {
		return getDriver().getCurrentUrl();
	}

	public void hover(By locator) {
		Actions action = new Actions(getDriver());
		action.moveToElement(findElement(locator)).perform();
	}

	public void assertionHard(By locator, String expected) {
		assertEquals(getText(locator), expected);
	}

	public void assertionURL(String expected) {
		assertEquals(getUrl(), expected);
	}

	public void assertionSoft(By locator, String expected) {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(getText(locator), expected);
		softAssert.assertAll();
	}

	public void alertAccept(By locator) {
		clickOn(locator);
		getDriver().switchTo().alert().accept();
	}

	public void alertCancel(By locator) {
		clickOn(locator);
		getDriver().switchTo().alert().dismiss();
	}

	public void alertInput(By locator, String text) {
		clickOn(locator);
		getDriver().switchTo().alert().sendKeys(text);

	}

	public void dropDownSelectByVisibleText(By locator, String text) {
		Select select = new Select(findElement(locator));
		select.selectByVisibleText(text);
	}

	public void dropDownSelectByValue(By locator, String text) {
		Select select = new Select(findElement(locator));
		select.selectByValue(text);
	}

	public void dropDownSelectByIndex(By locator, int index) {
		Select select = new Select(findElement(locator));
		select.selectByIndex(index);

	}

	public void dropDownDeselectByVisibleText(By locator, String text) {
		Select select = new Select(findElement(locator));
		select.deselectByVisibleText(text);
	}

	public void dropDownDeselectByValue(By locator, String text) {
		Select select = new Select(findElement(locator));
		select.deselectByValue(text);
	}

	public void dropDownDeselectByIndex(By locator, int index) {
		Select select = new Select(findElement(locator));
		select.deselectByIndex(index);

	}

	public void newTab() {
		((SafariDriver) getDriver().switchTo()).newWindow(WindowType.TAB);
	}

	public void newWindow() {
		((SafariDriver) getDriver().switchTo()).newWindow(WindowType.WINDOW);
	}

	public List<String> windowHandling() {
		Set<String> windowHandles = getDriver().getWindowHandles();
		ArrayList<String> windowHandlesList = new ArrayList<String>(windowHandles);
		int size = windowHandlesList.size();
		System.out.println("Window/Tab numbers: " + size);
		return windowHandlesList;
	}

	public void windowSwitch(int tabnumber) {
		try {
			getDriver().switchTo().window(windowHandling().get(tabnumber));
		} catch (Exception e) {
			System.out.println("Window tab number not exist!!!" + "Tab number is given :" + tabnumber);
		}

	}

	public void navigaterForward() {
		getDriver().navigate().forward();
	}

	public void navigaterBack() {
		getDriver().navigate().back();
	}

	public void navigaterRefresh() {
		getDriver().navigate().refresh();
	}

	public void navigaterTo(String url) {
		getDriver().navigate().to(url);
	}

	public void closeBanner(By locator) {
		try {
			clickOn(locator);
		} catch (Exception e) {
			System.out.println("Banner not found!");
		}

	}

	public void visibilityTest(By locator) {
		try {
			if (findElement(locator).isDisplayed()) {

				Thread.sleep(3000);
			}
		} catch (Exception e) {
			System.out.println("The locator is not visible!!!!!!");
		}

	}

	public void findTotalElement(String tagName) {
		List<WebElement> elements = getDriver().findElements(By.tagName(tagName));
		System.out.println(elements.size());
	}

	public void keyboardTab() {
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.TAB);
		action.build().perform();
	}

	public void tabOnEnterOnKeyboard() {
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.ENTER);
		action.build().perform();
	}

	public void keyboardSelectAll(By locator) {
		Actions action = new Actions(getDriver());
		findElement(locator).click();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

	}

	public void keyboardBackspace() {
		Actions action = new Actions(getDriver());
		action.keyDown(Keys.BACK_SPACE);
		action.build().perform();
	}

	public void keyboardCopy(By locator) {
		Actions action = new Actions(getDriver());
		keyboardSelectAll(locator);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

	}

	public void keyboardPaste(By locator) {
		Actions action = new Actions(getDriver());
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}

	public void scrollingDownTillElementFound(By locator) {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", findElement(locator));

	}

	public void scrollHorizontally(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", findElement(locator));

	}

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-350)", "");
	}

	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public void scrolldown800() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,800)", "");
	}

	public void takeScreenShotAllureAttach(String screenshotname) {
		Allure.addAttachment(screenshotname,
				new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));

	}

	public void waitForVisibilityOfElement(By locator, int timeoutInSeconds) {

		WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitForElementToBeClickable(By locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public String generateRandomEmail() {
		Random random = new Random();
		String name = names[random.nextInt(names.length)];
		String domain = domains[random.nextInt(domains.length)];
		return name + "@" + domain;
	}

	public static void writeStringToFile(String filename, String content) {
		
		try (FileWriter writer = new FileWriter(filename)) {
			writer.write(content);
			System.out.println("Content successfully written to file: " + filename);
		} 
		
		catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
	}
	
	public static String readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.readLine();
        } 
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

}

