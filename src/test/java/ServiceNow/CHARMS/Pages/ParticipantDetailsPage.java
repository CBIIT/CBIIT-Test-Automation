package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ParticipantDetailsPage {

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE RECORD BUTTONS ON
     * @param text
     * @return
     */
    public WebElement dynamicRecordButtonLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//td[contains(text(),'" + text + "')]//ancestor::td/div/table/tbody/tr/td)[2]"));
    }

    public ParticipantDetailsPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
