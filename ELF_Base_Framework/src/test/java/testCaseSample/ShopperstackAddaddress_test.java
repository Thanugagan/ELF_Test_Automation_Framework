package testCaseSample;

import java.util.Random;

import org.automation.base.Base_Test;
import org.automation.element_repository.AddAddress_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Profile_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShopperstackAddaddress_test extends Base_Test {
	@DataProvider
	public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException {
		readData = new ReadTestData();
		String[][] registerationData = readData.readTestDataFromExcel("Sheet1", "Addaddress");
		return registerationData;}
	
	
	
	@Test(dataProvider="multipleNewUsersData")
	public void addAddress(String [] registrationData) throws Throwable {
		UtilityMethods um = new UtilityMethods();
		Home_Page hp = new Home_Page(driver);
		//hp.profile();
		String name = registrationData[0];
		String houseno = registrationData[1];
		String street = registrationData[2];
		String landmark=registrationData[3];
		String pin = registrationData[4];
		String number = registrationData[5];
		Profile_Page pp = new Profile_Page(driver);
		AddAddress_Page add = new AddAddress_Page(driver);
		Thread.sleep(20);
		//um.waitForPageLaod(driver);
		hp.selectMyProfile();
		Thread.sleep(20);
		//um.waitForPageLaod(driver);
		pp.address();
		um.waitForPageLaod(driver);
		add.addaddress(name, houseno, street, landmark, pin, number);
		
	}
		
		

		
		
		
	

}



