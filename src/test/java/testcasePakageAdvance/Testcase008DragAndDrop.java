package testcasePakageAdvance;

import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_008Slider;

public class Testcase008DragAndDrop extends BaseDriver{
	@Test
	public void dragAndDropMethod() throws InterruptedException {
		PO_008Slider dragingAndDropingClass = new PO_008Slider(driver);
		dragingAndDropingClass.slider();
	}
}
