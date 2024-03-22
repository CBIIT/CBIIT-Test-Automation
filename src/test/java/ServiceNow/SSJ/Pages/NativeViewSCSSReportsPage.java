package ServiceNow.SSJ.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewSCSSReportsPage extends CommonUtils {

    public NativeViewSCSSReportsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** Focus Area Reporting Text **/
    @FindBy(xpath = "//div[contains(text(),'Focus Area Reporting')]")
    public WebElement focusAreaReportingText;

    /** Dynamic locator for Native View Reports Text **/
    public WebElement nativeViewReportsText(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(text(),'" + value + "')]"));
    }
}
