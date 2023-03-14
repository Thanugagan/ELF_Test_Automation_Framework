package testCaseSample;

import org.automation.base.Base_Test;
import org.automation.element_repository.EditProfile_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Profile_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShopperstackEditName_Test extends Base_Test {

	
	@Test
	public void editName() throws Throwable, Throwable, Throwable {
		Home_Page hp = new Home_Page(driver);
		Profile_Page pp = new Profile_Page(driver);
		EditProfile_Page ep = new EditProfile_Page(driver);
		hp.selectMyProfile();
		pp.editAddress();
		ep.editName();

	}

}
