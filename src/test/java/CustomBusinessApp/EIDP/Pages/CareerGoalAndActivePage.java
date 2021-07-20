package CustomBusinessApp.EIDP.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;


public class CareerGoalAndActivePage extends CommonUtils{

	@FindBy(how = How.ID, id = "careerGoalsSubmit")
	public WebElement saveAndContinueButton;
	
	@FindBy(how = How.ID, id = "skillsButton0")
	public WebElement communicationSkillButton;
	
	@FindBy(how = How.ID, id = "select")
	public WebElement typeDropdown;
	
	@FindBy(how = How.XPATH, xpath="//div[@id=\"radioButtons_c100\"]/label[1]")
	public WebElement careerExplorationStatus;
	
	@FindBy(how = How.ID, id = "field-RTA-01")
	public WebElement description;
	
	
	@FindBy(how = How.ID, id = "addMore")
	public WebElement doneButton;
	
	public CareerGoalAndActivePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
