package AnalysisTools.PLCO.Steps;

import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions chromeOptions = new ChromeOptions();
		System.out.println(chromeOptions.getVersion());
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
//		exploreGWASPage.btnPlusAnthropometricMeasures.click();
//		exploreGWASPage.btnPlusHeight.click();
//		exploreGWASPage.chkHeight.click();	
	}
	
	@When("selects ancestry as east asian all")
	public void selects_ancestry_as_east_asian_all(){
		CommonUtils.selectDropDownValue(exploreGWASPage.selAncestryTop, "east_asian__all");
//     	CommonUtils.selectDropDownValue(exploreGWASPage.selAncestry, "east_asian__all");
		Select select = new Select(exploreGWASPage.selAncestry); 
		select.selectByValue("east_asian__all");
	}
	
	@When("clicks submit")
	public void clicks_submit(){
		exploreGWASPage.subSummaryResults.click();
	}
	
	@Then("Manhattan Plot displays")
	public void Manhattan_Plot_displays(){
		exploreGWASPage.dspManhattanPlot.isDisplayed(); 
		JavascriptUtils.scrollIntoView(exploreGWASPage.dspManhattanPlot);
		CucumberLogUtils.logScreenShot();
	}
	
	
	@When("selects Pairwise Plots")
	public void selects_Pairwise_Plots(){
		exploreGWASPage.chkPairWise.click();
	}
	
	@When("selects top ancestry as east asian all")
	public void selects_top_ancestry_as_east_asian_all() {
		Select select = new Select(exploreGWASPage.selAncestryTop); 
		select.selectByValue("east_asian__all");
		
	}
	
	@When("selects bottom ancestry as european all")
	public void selects_bottom_ancestry_as_european_all() {
		Select select = new Select(exploreGWASPage.selAncestryBottom); 
		select.selectByValue("european__all");
	 
	}
}
