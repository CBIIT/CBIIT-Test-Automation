package ANALYSIS_TOOLS.MCAExplorer.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class MCAExplorerPage extends CommonUtils {

	public MCAExplorerPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/** PAIRCHECKBOX **/
	@FindBy(id = "paircheck")
	public WebElement pairwise_checkbox;

	/** CHOOSE MORE ATTRIBUTE ***/
	@FindBy(xpath = "//button[@class='accordion-button collapsed']")
	public WebElement choose_more_attribute;

	/** AGE CHECKBOX **/
	@FindBy(xpath = "//label[text()=' Age']")
	public WebElement age_checkbox;

	/** AGE FIRST TEXTBOX **/
	@FindBy(id = "aminAgeCompare")
	public WebElement amInageCompare;

	/** A AGE SECOND TEXTBOX **/
	@FindBy(id = "amaxAgeCompare")
	public WebElement AmaxAgeCompare;

	/** B AGE SECOND TEXTBOX **/
	@FindBy(id = "amaxAgeCompare")
	public WebElement BmaxAgeCompare;

	/** STUDY DROPDOWN **/
	@FindBy(id = "react-select-12-placeholder")
	public WebElement study_drodpown;
	
	/** STUDY DROPDOWN PLCO **/
	@FindBy(xpath = "react-select-12-input")
	public WebElement study_dropdown_plco;
	
	/** GROUP A STUDY DROPDOWN BIOBANK**/
	@FindBy(xpath="react-select-10-option-1")
	public WebElement groupA_Study_biobank;

	/** AGE **/
	@FindBy(id = "AminAgeCompare")
	public WebElement groupA_min_age;

	/** GROUP A MAX AGE **/
	@FindBy(id = "AmaxAgeCompare")
	public WebElement groupA_max_age;

	/** GROUP B MIN AGE **/
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_min_age;

	/** GROUP B MAX AGE **/
	@FindBy(id = "AmaxAgeCompare")
	public WebElement groupB_max_age;

	/** SUBMIT BUTTON */
	@FindBy(xpath = "//*[@id = 'summarySubmit']")
	public WebElement submitButton;

	/** COMPARE SUBMIT */
	@FindBy(xpath = "//*[@id = 'compareSubmit']")
	public WebElement submitButton2;
	
	/** ADVANCE SETTING BUTTON */
	@FindBy(xpath = "//*[text()='Advanced settings']")
	public WebElement advanceSettings;

	/** SUMMARY CIRCLE ELEMENT */
	@FindBy(id = "summaryCircle")
	public WebElement summaryCircle;
	
	/** SUMMARY CIRCLE ELEMENT XPATH */
	public String summaryCircleXpath = "//*[@id='summaryCircle']";
	
	/** COMPARE CIRCLE ELEMENT */
	@FindBy(id = "A")
	public WebElement compareCircle;
	
	/** COMPARE CIRCLE ELEMENT XPATH */
	public String compareCircleXpath = "//*[@id='A']";

	/** POINT ON IMAGE */
	@FindBy(css = ".track-3 > .block:nth-child(1) > .background")
	public WebElement pointOnImage;

	/** ZOOM BUTTON */
	@FindBy(xpath = "(//a[@rel=\"tooltip\"]//*)[7]")
	public WebElement zoomButton;

	/** BREADCRUM */
	@FindBy(xpath = "//button[text()='All chromosomes']")
	public WebElement breadcrum;

	/** CHART HEADER */
	@FindBy(xpath = "//div[text()=' Types: All Event Types; Sex: All Sexes; Study: PLCO; Ancestry: All Ancestries; Approach: All; Smoking: All']")
	public WebElement chartHeader;

	/** NUMBER OF ROWS ON PAGE */
	@FindBy(xpath = "//div[text()='Showing rows ']")
	public WebElement showingRows;

	/** PLOT TYPE DROPDOWN */
	@FindBy(xpath = "//div[@class=' css-1dimb5e-singleValue']/following-sibling::div[1]")
	public WebElement plotDropDown;
	
	/** DROPDOWN LEVELS */
	@FindBy(xpath="//div[text()='Chromosome level']")
	public WebElement plotDropdown_chromosomelevel;
	
	/** PLOT CHROMOSOMES **/
	@FindBy(xpath="(//div[text()='All chromosomes'])[2]")
	public WebElement plotDropdown_allchromosome;
	
	/** CHROMOSOME DROPDOWN **/
	@FindBy(xpath = "//div[contains(@class,'col-lg-6 col-md-12')]")
	public WebElement chart_header_text;
	
	/** CHROMOSOME DROPDOWN **/
	@FindBy(xpath ="//div[@class='d-flex ']//a[1]")
	public WebElement export_data_btn;

	/** CHROMOSOME DROPDOWN **/
	@FindBy(xpath = "//*[text()='Chromosome']/following-sibling::div//input")
	public WebElement chromosomeDropdown;

	/** CLEAR BUTTON IN STUDY DROP DOWN */
	@FindBy(xpath = "(//div[contains(@class,'indicatorContainer')])[2]")
	public WebElement studyClearButton;

	/** CHROMOSOME CHECKBOX X */
	@FindBy(css = "input[name='chrX']")
	public WebElement chromosomeXCheckbox;

	/** CHROMOSOME CHECKBOX Y */
	@FindBy(css = "input[name='chrY']")
	public WebElement chromosomeYCheckbox;
	
	/**STUDY BUTTON**/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[1]")
	public WebElement groupA_Study_dropdown;
	
	/**STUDY DROPDOWN**/
	@FindBy(xpath="(//*[text()='Study']/following-sibling::*//div[contains(@class,'select__option')])[1]")
	public WebElement groupA_Study_dropdown_biobank;

	/** SELECT GROUP A**/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[2]")
	public WebElement groupA_copynumber_dropdown;
	
	/** COPY NUMBER**/
	@FindBy(xpath="(//*[text()='Copy Number State']/following-sibling::*//div[contains(@class,'select__option')])[1]")
	public WebElement groupA_copynum_dropdown_loss;
	
	/** AGE GROUP A **/
	@FindBy(id = "AminAgeCompare")
	public WebElement groupA_age_Start;
	
	/** AGE GROUPA END **/
	@FindBy(id = "AmaxAgeCompare")
	public WebElement groupA_age_End;
	
	/** STUDY DROPDOWN **/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[3]")
	public WebElement groupB_Study_dropdown;

	/**  BIOBANK DROPDOWN **/
	@FindBy(id="react-select-13-option-1")
	public WebElement groupB_Study_dropdown_biobank;
	
	/**  BIOBANK DROPDOWN **/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[4]")
	public WebElement groupB_copynumber_dropdown;
	
	 /** COPY NUMBER DROPDOWN **/
	@FindBy(xpath="(//*[text()='Copy Number State']/following-sibling::*//div[contains(@class,'select__option')])")
	public WebElement groupB_copynum_dropdown_loss;
	
	 /** AGE GROUP B START **/
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_age_Start;
	
	/** AGE GROUP B END **/
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_age_End;
	
	/** DOWNLOAD BUTTON **/
	@FindBy(xpath = "//button[@class='btn btn-link']")
	public WebElement download_comparison_image_btn;
	
	/** GRAPH X CELL */
	@FindBy(css = "g.X")
	public WebElement graphXcell;

	/** GRAPH Y CELL */
	@FindBy(css = "g.Y")
	public WebElement graphYcell;

	/** END RANGE */
	@FindBy(css = "input[name='end']")
	public WebElement endRange;

	/** ALL TABLE ROWS */
	@FindAll(@FindBy(xpath = "//div[contains(@class,'active')]//table//tbody/tr"))
	public List<WebElement> gridAllRows;

	/** PAGE SIZE DROP DOWN VALUE */
	@FindBy(css = "div.active select[name='select-page-size']")
	public WebElement pageSize;
}
