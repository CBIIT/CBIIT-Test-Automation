package AnalysisTools.CEDCD.StepsImplementation;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;

public class CEDCDSearchCohortNewPageLayOutStepImp extends PageInitializer{
	
	public void cohortsSectionComparison() {
		MiscUtils.sleep(2000);
		JavascriptUtils.drawBlueBorder(cedcdSearchCohortsPage.cohortEligibilityRequirementsSection);
		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.cohortEnrollmentSection);
		JavascriptUtils.drawBlueBorder(cedcdSearchCohortsPage.cohortDataAndSpecimenCollectedSection);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(cedcdSearchCohortsPage.cohortEligibilityRequirementsSection.isDisplayed());
		Assert.assertTrue(cedcdSearchCohortsPage.cohortEnrollmentSection.isDisplayed());
		Assert.assertTrue(cedcdSearchCohortsPage.cohortDataAndSpecimenCollectedSection.isDisplayed());
	}
	
}
