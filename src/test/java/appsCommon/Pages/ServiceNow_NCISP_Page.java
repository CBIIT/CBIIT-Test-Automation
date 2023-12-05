package appsCommon.Pages;

import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class ServiceNow_NCISP_Page {

    /** NATIVE LINK **/
    @FindBy(linkText = "Native View")
    public static WebElement nativeViewLink;

    /** NATIVE VIEW LINK CONDITION**/
    @FindAll({@FindBy(linkText = "Native View")})
    public static List<WebElement> allPresentNativeViewLinks;

    public ServiceNow_NCISP_Page(){
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(WebDriverUtils.webDriver));
        PageFactory.initElements(decorator, this);
    }
}
