package CloudAndSystemEngineering.ShutdownBanner.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShutdownBannerLocatorsPage {

	/* Banner Title Text */
	@FindBy(xpath = "/html/body/section/div/h2")
	public WebElement bannerTitleText;

	/* Banner Body Text */
	@FindBy(xpath = "/html/body/section/div/p")
	public WebElement bannerBodyText;

	public ShutdownBannerLocatorsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
