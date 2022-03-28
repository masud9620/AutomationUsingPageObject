package testcasePakageAdvance;

import org.testng.annotations.Test;

import driverPakage.BaseDriver;
import pageObjectPakage.PO_007DragAndDrop;

public class Testcase007_DragAndDrop extends BaseDriver{
	@Test
	public void dragAndDropDoing() throws InterruptedException {
		PO_007DragAndDrop dragDropClass = new PO_007DragAndDrop(driver);
		dragDropClass.dragAndDrop();
	}

}
