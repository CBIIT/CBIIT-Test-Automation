package AnalysisTools.CEDCD.Steps;

import java.util.Iterator;
import java.util.Set;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class CEDCDSearchCohortsCohortsURLSteps extends PageInitializer {

	@When("the user clicks Agricultural Health Study")
	public void the_user_clicks_Agricultural_Health_Study() {
		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.AHSURL);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.AHSURL);
	}

	@Then("the Agricultural Health Study icon is shown on the web page")
	public void the_Agricultural_Health_Study_icon_is_shown_on_the_web_page() {
		String parent = WebDriverUtils.webDriver.getWindowHandle();
		Set<String> s = WebDriverUtils.webDriver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				WebDriverUtils.webDriver.switchTo().window(child_window);
				System.out.println(WebDriverUtils.webDriver.switchTo().window(child_window).getTitle());
				WebDriverUtils.webDriver.close();
			}
		}
		WebDriverUtils.webDriver.switchTo().window(parent);
	}
}