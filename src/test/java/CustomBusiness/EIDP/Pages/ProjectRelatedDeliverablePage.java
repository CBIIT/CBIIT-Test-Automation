package CustomBusiness.EIDP.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;

public class ProjectRelatedDeliverablePage extends CommonUtils{

	@FindBy(id = "projectTitle")
	public WebElement projectTitle;
	
	@FindBy(id="trainingActivitiesTab")
	public WebElement trainingActivityButton;
	
	@FindBy(id = "field-RP-01")
	public WebElement description;
	
	@FindBy(id = "field-RP-02")
	public WebElement responsibilities;
	
	@FindBy(id = "projectsAndTrainingSubmit")
	public WebElement saveAndContinueButton;
	
	@FindBy(id = "addDeliverablesButton")
	public WebElement doneButton;
	
	@FindBy(id = "publicationButton")
	public WebElement publicationButton;
	
	@FindBy(id = "selectType")
	public WebElement selectTypeDropdown;
	
	@FindBy(id = "publicationSubTypeSelect")
	public WebElement publicationSubTypeSelect;
	
	@FindBy(id = "month_start")
	public WebElement targetMonthStartDropdown;
	
	@FindBy(id = "year_start")
	public WebElement targetYearDropdown;
	
	@FindBy(id = "presentationFields5Title")
	public WebElement publicationtitle;
	
	@FindBy(id = "field-RTA-03")
	public WebElement publicationDescription;
	
	@FindBy(id = "addDeliverablesButton")
	public WebElement addDeliverablesButton;
	
	@FindBy(id = "workshopSubmission")
	public WebElement classesCoursesWorkshopButton;
	
	@FindBy(id = "noTravel1")
	public WebElement travelNoRadioButton;
	
	@FindBy(id = "datepicker9")
	public WebElement classesStartDate;
	
	@FindBy(id = "datepicker10")
	public WebElement classesToDate;
	
	@FindBy(id = "classroomLocation")
	public WebElement classRoomLocation;
	
	@FindBy(id = "classroomtitle")
	public WebElement classroomtitle;
	
	@FindBy(id = "field-RTA-classroom")
	public WebElement classDescrption;
	
	@FindBy(id = "noclassProjectLink")
	public WebElement existingProjectNoRadioButton;
	
	@FindBy(id = "addworkshops")
	public WebElement addworkshopsButton;
	
	@FindBy(id = "addnewProject")
	public WebElement addNewProjectButton;
	
	@FindBy(id = "month_start")
	public WebElement targetDateMonth;
	
	@FindBy(id = "year_start")
	public WebElement targetDateYear;
	
	@FindBy(id = "projectsAndTrainingSave")
	public WebElement projectsAndTrainingSave;
	
	public ProjectRelatedDeliverablePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
