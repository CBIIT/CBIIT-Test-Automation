package ServiceNow.SampleTest.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testing extends PageInitializer {

    @Given("test")
    public void test() throws TestingException {

        nativeViewLoginImpl.sideDoorAccountLogin();

        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox("Satya Gugulothu");
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(
                "https://service-test.nci.nih.gov/x/g/records-management/record/x_g_nci_record_mgt_rm_tracking_log/-1");

        WebDriverUtils.webDriver.findElement(By.cssSelector("macroponent-f51912f4c700201072b211d4d8c26010")).click();
        WebDriverUtils.webDriver.findElement(By.cssSelector("seismic-hoist")).click();

        // WebElement shadowHost = WebDriverUtils.webDriver
        // .findElement(By.xpath("//body/*[@component-id='ctzdsvt']"));
        // JavascriptExecutor jsDriver = (JavascriptExecutor) WebDriverUtils.webDriver;

        // WebElement shadowRoot = (WebElement) jsDriver.executeScript("return
        // arguments[0].shadowRoot", shadowHost);
        // WebElement shadowContent =
        // shadowRoot.findElement(By.cssSelector(".now-select-trigger-label"));

        // System.out.println(shadowContent.getText());

    }
}
