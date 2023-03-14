package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Sumanth
 *
 */
public class Login_Page extends Base_Page {
	
	public WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//================Web elements or Property================
	@FindBy(id="Email") 
	private WebElement emailTextField;
	
	@FindBy(id="Password") 
	private WebElement passwordTextField;
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(id ="Create Account") 
	private WebElement registerLink;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement log;

	//================Getters or Public services================
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	public WebElement getLog() {
		return log;
	}

	//================Business Logic or Action methods or Behavior================
	public Home_Page login(String username, String password) {
		loginButton.click();
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		log.click();
		
		//landing Page Object
		return new Home_Page(driver);
	}
	
	public void CreateAccount() {
		registerLink.click();
	}
}
