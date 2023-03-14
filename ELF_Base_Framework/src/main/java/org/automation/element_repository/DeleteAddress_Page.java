package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAddress_Page extends Base_Page {

	public DeleteAddress_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[7]")
	private WebElement delete;
	
	@FindBy(xpath = "//div[contains(@aria-labelledby,':rl:')]//button[contains(@type,'button')][normalize-space()='Yes']")
	private WebElement yes;
	
	public WebElement getDelete() {
		return delete;
	}
	
	public WebElement getYes() {
		return yes;
	}

	public void delete() {
		delete.click();
		yes.click();
		
	

}}
