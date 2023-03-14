package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditNumber_Page extends Base_Page{

	public EditNumber_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "Phone Number")
	private WebElement Phonenumber;
	
	@FindBy(id="Update Address")
	private WebElement update;
	
	@FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
	private WebElement close;

	public WebElement getPhonenumber() {
		return Phonenumber;
	}
	
	
	public WebElement getUpdate() {
		return update;
	}


	public WebElement getClose() {
		return close;
	}


	public void editnumber() {
		Phonenumber.clear();
		Phonenumber.sendKeys("9876543210");
		update.click();
		close.click();
	}

}
