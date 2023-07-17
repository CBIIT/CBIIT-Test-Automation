package ServiceNow.COVIDDash.NativeView.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewDashboardPage extends CommonUtils {

    @FindBy(xpath = "//div[@class='col-md-8']//a")
    private WebElement loginLink;

    @FindBy(xpath = "//span[text()='Native View']")
    private WebElement nativeViewLink;

    @FindBy(xpath = "//span[contains(@class,'user-name')]")
    private WebElement userDropDown;

    @FindBy(xpath = "//a[@id='glide_ui_impersonator']")
    private WebElement impersonateUser;

    @FindBy(xpath = "//span[@id='select2-chosen-2']")
    private WebElement impersonateSearchDD;

    @FindBy(xpath = "//a[@id='glide_ui_unimpersonate']")
    public WebElement endImpersonateInSearchDD;

    @FindBy(xpath = "//input[@id='s2id_autogen2_search']")
    private WebElement impersonateSearchBox;

    /**Native View Dashboard Page Search Text Box*/
    @FindBy(xpath = "//input[@id='s2id_autogen2_search']")
    public WebElement impersonateSearchBoxMultipleImpersonator;

    @FindBy(xpath = "//button[@class='btn-icon close icon-cross']")
    private WebElement impersonateWindowCloseBtn;

    public void clickLoginLink() {
        JavascriptUtils.clickByJS(loginLink);
    }

    public void clickCloseImpWindow() {
        JavascriptUtils.clickByJS(impersonateWindowCloseBtn);
    }

    public void clickNativeViewLink() {
        MiscUtils.sleep(1000);
        JavascriptUtils.clickByJS(nativeViewLink);
    }

    public void clickUserDropDown() {
        JavascriptUtils.clickByJS(userDropDown);
    }

    public void clickImpersonateUserLink() {
        JavascriptUtils.clickByJS(impersonateUser);
    }

    public void clickImpersonateSearchDD() {
        impersonateSearchDD.click();
    }

    public void enterTextImpersntSearchBox(String approver) {
        impersonateSearchBox.sendKeys(approver);
        MiscUtils.sleep(1000);
        impersonateSearchBox.sendKeys(Keys.ENTER);
    }

    public void enterTextImpersonateSearchBox(String approver) {
        MiscUtils.sleep(2000);
        impersonateSearchBox.sendKeys(approver);
        CommonUtils.waitForVisibility(
                WebDriverUtils.webDriver.findElement(By.xpath("//div[normalize-space()='Sharon Savage']")));
        impersonateSearchBox.sendKeys(Keys.ENTER);
    }

    /**Native View Dashboard Impersonator Locator By Email */
    public static WebElement dynamicImpersonatorLocatorByEmail(String approverEmail) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[normalize-space()='" + approverEmail + "']//parent::div//parent::li"));
    }

    public String textUserDropDown() {
        return  userDropDown.getText();
    }

    public NativeViewDashboardPage() {PageFactory.initElements(WebDriverUtils.webDriver, this);}

}
