package AnalysisTools.MCAExplorer.Pages;

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

	/** paircheckbox **/
	@FindBy(id = "paircheck")
	public WebElement pairwise_checkbox;

	/** choose more attribute ***/
	@FindBy(xpath = "//button[@class='accordion-button collapsed']")
	public WebElement choose_more_attribute;

	/** age checkbox **/
	@FindBy(xpath = "//label[text()=' Age']")
	public WebElement age_checkbox;

	/** age first textbox **/
	@FindBy(id = "aminAgeCompare")
	public WebElement amInageCompare;

	/** A age second textbox **/
	@FindBy(id = "amaxAgeCompare")
	public WebElement AmaxAgeCompare;

	/** B age second textbox **/
	@FindBy(id = "amaxAgeCompare")
	public WebElement BmaxAgeCompare;

	/** STUDY DROPDOWN **/
	@FindBy(id = "react-select-12-placeholder")
	public WebElement study_drodpown;
	
	/** STUDY DROPDOWN PLCO **/
	@FindBy(xpath = "react-select-12-input")
	public WebElement study_dropdown_plco;
	
	/** group A study dropdown BioBank**/
	@FindBy(xpath="react-select-10-option-1")
	public WebElement groupA_Study_biobank;

	/** age **/
	@FindBy(id = "AminAgeCompare")
	public WebElement groupA_min_age;

	/** group a max age **/
	@FindBy(id = "AmaxAgeCompare")
	public WebElement groupA_max_age;

	/** group b min age **/
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_min_age;

	/** group b max age **/
	@FindBy(id = "AmaxAgeCompare")
	public WebElement groupB_max_age;

	/** Submit Button */
	@FindBy(xpath = "//*[@id = 'summarySubmit']")
	public WebElement submitButton;

	/** Compare submit */
	@FindBy(xpath = "//*[@id = 'compareSubmit']")
	public WebElement submitButton2;
	
	/** Advance setting button */
	@FindBy(xpath = "//*[text()='Advanced settings']")
	public WebElement advanceSettings;

	/** Summary Circle element */
	@FindBy(id = "summaryCircle")
	public WebElement summaryCircle;
	
	/** Compare Circle element */
	@FindBy(id = "A")
	public WebElement compareCircle;

	/** Point on Image */
	@FindBy(css = ".track-3 > .block:nth-child(1) > .background")
	public WebElement pointOnImage;

	/** Zoom Button */
	@FindBy(xpath = "(//a[@rel=\"tooltip\"]//*)[7]")
	public WebElement zoomButton;

	/** Breadcrum */
	@FindBy(xpath = "//button[text()='All chromosomes ←']")
	public WebElement breadcrum;

	/** Chart Header */
	@FindBy(xpath = "//div[text()=' Types: All Event Types; Sex: All Sexes; Study: PLCO; Ancestry: All Ancestries; Approach: All; Smoking: All']")
	public WebElement chartHeader;

	/** Number of rows on page */
	@FindBy(xpath = "//div[text()='Showing rows ']")
	public WebElement showingRows;

	/** Plot Type Dropdown */
	@FindBy(xpath = "//div[@class=' css-1dimb5e-singleValue']/following-sibling::div[1]")
	public WebElement plotDropDown;
	
	/** Dropdown levels */
	@FindBy(xpath="//div[text()='Chromosome level']")
	public WebElement plotDropdown_chromosomelevel;
	
	/** plot chromosomes **/
	@FindBy(xpath="(//div[text()='All chromosomes'])[2]")
	public WebElement plotDropdown_allchromosome;
	
	/** Chromosome dropdown **/
	@FindBy(xpath = "//div[contains(@class,'col-lg-6 col-md-12')]")
	public WebElement chart_header_text;
	
	/** Chromosome dropdown **/
	@FindBy(xpath ="//div[@class='d-flex ']//a[1]")
	public WebElement export_data_btn;

	/** Chromosome dropdown **/
	@FindBy(xpath = "//*[text()='Chromosome']/following-sibling::div//input")
	public WebElement chromosomeDropdown;

	/** Clear button in Study drop down */
	@FindBy(xpath = "(//div[contains(@class,'indicatorContainer')])[2]")
	public WebElement studyClearButton;

	/** Chromosome checkbox X */
	@FindBy(css = "input[name='chrX']")
	public WebElement chromosomeXCheckbox;

	/** Chromosome checkbox Y */
	@FindBy(css = "input[name='chrY']")
	public WebElement chromosomeYCheckbox;
	
	/**study button**/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[1]")
	public WebElement groupA_Study_dropdown;
	
	/**study dropdown**/
	@FindBy(xpath="(//*[text()='Study']/following-sibling::*//div[contains(@class,'select__option')])[1]")
	public WebElement groupA_Study_dropdown_biobank;

	/** select group A**/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[2]")
	public WebElement groupA_copynumber_dropdown;
	
	/** copy number**/
	@FindBy(xpath="(//*[text()='Copy Number State']/following-sibling::*//div[contains(@class,'select__option')])[1]")
	public WebElement groupA_copynum_dropdown_loss;
	
	/** age group a **/
	@FindBy(id = "AminAgeCompare")
	public WebElement groupA_age_Start;
	
	/** age groupa end **/
	@FindBy(id = "AmaxAgeCompare")
	public WebElement groupA_age_End;
	
	/** study dropdown **/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[3]")
	public WebElement groupB_Study_dropdown;

	/**  biobank dropdown **/
	@FindBy(id="react-select-13-option-1")
	public WebElement groupB_Study_dropdown_biobank;
	
	/**  biobank dropdown **/
	@FindBy(xpath="(//div[contains(@class,'select__indicator select__dropdown-indicator')])[4]")
	public WebElement groupB_copynumber_dropdown;
	
	 /** copy number dropdown **/
	@FindBy(xpath="(//*[text()='Copy Number State']/following-sibling::*//div[contains(@class,'select__option')])")
	public WebElement groupB_copynum_dropdown_loss;
	
	 /** age group b start **/
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_age_Start;
	
	/** age group b end **/
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_age_End;
	
	/** download button **/
	@FindBy(xpath = "//button[@class='btn btn-link']")
	public WebElement download_comparison_image_btn;
	
	/** Graph X cell */
	@FindBy(css = "g.X")
	public WebElement graphXcell;

	/** Graph Y cell */
	@FindBy(css = "g.Y")
	public WebElement graphYcell;

	/** End Range */
	@FindBy(css = "input[name='end']")
	public WebElement endRange;

	/** All table rows */
	@FindAll(@FindBy(xpath = "//div[contains(@class,'active')]//table//tbody/tr"))
	public List<WebElement> gridAllRows;

	/** page size drop down value */
	@FindBy(css = "div.active select[name='select-page-size']")
	public WebElement pageSize;
}
