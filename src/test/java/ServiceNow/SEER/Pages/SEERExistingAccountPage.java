package ServiceNow.SEER.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class SEERExistingAccountPage {

    /** Header text */
    @FindBy(xpath = "//*[contains(text(),'You Already Have Access')]")
    public WebElement headerText;

    /** Paragraph */
    @FindBy(xpath = "//div[@class='box']/div/p[1]")
    public WebElement paragraph;

    /** PIV Card Login Message Text */
    @FindBy(xpath = "//p[contains(text(),'Requestors associated with HHS agencies should log')]")
    public WebElement pIVCardLoginMessageText;

    /** Back to SEER Database Details button */
    @FindBy(xpath = "//a[@class='button']")
    public WebElement backToSeerDatabaseDetailsButton;

    public SEERExistingAccountPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}