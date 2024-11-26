package CustomBusiness.Egrants.Utils;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Egrants_CommonUtils {

    private static final Duration TIMEOUT = Duration.ofSeconds(15);

    /**
     * This method is used to generate a random user id
     * @return
     */
    public static String generateRandomUserId() {
        return "user" + UUID.randomUUID().toString().replace("-", "").substring(0, 8);
    }

    /**
     * This method is used to wait for alert and accept it
     * @param driver
     */
    public static void waitForAlertAndAccept(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (TimeoutException e) {
            System.out.println("ALERT NOT PRESENT");
        }
    }

    /**
     * This method is used to get the current date
     */
    public static String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return currentDate.format(formatter);
    }

    /**
     * Clicks on the specified WebElement using JavaScript.
     *
     * @param element the WebElement to click on
     */
    public static void clickOnElementUsingJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.webDriver;
        js.executeScript("arguments[0].click();", element);
    }
}