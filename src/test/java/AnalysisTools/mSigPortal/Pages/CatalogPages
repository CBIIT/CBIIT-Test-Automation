package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class CatalogPages {
	public CatalogPages() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}
	
	@FindBy (xpath = "(//div[@title='Activity of activation-induced cytidine deaminase (AID) - SBS84'])[1]")
	public WebElement signaturesSearchIcon;
	
	@FindBy (xpath = "//div[@class = 'react-transform-component TransformComponent-module_container__3NwNd ']")
	public WebElement catalogResultsGraph;
	
	@FindBy (xpath = "//strong[contains(text(),'Signature Name:')]")
	public WebElement catalogSignatureName;

}
