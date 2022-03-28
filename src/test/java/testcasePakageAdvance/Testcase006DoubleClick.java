package testcasePakageAdvance;

import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_006DoubleClick;

public class Testcase006DoubleClick extends BaseDriver{
	
	@Test
	public static void doubleClickMehtod() throws InterruptedException {
		PO_006DoubleClick doubleClickClass = new PO_006DoubleClick(driver);
		doubleClickClass.doubleClick();
	}
	
	

}
