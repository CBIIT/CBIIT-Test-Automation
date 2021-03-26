package AnalysisTools.CEDCD.Steps;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchCohortsCohortsURLSteps extends PageInitializer {

	/**
	 * The method will highlight the URL in red, take a screenshot and then click
	 * the URL
	 */
	@When("the user clicks Agricultural Health Study")
	public void the_user_clicks_Agricultural_Health_Study() {

		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.AHSURL);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.AHSURL);

	}

	/**
	 * This method will verify that the icon displayed on the web page is the
	 * Agricultural Health Study and take a screenshot
	 */
	@Then("the Agricultural Health Study icon is shown on the web page")
	public void the_Agricultural_Health_Study_icon_is_shown_on_the_web_page() {

		// It will return the parent window name as a String
		String parent = WebDriverUtils.webDriver.getWindowHandle();

		Set<String> s = WebDriverUtils.webDriver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				WebDriverUtils.webDriver.switchTo().window(child_window);

				System.out.println(WebDriverUtils.webDriver.switchTo().window(child_window).getTitle());

				WebDriverUtils.webDriver.close();
			}

		}
		// switch to the parent window
		WebDriverUtils.webDriver.switchTo().window(parent);

	}

	// Assert.assertEquals(expectedAHSText, actualAHSText);;
	// CucumberLogUtils.logScreenShot();

}
