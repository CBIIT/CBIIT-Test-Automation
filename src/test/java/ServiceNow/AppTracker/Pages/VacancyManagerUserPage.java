package ServiceNow.AppTracker.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class VacancyManagerUserPage extends CommonUtils {
	
	/**Login as NIH Trusted User**/
	@FindBy(xpath = "//*[text()=\"Login with NIH iTrust\"]")
	public WebElement NIHTrustedUserLogin; 	
	
	/**Login dropdown menu on main page**/
	@FindBy(xpath = "//*[text()=\" Login \"]")
	public static WebElement logInMainPage; 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public VacancyManagerUserPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);

}
}