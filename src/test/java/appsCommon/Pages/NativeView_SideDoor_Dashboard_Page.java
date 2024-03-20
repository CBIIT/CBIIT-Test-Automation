package appsCommon.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.Shadow;
import io.github.sukgu.support.ElementFieldDecorator;
import io.github.sukgu.support.FindElementBy;

/*THIS CLASS CONTAINS NATIVE VIEW DASHBOARD ELEMENTS*/
public class NativeView_SideDoor_Dashboard_Page {   
    public static Shadow shadow = new Shadow(WebDriverUtils.webDriver); 
    /* ALL TAB */
    @FindElementBy(css = "div[aria-label='All']")
    public static WebElement allTab;
  
    /* FILTER NAVIGATOR TEXT BOX */
    @FindElementBy(xpath = "//*[@class='sn-polaris-nav-header-filter can-animate']//child::input")
    public static WebElement filterNavigatorTextBox;
 
    /* FILTER NAVIGATOR TEXT BOX */
    @FindBy(css = ".super-filter-header.all-results-toggle.no-interaction")
    public static WebElement filterNavigatorResultsTextBox;
   
    /* PIN */
    @FindElementBy(xpath = "//*[@class='sn-polaris-nav-header-controls pin']//child::button")
    public static WebElement sideMenuPin;
 
    /* iFrame */
    @FindElementBy(css = "iframe[title='Main Content']")
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
  
    /* IMPERSONATE USER SEARCH FIRST VALUE  */
    @FindElementBy(xpath = "//div[@class='now-dropdown-list']//child::div[1]//child::div[1]")
    public static WebElement impersonateSearchFirstValue;
   
    /* IMPERSONATE WINDOW USER BUTTON  */
    @FindElementBy(xpath = "//div[@class='now-modal-footer']/now-button[2]")
    public static WebElement impersonateUserWindowButton;

    /* NV POP UP CANCEL BUTTON  */
    @FindElementBy(xpath = "//div[@class='now-button -primary -md']")
    public static WebElement NVPopUpDiscardCancelButton;

    /* FILTER NAVIGATION EMAILS BUTTON  */
    @FindElementBy(xpath = "//div[@class='sn-polaris-nav-body']/sn-collapsible-list[2]")
    public static WebElement filterNavigationEmailsButton;

    /* FILTER NAVIGATION NOTIFICATIONS BUTTON  */
    @FindElementBy(xpath = "//div[@class='sn-polaris-nav-body']/sn-collapsible-list[2]/div/div/ul/li[2]/span")
    public static WebElement filterNavigationNotificationButton;

    /* FILTER NAVIGATION MEMBERS OF CONGRESS */
    @FindElementBy(xpath = "//span[@class='menu-item-row highlighted-menu-item-row']")
    public static WebElement filterNavigationMembersOfCongress;

    /* ASSETS MENU BUTTON */
    @FindElementBy(xpath = "//*[text()='Assets'][1]")
    public static WebElement assetsMenuButton;
    
	/* NV: FHQ Patients Menu Link In NV Navigator */
	@FindBy(css = "a[class='nested-item item-label keyboard-navigatable highlighted-item']")
	public static  WebElement nVFHQFilterMatchLink;
	
    /* USE THIS METHOD TO SEARCH ANY TEXT USING THE NATIVE VIEW FILTER NAVIGATOR @param text @return */
    public static WebElement dynamicFilterNavigatorTextSearch(String text) {
        return shadow.findElementByXPath("//*[text()='" + text + "'][1]");
    }    
    public NativeView_SideDoor_Dashboard_Page() {
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(WebDriverUtils.webDriver));
        PageFactory.initElements(decorator, this);
    }
}