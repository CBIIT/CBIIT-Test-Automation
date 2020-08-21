package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FollowUpFormPage extends CommonUtils{
	
	/** Enrollment Search drop down */
	@FindBy (xpath = "//*[@id='s2id_sp_formfield_patient_id']/a")
	public WebElement enrollmentSearchDropDown;
	
	/** Enrollment search x button*/
	@FindBy (xpath = "//*[@id='s2id_sp_formfield_patient_id']/a/abbr")
	public WebElement enrollmentSearchXbutton;
	
	/** Enrollment Search text box */
	@FindBy (xpath = "//*[@id='select2-drop']/div/input")
	public WebElement enrollmentSearchTxtBox;
	
	/** Existing Enrollment search values */
	@FindBy(xpath = "//*[@id='select2-results-48']/li")
	public List<WebElement> enrollmentSearchValues;
	
	/** User Group ID */
	@FindBy (xpath = "//*[@id='s2id_autogen1']")
	public WebElement userGroupID;
	
	/** Host Hospital Code */
	@FindBy (xpath = "//*[@id='s2id_sp_formfield_host_hospital_code']/input")	
	public WebElement hostHospitalCode;
	
	
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
