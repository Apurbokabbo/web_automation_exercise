package testcases;

import org.testng.annotations.Test;

import pages.LandingPage;
import utilities.BaseDriver;

public class LandingPageTestCases extends BaseDriver{
	
	 LandingPage landingObj = new LandingPage();
	 
	 @Test
	public void landingScreenVisit() throws InterruptedException{
		
		getDriver().get(landingObj.BASE_URL);
		Thread.sleep(1000);
		
		
	}

}
