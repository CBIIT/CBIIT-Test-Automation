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
	
	/** API Acess Tab **/
	@FindBy(xpath = "//*[@href='#/api-access']")
	public WebElement lnkAPIAcess;
	
	/** API Acess Page Heading **/
	@FindBy(xpath = "//h1[contains(text(), 'API Access')]")
	public WebElement txtAPIAcessHeading;
	
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
	
	/** Explore GWAS Results **/
	@FindBy(xpath = "(//*[@href='#/gwas'])[3]")
	public WebElement lnkExploreGwasResults;


}
