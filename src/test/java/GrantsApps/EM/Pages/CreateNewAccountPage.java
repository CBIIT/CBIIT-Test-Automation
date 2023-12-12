package GrantsApps.EM.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {

    /**
     * Create New Account page title
     */
    @FindBy(xpath = "//main[@data-select2-id='main']//app-create-account//div//div//div//h3")
    public WebElement createNewAccountTitle;

    /**
     * FULL NED NAME
     */
    @FindBy(xpath = "//a[@ngbtooltip='Click to email']")
    public WebElement full_NED_name;

    /**
     * NED NAME TOOLTIP LINK
     */
    @FindBy(xpath = "//label[@for='fundable-score-range']//a")
        public WebElement tooltipNEDnameLink;

    /**
     * NED NAME TOOLTIP TEXT
     */
    @FindBy(xpath = "//*[contains(text(),'Legal Name is always')]")
    public WebElement tooltipNEDnameText;
    public CreateNewAccountPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
