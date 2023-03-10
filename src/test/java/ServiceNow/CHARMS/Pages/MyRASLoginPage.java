package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class MyRASLoginPage {
	
	
	/** --------------- BEGINNING OF myRAS Login PAGE   ---------------  */
	
	/* Login To myRAS button */
	@FindBy (xpath = "(//a[@class='link ng-binding'][normalize-space()='login to myras'])[1]")
	public WebElement loginToMyRASButton;
	
	
	/** --------------- END OF myRAS Login PAGE   ---------------  */
	
	
	
	
	
	
	
	public MyRASLoginPage(){	
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
