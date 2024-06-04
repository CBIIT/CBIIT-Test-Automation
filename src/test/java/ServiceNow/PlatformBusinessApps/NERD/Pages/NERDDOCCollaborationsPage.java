package ServiceNow.PlatformBusinessApps.NERD.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NERDDOCCollaborationsPage {

    /*
     * -------- NERD DOC PLANNING CONTACT COLLABORATIONS PAGE ELEMENTS
     */

    /**
     * Use this method to dynamically locate author text
     * 
     * @param authorText
     * @return
     */
    public static WebElement authorText(String authorText) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(text(),'" + authorText + "')]"));
    }

    public NERDDOCCollaborationsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
