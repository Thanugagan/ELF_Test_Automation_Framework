package testCaseSample;

import org.automation.base.Base_Test;
import org.automation.element_repository.Search_Page;
import org.testng.annotations.Test;

public class ShopperStack_Search extends Base_Test {
	@Test
	public void searchItem() throws Exception {
		Search_Page sp = new Search_Page(driver);
		sp.searchItem("Kurta");
	}
	
	

}
