package CustomBusiness.EIDP.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CareerGoalAndActivePage extends CommonUtils{

	@FindBy(id = "careerGoalsSubmit")
	public WebElement saveAndContinueButton;
	
	@FindBy(id = "skillsButton0")
	public WebElement communicationSkillButton;
	
	@FindBy(id = "select")
	public WebElement typeDropdown;
	
	@FindBy(xpath="//div[@id=\"radioButtons_c100\"]/label[1]")
	public WebElement careerExplorationStatus;
	
	@FindBy(id = "field-RTA-01")
	public WebElement description;
	
	@FindBy(id = "addMore")
	public WebElement doneButton;

	@FindBy(css = "[data-target^='#academic']")
	public List<WebElement> goals;

	@FindBy(css = ".controls.line.ta_interestGroup.collapse.in label")
	public List<WebElement> goalOptions;
	
	public CareerGoalAndActivePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
