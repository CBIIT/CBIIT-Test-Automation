package ANALYSIS_TOOLS.ICRP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ICRPHomePage extends CommonUtils {

	/* This locator is for the ICRP data button */
	@FindBy(xpath = "(//*[@class='dropdown-toggle'])[1]")
	public WebElement ICRPDataBtn;

	/* This locator is for the search database button */
	@FindBy(xpath = "//*[@title='Search and analyze the ICRP Database']")
	public WebElement searchDatabaseBtn;

	public ICRPHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}