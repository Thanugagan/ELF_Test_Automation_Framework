package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlist_Page extends Base_Page {

	public Wishlist_Page(WebDriver driver) {
		super(driver);
		
	}
@FindBy(xpath ="//button[text()='remove from wishlist?']")
private WebElement remove;


public WebElement getRemove() {
	return remove;
}


public void removeWishlist() {
	UtilityMethods um = new UtilityMethods();
	remove.click();
	um.acceptAlert(driver);
	
	
}
	
	
	
}
