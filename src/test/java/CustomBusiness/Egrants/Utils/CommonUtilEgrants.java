package CustomBusiness.Egrants.Utils;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonUtilEgrants {


    public static void scrollIntoElement(WebElement element) {
        try {
            Actions action = new Actions(WebDriverUtils.webDriver);
            action.scrollToElement(element);
            action.perform();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void moveIntoElement(WebElement element) {
        try {
            Actions action = new Actions(WebDriverUtils.webDriver);
            action.moveToElement(element);
            action.perform();
        } catch (Exception e) {
            throw e;
        }
    }

}
