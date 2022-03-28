package pageObjectPakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_005ScrollUpDown {
	WebDriver driver = null;
	

	// constructor
	public PO_005ScrollUpDown (WebDriver driver) {
		this.driver = driver;
	}
	//Base url link
	By baseUrl = By.linkText("https://www.seleniumhq.org");
	
	// method
	public void scrollUpDown () throws InterruptedException {
		driver.findElement(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Scroll section :UP to Bottom
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		
		// Scroll section : Bottom to Up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		
		// Scroll to Specific Element of a page
		
		WebElement element = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[2]/a[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}

}
