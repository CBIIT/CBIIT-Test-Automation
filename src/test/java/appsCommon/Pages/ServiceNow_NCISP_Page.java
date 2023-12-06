package appsCommon.Pages;

import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ServiceNow_NCISP_Page {

    /** NATIVE LINK **/
    @FindBy(linkText = "Native View")
    public static WebElement nativeViewLink;

    public ServiceNow_NCISP_Page(){
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(WebDriverUtils.webDriver));
        PageFactory.initElements(decorator, this);
    }
}
