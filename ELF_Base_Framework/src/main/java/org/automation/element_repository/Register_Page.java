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
public class Register_Page extends Base_Page {

	public Register_Page(WebDriver driver) {
		super(driver);
	}

	// ================Web elements or Property================
	@FindBy(id = "Male")
	private WebElement maleRadioButton;

	@FindBy(id = "Female")
	private WebElement femaleRadioButton;

	@FindBy(id = "First Name")
	private WebElement firstNameTextField;

	@FindBy(id = "Last Name")
	private WebElement lastNameTextField;

	@FindBy(id = "Email Address")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "Confirm Password")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id="Terms and Conditions")
	private WebElement tc;

	@FindBy(id = "btnDisabled")
	private WebElement registerButton;

	//================Getters or Public services================
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getTc() {
		return tc;
	}

	//================Business Logic or Action methods or Behavior================
	public void registerUser(String gender,String firstName,String lastName,String emailId,String password,String number) {
		if(gender.equalsIgnoreCase("MALE")) 
			maleRadioButton.click();
		else 
			femaleRadioButton.click();
		
		firstNameTextField.clear();
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.clear();
		lastNameTextField.sendKeys(lastName);
		emailTextField.clear();
		emailTextField.sendKeys(emailId);
		phoneNumber.clear();
		phoneNumber.sendKeys(number);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.clear();
		confirmPasswordTextField.sendKeys(password);
		tc.click();
		registerButton.click();		
	}
}
