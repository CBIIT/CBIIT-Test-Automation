package ServiceNow.SandBoxUpgradeTest.Pages;

import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.support.ElementFieldDecorator;
import io.github.sukgu.support.FindElementBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ShadowPage {

    // USERNAME TEXT BOX
    @FindBy (xpath = "//input[@type='text']")
    public WebElement usernameTextbox;

    // PASSWORD TEXT BOX
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextbox;

    // SUBMIT BUTTON
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindElementBy(css = "div[aria-label='All']")
    public WebElement searchMenu;

    @FindElementBy(xpath = "//*[@class='sn-polaris-nav-header-filter can-animate']//child::input")
    public WebElement searchMenuTextbox;

    @FindElementBy(xpath = "//*[text()='Email Properties'][1]")
    public WebElement emailProperties;
    public  ShadowPage(){
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(WebDriverUtils.webDriver));
        PageFactory.initElements(decorator, this);
    }
}
