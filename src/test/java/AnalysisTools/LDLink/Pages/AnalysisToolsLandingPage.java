package AnalysisTools.LDLink.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class AnalysisToolsLandingPage extends CommonUtils {

    /* LDlink text on Analysis Tools Landing Page */
    @FindBy(xpath = "//a[contains(text(),'LDLink')]")
    public WebElement ldLinkTextOnLandingPage;

    /* LDLink description text on Analysis Tools Landing Page */
    @FindBy(xpath = "/html/body/main/div/div[25]/h3/following-sibling::div")
    public WebElement ldLinkDescriptionTextOnLandingPage;

    /* THIS IS THE SCREEN TEXT ON LDLINK SECURITY PAGE THAT DISPLAYS UNTIL VULNERABILITY IS FIXED */
    @FindBy(xpath = "//h1[contains(text(),'Your connection is not private')]")
    public WebElement securityScreenConnectionIsNotPrivateText;

    /* THIS IS THE SECURITY SCREEN THAT DISPLAYS FOR VULNERABILITY ISSUES -- WILL BE CHANGED LATER */
    @FindBy(xpath = "//button[contains(text(),'Advanced')]")
    public WebElement securityScreenAdvancedButton;

    /* This is the proceed link on security vulnerability page that directs to the correct LDLink page */
    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement securityScreenProceedLink;
    public AnalysisToolsLandingPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}