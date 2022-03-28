package pageObjectPakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_008Slider {
	WebDriver driver = null;

	public PO_008Slider(WebDriver driver) {
		this.driver = driver;
	}

	By baseUrl = By.linkText("https://jqueryui.com/slider/");
	By horizontalSlider = By.xpath("//div[@id='slider']/span");
	By verticalSlider = By.xpath("//div[@id='slider-vertical']/descendant::span");

	public void slider() throws InterruptedException {
		driver.findElement(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(3000);

		// Horizontal slider
		driver.switchTo().frame(0);
		WebElement e = driver.findElement(horizontalSlider);

		Actions a = new Actions(driver);
		a.dragAndDropBy(e, 300, 0).build().perform();

		Thread.sleep(3000);

		a.dragAndDropBy(e, -200, 0).build().perform();
		Thread.sleep(3000);

		// Vertical Slider
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(3000);

		driver.switchTo().frame(0);

		WebElement e1 = driver.findElement(verticalSlider);

		a.dragAndDropBy(e1, 0, 100).build().perform();
		Thread.sleep(3000);

		a.dragAndDropBy(e1, 0, -200).build().perform();
		Thread.sleep(3000);

		// CLose site
		driver.switchTo().defaultContent();

	}
}
