package ServiceNow.PlatformBusinessApps.NERD.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NERDCRSTOtherAccomplishmentsPage extends CommonUtils {

    /** NERD Other Accomplishments Dynamic Locator */
    public static WebElement otherAccomplishmentsFieldName(String otherAccomplishmentsField) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//h4[contains(text(),'" + otherAccomplishmentsField + "')]"));
    }

    public NERDCRSTOtherAccomplishmentsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
