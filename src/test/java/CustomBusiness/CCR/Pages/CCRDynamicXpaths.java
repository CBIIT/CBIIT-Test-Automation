package CustomBusiness.CCR.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CCRDynamicXpaths extends CommonUtils {
    public CCRDynamicXpaths() {
        PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
    }
    public WebElement openVacancy(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//h2//strong[contains(text(),'" + value + "')]"));
    }
}
