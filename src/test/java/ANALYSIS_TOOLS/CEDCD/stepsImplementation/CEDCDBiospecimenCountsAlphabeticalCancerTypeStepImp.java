package ANALYSIS_TOOLS.CEDCD.stepsImplementation;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp extends PageInitializer {

	public void sortCancerTypeAlphabetically() {
		ArrayList<String> cancerTypeDropDown = new ArrayList<String>();
		for (int i = 0; i < cedcdBiospecimenCountsPage.cancerTypeValues.size() - 3; i++) {
			cancerTypeDropDown.add(cedcdBiospecimenCountsPage.cancerTypeValues.get(i).getText());
		}
		ArrayList<String> cancerTypeDropDownSortAlphabetically = new ArrayList<String>();
		for (int i = 0; i < cedcdBiospecimenCountsPage.cancerTypeValues.size() - 3; i++) {
			cancerTypeDropDownSortAlphabetically.add(cedcdBiospecimenCountsPage.cancerTypeValues.get(i).getText());
		}
		Collections.sort(cancerTypeDropDownSortAlphabetically);
		Assert.assertEquals(cancerTypeDropDownSortAlphabetically, cancerTypeDropDown);
		CucumberLogUtils.logScreenshot();
	}
}