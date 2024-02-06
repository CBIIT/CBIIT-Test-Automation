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
	@FindBy(id = "AminAgeCompare")
	public WebElement AmInageCompare;

	/** Bage first textbox **/
	@FindBy(id = "BminAgeCompare")
	public WebElement BmInageCompare;

	/** A age second textbox **/
	@FindBy(id = "AmaxAgeCompare")
	public WebElement AmaxAgeCompare;

	/** B age second textbox **/
	@FindBy(id = "BmaxAgeCompare")
	public WebElement BmaxAgeCompare;

	/** study dropdown **/
	@FindBy(id = "react-select-12-placeholder")
	public WebElement study_drodpown;

	@FindBy(xpath = "react-select-12-input")
	public WebElement study_dropdown_plco;

	/** age **/
	@FindBy(id = "AminAgeCompare")
	public WebElement groupA_min_age;

	@FindBy(id = "AmaxAgeCompare")
	public WebElement groupA_max_age;

	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_min_age;

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

	// ** Plot Type Dropdown
	@FindBy(xpath = "//div[@class=' css-1dimb5e-singleValue']/following-sibling::div[1]")
	public WebElement plotDropDown;
	
	@FindBy(xpath="//div[text()='Chromosome level']")
	public WebElement plotDropdown_chromosomelevel;
	
	@FindBy(xpath="(//div[text()='All chromosomes'])[2]")
	public WebElement plotDropdown_allchromosome;
	
	@FindBy(xpath = "//div[contains(@class,'col-lg-6 col-md-12')]")
	public WebElement chart_header_text;
	
	
	@FindBy(xpath ="//div[@class='d-flex ']//a[1]")
	public WebElement export_data_btn;

	/** Chromosome dropdown **/
	@FindBy(id = "react-select-10-input") //react-select-10-input
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
	
	@FindBy(xpath="(//div[contains(@class,'select__control select__control--is-focused')])[1]")
	public WebElement groupA_Study_dropdown;
	
	@FindBy(id="react-select-65-option-1")
	public WebElement groupA_Study_dropdown_biobank;
	
	@FindBy(xpath="(//div[contains(@class,'select__value-container select__value-container--is-multi')])[2]")
	public WebElement groupA_copynumber_dropdown;

	
	@FindBy(id="react-select-66-option-2")
	public WebElement groupA_copynum_dropdown_loss;
	
	@FindBy(id = "AminAgeCompare")
	public WebElement groupA_age_Start;
	
	@FindBy(id = "AminAgeCompare")
	public WebElement groupA_age_End;
	
	@FindBy(xpath="(//div[contains(@class,'select__value-container select__value-container--is-multi')])[3]")
	public WebElement groupB_Study_dropdown;

	@FindBy(id="react-select-67-option-1")
	public WebElement groupB_Study_dropdown_biobank;
	
	@FindBy(xpath="(//div[contains(@class,'select__value-container select__value-container--is-multi')])[4]")
	public WebElement groupB_copynumber_dropdown;

	@FindBy(id="react-select-68-option-2")
	public WebElement groupB_copynum_dropdown_loss;
	
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_age_Start;
	
	@FindBy(id = "BminAgeCompare")
	public WebElement groupB_age_End;
	
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
