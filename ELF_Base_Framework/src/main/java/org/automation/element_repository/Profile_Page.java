package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile_Page extends Base_Page {
	
		public Profile_Page(WebDriver driver) {
			super(driver);
		}

		// ================Web elements or Property================
		@FindBy(xpath = "//div[text()='My Profile']")
		private WebElement myProfileButton;

		@FindBy(xpath  = "//a[@href='/my-profile/my-addresses']")
		private WebElement myAddressButton;
		
		@FindBy(xpath = "//a[@href='/my-profile/my-wallet']")
		private WebElement mywallet;
		
		@FindBy(xpath="//a[@href='/my-profile/my-likes']")
		private WebElement mylikes;

		@FindBy(xpath  = "(//*[name()='svg'][@id='editaddress_fl'])[1]")
		private WebElement editAddresspage;
		
		@FindBy(xpath = "//button[contains(@class,'css-t2wvjf')]")
		private WebElement editProfile;
		
		@FindBy(xpath = "//button[normalize-space()='Add Address']")
		private WebElement add;
		
		@FindBy(xpath="//li[normalize-space()='Wish List']")
		private WebElement wishlist;
		
//======================================================================================

		public WebElement getMyProfileButton() {
			return myProfileButton;
		}

		public WebElement getMyAddressButton() {
			return myAddressButton;
		}

		public WebElement getEditAddress() {
			return editAddresspage;
		}
		
		public WebElement getAdd() {
			return add;
		}
		
		public WebElement getMywallet() {
			return mywallet;
		}

		public WebElement getMylikes() {
			return mylikes;
		}

		public WebElement getEditProfile() {
			return editProfile;
		}

		public WebElement getWishlist() {
			return wishlist;
		}

		//=======================================================================================
		

		public void address() {
			myAddressButton.click();
			add.click();
			
		}
		
		public void editAddress() {
			UtilityMethods um = new UtilityMethods();
			myProfileButton.click();
			myAddressButton.click();
			um.waitForPageLaod(driver);
			editAddresspage.click();
		}
		
		public void editprofile() {
			UtilityMethods um = new UtilityMethods(); 
			myProfileButton.click();
			myAddressButton.click();
			editAddresspage.click();
			
		}
		
		public void wishlist() {
			//myProfileButton.click();
			wishlist.click();
		}
		
		public void gotoAddress() {
			myAddressButton.click();
			
			
			
		}
		
		
}
