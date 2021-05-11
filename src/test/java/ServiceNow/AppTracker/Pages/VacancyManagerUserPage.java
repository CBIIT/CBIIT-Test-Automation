package ServiceNow.AppTracker.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class VacancyManagerUserPage extends CommonUtils {
	
	/**Login as NIH Trusted User**/
	@FindBy(xpath = "//*[text()='Login with NIH iTrust']")
	public WebElement NIHTrustedUserLogin; 	
	
	/**Login dropdown menu on main page**/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-link ant-dropdown-trigger Login']")
	public WebElement logInMainPage; 	
	
	/**Vacancy Dashboard  Page Header **/
	@FindBy(xpath = "//h1[contains(text(),'Vacancy Dashboard')]")
	public WebElement vacancyDashboardPageHeader;
	
	/**Create Vacancy Button**/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public WebElement createVacancyButton;
	
	/**Vacancy Page Vacancy Title Input Field**/
	@FindBy(xpath ="//input[@id='BasicInfo_title']")
	public WebElement vacancyTitleField;
	
	/**Vacancy Page Vacancy Description Input Field**/
	@FindBy(xpath ="(//div[@class='ql-editor ql-blank'])[1]")
	public WebElement vacancyDescriptionField;
	
	/** Vacancy Description Header**/
	@FindBy(xpath="//label[@title='Vacancy Description']")
	public WebElement vacancyHeader;
	
	/**Recommendation Option**/
	@FindBy(xpath="//div[@class='ant-slider-step']")
	public WebElement lettersOfRecommendation;
	
    /**Basic Vacancy Information Save Button**/
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary wider-button']")
	public WebElement basicVacancyInformationSaveButton;
	
	/**Review and Finalize Page verify number of letters of recommendation**/
	@FindBy(xpath ="//li[@class='ListItemTrue' and text()='3']")
	public WebElement numberOfLettersOfRecommendation;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public VacancyManagerUserPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);

}
}