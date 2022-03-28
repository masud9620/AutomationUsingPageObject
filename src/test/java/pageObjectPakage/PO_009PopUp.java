package pageObjectPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_009PopUp {
	WebDriver driver = null;
	
	public PO_009PopUp(WebDriver driver) {
		this.driver = driver;
	}
	By webElement01 = By.name("iframeResult");
	By webElement02 = By.xpath("//button[text()='Try it']");
	public  void popUpMethod() throws InterruptedException {
		WebElement b = driver.findElement(webElement01);
		driver.switchTo().frame(b);
		
		driver.findElement(webElement02);
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		
	}
	
}
