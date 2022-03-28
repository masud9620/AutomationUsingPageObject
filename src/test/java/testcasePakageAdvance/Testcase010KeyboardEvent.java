package testcasePakageAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_010KeyboardEvent;

public class Testcase010KeyboardEvent extends BaseDriver {
	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test
	public static void KeyboardEventCheck() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		//Using PO
		PO_010KeyboardEvent keyboadEventClass = new PO_010KeyboardEvent(driver);
		keyboadEventClass.keyBoardEvent();
	}
}
