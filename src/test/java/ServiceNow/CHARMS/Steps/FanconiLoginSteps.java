package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import ServiceNow.CHARMS.Utils.CharmsUtil;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import static com.nci.automation.web.TestProperties.getFanconiUrl;

public class FanconiLoginSteps extends PageInitializer {
	@Given("a Participant is on the Fanconi Study login page")
	public void a_Participant_is_on_the_Fanconi_Study_login_page() {
		WebDriverUtils.webDriver.get(getFanconiUrl());
	}
	@Given("logs in Fanconi page via Okta with username {string} and password {string}")
	public void logs_in_Fanconi_page_via_Okta_with_username_and_password(String username, String password) {
		CommonUtils.waitForVisibility(fanconiLoginPage.enrollLoginButton1);
		CharmsUtil.clickOnElement(fanconiLoginPage.enrollLoginButton1);
		CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox, username);
		CharmsUtil.clickOnElement(oktaLoginPage.nextButton);
		CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
		CharmsUtil.clickOnElement(oktaLoginPage.verifyBtn);	
		CucumberLogUtils.logScreenshot();
		CommonUtils.waitForVisibility(oktaLoginPage.agreeBtn);
		CharmsUtil.clickOnElement(oktaLoginPage.agreeBtn);
	}
	@Given("clicks the Fanconi Eligibility Questionnaire widget")
	public void clicks_the_Fanconi_Eligibility_Questionnaire_widget() {
		fanconiLoginPage.eligibilityQuestionnaireLink.click();
	}
}