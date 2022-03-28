package testcasePakageAdvance;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPakage.BaseDriver;

public class Testcase001_verifyTitlePage extends BaseDriver{
	String baseUrl = "http://automationpractice.com/index.php";
	@Test(priority=1)     // priority is used for making a sequence of checking in a order!
	public void verifyPageTilte () {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// print the title of the website
		String foundTitleFromWebsite = driver.getTitle();
		System.out.println("The Title of the website is:" +foundTitleFromWebsite);
	}
	
	// Website security check
	
	@Test(priority=2)
	public void websiteIsSecure () {
		String securityVerify = driver.getCurrentUrl();
		System.out.println(securityVerify);// print the link 
		
		//check if it contains "https"?
		if(securityVerify.contains("https")) {
			System.out.println("Website is Secured.");
		}else {
			System.out.println("Website is not Secured!");
		}
	}
	
}

