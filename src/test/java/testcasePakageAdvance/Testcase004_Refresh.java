package testcasePakageAdvance;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_004Refresh;

public class Testcase004_Refresh extends BaseDriver {

	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public static void refreshPage() throws InterruptedException {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//using PO
		PO_004Refresh pageRefreshClass = new PO_004Refresh (driver);
		pageRefreshClass.baseURLToRefresh();
		
	
		//navigate( ).to( )
		//navigate( ).back( )
		//navigate( ).forward( )
		//navigate( ).refresh( )
	}
}
