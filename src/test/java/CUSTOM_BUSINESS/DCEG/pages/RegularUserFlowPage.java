package CUSTOM_BUSINESS.DCEG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class RegularUserFlowPage extends CommonUtils {
	public RegularUserFlowPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);			
	}
	
	/**View ODRequest*/
	@FindBy(xpath = "(//a[@id='editpub'])[6]")
	public WebElement viewODRequest;
	
	/**add NonNHI Group*/
	@FindBy(xpath = "(//input[@class='authorsListRadio'])[3]")
	public WebElement addNonNHIGroup;
	
	/**add NonNHI Author*/
	@FindBy(xpath = "//input[@id='addNonNihAuthor']")
	public WebElement addNonNHIAuthor;
	
	/**Group Name Field*/
	@FindBy(xpath = "//input[@id='nonNihAuthorGroupName']")
	public WebElement groupNameField;

	/**addGroupButton*/
	@FindBy(xpath = "//input[@id='addGroupButton']")
	public WebElement addGroupButton;

	/**addedNewGroup*/
	@FindBy(xpath = "//td[contains(text(),'NON NHI GROUP')]")
	public WebElement addedNewGroup;
	
	/**non NHIAuthor First Name*/
	@FindBy(xpath = "//input[@id='nonNihAuthorFirstName']")
	public WebElement nonNHIAuthFirstName;
	
	/**non NHIAuthor Last Name*/
	@FindBy(xpath = "//input[@id='nonNihAuthorLastName']")
	public WebElement nonNHIAuthLastName;
	
	/**non NHIAuthor Affiliation*/
	@FindBy(xpath = "//textarea[@id='nonNihAuthorAffiliation0']")
	public WebElement nonNHIAuthAffiliation;
	
	/**Add Author Button*/
	@FindBy(xpath = "//input[@id='addAuthorButton']")
	public WebElement addAuthorButton;
	
	/**addedNew Author*/
	@FindBy(xpath = "//td[contains(text(),'MADIGAN, PATRICIA')]")
	public WebElement addedNewAuthor;
	
	/**Search for Authors*/
	@FindBy(xpath = "//input[@id='searchAuthor']")
	public WebElement searchForAuthors;
	
	/**Madigan P*/
	@FindBy(xpath = "//LI[contains(text(),'MADIGAN, PATRICIA [E] / NCI DCEG TDRP MEB / 9609 MEDICAL CENTER DRIVE 6E580')]")
	public WebElement madiganP;

	/**Madogan Affiliation*/
	@FindBy(xpath = "//li[contains(text(),'METABOLIC EPIDEMIOLOGY BRANCH')]")
	public WebElement affiliationMadigan;
	
	/**PubMed search*/
	@FindBy(xpath = "//input[@id='pubMedId']")
	public WebElement pubMedField;
	
	/**pubMedImportButton**/
	@FindBy(xpath = "//input[@id='pubMedImport']")
	public WebElement pubMedImportButton;
	
	/**pubMedURL**/
	@FindBy(xpath = "//p[@id='pubMedURL']")
	public WebElement pubMedURL;

	/**pubMedURL**/
	@FindBy(xpath = "//td[normalize-space()='MALLAPATY, SMRITI']")
	public WebElement authorMallapaty;
	
	/**pubMedURL**/
	@FindBy(xpath = "//div[@id='btn-action']//input[@value='Reset']")
	public WebElement resetPublication;

	/**Madigan Affiliation*/
	@FindBy(xpath = "//button[contains(text(),'Reset Publication')]")
	public WebElement resetPublAlert;
	
	/**Title Field**/
	@FindBy(xpath = "//input[@id='clearanceRequestForm_clearanceRequest_title']")
	public WebElement titleField;
	
	/** Publication Title Field**/
	@FindBy(xpath = "//input[@id='publicationTitle']")
	public WebElement titleFieldPublication;
	
	/**Cancel button*/
	@FindBy(xpath = "(//input[@id='cancelCR'])[1]")
	public WebElement cancelButton;
	
	/**Cancel button Publication*/
	@FindBy(xpath = "(//input[@id='cancelPublication'])[1]")
	public WebElement cancelButtonPublication;

	/**Requestor MURPHY, GWEN*/
	@FindBy(xpath = "//p[contains(text(),'MURPHY, GWEN')]")
	public WebElement requestorMURPHYGWEN;
	
	/**Requestor VOGTMANN, EMILY*/
	@FindBy(xpath = "//p[contains(text(),'VOGTMANN, EMILY')]")
	public WebElement requestorVOGTMANNEMILY;
	
	/**Requestor BERRINGTON, AMY*/
	@FindBy(xpath = "//p[contains(text(),'BERRINGTON, AMY')]")
	public WebElement requestorBERRINGTONAMY;
	
	/**Requestor COOK, MICHAEL*/
	@FindBy(xpath = "//p[contains(text(),'GREENE, MARK')]")
	public WebElement requestorGREENEMARK;

	/**Back To Publications*/
	@FindBy(xpath = "//input[@value='Back To Publications']")
	public WebElement backToPublications;

}