package appsCommon;

import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.Shadow;
import io.github.sukgu.support.ElementFieldDecorator;
import io.github.sukgu.support.FindElementBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class NativeView_SideDoor_Dashboard_Page {

    /**
     * THIS CLASS CONTAINS NATIVE VIEW DASHBOARD ELEMENTS
     */
    public static Shadow shadow = new Shadow(WebDriverUtils.webDriver);

    /* ALL TAB */
    @FindElementBy(css = "div[aria-label='All']")
    public static WebElement allTab;

    /* FILTER NAVIGATOR TEXT BOX */
    @FindElementBy(xpath = "//*[@class='sn-polaris-nav-header-filter can-animate']//child::input")
    public static WebElement filterNavigatorTextBox;

    /* iFrame */
    @FindElementBy(xpath = "//*[@id='gsft_main']")
    public static WebElement nativeViewiFrame;

    public static WebElement dynamicFilterNavigatorTextSearch(String text) {
        return shadow.findElementByXPath("//*[text()='" + text + "'][1]");
    }

    public NativeView_SideDoor_Dashboard_Page() {
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(WebDriverUtils.webDriver));
        PageFactory.initElements(decorator, this);
    }
}
