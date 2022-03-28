package pageObjectPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_010KeyboardEvent {
	WebDriver driver = null;

	public PO_010KeyboardEvent(WebDriver driver) {
		this.driver = driver;
	}
	
	By urlPath = By.xpath("//input[@id='search_query_top']");
	public void keyBoardEvent() throws InterruptedException {
		WebElement element = driver.findElement(urlPath);
		Thread.sleep(3000);
		element.sendKeys(Keys.chord(Keys.SHIFT,"Independence Day"));
		
		Thread.sleep(3000);
		element.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(3000);
	}
}
