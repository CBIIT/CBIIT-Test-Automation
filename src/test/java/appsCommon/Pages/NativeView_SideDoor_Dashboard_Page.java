package appsCommon.Pages;

import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.Shadow;
import io.github.sukgu.support.ElementFieldDecorator;
import io.github.sukgu.support.FindElementBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

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
    /* PIN */
    @FindElementBy(xpath = "//*[@class='sn-polaris-nav-header-controls pin']//child::button")
    public static WebElement sideMenuPin;
    /* iFrame */
    @FindElementBy(xpath = "//*[@id='gsft_main']")
    public static WebElement nativeViewiFrame;
    /* PROFILE BUTTON */
    @FindElementBy(xpath = "//div[@class='header-avatar-button contextual-zone-button user-menu']")
    public static WebElement profileButton;
    /* IMPERSONATE USER BUTTON */
    @FindElementBy(xpath = "//button[contains(text(),'Impersonate user')]")
    public static WebElement impersonateUserButton;
    /* IMPERSONATE ANOTHER USER BUTTON */
    @FindElementBy(xpath = "//button[contains(text(),'Impersonate another user')]")
    public static WebElement impersonateAnotherUserButton;
    /* IMPERSONATE USER SEARCH TEXT BOX */
    @FindElementBy(xpath = "//input[@class='now-typeahead-native-input']")
    public static WebElement impersonateSearchTextBox;
    /* IMPERSONATE USER SEARCH FIRST VALUE */
    @FindElementBy(xpath = "//div[@class='now-dropdown-list']//child::div[1]//child::div[1]")
    public static WebElement impersonateSearchFirstValue;
    /* IMPERSONATE WINDOW USER BUTTON */
    @FindElementBy(xpath = "//div[@class='now-modal-footer']/now-button[2]")
    public static WebElement impersonateUserWindowButton;

    /* ASSETS MENU BUTTON */
    @FindElementBy(xpath = "//*[text()='Assets'][1]")
    public static WebElement assetsMenuButton;
    /**
     * USE THIS METHOD TO SEARCH ANY TEXT USING THE NATIVE VIEW FILTER NAVIGATOR
     *
     * @param text
     * @return
     */
    public static List<WebElement> dynamicFilterNavigatorTextSearch(String text) {
        return shadow.findElementsByXPath("//*[text()='" + text + "'][1]");
    }
    public NativeView_SideDoor_Dashboard_Page() {
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(WebDriverUtils.webDriver));
        PageFactory.initElements(decorator, this);
    }
}