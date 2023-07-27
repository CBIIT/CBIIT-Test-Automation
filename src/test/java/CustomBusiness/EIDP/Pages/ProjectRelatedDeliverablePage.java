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

	/* ------ Other start date selection ------ */
	@FindBy(id = "datepicker12")
	public WebElement otherStartDate;
	
	/* ------ Class to date selection ------ */
	@FindBy(id = "datepicker13")
	public WebElement otherToDate;

	/* ------ Others location text box ------ */
	@FindBy(id = "othersLocation")
	public WebElement othersLocation;
	
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

	/* ------ Training Type Text ------ */
	@FindBy(css = ".modal-lg.in #myModalLabel")
	public WebElement trainingTypeText;

	/* ------ Work date from ------ */
	@FindBy(id = "datepicker34")
	public WebElement workDateFrom;

	/* ------ Work date to ------ */
	@FindBy(id = "datepicker33")
	public WebElement workDateTo;

	/* ------ Interest Group Location ------ */
	@FindBy(id = "interestGroupLocation")
	public WebElement interestGroupLocation;

	/* ------ Add group perticipation button ------ */
	@FindBy(id = "addGroupParticipation")
	public WebElement addGroupPerticipation;

	/* ------ Others Training Activity ------ */
	@FindBy(id = "addOthersTrainingActivities")
	public WebElement addOthersTrainingActivities;

	/* ------ List of training activity Icons ------ */
	@FindBy(css = ".delivChoice .fa.fa-pencil")
	public List<WebElement> trainningActivitiesEditIcons;

	/* ------ List of Interest/working groups ------ */
	@FindBy(xpath = "//*[@id='ta_interestGroup2']//div[@class='controls']//label[@class='radio']")
	public List<WebElement> interestGroups;

	/* ------ List of Class course statuses ------ */
	@FindBy(xpath = "//*[@id='ta_classCourses2']//*[@aria-labelledby='trackClassActStatusLegend']//label")
	public List<WebElement> classCourseStatuses;

	/* ------ List of Other Activity statuses ------ */
	@FindBy(xpath = "//*[@id='ta_presentations']//*[@aria-labelledby='trackOtherActStatusLegend']//label")
	public List<WebElement> otherActStatuses;
	
	public ProjectRelatedDeliverablePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
