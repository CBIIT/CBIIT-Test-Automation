package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RAS_Survey_Native_View_Page {

    /**
     * STORE RAS SURVEY NATIVE VIEW ELEMENTS HERE
     */

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE TABS BY SPECIFYING EXACT TEXT
     * @param text
     * @return
     */
    public WebElement dynamicTabLocator(String text){
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[text()='"+ text +"']"));
    }
    public RAS_Survey_Native_View_Page(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
