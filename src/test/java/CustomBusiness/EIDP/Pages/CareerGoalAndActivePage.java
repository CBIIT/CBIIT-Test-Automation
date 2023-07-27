package CustomBusiness.EIDP.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CareerGoalAndActivePage extends CommonUtils{

	/* ------ Career Goals save and continue button ------ */
	@FindBy(id = "careerGoalsSubmit")
	public WebElement saveAndContinueButton;
	
	/* ------ Communication skills button ------ */
	@FindBy(id = "skillsButton0")
	public WebElement communicationSkillButton;
	
	/* ------ IDP type dropdown ------ */
	@FindBy(id = "select")
	public WebElement typeDropdown;
	
	/* ------ Career Exploration status ------ */
	@FindBy(xpath="//div[@id=\"radioButtons_c100\"]/label[1]")
	public WebElement careerExplorationStatus;
	
	/* ------ Description on career goals page ------ */
	@FindBy(id = "field-RTA-01")
	public WebElement description;

	/* ------ Career Goal Academic option ------ */
	@FindBy(css = "[data-target='#academic24']")
	public WebElement academicOption;

	/* ------ Add More button ------ */
	@FindBy(id = "addMore")
	public WebElement addMoreButton;

	/* ------ Done button ------ */
	@FindBy(xpath = "//*[contains(@class, 'modal-lg')][contains(@class, 'in')]//*[text()='Done']")
	public WebElement doneButton;

	/* ------ List of Goals ------ */
	@FindBy(css = "[data-target^='#academic']")
	public List<WebElement> goals;

	/* ------ List of Goal options ------ */
	@FindBy(css = ".controls.line.ta_interestGroup.collapse.in label")
	public List<WebElement> goalOptions;

	/* ------ Edit icons ------ */
	@FindBy(css = "[title='Edit']")
	public List<WebElement> editIcons;

	/* ------ careerStatuses ------ */
	@FindBy(xpath = "//*[text()=' Please indicate the status of this career exploration:']//ancestor::div[@role='group']")
	public List<WebElement> careerStatuses;

	/* ------ edit radio buttons ------ */
	@FindBy(css = ".modal-lg.in label.radio")
	public List<WebElement> editRadiobuttons;
	
	public CareerGoalAndActivePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
