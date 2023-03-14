package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EditProfile_Page extends Base_Page {
	public EditProfile_Page(WebDriver driver) {
		super(driver);	
	}
@FindBy(id="Name")
public WebElement firstname;

@FindBy(id="Update Address")
private WebElement update;

@FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
private WebElement close;


public WebElement getFirstname() {
	return firstname;
}


public WebElement getUpdate() {
	return update;
}


public WebElement getClose() {
	return close;
}


public void editName() {
	firstname.clear();
	firstname.sendKeys("Thanuja");
	update.click();
	close.click();
	
	
}
	
}
