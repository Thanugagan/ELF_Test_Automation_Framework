package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddress_Page extends Base_Page {

	public EditAddress_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@id='editaddress_fl'])")
	private WebElement edit;
	
	@FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
	private WebElement close;
	
	@FindBy(id="House/Office Info")
	private WebElement house;
	
	@FindBy(id="Update Address")
	private WebElement update;

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getHouse() {
		return house;
	}
	
	public void editAddress() {
		//edit.click();
		house.clear();
		house.sendKeys("5");
		update.click();
		close.click();
		
	}

}
