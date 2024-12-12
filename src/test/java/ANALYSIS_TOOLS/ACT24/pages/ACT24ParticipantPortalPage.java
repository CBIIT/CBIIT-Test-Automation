package ANALYSIS_TOOLS.ACT24.pages;

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

    /** This is the button for the last page on the Splash Screen **/
    @FindBy(xpath = "//button[contains(text(),'4')]")
    public WebElement splashScreenLastPageButton;

    /** This is the next button on the last page on the Splash Screen **/
    @FindBy(xpath = "(//button[contains(text(),'Next')])[1]")
    public WebElement nextButtonOnSplashScreen;

    /** This is the next button after inputting wakeup time on Splash Screen **/
    @FindBy (xpath = "//input[@id='submitBtn']")
    public WebElement wakeupTimeOnSplashScreenButton;

    /** This is the OK button on the welcome back screen **/
    @FindBy(xpath = "(//input[@value='OK'])[9]")
    public WebElement okOnWelcomeBackPopup;

    public ACT24ParticipantPortalPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
