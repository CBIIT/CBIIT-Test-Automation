package ServiceNow.SEER.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCustomersPage extends CommonUtils {

    /** --------------- NATIVE VIEW CUSTOMERS PAGE --------------- */

    /**SEER Information Button Customer locator by Last Name*/
    public static WebElement seerCustomerLocatorBylastNameInfoButton(String lastName) {
        return WebDriverUtils.webDriver.findElement (By.xpath( "//a[normalize-space()='" + lastName + "']//parent::td//parent::tr//child::td[2]//child::a"));
    }

    /**SEER Customer Account Type Read Only Field*/
    @FindBy(xpath = "//input[@id='sys_readonly.x_g_nci_seer_data_customer.email_type']")
    public WebElement nativeViewSeerCustomerAccountTypeReadOnlyField;
    public NativeViewCustomersPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
