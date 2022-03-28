package testcasePakageAdvance;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_03Dropdown;

public class Testcase003_Dropdown extends BaseDriver {

	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public static void selectingValueFromDropdown() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		
		// Using Page Object 
		PO_03Dropdown selectDropdownClass = new PO_03Dropdown(driver);
		selectDropdownClass.dropDownSelect();
		
		driver.switchTo().defaultContent();
	}

	@Test
	public static void selectingMultipleValueFromDropdown() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		
		// Using Page Object
		PO_03Dropdown multipleValueSelection = new PO_03Dropdown(driver);
		multipleValueSelection.multipleValueSelect();
		
		
		// Close Site
		driver.switchTo().defaultContent();
		
	}
}

