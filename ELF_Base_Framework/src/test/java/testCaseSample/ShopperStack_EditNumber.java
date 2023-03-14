package testCaseSample;

import org.automation.base.Base_Test;
import org.automation.element_repository.EditNumber_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Profile_Page;
import org.testng.annotations.Test;

public class ShopperStack_EditNumber extends Base_Test {
	@Test
	public void editName() throws Throwable, Throwable, Throwable {
		Home_Page hp = new Home_Page(driver);
		Profile_Page pp = new Profile_Page(driver);
		EditNumber_Page en = new EditNumber_Page(driver);
		hp.selectMyProfile();
		pp.editAddress();
		en.editnumber();
	}

}


