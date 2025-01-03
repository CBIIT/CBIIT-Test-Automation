package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyRASStudyAssentPage {

    /* Yes, I have read and assent to the terms and conditions. Checkbox */
    @FindBy(xpath = "//input[@name='consent_read']")
    public WebElement yesIHaveReadAndAssentToTheTermsAndConditionsCheckbox;

    /* Assent button */
    @FindBy(xpath = "//button[normalize-space()='Assent']")
    public WebElement assentButton;

    /* Yes, I have read and assent to the terms and conditions. Text */
    @FindBy(xpath = "//b[contains(text(),'Yes, I have read and assent to the terms and condi')]")
    public WebElement yesIHaveReadAndAssentToTheTermsAndConditionsText;

    /* Signing Password text box */
    @FindBy(xpath = "//div[@class='form-group']//input[@id='signature_password']")
    public WebElement signaturePasswordTextBox;

    /* Sign button */
    @FindBy(xpath = "//button[@ng-click='c.confirm()']")
    public WebElement signButton;

    /* Your Assent Form has been submitted successfully ! Message */
    @FindBy(xpath = "//div[@ng-show=\"c.data.form == 'assent'\"]")
    public WebElement yourAssentFormHasBeenSubmittedSuccessfullyMessage;

    /* Your Assent Form has been submitted successfully ! OK button */
    @FindBy(xpath = "//button[normalize-space()='OK']")
    public WebElement youAssentFormHasBeenSubmittedOKButton;

    public MyRASStudyAssentPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}