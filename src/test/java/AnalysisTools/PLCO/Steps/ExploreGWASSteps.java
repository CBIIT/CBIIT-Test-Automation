package AnalysisTools.PLCO.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.nci.automation.utils.CucumberLogUtils;
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
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
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
		System.out.println(width+":"+height);
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Actions action = new Actions(WebDriverUtils.webDriver);
		action.moveToElement(exploreGWASPage.dspManhattanPlot).moveByOffset(width/10, height/10).click().build().perform();
		System.out.println("Height of element:"+exploreGWASPage.dspGenePlot.getSize().getHeight());
		while(exploreGWASPage.dspGenePlot.getSize().getHeight()==0) {			
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Height of element:"+exploreGWASPage.dspGenePlot.getSize().getHeight());
			action.clickAndHold(exploreGWASPage.dspManhattanPlot).moveToElement(exploreGWASPage.dspManhattanPlot).moveByOffset(width/10, height/10).release(exploreGWASPage.dspManhattanPlot).build().perform();
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		int hight = 280;//exploreGWASPage.dspGenePlot.getSize().getHeight();
		 width = 500;//exploreGWASPage.dspGenePlot.getSize().getWidth();
		System.out.println("Width Of Gene Plot:"+width);
		System.out.println("Height Of Gene Plot:"+hight);
		//while(!isElementDisplayed()) {
			boolean flag = false;
			for(int i=10;i<hight;i++) {
				for(int j=10;j<width;j++) {
					action.moveToElement(exploreGWASPage.dspGenePlot,j,i).build().perform();
					try {
						Thread.sleep(1500);
					}catch(Exception e) {}
					System.out.println("X-Value: "+j+", Y-Value"+i);
					if(isElementDisplayed()) {
						flag = true;
						break;
					}
					j = j+5;
				}
				if(flag)
					break;
				i = i+5;
			}
			
		//}
		
		JavascriptUtils.scrollIntoView(exploreGWASPage.dspManhattanPlot);
		CucumberLogUtils.logScreenShot();
	}
	public boolean isElementDisplayed() {
		System.out.println(" Waiting for tool tip element");
		boolean flag = false;
		WebDriverUtils.webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			flag = WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(@class, 'tool') and contains(@style, 'block')]/div")).isDisplayed();
		}catch(Exception e) {
			flag = false;
		}
		WebDriverUtils.webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return flag;
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
