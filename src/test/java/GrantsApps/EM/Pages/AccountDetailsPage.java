package GrantsApps.EM.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {

    @FindBy(xpath = "(//td//span[contains(text(),'I2E Technical Support')])[1]")
    public WebElement i2eTechSupportRoleDisplayed;

    /** GM ACTION MANAGER ROLE TEXT */
    @FindBy(xpath = "//span[contains(text(),'GM Action Manager')]")
    public WebElement gmActionManagerRoleText;

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

    /** Business Area All Bootstrap drop down **/
    @FindBy(xpath = "//select[@id='businessArea-select']//option[contains(text(),'All')]")
    public WebElement allBADropDown;

    /** Business Area Administrative Drop Down Option */
    @FindBy(xpath = "//select[@id='businessArea-select']//option[contains(text(),'Administrative')]")
    public WebElement administrativeBADropDownOption;

    /** I2E TECHNICAL SUPPORT DROP DOWN OPTION **/
    @FindBy(xpath = "//ul[@class='select2-results__options']//b[contains(text(),'I2E Technical Support')]")
    public WebElement i2ETechSupportDropDownOption;

    /** eGrants ACCESS REPRESENTATIVE ROLE **/
    @FindBy(xpath = "//ul[@class='select2-results__options']//b[contains(text(),'eGrants Access Representative')]")
    public WebElement eGrantsAccessRepresentativeRole;

    /** REMOVE ITEMS I2E DROP DOWN ICON */
    @FindBy(xpath = "(//span[@title='Remove all items'])[2]")
    public WebElement removeItemsIconi2E;

    /** REMOVE ITEMS BUSINESS AREA ICON */
    @FindBy(xpath = "(//span[@title='Remove all items'])[1]")
    public WebElement removeItemsBAIcon;

    public AccountDetailsPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
