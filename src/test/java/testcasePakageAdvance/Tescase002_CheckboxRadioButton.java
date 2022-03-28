package testcasePakageAdvance;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import driverPakage.BaseDriver;
import pageObjectPakage.PO_02CheckboxRadioButton;



public class Tescase002_CheckboxRadioButton extends BaseDriver {
	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	// Selection of Radio button and Check box in Frames:
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		// Switch to Frame
		driver.switchTo().frame(0);
		
		// using page object Module
		PO_02CheckboxRadioButton radioButtonClass = new PO_02CheckboxRadioButton(driver);
		radioButtonClass.LondonRadioButton();
		
		Thread.sleep(5000);
		
		// using page object Module
		PO_02CheckboxRadioButton CheckboxButoonclass = new PO_02CheckboxRadioButton(driver);
		CheckboxButoonclass.CheckboxRadioButton();
		
		Thread.sleep(5000);
		
		// Back to page
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}
}
