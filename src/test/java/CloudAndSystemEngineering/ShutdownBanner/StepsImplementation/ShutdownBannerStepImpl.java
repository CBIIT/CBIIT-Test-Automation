package CloudAndSystemEngineering.ShutdownBanner.StepsImplementation;

import CloudAndSystemEngineering.ShutdownBanner.Constants.ShutdownBannerConstants;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ShutdownBannerStepImpl {
    public static void aUserIsOnTheWebpage() {
        long startTime = System.currentTimeMillis();
        WebDriverUtils.webDriver.get(ShutdownBannerConstants.WEBSITE_URL);
        WebDriverWait wait = new WebDriverWait(WebDriverUtils.webDriver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(shutdownBannerLocatorsPage.bannerBodyText));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(totalTime);
        long seconds = (TimeUnit.MILLISECONDS.toSeconds(totalTime) % 60);
        System.out.println("Total Load time for " + ShutdownBannerConstants.WEBSITE_URL + " is: " + totalTime + " Milliseconds or " + minutes + " minutes and " + seconds + " seconds.");
    }

    public static void theUserShouldSeeTheShutdownBanner() {
        CommonUtils.assertEqualsWithMessage(shutdownBannerLocatorsPage.bannerBodyText.getText(), ShutdownBannerConstants.MESSAGE_BODY_SPANISH, "ASSERTING THE SPANISH BANNER BODY TEXT");
        CommonUtils.assertEqualsWithMessage(shutdownBannerLocatorsPage.bannerTitleText.getText(), ShutdownBannerConstants.MESSAGE_TITLE_SPANISH, "ASSERTING THE SPANISH BANNER TITLE TEXT");
    }


}
