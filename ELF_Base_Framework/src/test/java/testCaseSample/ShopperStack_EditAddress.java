package testCaseSample;

import org.automation.base.Base_Test;
import org.automation.element_repository.EditAddress_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Profile_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShopperStack_EditAddress extends Base_Test {
	public ReadTestData readData;

	@DataProvider
	public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
		readData = new ReadTestData();
		String[][] registerationData = readData.readTestDataFromExcel("Sheet1", "Address");
		return registerationData;
	}
	@Test(dataProvider="multipleNewUsersData")
	public void editAddress(String [] registrationData) throws Throwable, Throwable, Throwable {
		UtilityMethods um = new UtilityMethods();
		Home_Page hp = new Home_Page(driver);
		Profile_Page pp = new Profile_Page(driver);
		EditAddress_Page ea = new EditAddress_Page(driver);
		hp.selectMyProfile();
		pp.editAddress();
		ea.editAddress();
		Thread.sleep(IMPLICIT_TIMEOUT, EXPLICIT_TIMEOUT);;
		
		
		

}}
