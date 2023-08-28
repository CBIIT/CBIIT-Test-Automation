package ServiceNow.CHARMS.Steps;

import java.io.FileNotFoundException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.CHARMS.Pages.FanconiLoginPage;
import ServiceNow.CHARMS.Utils.CharmsUtil;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;

public class FanconiLoginSteps extends PageInitializer {	
	@Given("a Participant is on the Fanconi Study login page")
	public void a_Participant_is_on_the_Fanconi_Study_login_page() 
		throws TestingException, JsonIOException, JsonSyntaxException, FileNotFoundException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("fanconiLogin"));
		MiscUtils.sleep(1000);
	}

	@Given("logs in Fanconi page via Okta with username {string} and password {string}")
	public void logs_in_Fanconi_page_via_Okta_with_username_and_password(String username, String password) {
		//MiscUtils.sleep(500);
		CommonUtils.waitForVisibility(fanconiLoginPage.enrollLoginButton);
		CharmsUtil.clickOnElement(fanconiLoginPage.enrollLoginButton);
		CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox,username);
		CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox,password);
		MiscUtils.sleep(600);
		CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
		CharmsUtil.clickOnElement(oktaLoginPage.loginBtn);
		CommonUtils.waitForVisibility(fanconiLoginPage.warningAgreeButton);
		CharmsUtil.clickOnElement(fanconiLoginPage.warningAgreeButton);	
	}

	@Given("clicks the Fanconi Eligibility Questionnaire widget")
	public void clicks_the_Fanconi_Eligibility_Questionnaire_widget() {
		fanconiLoginPage.eligibilityQuestionnaireLink.click();
	}
}
