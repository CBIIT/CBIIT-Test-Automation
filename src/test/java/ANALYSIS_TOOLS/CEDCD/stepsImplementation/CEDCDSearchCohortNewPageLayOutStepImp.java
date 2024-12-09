package ANALYSIS_TOOLS.CEDCD.stepsImplementation;

import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class CEDCDSearchCohortNewPageLayOutStepImp extends PageInitializer {

	public void cohortsSectionComparison() {
		CommonUtils.sleep(2000);
		JavascriptUtils.drawBlueBorder(cedcdSearchCohortsPage.cohortEligibilityRequirementsSection);
		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.cohortEnrollmentSection);
		JavascriptUtils.drawBlueBorder(cedcdSearchCohortsPage.cohortDataAndSpecimenCollectedSection);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(cedcdSearchCohortsPage.cohortEligibilityRequirementsSection.isDisplayed());
		Assert.assertTrue(cedcdSearchCohortsPage.cohortEnrollmentSection.isDisplayed());
		Assert.assertTrue(cedcdSearchCohortsPage.cohortDataAndSpecimenCollectedSection.isDisplayed());
	}
}