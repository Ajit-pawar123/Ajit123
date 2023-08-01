package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void SendKeys(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);

		}
	}

	public static void Click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}

	public static void Country(WebElement wb, String value) {

		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}

}
