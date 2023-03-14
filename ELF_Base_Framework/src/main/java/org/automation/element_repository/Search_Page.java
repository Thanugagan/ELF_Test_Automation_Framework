package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Page extends Base_Page{

	public Search_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "search")
	private WebElement search;
	
	@FindBy(id="searchBtn")
	private WebElement button;

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getButton() {
		return button;
	}


	public void searchItem(String name) throws Exception {
		search.sendKeys(name);
		Thread.sleep(20);
		button.click();
	}
	
	

}
