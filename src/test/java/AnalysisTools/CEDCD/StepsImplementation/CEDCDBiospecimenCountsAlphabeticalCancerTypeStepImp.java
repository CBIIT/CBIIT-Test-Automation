package AnalysisTools.CEDCD.StepsImplementation;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;

import appsCommon.PageInitializer;

public class CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp extends PageInitializer {

	public void sortCancerTypeAlphabetically() {

		ArrayList<String> cancerTypeDropDown = new ArrayList<String>();

		for (int i = 0; i < cedcdBiospecimenCountsPage.cancerTypeValues.size() - 1; i++) {

			cancerTypeDropDown.add(cedcdBiospecimenCountsPage.cancerTypeValues.get(i).getText());

		}
		ArrayList<String> cancerTypeDropDownSortAlphabetically = new ArrayList<String>();

		for (int i = 0; i < cedcdBiospecimenCountsPage.cancerTypeValues.size() - 1; i++) {

			cancerTypeDropDownSortAlphabetically.add(cedcdBiospecimenCountsPage.cancerTypeValues.get(i).getText());

		}

		Collections.sort(cancerTypeDropDownSortAlphabetically);
		Assert.assertEquals(cancerTypeDropDownSortAlphabetically, cancerTypeDropDown);
		CucumberLogUtils.logScreenShot();

	}

}
