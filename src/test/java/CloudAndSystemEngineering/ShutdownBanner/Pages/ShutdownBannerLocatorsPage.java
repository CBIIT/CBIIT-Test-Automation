package CloudAndSystemEngineering.ShutdownBanner.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ShutdownBannerLocatorsPage {

	/* Banner Title Text */
	@FindBy(xpath = "/html/body/section/div/h2")
	public WebElement bannerTitleText;

	/* Banner Body Text */
	@FindBy(xpath = "/html/body/section/div/p")
	public WebElement bannerBodyText;

	/** NATIVE VIEW LINK CONDITION**/
	@FindAll({@FindBy(xpath = "/html/body/section/div/p")})
	public List<WebElement> bannerLinkPresent;

	public ShutdownBannerLocatorsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
