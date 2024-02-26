package AnalysisTools.ICRP.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ICRPSearchDatabasePage extends CommonUtils {

	/* This is the locator for the */
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	public WebElement searchBtn;

	/* This is the locator for the totalBaseProj */
	@FindBy(xpath = "//*[@tooltip='Parent projects']")
	public WebElement totalBaseProj;

	/* This is the locator for the totalProj */
	@FindBy(xpath = "//*[@tooltip='Including linked sub-projects or supplements']")
	public WebElement totalProj;

	/* This is the locator for the searchTxtbox */
	@FindBy(xpath = "//*[@tooltip='Enter search terms']")
	public WebElement searchTxtbox;

	/* This is the locator for the exactPhraseRadioBtn */
	@FindBy(xpath = "(//input[@type='radio'])[4]")
	public WebElement exactPhraseRadioBtn;

	/* This is the locator for the anyOfTheKeywordsBtn */
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	public WebElement anyOfTheKeywordsBtn;

	/* This is the locator for the projTitles */
	@FindBy(xpath = "//tr[@class='ng-star-inserted']")
	public List<WebElement> projTitles;

	/* This is the locator for the projGliomaOrganoids */
	@FindBy(xpath = "//a[contains(text(),' Glioma invasion under Mechanical Constraints: Mechanotaxis of the 3D Biomimicry Microenvironment ')]")
	public WebElement projGliomaInvastion;

	/* This is the locator for the institutionPanelHeader */
	@FindBy(xpath = "(//*[@class='ui-panel-header'])[2]")
	public WebElement institutionPanelHeader;

	/* This is the locator for the institutionTxtBox */
	@FindBy(xpath = "//*[@id='institution']")
	public WebElement institutionTxtBox;

	/* This is the locator for the institutionUniversityOfColoradoDenver list */
	@FindBy(xpath = "//*[@title='University of Colorado Denver']")
	public List<WebElement> institutionUniversityOfColoradoDenver;

	/* This is the locator for the fundingPanelHeader */
	@FindBy(xpath = "(//*[@class='ui-panel-header'])[3]")
	public WebElement fundingPanelHeader;

	/* This is the locator for the ALSFChkbox */
	@FindBy(xpath = "//*[@value='127']")
	public WebElement ALSFChkbox;

	/* This is the locator for the fundingOrgALSF */
	@FindBy(xpath = "(//*[@title='ALSF'])[1]")
	public WebElement fundingOrgALSF;

	/* This is the locator for the cancerTypePanelHeader */
	@FindBy(xpath = "(//*[@class='ui-panel-header'])[4]")
	public WebElement cancerTypePanelHeader;

	/* This is the locator for the cancerTypeTxtbox */
	@FindBy(xpath = "(//*[@placeholder='Select Cancer Types'])[2]")
	public WebElement cancerTypeTxtbox;

	/* This is the locator for the brainTumortxt */
	@FindBy(xpath = "//li[contains(text(), 'Brain Tumor')]")
	public WebElement brainTumortxt;

	/* This is the locator for the resetBtn */
	@FindBy(xpath = "(//*[@class='btn btn-default ml2'])[1]")
	public WebElement resetBtn;

	/* This is the locator for the clearBtn */
	@FindBy(xpath = "(//*[@class='btn btn-default ml2'])[2]")
	public WebElement clearBtn;

	/* This is the locator for the allProjTxt */
	@FindBy(xpath = "(//*[@_ngcontent-c5])[3]")
	public WebElement allProjTxt;

	/* This is the locator for the researchAreaPanelHeader */
	@FindBy(xpath = "(//*[@class='ui-panel-header'])[5]")
	public WebElement researchAreaPanelHeader;

	/* This is the locator for the normalFunctioningChkbox */
	@FindBy(xpath = "//*[contains(text(),'1.1 Normal Functioning')]")
	public WebElement normalFunctioningChkbox;

	/* This is the locator for the proj3DPrinting */
	@FindBy(xpath = "//*[@href='/project/128199']")
	public WebElement proj3DPrinting;

	/* This is the locator for the projectTitles list */
	@FindBy(xpath = "//table/tbody/tr/td[1]/a")
	public List<WebElement> projectTitles;

	/* This is the locator for the projectTitlesVal list */
	@FindBy(xpath = "//a[contains(text(),'Cost')]")
	public List<WebElement> projectTitlesVal;

	/* This is the locator for the emailResultsBtn */
	@FindBy(xpath = "(//*[contains(text(),' Email')])[1]")
	public WebElement emailResultsBtn;

	/* This is the locator for the emailNameTxtbox */
	@FindBy(xpath = "//input[@id='name']")
	public WebElement emailNameTxtbox;

	/* This is the locator for the emailRecipientTxtbox */
	@FindBy(xpath = "//input[@placeholder='Enter multiple email recipients, separated by commas']")
	public WebElement emailRecipientTxtbox;

	/* This is the locator for the emailSubmitBtn */
	@FindBy(xpath = "//button[normalize-space()='Send Email']")
	public WebElement emailSubmitBtn;

	/* This is the locator for the emailSuccessMsg */
	@FindBy(xpath = "//div[contains(text(),'Your email has been sent successfully!')]")
	public WebElement emailSuccessMsg;

	/* This is the locator for the exportBtn */
	@FindBy(xpath = "//button[normalize-space()='Export']")
	public WebElement exportBtn;

	/* This is the locator for the projectMultisheetBtn */
	@FindBy(xpath = "//a[normalize-space()='Projects (Multi-Sheets)']")
	public WebElement projectMultisheetBtn;

	public ICRPSearchDatabasePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}