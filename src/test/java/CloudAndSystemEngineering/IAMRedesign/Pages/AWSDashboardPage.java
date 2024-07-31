package CloudAndSystemEngineering.IAMRedesign.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AWSDashboardPage {

    /* AWS Cloud One Identity Center Button */
    @FindBy(xpath = "//a[@aria-label='launch app Cloud One Identity Center']")
    public WebElement aWSCloudOneIdentityCenterButton;

    /* First account number text */
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/main/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div/button/div/div[2]/div")
    public WebElement firstAccountNumberText;

    /* First account number text */
    @FindBy(xpath = "//div[@data-testid='account-list']//div[1]//div[1]//button[1]")
    public WebElement firstAccountNummerButton;

    /* All account numbers Names */
    @FindAll({@FindBy(xpath = "//div[@data-testid='account-list']/div/div/button/div/div[2]/div")})
    public List<WebElement> allaccountNumbers;

    public AWSDashboardPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
