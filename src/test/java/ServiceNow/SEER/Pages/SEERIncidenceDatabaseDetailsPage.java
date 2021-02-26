package ServiceNow.SEER.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SEERIncidenceDatabaseDetailsPage extends CommonUtils {

	/** --------------- SEER INCIDENCE DATABASE DETAILS PAGE -------------- */

	/**
	 * ------SEER INCIDENCE DATABASE DETAILS PAGE: Thank you - your data access
	 * request is complete SECTION ------
	 */

	@FindBy(xpath = "//div/div/h3")
	public WebElement thankYouDataAccessRequestCompletedText;

	/** --------------- END OF SEER INCIDENCE DATABASE DETAILS PAGE -------------- */

	public SEERIncidenceDatabaseDetailsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}