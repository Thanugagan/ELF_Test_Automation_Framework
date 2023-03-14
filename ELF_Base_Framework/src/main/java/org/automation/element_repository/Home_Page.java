package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/***
 * 
 * @author Sumanth
 *
 */
public class Home_Page extends Base_Page {
	
	

	public Home_Page(WebDriver driver) {
		super(driver);
	}

	//================Web elements or Property================
	@FindBy(id = "loginBtn") 
	private WebElement loginLink;
	
	@FindBy(xpath ="//li[normalize-space()='Logout']") 
	private WebElement logoutButton;
	
	@FindBy(xpath ="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']") 
	private WebElement profileLink;
	
	@FindBy(xpath = "//li[normalize-space()='My Profile']")
	private WebElement myprofile;
	
	@FindBy(xpath="//a[text()='Men']")
	private WebElement menprofile;
	
	
	
	//================Getters or Public services================
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getMyprofile() {
		return myprofile;
	}
	
	public WebElement getMenprofile() {
		return menprofile;
	}

	

	//================Business Logic or Action methods or Behavior================
	public void logout() {
		profileLink.click();
		logoutButton.click();
	}
	
	public void profile() {
		profileLink.click();
		
	}
	
	
	public void selectMyProfile() {
		profileLink.click();
		myprofile.click();	
	}
	
	public void login() {
		loginLink.click();
	}
	
	public void men() {
		menprofile.click();
		
	}
}


