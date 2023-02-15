package AnalysisTools.ICRP.StepsImplementation;

import java.util.List;

import org.openqa.selenium.WebElement;

import appsCommon.PageInitializer;

public class ICRPSearchStepImp extends PageInitializer {
	
	
	public void getProjectTtile() {
		List<WebElement> titles = icrpSearchDatabasePage.projectTitles;
	}
	

}
