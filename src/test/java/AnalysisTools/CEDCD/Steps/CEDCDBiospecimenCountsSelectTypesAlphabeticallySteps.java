package AnalysisTools.CEDCD.Steps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDBiospecimenCountsSelectTypesAlphabeticallySteps extends PageInitializer {

	ArrayList<WebElement> arrayListOne;

	@When("the user clicks on the Specimen Types drop down")
	public void the_user_clicks_on_the_Specimen_Types_drop_down() {

		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.specimenType);

	}

	@Then("the alphabetized Specimen Types are displayed")
	public void the_alphabetized_Specimen_Types_are_displayed() throws InterruptedException {
		
		ArrayList<String> firstArraylist = new ArrayList<String>();
		
		for(int i = 0; i < 8; i++) {
			firstArraylist.add(cedcdBiospecimenCountsPage.specimenTypeDropDownValues.get(i).getText()); 
		}
		
		System.out.println(firstArraylist);
		
		Collections.sort(firstArraylist);
		
		
//		Assert.assertEquals();
		

//		ArrayList<String> arrayListOne = new ArrayList<String>();
//		Thread.sleep(1000);
//		for (int i = 0; i < 1; i++) {
//			Thread.sleep(1000);
//
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue.getText());
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownBuffyCoatAndOrLymphocytesValue.getText());
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownFecesValue.getText());
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownSalivaAndOrBuccalValue.getText());
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownSerumAndOrPlasmaValue.getText());
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownTumorTissueFFPEValue.getText());
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownTumorTissueFreshFrozenValue.getText());
//			arrayListOne.add(i, cedcdBiospecimenCountsPage.specimenTypeDropDownUrineValue.getText());
//			
//			
//			
//			
//			
//			
//			
//			System.out.println(arrayListOne);
//			break;

//		}
//		Collections.sort(arrayListOne);
//		for (String sortedList : arrayListOne) {
//			System.out.print("[");
//			System.out.print(sortedList);
//			System.out.print(", ");
//			System.out.print("]");

//			Assert.assertEquals(sortedList, arrayListOne);
		//}
//		Assert.assertEquals("All Types", arrayListOne.get(0));

//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue.getText());
//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownBuffyCoatAndOrLymphocytesValue.getText());
//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownFecesValue.getText());
//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownSalivaAndOrBuccalValue.getText());
//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownSerumAndOrPlasmaValue.getText());
//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownTumorTissueFFPEValue.getText());
//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownTumorTissueFreshFrozenValue.getText());
//		System.out.println(cedcdBiospecimenCountsPage.specimenTypeDropDownUrineValue.getText());

//		String firstText = cedcdBiospecimenCountsPage.specimenTypeDropDownValues.get(0).getAttribute("All Types"); 
//		System.out.println(firstText);
//		
//		ArrayList<String> arrayListOne = new ArrayList<String>(); 
//		Thread.sleep(1000);
//		for (int i = 0; i < 8; i++) {
//		    Thread.sleep(1000);
//			arrayListOne.add(cedcdBiospecimenCountsPage.specimenTypeDropDownValues.get(i).getAttribute("");
//			
//			
//		}
//		System.out.println(arrayListOne);

//		List<WebElement> values = cedcdBiospecimenCountsPage.specimenTypeDropDownValues;
//
//		for (WebElement listValues : values) {
//
//			if (listValues.getText().contentEquals("Buffy Coat and/or Lymphocytes")) {
//
//				MiscUtils.sleep(1000);
//				listValues.click();
//				break;
//			}
//
//		}
//		
//		int i = 1;
//		String xpath = "(//span[@class='filter-component-input'])"+"["+ i + "]";

//		ArrayList<String> alphabetizedSpecimenType = new ArrayList<String>();
//		alphabetizedSpecimenType.add("All Types");
//		alphabetizedSpecimenType.add("Buffy Coat and/or Lymphocytes");
//		alphabetizedSpecimenType.add("Feces");
//		alphabetizedSpecimenType.add("Saliva and/or Buccal");
//		alphabetizedSpecimenType.add("Serum and/or Plasma");
//		alphabetizedSpecimenType.add("Tumor Tissue FFPE");
//		alphabetizedSpecimenType.add("Tumor Tissue Fresh/Frozen");
//		alphabetizedSpecimenType.add("Urine");

	}

}
