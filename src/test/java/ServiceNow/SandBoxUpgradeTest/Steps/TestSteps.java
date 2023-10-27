package ServiceNow.SandBoxUpgradeTest.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestSteps extends PageInitializer {
    @Given("testing")
    public void testing() {
        // ---- LOGIN SIDE DOOR -------
        WebDriverUtils.webDriver.get("https://service-sandbox.nci.nih.gov/side_door.do");
        Shadow shadow = new Shadow(WebDriverUtils.webDriver);
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("CBIITTestAccount");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("curlbylawdighalvekinlarswould");
        WebDriverUtils.webDriver.findElement(By.xpath("//button[@type='submit']")).click();
        MiscUtils.sleep(10000);
        // ---- MAIN MENU SEARCH -------
        shadow.findElementByXPath("//*[@class='sn-polaris-navigation polaris-header-menu']//child::div[1]").click();
        shadow.findElementByXPath("//*[@class='sn-polaris-nav-header-filter can-animate']//child::input").sendKeys("Emails");
        MiscUtils.sleep(2000);
        shadow.findElementByXPath("//*[@aria-label='Emails']").click();
        // ---- IMPERSONATE USER -------
        shadow.findElementByXPath("//*[@class='now-avatar -sm']").click();
        MiscUtils.sleep(1000);
        shadow.findElementByXPath("//*[@class='user-menu-button impersonateUser keyboard-navigatable polaris-enabled']").click();
        MiscUtils.sleep(1000);
        shadow.findElementByXPath("//*[@class='now-typeahead-native-input']").sendKeys("Roland Owens");
        MiscUtils.sleep(1000);
        shadow.findElementByXPath("//*[@class='now-typeahead-native-input']").sendKeys(Keys.ENTER);
        MiscUtils.sleep(1000);
        shadow.findElementByXPath("//*[@class='now-button -primary -md']").click();
        MiscUtils.sleep(7000);
        // ---- LOG OUT -------
        shadow.findElementByXPath("//*[@class='now-avatar -sm']").click();
        MiscUtils.sleep(1000);
        shadow.findElementByXPath("//*[@class='user-menu-button logout keyboard-navigatable polaris-enabled']").click();
        MiscUtils.sleep(7000);
    }
}