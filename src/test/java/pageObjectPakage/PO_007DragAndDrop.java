package pageObjectPakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_007DragAndDrop {
	WebDriver driver = null;
	
	public PO_007DragAndDrop(WebDriver driver) {
		this.driver = driver;
	}
	
	By baseUrl = By.linkText("https://jqueryui.com/droppable");
	
	public void dragAndDrop() throws InterruptedException {
		driver.findElement(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		// Drag and Drop
		driver.switchTo().frame(0);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(e1, e2).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
	}

}
