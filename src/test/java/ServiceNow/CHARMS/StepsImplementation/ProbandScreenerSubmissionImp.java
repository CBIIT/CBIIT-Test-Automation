package ServiceNow.CHARMS.StepsImplementation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nci.automation.web.CommonUtils;

public class ProbandScreenerSubmissionImp extends CommonUtils{
	
	/** "Are you filling this questionnaire out for someone else?" Returns Yes or No  */
	@FindBy (xpath   = "//div[@class='select2-container ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-not-empty']")
	public WebElement[] areYouFillingThisOutForSomeoneElse;
	
	/** SAVE and NEXT button on Study Introduction Section */
	@FindBy (xpath = "//button[contains(text(),'SAVE & NEXT')]")
	public WebElement saveAndNextBtn;
	
	/** Biological Sex Drop down */
	@FindBy (xpath = "")
	public WebElement biologicalSexDropdown;
	
	/** Biological Sex Drop down values */
	@FindBy (xpath = "")
	public List<WebElement> biologicalSex;
	
}
