package AnalysisTools.PLCO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class InformationPage extends CommonUtils {

	public InformationPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/**** API ACCESS TAB ELEMENTS ***/

	/** API Access Tab **/
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[5]/a")
	public WebElement lnkAPIAcess;

	/** API Access Page Heading **/
	@FindBy(xpath = "//h3[contains(text(), 'API Access')]")
	public WebElement txtAPIAccessHeading;

	/*** ABOUT TAB ELEMENTS ***/

	/** About Page Tab **/
	@FindBy(linkText = "About")
	public WebElement lnkAbout;

	/** About Page Github Link **/
	@FindBy(linkText = "GitHub")
	public WebElement lnkGitHub;

	/*** HOME TAB ELEMENTS ***/

	/** Home Page Github Link **/
	@FindBy(linkText = "source code")
	public WebElement lnkSourceCode;

	/** TABS **/

	/** About Tabs */
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[6]/a")
	public WebElement aboutTab;

	/** Explore GWAS Results **/
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/a")
	public WebElement lnkExploreGwasResults;

}
