package GrantsApps.EM.Steps;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class Managing_User_Accounts_Steps extends PageInitializer {

    @Given("clicks Show Advanced Filters")
    public void clicks_show_advanced_filters() {
        WebDriverUtils.webDriver.findElement(By.xpath("//body/app-root/div/div/div/main/app-search/div/div/div/a[1]")).click();
        MiscUtils.sleep(2000);
    }

    @Given("selects {string} in I2E Account Status drop down list")
    public void selects_in_i2e_account_status_drop_down_list(String text) {

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//ng-select2[@multiple='false']//span//ul")));
        WebDriverUtils.webDriver.findElement(By.xpath("//ng-select2[@multiple='false']//span//ul")).click();
        CommonUtils.selectValueFromBootStrapDropDown(WebDriverUtils.webDriver.findElements(By.xpath("/html/body/span/span/span/ul/li")), text);
        MiscUtils.sleep(2000);
    }

    @Given("searches")
    public void searches() {
        WebDriverUtils.webDriver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Given("clicks Create on the first record in the results")
    public void clicks_create_on_the_first_record_in_the_results() {
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("//tbody/tr[1]/td[8]/app-action-cell-renderer[1]/div[1]/button[1]")));
        JavascriptUtils.clickByJS(WebDriverUtils.webDriver.findElement(By.xpath("//tbody/tr[1]/td[8]/app-action-cell-renderer[1]/div[1]/button[1]")));
    }
}
