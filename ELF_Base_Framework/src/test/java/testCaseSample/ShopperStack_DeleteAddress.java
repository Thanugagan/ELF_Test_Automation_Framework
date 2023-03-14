package testCaseSample;

import org.automation.base.Base_Test;
import org.automation.element_repository.DeleteAddress_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Profile_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShopperStack_DeleteAddress extends Base_Test {

	@Test
	public void deleteAddress() {
		UtilityMethods um = new UtilityMethods();
		Home_Page hp = new Home_Page(driver);
		Profile_Page pp = new Profile_Page(driver);
		DeleteAddress_Page da = new DeleteAddress_Page(driver);
		um.waitForPageLaod(driver);
		hp.selectMyProfile();
		pp.gotoAddress();
		da.delete();
		
		
	

}}

