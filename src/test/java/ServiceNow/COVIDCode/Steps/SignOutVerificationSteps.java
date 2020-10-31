package ServiceNow.COVIDCode.Steps;

import org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.PogoCachedMethodSiteNoUnwrapNoCoerce;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignOutVerificationSteps extends PageInitializer{
	
	@Given("an internal user is logged into the COVIDcode application")
	public void an_internal_user_is_logged_into_the_COVIDcode_application() throws TestingException {
		WebDriverUtils.webDriver.get("https://service.cancer.gov/ncisp?id=nci_home");
		JavascriptUtils.clickByJS(signOutVerificationPage.ncipLogInBtn);
		MiscUtils.sleep(1000);
		iTrustloginPage.enterUsername();
		iTrustloginPage.enterPassword();
		iTrustloginPage.clickSignInButton();
	}

	@Given("is on the home page")
	public void is_on_the_home_page() {
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		
	}

	@Then("the internal user is able to sign out of the application by clicking on the {string} button")
	public void the_internal_user_is_able_to_sign_out_of_the_application_by_clicking_on_the_button(String logOut) {
		signOutVerificationPage.profileDropdown.click();
		signOutVerificationPage.logOutBtn.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		
	}

}
