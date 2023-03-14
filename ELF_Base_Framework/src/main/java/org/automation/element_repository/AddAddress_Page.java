package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddress_Page extends Base_Page{

	public AddAddress_Page(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id =  "Office")
	private WebElement office;
	
	@FindBy(id="Name")
	private WebElement name1;
	 
	@FindBy(id = "House/Office Info")
	private WebElement houseno1;
	
	@FindBy(id  = "Street Info")
	private WebElement streetinfo1;
	
	@FindBy(id ="Landmark")
	private WebElement landmark1;
	
	@FindBy(id = "Pincode")
	private WebElement pincode1;
	
	@FindBy(id = "Phone Number")
	private WebElement number1;
	
	@FindBy(id = "addAddress")
	private  WebElement submit1;
	
	@FindBy(id = "Country")
	private WebElement country;
	
	@FindBy(id = "State")
	private WebElement state;
	
	@FindBy(id = "City")
	private WebElement city;
	
	@FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
	private WebElement close;
	

	public WebElement getoffice() {
		return office;
	}

	public WebElement getName1() {
		return name1;
	}

	public WebElement getHouseno1() {
		return houseno1;
	}

	public WebElement getStreetinfo1() {
		return streetinfo1;
	}

	public WebElement getLandmark1() {
		return landmark1;
	}

	public WebElement getPincode1() {
		return pincode1;
	}

	public WebElement getNumber1() {
		return number1;
	}

	public WebElement getSubmit1() {
		return submit1;
	}


	public WebElement getName() {
		return name1;
	}


	public WebElement getHouseno() {
		return houseno1;
	}


	public WebElement getStreetinfo() {
		return streetinfo1;
	}


	public WebElement getLandmark() {
		return landmark1;
	}


	public WebElement getPincode() {
		return pincode1;
	}


	public WebElement getNumber() {
		return number1;
	}


	public WebElement getSubmit() {
		return submit1;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}
	

	public WebElement getClose() {
		return close;
	}

	public void addaddress(String name,String houseno,String streetinfo,String landmark,String pincode,String number) {
	 UtilityMethods um = new UtilityMethods();
	 
		name1.sendKeys(name);
		houseno1.sendKeys(houseno);
		streetinfo1.sendKeys(streetinfo);
		landmark1.sendKeys(landmark);
		um.selectDropDown(country, "India");
		um.selectDropDown(state, "Karnataka");
		um.selectDropDown(city, "Hassan");
		pincode1.sendKeys(pincode);
		number1.sendKeys(number);
		submit1.click();
		close.click();
	}
	
	public void addOfficeAddress(String name,String houseno,String streetinfo,String landmark,String pincode,String number) {
		 UtilityMethods um = new UtilityMethods();
		 	office.click();
			name1.sendKeys(name);
			houseno1.sendKeys(houseno);
			streetinfo1.sendKeys(streetinfo);
			landmark1.sendKeys(landmark);
			um.selectDropDown(country, "India");
			um.selectDropDown(state, "Karnataka");
			um.selectDropDown(city, "Hassan");
			pincode1.sendKeys(pincode);
			number1.sendKeys(number);
			submit1.click();
			close.click();
		}
}
