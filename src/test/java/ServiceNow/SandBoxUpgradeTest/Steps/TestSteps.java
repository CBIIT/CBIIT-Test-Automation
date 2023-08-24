package ServiceNow.SandBoxUpgradeTest.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class TestSteps extends PageInitializer {
    @Given("testing")
    public void testing() {
        WebDriverUtils.webDriver.get("https://service-sandbox.nci.nih.gov/side_door.do");
        Shadow shadow = new Shadow(WebDriverUtils.webDriver);

        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("CBIITTestAccount");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("curlbylawdighalvekinlarswould");
        WebDriverUtils.webDriver.findElement(By.xpath("//button[@type='submit']")).click();
        MiscUtils.sleep(3000);
        shadow.findElementByXPath("//*[@class='sn-polaris-navigation polaris-header-menu']//child::div[1]").click();
        shadow.findElementByXPath("//*[@class='sn-polaris-nav-header-filter can-animate']//child::input").sendKeys("Email Properties");
        MiscUtils.sleep(2000);
        shadow.findElementByXPath("//[@aria-label='Email Properties']").click();
        MiscUtils.sleep(2000);
    }
}