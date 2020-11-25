package AnalysisTools.CEDCD.StepsImplementation;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;

import appsCommon.PageInitializer;

public class CEDCDAlphabetizedSelectTypesStepImp extends PageInitializer{
	
	public void alphabetizedComparison() {
		
		ArrayList<String> firstArraylist = new ArrayList<String>();

		for (int i = 0; i < 8; i++) {
			firstArraylist.add(cedcdBiospecimenCountsPage.specimenTypeDropDownValues.get(i).getText());
		}
		ArrayList<String> actualSpecimenTypeValues = new ArrayList<String>();

		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue.getText());
		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownBuffyCoatAndOrLymphocytesValue.getText());
		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownFecesValue.getText());
		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownSalivaAndOrBuccalValue.getText());
		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownSerumAndOrPlasmaValue.getText());
		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownTumorTissueFFPEValue.getText());
		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownTumorTissueFreshFrozenValue.getText());
		actualSpecimenTypeValues.add(cedcdBiospecimenCountsPage.specimenTypeDropDownUrineValue.getText());

		
		Collections.sort(actualSpecimenTypeValues);
		
		System.out.println(firstArraylist);
		System.out.println(actualSpecimenTypeValues);
		
		Assert.assertEquals(firstArraylist, actualSpecimenTypeValues);
		CucumberLogUtils.logScreenShot();
		
	}

}
