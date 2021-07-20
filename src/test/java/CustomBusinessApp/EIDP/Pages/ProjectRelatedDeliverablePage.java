package CustomBusinessApp.EIDP.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;



public class ProjectRelatedDeliverablePage extends CommonUtils{

	@FindBy(how = How.ID, id = "projectTitle")
	public WebElement projectTitle;
	
	@FindBy(how = How.ID, id="trainingActivitiesTab")
	public WebElement trainingActivityButton;
	
	@FindBy(how = How.ID, id = "field-RP-01")
	public WebElement description;
	
	@FindBy(how = How.ID, id = "field-RP-02")
	public WebElement responsibilities;
	
	@FindBy(how = How.ID, id = "projectsAndTrainingSubmit")
	public WebElement saveAndContinueButton;
	
	@FindBy(how = How.ID, id = "publicationButton")
	public WebElement publicationButton;
	
	@FindBy(id = "selectType")
	public WebElement selectTypeDropdown;
	
	@FindBy(id = "publicationSubTypeSelect")
	public WebElement publicationSubTypeSelect;
	
	@FindBy(how = How.ID, id = "month_start")
	public WebElement targetMonthStartDropdown;
	
	@FindBy(how = How.ID, id = "year_start")
	public WebElement targetYearDropdown;
	
	@FindBy(how = How.ID, id = "presentationFields5Title")
	public WebElement publicationtitle;
	
	@FindBy(how = How.ID, id = "field-RTA-03")
	public WebElement publicationDescription;
	
	@FindBy(how = How.ID, id = "addDeliverablesButton")
	public WebElement addDeliverablesButton;
	
	@FindBy(how = How.ID, id = "workshopSubmission")
	public WebElement classesCoursesWorkshopButton;
	
	@FindBy(how = How.ID, id = "noTravel1")
	public WebElement travelNoRadioButton;
	
	@FindBy(how = How.ID, id = "datepicker9")
	public WebElement classesStartDate;
	
	@FindBy(how = How.ID, id = "datepicker10")
	public WebElement classesToDate;
	
	@FindBy(how = How.ID, id = "classroomLocation")
	public WebElement classRoomLocation;
	
	@FindBy(how = How.ID, id = "classroomtitle")
	public WebElement classroomtitle;
	
	@FindBy(how = How.ID, id = "field-RTA-classroom")
	public WebElement classDescrption;
	
	@FindBy(how = How.ID, id = "noclassProjectLink")
	public WebElement existingProjectNoRadioButton;
	
	@FindBy(how = How.ID, id = "addworkshops")
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
