package AnalysisTools.PLCO.Steps;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExploreGWASSteps extends PageInitializer {
	
	@Given("user on PLCO homepage")
	public void user_on_PLCO_homepage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("PLCO"));
	}
	
	@When("user selects explore GWAS")
	public void user_selects_explore_GWAS(){
		exploreGWASPage.lnkExploreGWAS.click();
	}
	
	@When("selects phenotype as BMI at baseline")
	public void selects_phenotype_as_BMI_at_baseline(){
		exploreGWASPage.btnPlusAnthropometricMeasures.click();
		exploreGWASPage.btnPlusBMI.click();
		exploreGWASPage.chkBMIBaseLine.click();
	}
	
	@When("selects ancestry as East Asian All")
	public void selects_ancestry_as_East_Asian_All(){
		CommonUtils.selectDropDownValue(exploreGWASPage.selAncestryTop, "east_asian__all");
	}
	
	@When("clicks submit")
	public void clicks_submit(){
		exploreGWASPage.subSummaryResults.click();
	}
	
	@Then("Manhattan Plot displays")
	public void Manhattan_Plot_displays(){
		exploreGWASPage.dspManhattanPlot.isDisplayed(); 
		int width = exploreGWASPage.dspManhattanPlot.getSize().getWidth();
		int height = exploreGWASPage.dspManhattanPlot.getSize().getHeight();
		Actions action = new Actions(WebDriverUtils.webDriver);
		action.moveToElement(exploreGWASPage.dspManhattanPlot).moveByOffset(width/5, height/5).click().build().perform();
		JavascriptUtils.scrollIntoView(exploreGWASPage.dspManhattanPlot);
		CucumberLogUtils.logScreenShot();
	}
	
	
	@When("selects Pairwise Plots")
	public void selects_Pairwise_Plots(){
		exploreGWASPage.chkPairWise.click();
	}
	
	@When("selects top ancestry as East Asian All")
	public void selects_top_ancestry_as_East_Asian_All() {
		Select select = new Select(exploreGWASPage.selAncestryTop); 
		select.selectByValue("east_asian__all");
		
	}
	
	@When("selects bottom ancestry as European All")
	public void selects_bottom_ancestry_as_European_All() {
		Select select = new Select(exploreGWASPage.selAncestryBottom); 
		select.selectByValue("european__all");
	 
	}
	
	@When("selects ancestry as European Female")
	public void selects_ancestry_as_European_Female() {
		Select select = new Select(exploreGWASPage.selAncestryTop); 
		select.selectByValue("european__female");
	}
	
	@When("clicks submit for results to load")
	public void clicks_submit_for_results_to_load() {
		exploreGWASPage.subSummaryResults.click();
		JavascriptUtils.scrollIntoView(exploreGWASPage.dspManhattanPlot);
		CucumberLogUtils.logScreenShot();
	}
	
	
	
	
	
	
	

}
