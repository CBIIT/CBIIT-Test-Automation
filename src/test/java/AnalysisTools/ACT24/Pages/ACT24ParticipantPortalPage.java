package AnalysisTools.ACT24.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACT24ParticipantPortalPage extends CommonUtils {

    /** This is the ACT24 Participant site welcome text **/
    @FindBy(xpath = "//h3[contains(text(),'Welcome to ACT24')]")
    public WebElement act24WelcomeText;

    /** This is the splash screen for the ACT24 participant site **/
    @FindBy(xpath = "//div[contains(text(),'Please review this guide to using ACT24')]")
    public WebElement splashScreenText;

    public ACT24ParticipantPortalPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
