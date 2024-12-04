package PLATFORM_BUSINESS.RCMDB.pages;

import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class PortalViewPage extends BasePage {

	public PortalViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	public void navigateToPortalView() throws Exception {
		try {
			driver.get("https://service-test.nci.nih.gov/x/g/records-management/home");
		} catch (Exception e) {
			throw e;
		}
	}
	
	

}
