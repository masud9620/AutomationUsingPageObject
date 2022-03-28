package testcasePakageAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_009PopUp;

public class Testcase009PopUp extends BaseDriver{
	public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

	@Test
	public static void alertHandlingCheck() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		PO_009PopUp popUPClass = new PO_009PopUp(driver);
		popUPClass.popUpMethod();
		
	}
}
