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
	
	/** COVIDCode Follow Ups link */
	@FindBy (linkText = "COVIDcode Follow Ups")
	public WebElement covidCodeFollowUpsLink;
	
	/** COVIDCode Volunteer Surveys */
	@FindBy (linkText = "COVIDcode volunteer surveys")
	public WebElement covidCodeVolunteerSurveysLink;
	
	/** COVIDCode Follow Ups Group 1 link */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/a")
	public WebElement covidCodeFollowUpsGroup1link;
	
	/** COVIDCode Survey Number first link */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/a")
	public WebElement covidCodeSurveyNumberFirstLink;
	
	/** COVIDCode Follow Ups Activity tab */
	@FindBy (xpath = "//*[@id='tabs2_section']/span[6]/span[1]/span[2]")
	public WebElement covidCodeFollowUpsActivityTab;

	public NativeViewEnrollmentsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
