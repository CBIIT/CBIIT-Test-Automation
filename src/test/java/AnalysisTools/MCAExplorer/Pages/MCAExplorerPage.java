package AnalysisTools.MCAExplorer.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class MCAExplorerPage extends CommonUtils{
	
	public MCAExplorerPage(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	
	/** Submit Button*/
	@FindBy(xpath = "//*[@id = 'summarySubmit']")
	public WebElement submitButton; 
	
	/** Advance setting button */
	@FindBy(xpath = "//*[text()='Advanced settings']")
	public WebElement advanceSettings; 
	
	/**Summary Circle element*/
	@FindBy(id = "summaryCircle")
	public WebElement summaryCircle;
	
	/** Number of rows on page*/
	@FindBy(xpath = "//div[text()='Showing rows ']")
	public WebElement showingRows;
	
}
