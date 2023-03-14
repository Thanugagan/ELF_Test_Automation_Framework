package org.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * Every Page class must and should extend Base Page
 * In this page you will find all common elements of the Web App
 * 
 * @author Sumanth
 * 
 */
public abstract class Base_Page {

	public WebDriver driver;
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//================Web elements or Property================
	@FindBy(id  ="fl_login_btn") 
	private WebElement loginLink;
	
	@FindBy(xpath ="//span[normalize-space()='Create Account']") 
	private WebElement registerLink;
	
	@FindBy(xpath ="//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']") 
	private WebElement accountSettingLink;
		
	@FindBy(xpath="//*[local-name()='svg' and @id='editaddress_fl']") 
	private WebElement editAddress;
	
	@FindBy(partialLinkText="COMPUTERS") 
	private WebElement computersModule;
	
	@FindBy(partialLinkText="ELECTRONICS") 
	private WebElement electronicsModule;
	
	@FindBy(partialLinkText="APPARELS") 
	private WebElement apparelsAndShoesModule;
	
	@FindBy(partialLinkText="DIGITAL DOWNLOADS") 
	private WebElement digitalDownloadsModule;
	
	@FindBy(partialLinkText="JEWELLERY") 
	private WebElement jewelleryModule;
	
	@FindBy(partialLinkText="GIFT CARDS") 
	private WebElement giftCardsModule;
	
	@FindBy(id="small-searchterms")
	private WebElement searchStoreTextBox;
	
	@FindBy(xpath="//*[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement demoWebShopLogo;
	
	//================Getters or Public services================
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getAccountSettingLink() {
		return accountSettingLink;
	}

	public WebElement getComputersModule() {
		return computersModule;
	}

	public WebElement getElectronicsModule() {
		return electronicsModule;
	}

	public WebElement getApparelsAndShoesModule() {
		return apparelsAndShoesModule;
	}

	public WebElement getDigitalDownloadsModule() {
		return digitalDownloadsModule;
	}

	public WebElement getJewelleryModule() {
		return jewelleryModule;
	}

	public WebElement getGiftCardsModule() {
		return giftCardsModule;
	}

	public WebElement getSearchStoreTextBox() {
		return searchStoreTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getDemoWebShopLogo() {
		return demoWebShopLogo;
	}
		
	
	//=================================using business libraries=========================
	
public void getLoginPage() {
	loginLink.click();
}
	
}
