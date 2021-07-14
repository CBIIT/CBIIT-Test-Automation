package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SignatureExplorerPages extends CommonUtils {

	public SignatureExplorerPages() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}
	
	@FindBy (xpath = "(//strong[contains(text(),'SBS24')])[1]")
	public WebElement calculateOnExplorerTab;
	
	@FindBy (xpath = "(//button[contains(text(),'Download Plot')])[1]")
	public WebElement downloadFirstPlotOnSignatureExplorer;

}
