package AnalysisTools.PLCO.Steps;

import java.util.ArrayList;

import com.nci.automation.utils.CucumberLogUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PLCOAboutSteps extends PageInitializer {
	

	
	
	@When("user clicks on About page")
	public void user_clicks_on_About_page() {
		PLCOAboutPage.lnkAbout.click(); 
		ArrayList<String> arrayList = new ArrayList<String>(); 
		arrayList.add("one"); 
		arrayList.add("two"); 
		System.out.println(arrayList);
	}

	
	@When("clicks on Github")
	public void clicks_on_Github() {
		PLCOAboutPage.lnkGitHub.click();
	}
	
	@Then("user goes to source code from About page")
	public void user_goes_to_source_code_from_About_page() {
		CucumberLogUtils.logScreenShot();
	}

}
