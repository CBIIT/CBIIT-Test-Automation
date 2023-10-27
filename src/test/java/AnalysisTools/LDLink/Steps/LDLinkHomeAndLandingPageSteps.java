package AnalysisTools.LDLink.Steps;

import appsCommon.PageInitializers.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LDLinkHomeAndLandingPageSteps extends PageInitializer {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
    }
}
