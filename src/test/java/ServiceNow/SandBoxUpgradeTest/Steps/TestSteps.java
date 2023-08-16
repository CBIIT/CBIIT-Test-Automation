package ServiceNow.SandBoxUpgradeTest.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.github.sukgu.Shadow;
import org.openqa.selenium.By;

public class TestSteps extends PageInitializer {
    @Given("testing")
    public void testing() {
        WebDriverUtils.webDriver.get("https://service-sandbox.nci.nih.gov/side_door.do");
        Shadow shadow = new Shadow(WebDriverUtils.webDriver);

        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("CBIITTestAccount");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("curlbylawdighalvekinlarswould");
        WebDriverUtils.webDriver.findElement(By.xpath("//button[@type='submit']")).click();
        shadow.findElementByXPath("//*[@id='sncwsgs-typeahead-input']").sendKeys("1234565");
        MiscUtils.sleep(3000);
    }
}