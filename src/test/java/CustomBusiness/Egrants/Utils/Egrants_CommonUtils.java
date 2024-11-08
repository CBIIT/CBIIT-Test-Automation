package CustomBusiness.Egrants.Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
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
}
