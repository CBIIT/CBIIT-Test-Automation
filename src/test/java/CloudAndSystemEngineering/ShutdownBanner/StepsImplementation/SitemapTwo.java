package CloudAndSystemEngineering.ShutdownBanner.StepsImplementation;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class SitemapTwo {

    public static void main(String[] args) {
        WebDriverUtils.webDriver.get("https://candymapper.com/");
        List<WebElement> mainlinks = WebDriverUtils.webDriver.findElements(By.tagName("a"));
        for (WebElement link : mainlinks) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }
    }
}
