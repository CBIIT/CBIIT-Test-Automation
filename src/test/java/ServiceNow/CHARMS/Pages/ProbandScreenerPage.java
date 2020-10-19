package ServiceNow.CHARMS.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ProbandScreenerPage extends CommonUtils {
	
	/** Are you filling this questionnaire out for someone else? drop down */
	@FindBy (xpath = "//span[@id='select2-chosen-1']")
	public WebElement areYouFillingOutThisQuestionnaireForSomeoneElseDropDown;
	
	/** Are you filling this questionnaire out for someone else? drop down */
	@FindBy (xpath = "/html/body/div[3]/ul/li")
	public List<WebElement> areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues;
	
	/** SAVE and NEXT button */
	@FindBy (xpath = "//button[contains(text(),'SAVE & NEXT')]")
	public WebElement saveAndNextBtn;
	
	
	
	
	
	public ProbandScreenerPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
