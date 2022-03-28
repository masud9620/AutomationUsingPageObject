package pageObjectPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_02CheckboxRadioButton {
	
	WebDriver driver = null;

	public PO_02CheckboxRadioButton(WebDriver driver) {
		this.driver = driver;
	}
	
	By LondonRadioButtonClick = By.xpath("//body/div[1]/fieldset[1]/label[3]");
	
	// Method of londonRAdioButtonclick
	public void LondonRadioButton () {
		driver.findElement(LondonRadioButtonClick).click();
	}
	
	// Method of CheckboxRadioButoonclick
	By CheckboxRadioButtonClick = By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]");
	public void CheckboxRadioButton () {
		driver.findElement(CheckboxRadioButtonClick).click();
	}

}
