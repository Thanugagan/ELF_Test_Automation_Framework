package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utilities.ActionsUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Men_Page extends Base_Page {

	public Men_Page(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//a[@href='/sub-category/men-shirt'][normalize-space()='Shirts']")
	private WebElement shirts;
	
	@FindBy(xpath = "//div[@class='cat_box__jl5G7']")
	private WebElement empty;
	
	@FindBy(xpath = "//span[normalize-space()='Men Regular Fit Solid Cut Away Coll...']")
	private WebElement selectitem;
	

	@FindBy(xpath="//div[@class='featuredProducts_footerRight__k498x']//*[name()='svg']")
	private WebElement wish;

	
	
	public WebElement getSelectitem() {
		return selectitem;
	}

	public WebElement getCart() {
		return wish;
	}

	public WebElement getShirts() {
		return shirts;
	}

	public void wish() throws Throwable {
		ActionsUtil action = new ActionsUtil(driver);
		shirts.click();
		Thread.sleep(20);
		selectitem.click();
		Thread.sleep(30);
		action.mouseHoverOnElement(empty);
		wish.click();
	}
}
