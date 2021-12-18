package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class MSigPortalHomePage extends CommonUtils{
	
public MSigPortalHomePage(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	/** These are the elements on the home page of the mSigPortal */
	
	/** This is the element for the Signature Visualization tab */
	@FindBy (xpath = "//a[@id='Visualization-navbar']")
	public WebElement signatureVisualizationTab;
	
	/** This is the element for the Signature Explorer tab */
	@FindBy (xpath = "//a[@id='Exploration-navbar']")
	public WebElement signatureExplorerTab;
	
	/** This is the element for the Signature Explorer tab */
	@FindBy (xpath = "(//a[contains(text(),'Catalog')])[1]")
	public WebElement CatalogTab;

}
