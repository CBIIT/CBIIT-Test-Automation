package CustomBusiness.EIDP.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ProjectRelatedDeliverablePage extends CommonUtils{

	/* ------ Project title ------ */
	@FindBy(id = "projectTitle")
	public WebElement projectTitle;
	
	/* ------ Training activity button ------ */
	@FindBy(id="trainingActivitiesTab")
	public WebElement trainingActivityButton;
	
	/* ------ Description field ------ */
	@FindBy(id = "field-RP-01")
	public WebElement description;
	
	/* ------ Responsibilities tab ------ */
	@FindBy(id = "field-RP-02")
	public WebElement responsibilities;
	
	/* ------ Save and continue button ------ */
	@FindBy(id = "projectsAndTrainingSubmit")
	public WebElement saveAndContinueButton;
	
	/* ------ Add deliverables done button ------ */
	@FindBy(id = "addDeliverablesButton")
	public WebElement doneButton;
	
	/* ------ Publication button ------ */
	@FindBy(id = "publicationButton")
	public WebElement publicationButton;
	
	/* ------ Select type dropdown ------ */
	@FindBy(id = "selectType")
	public WebElement selectTypeDropdown;
	
	/* ------ Target start month dropdown ------ */
	@FindBy(id = "month_start")
	public WebElement targetMonthStartDropdown;
	
	/* ------ Target start year dropdown ------ */
	@FindBy(id = "year_start")
	public WebElement targetYearDropdown;
	
	/* ------ Publication presentation title field ------ */
	@FindBy(id = "presentationFields5Title")
	public WebElement publicationtitle;
	
	/* ------ Publication description box ------ */
	@FindBy(id = "field-RTA-03")
	public WebElement publicationDescription;
	
	/* ------ Add deliverables button ------ */
	@FindBy(id = "addDeliverablesButton")
	public WebElement addDeliverablesButton;
	
	/* ------ Workshop submission button ------ */
	@FindBy(id = "workshopSubmission")
	public WebElement classesCoursesWorkshopButton;
	
	/* ------ Radio button for NO travel ------ */
	@FindBy(id = "noTravel1")
	public WebElement travelNoRadioButton;
	
	/* ------ Class start date selection ------ */
	@FindBy(id = "datepicker9")
	public WebElement classesStartDate;
	
	/* ------ Class to date selection ------ */
	@FindBy(id = "datepicker10")
	public WebElement classesToDate;
	
	/* ------ Class room location text box ------ */
	@FindBy(id = "classroomLocation")
	public WebElement classRoomLocation;
	
	/* ------ Class room title text box ------ */
	@FindBy(id = "classroomtitle")
	public WebElement classroomtitle;
	
	/* ------ Classroom description text box ------ */
	@FindBy(id = "field-RTA-classroom")
	public WebElement classDescrption;
	
	/* ------ NO existing project radio button ------ */
	@FindBy(id = "noclassProjectLink")
	public WebElement existingProjectNoRadioButton;
	
	/* ------ Add workshop button ------ */
	@FindBy(id = "addworkshops")
	public WebElement addworkshopsButton;
	
	/* ------ Add new project button ------ */
	@FindBy(id = "addnewProject")
	public WebElement addNewProjectButton;
	
	/* ------ Target starting month ------ */
	@FindBy(id = "month_start")
	public WebElement targetDateMonth;
	
	/* ------ Target starting year ------ */
	@FindBy(id = "year_start")
	public WebElement targetDateYear;
	
	/* ------ Save button for project and training ------ */
	@FindBy(id = "projectsAndTrainingSave")
	public WebElement projectsAndTrainingSave;

	/* ------ List of Project edit Buttons ------ */
	@FindBy(css = "#tab_0 [aria-label='edit']")
	public List<WebElement> projectEditButtons;

	/* ------ Project completed Radio Button ------ */
	@FindBy(id = "projStatus_297")
	public WebElement completeRadioButton;

	/* ------ In Preparation Radio button ------ */
	@FindBy(xpath = "//label[contains(text(), 'In Preparation')]")
	public WebElement inPrepRadioButton;
	
	public ProjectRelatedDeliverablePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
