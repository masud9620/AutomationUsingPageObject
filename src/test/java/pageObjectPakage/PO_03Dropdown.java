package pageObjectPakage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import driverPakage.BaseDriver;


public class PO_03Dropdown extends BaseDriver{
	
	WebDriver  driver = null;
	
	
	public PO_03Dropdown(WebDriver driver) {
		this.driver = driver;
	}
	By selectDropdown = By.name("cars");
	
	public void dropDownSelect() throws InterruptedException {
		WebElement e = (WebElement) driver.findElements(selectDropdown);
		Select s= new Select(e);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build()
		.perform();

		Thread.sleep(3000);
		
	}
	
	By selectMultipleValue = By.name("cars");
	public void multipleValueSelect() throws InterruptedException {
		WebElement e = (WebElement) driver.findElement(selectMultipleValue);
		Select s= new Select(e);

		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build()
		.perform();

		Thread.sleep(3000);
		
	}
			
			
}
