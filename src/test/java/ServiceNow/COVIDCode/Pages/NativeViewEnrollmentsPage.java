package ServiceNow.COVIDCode.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewEnrollmentsPage extends CommonUtils {

	/** Filter Navigator search bar */
	@FindBy(css = "#filter")
	public WebElement filterNavigator;

	/** COVIDCode Enrollments Link */
	@FindBy(linkText = "COVIDcode enrollments")
	public WebElement COVIDCodeEnrollmentsLink;
	
	/** Native View Frame */
	@FindBy (id = "gsft_main")
	public WebElement frame;
	
	/** New button */
	@FindBy (css = "#sysverb_new")
	public WebElement newButton;
	
	/** Search drop down */
	@FindBy (xpath = "//select[@class='form-control default-focus-outline']")
	public WebElement searchDropDown;
	
	/** Search text box */
	@FindBy (xpath = "//div[@class='input-group']/input")
	public WebElement searchTextBox;

	public NativeViewEnrollmentsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
