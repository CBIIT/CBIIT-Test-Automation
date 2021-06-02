package AnalysisTools.Comets2.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class Comets2Page {
	
public Comets2Page(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	/** This element clicks on the header named Correlate */
	@FindBy (xpath = "//a[contains(text(),'Correlate')]")
	public WebElement correlateTab;
	
	/** This element is the Choose File button on the Correlate tab */
	@FindBy (xpath = "//input[@id='inputDataFile']")
	public WebElement chooseFileButton;
	
	/** This element is the Check Integrity button */
	@FindBy (xpath = "//button[contains(text(),'Check Integrity')]")
	public WebElement checkIntegrityButton;
	
	/** This element is the "Input data has passed QC (metabolite and sample names match in all input files)" success message */
	@FindBy (xpath = "(//div[@class='alert alert-success'])[1]")
	public WebElement inputDataQCSuccessMessage;
	
	/** This element is the "Pre-specified models from the input file" radio button */
	@FindBy (xpath = "//input[@id='methodSelection1']")
	public WebElement prespecifiedModelsRadioButton;
	
	/** This element is the Choose Model drop down */
	@FindBy (xpath = "//select[@name='modelSelection']")
	public WebElement chooseModelDropDown;
	
	/** This element is the "Age.2.1 Gender stratified" value from the Choose Model drop down */
	@FindBy (xpath = "//option[contains(text(),'Age.2.1 Gender stratified')]")
	public WebElement ageGenderStratified;
	
	/** This element is the "Run Model" button to search for results */
	@FindBy (xpath = "//button[contains(text(),'Run Model')]")
	public WebElement runModelButton;
	
	/** This element is the "Correlation analyses successful. 
	 * Please download the file below to the COMETS harmonization group for meta-analysis." success message */
	@FindBy (xpath = "(//div[@id='resultStatus'])[2]")
	public WebElement modelSuccessMessage;
	

}
