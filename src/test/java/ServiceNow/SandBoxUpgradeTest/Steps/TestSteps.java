package ServiceNow.SandBoxUpgradeTest.Steps;

import ServiceNow.SandBoxUpgradeTest.Pages.ShadowPage;
import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.github.sukgu.Shadow;
import org.openqa.selenium.By;

public class TestSteps extends PageInitializer {

    ShadowPage shadowPage = new ShadowPage();
    Shadow shadow = new Shadow(WebDriverUtils.webDriver);
    @Given("testing")
    public void testing() throws Exception {
        WebDriverUtils.webDriver.get("https://service-sandbox.nci.nih.gov/side_door.do");
        shadowPage.usernameTextbox.sendKeys("CBIITTestAccount");
        shadowPage.passwordTextbox.sendKeys("curlbylawdighalvekinlarswould");
        shadowPage.submitButton.click();
        MiscUtils.sleep(3000);


       // shadowPage.searchMenu.click();

        MiscUtils.sleep(2000);

        //CommonUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("(//*[contains(text(),'Awaiting PI Signature 2023')])[2]")));

        CommonUtils.switchToFrame(shadow.findElementByXPath("//*[@id='gsft_main']"));

        JavascriptUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("//div[@aria-label='Awaiting PI Signature 2023 Widget']//div//div//div//div//div//div[@aria-live='polite']")));
        //shadowPage.searchMenuTextbox.sendKeys("Email Properties");
        MiscUtils.sleep(2000);

        //shadowPage.emailProperties.click();
        //MiscUtils.sleep(2000);
    }
}