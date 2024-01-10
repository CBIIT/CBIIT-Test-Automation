package AnalysisTools.PLCO.Steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
<<<<<<< HEAD
import org.testng.Assert;
=======
>>>>>>> 1f082a8263f81d9e192c053b5c975c4db2fbce07
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
<<<<<<< HEAD
import appsCommon.PageInitializer;
=======
import appsCommon.PageInitializers.PageInitializer;
>>>>>>> 1f082a8263f81d9e192c053b5c975c4db2fbce07
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExploreGWASSteps extends PageInitializer {

	@Given("user on PLCO homepage")
	public void user_on_PLCO_homepage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("PLCO"));
	}

	@When("user selects explore GWAS")
	public void user_selects_explore_GWAS() {
		exploreGWASPage.lnkExploreGWAS.click();
	}

	@When("selects phenotype as BMI at baseline")
	public void selects_phenotype_as_BMI_at_baseline() throws InterruptedException {
		Thread.sleep(1000);
		exploreGWASPage.btnPlusAnthropometricMeasures.click();
		Thread.sleep(1000);
		exploreGWASPage.btnBMI.click();
		Thread.sleep(1000);
	}

	@When("selects ancestry as East Asian All")
	public void selects_ancestry_as_East_Asian_All() {
		CommonUtils.selectDropDownValue(exploreGWASPage.selAncestryTop, "east_asian__all");
		Select select = new Select(exploreGWASPage.selAncestry);
		select.selectByValue("east_asian__all");
	}

	@When("clicks submit")
	public void clicks_submit() {
		exploreGWASPage.subSummaryResults.click();
	}

	@Then("Manhattan Plot displays")
	public void Manhattan_Plot_displays() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		exploreGWASPage.dspManhattanPlot.isDisplayed();
		JavascriptUtils.scrollIntoView(exploreGWASPage.dspManhattanPlot);
		CucumberLogUtils.logScreenshot();
	}

	public boolean isElementDisplayed() {
		System.out.println(" Waiting for tool tip element");
		boolean flag = false;
		WebDriverUtils.webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			flag = WebDriverUtils.webDriver
					.findElement(By.xpath("//div[contains(@class, 'tool') and contains(@style, 'block')]/div"))
					.isDisplayed();
		} catch (Exception e) {
			flag = false;
		}
		WebDriverUtils.webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return flag;
	}

	@When("selects Pairwise Plots")
	public void selects_Pairwise_Plots() {
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
		CucumberLogUtils.logScreenshot();
	}

	@When("selects variant lookup tab")
	public void selects_variant_lookup_tab() {
		MiscUtils.sleep(2000);
		exploreGWASPage.lnkVariantLookUp.click();
	}

	@When("writes variant as {string}")
	public void writes_variant_as(String variant) {
		exploreGWASPage.actVariantTextBox.sendKeys(variant);
	}

	@When("selects phenotype as BMI at baseline for variant lookup")
	public void selects_phenotype_as_BMI_at_baseline_for_variant_lookup() {
		exploreGWASPage.btnPlusAnthropometricMeasures.click();
		exploreGWASPage.btnBMI.click();
	}

	@When("selects ancestry as European for variant lookup")
	public void selects_ancestry_as_European_for_variant_lookup() {
		CommonUtils.selectDropDownValue(exploreGWASPage.selAncestryVariantLookup, "european");
	}

	@When("selects sex as all for variant lookup")
	public void selects_sex_as_all_for_variant_lookup() {
		CommonUtils.selectDropDownValue(exploreGWASPage.selSexVariantLookup, "all");
	}

	@Then("results table displays")
	public void results_table_displays() {
		JavascriptUtils.scrollIntoView(exploreGWASPage.dspVariantLookupResults);
		Assert.assertTrue(exploreGWASPage.dspVariantLookupResults.isDisplayed());
	}

	@When("selects Phenotype Correlations tab")
	public void selects_Phenotype_Correlations_tab() {
		exploreGWASPage.lnkPhenotypeCorrelationsTab.click();
	}

	@When("selects phenotype as BMI at baseline for phenotype correlation")
	public void selects_phenotype_as_BMI_at_baseline_for_phenotype_correlation() {
		exploreGWASPage.btnPlusAnthropometricMeasures.click();
		exploreGWASPage.btnBMI.click();
	}

	@When("selects phenotype as height BQ for phenotype correlation")
	public void selects_phenotype_as_height_BQ_for_phenotype_correlation() {
		exploreGWASPage.chkHeightPhenotypeCorrelation.click();
	}
}