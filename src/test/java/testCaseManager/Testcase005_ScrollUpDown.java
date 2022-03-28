package testCaseManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPakage.BaseDriver;

public class Testcase005_ScrollUpDown extends BaseDriver {
	public static String baseUrl = "https://www.seleniumhq.org";

	@Test
	public static void scrollCheck() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//Scroll to Top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//Scroll to specific Element
		WebElement e=driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[2]/a[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
	}

}
