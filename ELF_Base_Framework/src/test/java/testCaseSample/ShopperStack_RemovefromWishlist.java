package testCaseSample;

import org.automation.base.Base_Test;
import org.automation.element_repository.DeleteAddress_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Profile_Page;
import org.automation.element_repository.Wishlist_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.testng.annotations.Test;

public class ShopperStack_RemovefromWishlist extends Base_Test{

	@Test
	public void removefromWishlist() {
		UtilityMethods um = new UtilityMethods();
		Home_Page hp = new Home_Page(driver);
		Profile_Page pp = new Profile_Page(driver);
		Wishlist_Page wl = new Wishlist_Page(driver);
		um.waitForPageLaod(driver);
		hp.selectMyProfile();
		um.waitForPageLaod(driver);
		pp.wishlist();
		um.waitForPageLaod(driver);
		wl.removeWishlist();
		
	}}
