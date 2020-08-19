package ServiceNow.COVIDCode.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FollowUpFormPage extends CommonUtils{
	
	/*
	 * Demographics Section elements
	 */
	/** What is the highest level of school that you/the patient completed? */
	@FindBy (xpath = "//*[@id='highest_education_level']/div/label")
	public WebElement whatIsHighestEducationLevelCompleted;
	
	
	public FollowUpFormPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
