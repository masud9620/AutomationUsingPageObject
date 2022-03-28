package testcasePakageAdvance;

import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_005ScrollUpDown;

public class Testcase005ScrollUpDown extends BaseDriver{
	
	
	@Test
	public static void scrollUPDown () throws InterruptedException {
		
		PO_005ScrollUpDown scrollUpDownClass = new PO_005ScrollUpDown(driver);
		scrollUpDownClass.scrollUpDown();
		
	}
	

}
