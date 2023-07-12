package ServiceNow.NERD.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewMembersOfCongressPage extends CommonUtils {

    /** --------------- NATIVE VIEW MEMBERS OF CONGRESS PAGE --------------- */

    /**NativeView Members of Congress */
    @FindBy(xpath = "//*[@id='c09ae5e61bc17c14e541631ee54bcb74']/div/div")
    public WebElement nativeViewMembersOfCongressButton;

    /**Native View Members of Congress Dropdown Menu*/
    @FindBy(xpath = "//*[@id='list_nav_x_26385_crs_kd_member_of_congress']/div/div[1]/h1/a")
    public WebElement membersOfCongressMenu;

    /**Native View Members of Congress Filter Icon*/
    @FindBy(xpath = "//*[@id='x_26385_crs_kd_member_of_congress_filter_toggle_image']")
    public WebElement membersOfCongressFilterIcon;

    /**Native View Members of Congress Active Field*/
    @FindBy(xpath = "//*[@id='x_26385_crs_kd_member_of_congressgcond_filters']/tr/td//child::table[1]//child::tbody//child::tr[3]//child::td//child::table[1]//child::tbody//child::tr/child::td[2]//child::div[1]//child::a//child::span[1]")
    public WebElement membersOfCongressActiveFiled;

    /**Native View Members of Congress Active Text Field*/
    @FindBy(xpath = "//*[@id='select2-drop']/div//child::input")
    public WebElement membersOfCongressActiveTextFiled;

    /**Native View Members of Congress Run Button*/
    @FindBy(xpath = "//*[@id='test_filter_action_toolbar_run']")
    public WebElement membersOfCongressRunButton;

    /**Native View Members of Congress Next Page Button*/
    @FindBy(xpath = "//*[@id='x_26385_crs_kd_member_of_congress_expanded']/div[5]/div[1]/table//child::tbody//child::tr//child::td[2]//child::span[1]//child::button[3]")
    public WebElement membersOfCongresNextPageButton;

    /** Native View Congress Person First Name */
    public static WebElement nativeViewCongressPersonFirstName(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='x_26385_crs_kd_member_of_congress_table']//child::tbody//child::tr[" + value + "]//child::td[4]"));
    }

    /** Native View Congress Person Last Name */
    public static WebElement nativeViewCongressPersonLastName(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='x_26385_crs_kd_member_of_congress_table']//child::tbody//child::tr[" + value + "]//child::td[5]"));
    }

    public NativeViewMembersOfCongressPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}