package AnalysisTools.LDLink.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LDLinkHomeAndLandingPageSteps extends PageInitializer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Printing test line");
	}

}
