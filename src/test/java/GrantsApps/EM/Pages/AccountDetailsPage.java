package GrantsApps.EM.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {

    @FindBy(xpath = "(//td//span[contains(text(),'I2E Technical Support')])[1]")
    public WebElement i2eTechSupportRoleDisplayed;

    /** ADD ROLE BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Add Role']")
    public WebElement addRole;

    /** I2E ROLE DROP DOWN */
    @FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-role-modal[1]/form[1]/div[1]/div[1]/div[2]/app-i2e-role-dropdown[1]/div[1]/ng-select2[1]/span[1]/span[1]/span[1]")
    public WebElement I2ERoleDropDown;

    /** I2E TECHNICAL SUPPORT DROP DOWN */
    @FindBy(xpath = "//li[@class='select2-results__option']//b[text()='I2E Technical Support']")
    public WebElement technicalSupportRole;

    /** DUPLICATE ROLE WARNING MESSAGE */
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-add-role-modal/form/div/div[1]")
    public WebElement duplicateRoleWarningMessage;

    /** ADD ROLE MODAL DIALOG CLOSE 'x' **/
    @FindBy(xpath = "//div//button//span[@aria-hidden='true'][normalize-space()='×']")
    public WebElement addRoleModalClose;

    /** SAVE CHANGES BUTTON */
    @FindBy(xpath = "//span//button[contains(text(),' Save Changes ')]")
    public WebElement saveChangesButton;


    public AccountDetailsPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
