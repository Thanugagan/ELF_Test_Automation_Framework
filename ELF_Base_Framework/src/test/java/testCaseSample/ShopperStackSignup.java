package testCaseSample;

import org.automation.base.Base_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.Register_Page;
import org.automation.generic_utilities.ActionsUtil;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopperStackSignup {


	public ReadTestData readData;
	
	@DataProvider
	public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
		readData = new ReadTestData();
		String[][] registerationData = readData.readTestDataFromExcel("Sheet1", "Address");
		return registerationData;
	}
	
	@Test(dataProvider="multipleNewUsersData")
	public void registerUser(String [] registrationData) {
		UtilityMethods um = new UtilityMethods();
		String gender = registrationData[0];
		String firstName = registrationData[1];
		String lastName = registrationData[2];
		String number=registrationData[3];
		String emailId = firstName+um.giveRandomNumber(200)+registrationData[4];
		String password = registrationData[5];
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(readData.readDataFromPropertyFile("url"));
		Login_Page loginPage = new Login_Page(driver);
		Home_Page homePage=new Home_Page(driver);
		um.waitForPageLaod(driver);
		homePage.login();
		loginPage.CreateAccount();
		Register_Page registerPage = new Register_Page(driver);
		registerPage.registerUser(gender, firstName, lastName, emailId, password, number);
		driver.quit();
	}
}
