package ServiceNow.CHARMS.Steps;

import java.util.ArrayList;
import org.junit.Assert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import ServiceNow.CHARMS.Constants.FHQSurveyPageConstants;
import ServiceNow.CHARMS.Utils.ComponentTestResult;
import ServiceNow.CHARMS.Utils.FHQUtil;
import ServiceNow.CHARMS.Utils.StepTestResult;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FHQParentRecordProducerSteps extends PageInitializer {

	private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();
	

	
	ExtentReports extent =new ExtentReports();

	@Given("user clicks the Parents Grid link on FHQ Grid page to land on the FHQ Parents list view page")
	public void user_clicks_the_Parents_Grid_link_on_FHQ_Grid_page_to_land_on_the_FHQ_Parents_list_view_page() {

		MiscUtils.sleep(100);

		fHQSurveyPortalPage.parentsLinkOnFamilyGrid.click();

		MiscUtils.sleep(300);

		StepTestResult stepTestResult = new StepTestResult(
				"User clicked the Participant Parents Grid link on FHQ Grid page and lands on the FHQ Parents list view page");

		scenarioReportList.add(stepTestResult);

	}

	@Given("verifies the Parents List View details")
	public void verifies_the_Parents_List_View_details() {

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listViewButton, "List View");

		ComponentTestResult contextMenuTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentContextMenuButton, "");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentsBanner, "Parents");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.newButtonLinkOnListView, "New");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rowsDetailsOnListView,
				"The blue highlighted rows represent the incompleted family records");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.allDetailsOnListView, "All");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentRelationToPatientBannerOnListView,
				"Relation to Patient in (Biological Mother, Biological Father)");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnListView, "First Name");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLastNameOnListView,
				"First Initial of LAST Name");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusOnListView, "Vital Status");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnListView,
				"Year of Birth");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationToPatientOnListView1,
				"Relation to Patient");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationToPatientOnListViewValue2,
				"Biological Mother");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationToPatientOnListViewValue1,
				"Biological Father");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parents details on the List View page are verified");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(contextMenuTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);

		scenarioReportList.add(stepTestResult);

	}

	@When("clicks the New button on the FHQ Parents list view page it lands on the New FHQ Parent record producer page")
	public void clicks_the_New_button_on_the_FHQ_Parents_list_view_page_it_lands_on_the_New_FHQ_Parent_record_producer_page() {

		fHQSurveyPortalPage.newButtonLinkOnListView.click();

		MiscUtils.sleep(300);

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.formViewButton, "Form View");

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyHealthBanner,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentBanner, "Parent");

		ComponentTestResult bannerTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantParentInformationBanner,
				"You are currently filling out information for the participants parent.");

		StepTestResult stepTestResult = new StepTestResult(
				"Clicked the New button on the FHQ Parents list view page and the user lands on the New FHQ Parent record producer page");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(bannerTest);
		stepTestResult.add(labelTest);
		stepTestResult.add(bannerTest1);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Parent related to the Patient")
	public void fills_the_First_Name_First_Initial_of_LAST_name_Year_of_Birth_Vital_Status_Year_of_Death_Age_of_Death_information_of_the_Parent_related_to_the_Patient() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.WhichParentLabel,
				"Which parent is this?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.WhichParentDropDown,
				FHQSurveyPageConstants.TYPES_OF_PARENTS, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameLabel, "First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameTextBox, "");

		fHQSurveyPortalPage.firstNameTextBox.sendKeys("Participant Mother FN");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.firstInitialLastName(), 4);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.thisRelativeAdoptedLabel,
				"Was this relative adopted?");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.WasThisRelativeAdoptedDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthLabel, "Year of Birth");

		ComponentTestResult banner1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthdateLabelBanner,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.yearOfBirthOrDeath(), 45);

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusLabel, "Vital Status");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.VITAL_STATUS_LIST, 2);

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOrAgeLabel,
				"Please provide the year of death or the age of death");

		ComponentTestResult dropdownTest5 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.YEAR_OR_AGE_OF_DEATH, 1);

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathLabel, "Year of Death");

		ComponentTestResult banner2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthdateLabelBanner1,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest6 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.yearOfBirthOrDeath(), 70);

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfThisRelativeDeathLabel,
				"What was the cause of this relative death?");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathInformationBanner,
				"If you don't know, you can write \"don't know\" in the text box.");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathTextBox, "");

		fHQSurveyPortalPage.causeOfDeathTextBox.sendKeys("Reason of Death of this relative is not Known");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest5);
		stepTestResult.add(banner1);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest6);
		stepTestResult.add(dropdownTest4);
		stepTestResult.add(labelTest7);
		stepTestResult.add(dropdownTest5);
		stepTestResult.add(labelTest8);
		stepTestResult.add(banner2);
		stepTestResult.add(dropdownTest6);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the Sex assigned at birth, Gender Identity information for the Parent")
	public void fills_the_Sex_assigned_at_birth_Gender_Identity_information_for_the_Parent() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthLabel,
				"Sex assigned at birth");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentSexAssignedAtBirthDropDown, FHQSurveyPageConstants.SEX_ASSIGNED_AT_BIRTH, 2);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityLabel,
				"Gender Identity");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentGenderIdentitydDropDown, FHQSurveyPageConstants.GENDER_IDENTITY, 2);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Sex assigned at birth, Gender Identity information are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);

	}

	@When("fills the Type of birth Information for the Parent")
	public void fills_the_Type_of_birth_Information_for_the_Parent() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.isThisRelativeTwinOrMultipleBirthLabel,
				"Is this relative a twin or part of a multiple birth?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.TwinOrMultipleBirthDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfBirthLabel, "Type of birth");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentTypeOfBirthDropDown, FHQSurveyPageConstants.TYPE_OF_BIRTH, 2);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Type of birth Information are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);

	}

	@When("fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this person")
	public void fills_Total_Miscarriages_Total_Still_births_Total_Induced_Abortions_Total_Tubal_Ectopic_Molar_Pregnancies_details_of_this_person() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.BirthsLabel,
				"Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.parentBirthLabelDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		MiscUtils.sleep(500);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentbirthsBanner,
				"Please identify the number of each of the following pregnancy results for this parent.");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalMiscarriagesLabel,
				"Total number of Miscarriages");

		ComponentTestResult bannerTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalMiscarriagesBanner,
				"(less than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentTotalMiscarriagesDropDown, FHQSurveyPageConstants.numberUpToN(20), 1);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalStillbirthsLabel,
				"Total number of Stillbirths");

		ComponentTestResult bannerTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalStillbirthsBanner,
				"(more than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentTotalStillbirthsDropDown, FHQSurveyPageConstants.numberUpToN(20), 1);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalInducedAbortionsLabel,
				"Total number of Induced Abortions");

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentTotalInducedAbortionsDropDown, FHQSurveyPageConstants.numberUpToN(20), 1);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentTotalTubalEctopicMolarPregnanciesLabel,
				"Total number of Tubal/Ectopic/Molar Pregnancies");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentTotalTubalEctopicMolarPregnanciesDropDown,
				FHQSurveyPageConstants.numberUpToN(20), 1);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Total Live Births, Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(bannerTest1);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest3);
		stepTestResult.add(bannerTest2);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest5);
		stepTestResult.add(dropdownTest4);

		scenarioReportList.add(stepTestResult);

	}

	@Then("fills the Patient Parent Resopathy details")
	public void fills_the_Patient_Parent_Resopathy_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.relativeDiagnosedWithRasopathyLabel,
				"Has this relative been diagnosed with a RASopathy?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childDiagnosedWithRasopathyInformation,
				"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentDiagnosedWithRasopathyDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentDiagnosedWithRasopathyAddButtonInfo,
				"Please select the 'Add' button below to add each RASopathy this relative has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Resopathy details are filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);
	}

	@When("Parent Rasopathy MRVS details are filled")
	public void parent_Rasopathy_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.rASopathyLabel, "RASopathy");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRasopathyButton, "Add");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllRasopathyButton,
				"Remove All");

		fHQSurveyPortalPage.addRasopathyButton.click();

		MiscUtils.sleep(300);

		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowTypeOfDiagnosisLabel,
				"RASopathy");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowTypeOfDiagnosisDropDown, FHQSurveyPageConstants.RESOPATHY_TYPE, 7);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisLabel,
				"Specify other RASopathy");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox, "");

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other Rasopathy for Parent");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisLabel,
				"Please provide the year of diagnosis or the age of diagnosis");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				4);
		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				3);

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				1);

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowYearOfDiagnosisLabel,
				"Year of diagnosis");

		ComponentTestResult estimatedAgeBanner1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowestimatedAgeBanner1,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOfDiagnosisDropDown, FHQSurveyPageConstants.yearOfDiagnosis(), 16);

		ComponentTestResult dropdownTest5 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				2);

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowAgeOfDiagnosisLabel,
				"Age of diagnosis");

		ComponentTestResult estimatedAgeBanner2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowestimatedAgeBanner2,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest6 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowAgeOfDiagnosisDropDown, FHQSurveyPageConstants.ageOfDiagnosis(), 18);

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowadditionalInformationLabel,
				"Additional Information");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowadditionalInformationTextBox,
				"");

		fHQSurveyPortalPage.addRowadditionalInformationTextBox
				.sendKeys("Additional Rasopathy Information Details added");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowCancelButton, "Cancel");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowsaveButton, "Add");

		fHQSurveyPortalPage.addRowsaveButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent RASopathy MRVS details are filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest8);
		stepTestResult.add(estimatedAgeBanner1);
		stepTestResult.add(dropdownTest4);
		stepTestResult.add(dropdownTest5);
		stepTestResult.add(labelTest9);
		stepTestResult.add(estimatedAgeBanner2);
		stepTestResult.add(dropdownTest6);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);
		stepTestResult.add(labelTest13);

		scenarioReportList.add(stepTestResult);
	}

	@When("Parent Rasopathy MRVS table are verified")
	public void parent_Rasopathy_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsBanner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rASopathyBanner, "RASopathy");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.specifyOtherRASopathyBanner,
				"Specify other RASopathy");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosisBanner,
				"Please provide the year of diagnosis or the age of diagnosis");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosisBanner,
				"Year of diagnosis");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosisBanner,
				"Age of diagnosis");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformationBanner,
				"Additional Information");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsEdit, "");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsDelete, "");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rASopathyBannerValue,
				"Other RASopathy");

		ComponentTestResult labelTest10 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentSpecifyOtherRASopathyBannerValue, "Other Rasopathy for Parent");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosisBannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosisBannerValue, "");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosisBannerValue, "18");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformationBannerValue,
				"Additional Rasopathy Information Details added");

		StepTestResult stepTestResult = new StepTestResult("The Participant Parent Rasopathy MRVS tables are verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);
		stepTestResult.add(labelTest13);
		stepTestResult.add(labelTest14);
		scenarioReportList.add(stepTestResult);

	}

	@Then("fills the Patient Parent Cancer details")
	public void fills_the_Patient_Parent_Cancer_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.relativeDiagnosedWithCancerLabel,
				"Has this relative ever been diagnosed with cancer?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentDiagnosedWithCancerDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentDiagnosedWithCancerAddButtonInfo,
				"Please select the 'Add' button below to add each cancer this relative has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Cancer details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);

		scenarioReportList.add(stepTestResult);
	}

	@When("Parent Cancer MRVS details are filled")
	public void parent_Cancer_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cancerLabel, "Cancer(s)");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addCancerButton, "Add");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllCancerButton, "Remove All");

		fHQSurveyPortalPage.addCancerButton.click();

		MiscUtils.sleep(300);
		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowTypeOfDiagnosisLabel, "Cancer");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowTypeOfDiagnosisDropDown, FHQSurveyPageConstants.CANCER_TYPE, 41);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisLabel,
				"Specify other cancer");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox, "");

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other cancer for Parent");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisLabel,
				"Please provide the year of diagnosis or the age of diagnosis");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				4);

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				3);

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				1);

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowYearOfDiagnosisLabel,
				"Year of diagnosis");

		ComponentTestResult estimatedAgeBanner1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowestimatedAgeBanner1,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOfDiagnosisDropDown, FHQSurveyPageConstants.yearOfDiagnosis(), 16);

		ComponentTestResult dropdownTest5 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				2);

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowAgeOfDiagnosisLabel,
				"Age of diagnosis");

		ComponentTestResult estimatedAgeBanner2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowestimatedAgeBanner2,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest6 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowAgeOfDiagnosisDropDown, FHQSurveyPageConstants.ageOfDiagnosis(), 29);

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowadditionalInformationLabel,
				"Additional Information");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowadditionalInformationTextBox,
				"");

		fHQSurveyPortalPage.addRowadditionalInformationTextBox.sendKeys("Additional Cancer Information Details added");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowCancelButton, "Cancel");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowsaveButton, "Add");

		MiscUtils.sleep(500);
		fHQSurveyPortalPage.addRowsaveButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Cancer MRVS details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest8);
		stepTestResult.add(estimatedAgeBanner1);
		stepTestResult.add(dropdownTest4);
		stepTestResult.add(dropdownTest5);
		stepTestResult.add(labelTest9);
		stepTestResult.add(estimatedAgeBanner2);
		stepTestResult.add(dropdownTest6);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);
		stepTestResult.add(labelTest13);

		scenarioReportList.add(stepTestResult);
	}

	@When("Parent Cancer MRVS table are verified")
	public void parent_Cancer_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.actions1Banner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cancerBanner, "Cancer");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.specifyOtherCancerBanner,
				"Specify other cancer");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosis1Banner,
				"Please provide the year of diagnosis or the age of diagnosis");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosis1Banner,
				"Year of diagnosis");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosis1Banner,
				"Age of diagnosis");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformation1Banner,
				"Additional Information");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsEdit1, "");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsDelete1, "");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cancerBannerValue, "Other cancer");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentSpecifyOtherCancerBannerValue,
				"Other cancer for Parent");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosis1BannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosis1BannerValue, "");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosis1BannerValue, "29");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformation1BannerValue,
				"Additional Cancer Information Details added");

		StepTestResult stepTestResult = new StepTestResult("The Participant Parent Cancer MRVS tables are verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);
		stepTestResult.add(labelTest13);
		stepTestResult.add(labelTest14);

		scenarioReportList.add(stepTestResult);
	}

	@Then("fills the Patient Parent Medical Conditions details")
	public void fills_the_Patient_Parent_Medical_Conditions_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentDiagnosedWithMedicalConditionsLabel,
				"Has this relative ever been diagnosed with any of the medical conditions listed below?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithMedicalConditionsBanner,
				"Congenital heart disease, developmental disorder, uncommon physical features, other medical conditions.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentDiagnosedWithMedicalConditionsDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,
				"Please select the 'Add' button below to add each medical condition this relative has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Medical Conditions details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);

	}

	@When("Parent Medical Conditions MRVS details are filled")
	public void parent_Medical_Conditions_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.medicalConditionsLabel,
				"Medical Condition(s)");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addMedicalConditionsButton, "Add");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllMedicalConditionButton,
				"Remove All");

		fHQSurveyPortalPage.addMedicalConditionsButton.click();

		MiscUtils.sleep(300);
		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowTypeOfDiagnosisLabel,
				"Medical Condition");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowTypeOfDiagnosisDropDown, FHQSurveyPageConstants.MEDICAL_CONDITIONS_TYPE, 1);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisLabel,
				"Specify medical condition");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox, "");

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other Congenital condition");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisLabel,
				"Please provide the year of diagnosis or the age of diagnosis");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				4);

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				3);

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				1);

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowYearOfDiagnosisLabel,
				"Year of diagnosis");

		ComponentTestResult estimatedAgeBanner1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowestimatedAgeBanner1,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOfDiagnosisDropDown, FHQSurveyPageConstants.yearOfDiagnosis(), 16);

		ComponentTestResult dropdownTest5 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowYearOrAgeOfDiagnosisDropDown, FHQSurveyPageConstants.YEAR_OR_AGE_OF_DIAGNOSIS,
				2);

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowAgeOfDiagnosisLabel,
				"Age of diagnosis");

		ComponentTestResult estimatedAgeBanner2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowestimatedAgeBanner2,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest6 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowAgeOfDiagnosisDropDown, FHQSurveyPageConstants.ageOfDiagnosis(), 26);

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowCancelButton, "Cancel");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowsaveButton, "Add");

		fHQSurveyPortalPage.addRowsaveButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Medical Conditions MRVS details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest8);
		stepTestResult.add(estimatedAgeBanner1);
		stepTestResult.add(dropdownTest4);
		stepTestResult.add(dropdownTest5);
		stepTestResult.add(labelTest9);
		stepTestResult.add(estimatedAgeBanner2);
		stepTestResult.add(dropdownTest6);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);

		scenarioReportList.add(stepTestResult);

	}

	@When("Parent Medical Conditions MRVS table are verified")
	public void parent_Medical_Conditions_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.actions2Banner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.medicalConditionBanner,
				"Medical Condition");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.specifyMedicalConditionBanner,
				"Specify medical condition");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosis2Banner,
				"Please provide the year of diagnosis or the age of diagnosis");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosis2Banner,
				"Year of diagnosis");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosis2Banner,
				"Age of diagnosis");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsEdit2, "");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsDelete2, "");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentMedicalConditionBannerValue,
				"Congenital heart disease");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentSpecifyMedicalConditionBannerValue, "Other Congenital condition");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosis2BannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosis2BannerValue, "");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosis2BannerValue, "26");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parent Medical Conditions MRVS tables are verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the Patient Parent siblings details")
	public void fills_the_Patient_Parent_siblings_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.howManySiblingsThisRelativeHaveLabel,
				"How many siblings does this relative have?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.howManySiblingsThisRelativeHaveBanner,
				"Please include all full and half siblings, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.howManySiblingsThisRelativeHaveDropDown, FHQSurveyPageConstants.numberUpToN(12), 4);

		MiscUtils.sleep(300);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.selectAddButtonToAddEachSiblingLabel,
				"Please select the 'Add' button below to add each sibling this relative has.");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingLabel, "Siblings");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addSiblingButton, "Add");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllSiblingButton, "Remove All");

		fHQSurveyPortalPage.addSiblingButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant's Parent Sibling details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}

	@When("Parent Sibling MRVS details are filled")
	public void parent_Sibling_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");
		

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowSiblingsTypeLabel,
				"Types of Sibling relation");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowSiblingsTypeDropDown, FHQSurveyPageConstants.TYPES_OF_SIBLING, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowFirstNameSiblingLabel,
				"First name of sibling");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowFirstNameSiblingTextBox, "");

		fHQSurveyPortalPage.addRowFirstNameSiblingTextBox.sendKeys("Parent Sibling FN");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowFirstInitialOfLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowFirstInitialOfLastNameSiblingDropDown,
				FHQSurveyPageConstants.firstInitialLastName(), 3);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowVitalStatusSiblingLabel,
				"Vital Status of sibling");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowVitalStatusSiblingDropDown, FHQSurveyPageConstants.VITAL_STATUS_LIST, 4);

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowCancelButton, "Cancel");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowsaveButton, "Add");

		fHQSurveyPortalPage.addRowsaveButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant's Parent Sibling MRVS details are filled and verified for the Parent of the Patient");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest5);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);

		scenarioReportList.add(stepTestResult);

	}

	@When("Parent Sibling MRVS table are verified")
	public void parent_Sibling_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.actions3Banner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingTypesBanner,
				"Types of Siblings relation");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingFirstNameBanner,
				"First name of sibling");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingFirstInitialOfLastNameBanner1,
				"First Initial of LAST Name");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingVitalStatusBanner,
				"Vital Status of sibling");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsEdit3, "");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsDelete3, "");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentsiblingFirstNameBanner,
				"Sister");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentsiblingFirstNameBannerValue,
				"Parent Sibling FN");

		ComponentTestResult labelTest9 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.siblingFirstInitialOfLastNameBannerValue, "C");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingVitalStatusBannerValue,
				"Prefer not to answer");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant's Parent Sibling MRVS Information tables are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);

		scenarioReportList.add(stepTestResult);
	}

	@Then("finally click the Complete-Submit Button to submit the patient Parent record producer")
	public void finally_click_the_Complete_Submit_Button_to_submit_the_patient_Parent_record_producer() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.anythingElseAboutThisRelativeLabel,
				"Is there anything else you would like us to know about this relative?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.anythingElseAboutThisRelativeTextBox,
				"");

		fHQSurveyPortalPage.anythingElseAboutThisRelativeTextBox
				.sendKeys("There is nothing else to tell about this Participant Parent.");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.CompleteAndSubmitButton,
				"Complete and Submit");

		fHQSurveyPortalPage.CompleteAndSubmitButton.click();

		MiscUtils.sleep(300);

		StepTestResult stepTestResult = new StepTestResult(
				"Finally clicked the Complete-Submit Button to submit the Participant Parent record producer");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);

	}

	@When("Parents list view page is updated and verified")
	public void parents_list_view_page_is_updated_and_verified() {

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentfirstNameOnListView,
				"Participant Mother FN");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentfirstInitialOfLastNameOnListView,
				"D");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentvitalStatusOnListView,
				"Deceased");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentyearOfBirthOnListView, "1941");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentrelationToPatientOnListView,
				"Biological Mother");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Parents list view page is updated and verified");

		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}
	
	@Then("Generate Scenario Report for the details of the Patient Parent in the FHQ Survey")
	public void generate_Scenario_Report_for_the_details_of_the_Patient_Partner_in_the_FHQ_Survey_page() {

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());

		}
	}
	

	@When("click the new parent added and verify the completed record producer data")
	public void click_the_new_parent_added_and_verify_the_completed_record_producer_data() {

		fHQSurveyPortalPage.parentfirstNameOnListView.click();

		MiscUtils.sleep(300);

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.completedFormViewButton,
				"Complete Form View");

		ComponentTestResult parentNameTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentfirstNameBannerOnCRP,
				"Participant Mother FN");

		Assert.assertTrue("First Name Banner do not match",
				fHQSurveyPortalPage.parentfirstNameBannerOnCRP.getText().contentEquals("Participant Mother FN"));

		System.out.println("First Name Banner Matched");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentRelationToPatientOnCRP,
				"Relation to Patient");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentRelationToPatientOnCRPValue,
				"Biological Mother");

		Assert.assertTrue("Relation to Patient do not match",
				fHQSurveyPortalPage.parentRelationToPatientOnCRPValue.getText().contentEquals("Biological Mother"));

		System.out.println("Relation to Patient Matched");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentFirstNameOnCRP, "First Name");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentFirstNameOnCRPValue,
				"Participant Mother FN");

		Assert.assertTrue("First Name do not match ", fHQSurveyPortalPage.parentFirstNameOnCRPValue
				.getAttribute("value").contentEquals("Participant Mother FN"));

		System.out.println("First Name Matched");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentFirstInitialOfLASTNameOnCRP,
				"First Initial of LAST Name");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentFirstInitialOfLASTNameOnCRPValue,
				"D");

		Assert.assertTrue("First Initial of LAST Name do not match ",
				fHQSurveyPortalPage.parentFirstInitialOfLASTNameOnCRPValue.getAttribute("value").contentEquals("D"));

		System.out.println("First Initial of LAST Name Matched");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentWasThisRelativeAdoptedOnCRP,
				"Was this relative adopted?");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentWasThisRelativeAdoptedOnCRPValue,
				"Yes");

		Assert.assertTrue("Was this relative adopted do not match",
				fHQSurveyPortalPage.parentWasThisRelativeAdoptedOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Was this relative adopted Matched");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentYearOfBirthOnCRP,
				"Year of Birth");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentYearOfBirthOnCRPValue, "1941");

		Assert.assertTrue("Year of Birth do not match ",
				fHQSurveyPortalPage.parentYearOfBirthOnCRPValue.getAttribute("value").contentEquals("1941"));

		System.out.println("Year of Birth Matched");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentVitalStatusOnCRP,
				"Vital Status");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentVitalStatusOnCRPValue,
				"Deceased");

		Assert.assertTrue("Vital Status do not match ",
				fHQSurveyPortalPage.parentVitalStatusOnCRPValue.getText().contentEquals("Deceased"));

		System.out.println("Vital Status Matched");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentYearOfDeathOrAgeOfDeathOnCRP,
				"Please provide the year of death or the age of death");

		ComponentTestResult labelTest13 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentYearOfDeathOrAgeOfDeathOnCRPValue, "Year of Death");

		Assert.assertTrue("The year of death or the age of death do not match ",
				fHQSurveyPortalPage.parentYearOfDeathOrAgeOfDeathOnCRPValue.getText().contentEquals("Year of Death"));

		System.out.println("The year of death or the age of death Matched");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentYearOfDeathOnCRP,
				"Year of Death");

		ComponentTestResult labelTest15 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentYearOfDeathOnCRPValue, "1966");

		Assert.assertTrue("Year of death do not match ",
				fHQSurveyPortalPage.parentYearOfDeathOnCRPValue.getAttribute("value").contentEquals("1966"));

		System.out.println("Year of death Matched");

		ComponentTestResult labelTest16 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentCauseOfDeathOnCRP,
				"What was the cause of this relative death?");

		ComponentTestResult labelTest17 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentCauseOfDeathOnCRPValue,
				"Reason of Death of this relative is not Known");

		Assert.assertTrue("The cause of this relative death do not match ",
				fHQSurveyPortalPage.parentCauseOfDeathOnCRPValue.getAttribute("value")
						.contentEquals("Reason of Death of this relative is not Known"));

		System.out.println("The cause of this relative death Matched");

		ComponentTestResult labelTest18 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentSexAssignedAtBirthOnCRP,
				"Sex assigned at birth");

		ComponentTestResult labelTest19 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentSexAssignedAtBirthOnCRPValue,
				"Female");

		Assert.assertTrue("Sex assigned at birth do not match ",
				fHQSurveyPortalPage.parentSexAssignedAtBirthOnCRPValue.getText().contentEquals("Female"));

		System.out.println("Sex assigned at birth Matched");

		ComponentTestResult labelTest20 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentGenderIdentityOnCRP,
				"Gender Identity");

		ComponentTestResult labelTest21 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentGenderIdentityOnCRPValue,
				"Female");

		Assert.assertTrue("Gender Identity do not match ",
				fHQSurveyPortalPage.parentGenderIdentityOnCRPValue.getText().contentEquals("Female"));

		System.out.println("Gender Identity Matched");

		ComponentTestResult labelTest22 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTwinOnCRP,
				"Is this relative a twin or part of a multiple birth?");

		ComponentTestResult labelTest23 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTwinOnCRPValue, "Yes");

		Assert.assertTrue("Is this relative a twin or part of a multiple birth do not match ",
				fHQSurveyPortalPage.parentTwinOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Is this relative a twin or part of a multiple birth Matched");

		ComponentTestResult labelTest24 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTypeOfBirthOnCRP,
				"Type of birth");

		ComponentTestResult labelTest25 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTypeOfBirthOnCRPValue,
				"Fraternal Twin");

		Assert.assertTrue("Type of birth do not match ",
				fHQSurveyPortalPage.parentTypeOfBirthOnCRPValue.getText().contentEquals("Fraternal Twin"));

		System.out.println("Type of birth Matched");

		ComponentTestResult labelTest26 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentMiscarriageStillBirthsOnCRP,
				"Has this relative ever had any miscarriages, stillbirths, induced abortions ...");

		ComponentTestResult labelTest27 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentMiscarriageStillBirthsOnCRPValue, "Yes");

		Assert.assertTrue("Has this relative ever had any miscarriages, stillbirths, induced abortions do not match ",
				fHQSurveyPortalPage.parentMiscarriageStillBirthsOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative ever had any miscarriages, stillbirths, induced abortions Matched");

		ComponentTestResult labelTest28 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalNumberOfMiscarriagesOnCRP,
				"Total number of Miscarriages");

		ComponentTestResult labelTest29 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentTotalNumberOfMiscarriagesOnCRPValue, "Don't Know");

		Assert.assertTrue("Total number of Miscarriages do not match ",
				fHQSurveyPortalPage.parentTotalNumberOfMiscarriagesOnCRPValue.getAttribute("value")
						.contentEquals("Don't Know"));

		System.out.println("Total number of Miscarriages Matched");

		ComponentTestResult labelTest30 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotaNumberOfStillbirthsOnCRP,
				"Total number of Stillbirths");

		ComponentTestResult labelTest31 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentTotaNumberOfStillbirthsOnCRPValue, "Don't Know");

		Assert.assertTrue("Total number of Stillbirths do not match ",
				fHQSurveyPortalPage.parentTotaNumberOfStillbirthsOnCRPValue.getAttribute("value")
						.contentEquals("Don't Know"));

		System.out.println("Total number of Stillbirths Matched");

		ComponentTestResult labelTest32 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentTotalNumberOfInducedAbortionsOnCRP, "Total number of Induced Abortions");

		ComponentTestResult labelTest33 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentTotalNumberOfInducedAbortionsOnCRPValue, "Don't Know");

		Assert.assertTrue("Total Number of Induced Abortions do not match ",
				fHQSurveyPortalPage.parentTotalNumberOfInducedAbortionsOnCRPValue.getAttribute("value")
						.contentEquals("Don't Know"));

		System.out.println("Total number of Induced Abortions Matched");

		ComponentTestResult labelTest34 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalNumberOfTubalOnCRP,
				"Total number of Tubal/Ectopic/Molar Pregnancies");

		ComponentTestResult labelTest35 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalNumberOfTubalOnCRPValue,
				"Don't Know");

		Assert.assertTrue("Total number of Tubal/Ectopic/Molar Pregnancies do not match ",
				fHQSurveyPortalPage.parentTotalNumberOfTubalOnCRPValue.getAttribute("value")
						.contentEquals("Don't Know"));

		System.out.println("Total number of Tubal/Ectopic/Molar Pregnancies Matched");

		ComponentTestResult labelTest36 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentDiagnosedWithRASopathyOnCRP,
				"Has this relative been diagnosed with a RASopathy?");

		ComponentTestResult labelTest37 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentDiagnosedWithRASopathyOnCRPValue, "Yes");

		Assert.assertTrue("Has this relative been diagnosed with a RASopathy? do not match ",
				fHQSurveyPortalPage.parentDiagnosedWithRASopathyOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative been diagnosed with a RASopathy Matched");

		ComponentTestResult labelTest38 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentDiagnosedWithCancerOnCRP,
				"Has this relative ever been diagnosed with cancer?");

		ComponentTestResult labelTest39 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentDiagnosedWithCancerOnCRPValue,
				"Yes");

		Assert.assertTrue("Has this relative ever been diagnosed with cancer do not match ",
				fHQSurveyPortalPage.parentDiagnosedWithCancerOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative ever been diagnosed with cancer Matched");

		ComponentTestResult labelTest40 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.parentDiagnosedWithMedicalConditionsOnCRP,
				"Has this relative ever been diagnosed with any medical conditions?");

		ComponentTestResult labelTest41 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.parentDiagnosedWithMedicalConditionsOnCRPValue, "Yes");

		Assert.assertTrue("Has this relative ever been diagnosed with any medical conditions do not match ",
				fHQSurveyPortalPage.parentDiagnosedWithMedicalConditionsOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative ever been diagnosed with any medical conditions Matched");

		ComponentTestResult labelTest42 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentHowManySiblingsOnCRP,
				"How many siblings does this relative have?");

		ComponentTestResult labelTest43 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentHowManySiblingsOnCRPValue, "1");

		Assert.assertTrue("How many siblings does this relative have do not match ",
				fHQSurveyPortalPage.parentHowManySiblingsOnCRPValue.getAttribute("value").contentEquals("1"));

		System.out.println("How many siblings does this relative have had Matched");

		ComponentTestResult labelTest44 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentAdditionalInfoOnCRP,
				"Is there anything else you would like us to know about this relative?");

		ComponentTestResult labelTest45 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentAdditionalInfoOnCRPValue,
				"There is nothing else to tell about this Participant Parent.");

		Assert.assertTrue("Is there anything else you would like us to know about this relative do not match ",
				fHQSurveyPortalPage.parentAdditionalInfoOnCRPValue.getAttribute("value")
						.contentEquals("There is nothing else to tell about this Participant Parent."));

		System.out.println("Is there anything else you would like us to know about this relative Matched");

		ComponentTestResult labelTest46 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relatedListsOnCRPValue,
				"Related Lists");

		Assert.assertTrue("Related Lists do not match ",
				fHQSurveyPortalPage.relatedListsOnCRPValue.getText().contentEquals("Related Lists"));

		System.out.println("Related Lists Matched");

		ComponentTestResult labelTest47 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rASopathiesInfoOnCRPValue,
				"RASopathies 1");

		Assert.assertTrue("RASopathies do not match ",
				fHQSurveyPortalPage.rASopathiesInfoOnCRPValue.getText().contentEquals("RASopathies 1"));

		System.out.println("RASopathies 1 Matched");

		ComponentTestResult labelTest48 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cancersInfoOnCRPValue, "Cancers 1");

		Assert.assertTrue("Cancers 1 do not match ",
				fHQSurveyPortalPage.cancersInfoOnCRPValue.getText().contentEquals("Cancers 1"));

		System.out.println("Cancers 1 Matched");

		ComponentTestResult labelTest49 = FHQUtil.verifyLabel(fHQSurveyPortalPage.medicalConditionsInfoOnCRPValue,
				"Medical Conditions 1");

		Assert.assertTrue("Medical Conditions 1 do not match ",
				fHQSurveyPortalPage.medicalConditionsInfoOnCRPValue.getText().contentEquals("Medical Conditions 1"));

		System.out.println("Medical Conditions 1 Matched");

		StepTestResult stepTestResult = new StepTestResult(
				"Verified the new Parent added and all the field data in the completed record producer");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(parentNameTest);
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);
		stepTestResult.add(labelTest13);
		stepTestResult.add(labelTest14);
		stepTestResult.add(labelTest15);
		stepTestResult.add(labelTest16);
		stepTestResult.add(labelTest17);
		stepTestResult.add(labelTest18);
		stepTestResult.add(labelTest19);
		stepTestResult.add(labelTest20);
		stepTestResult.add(labelTest21);
		stepTestResult.add(labelTest22);
		stepTestResult.add(labelTest23);
		stepTestResult.add(labelTest24);
		stepTestResult.add(labelTest25);
		stepTestResult.add(labelTest26);
		stepTestResult.add(labelTest27);
		stepTestResult.add(labelTest28);
		stepTestResult.add(labelTest29);
		stepTestResult.add(labelTest30);
		stepTestResult.add(labelTest31);
		stepTestResult.add(labelTest32);
		stepTestResult.add(labelTest33);
		stepTestResult.add(labelTest34);
		stepTestResult.add(labelTest35);
		stepTestResult.add(labelTest36);
		stepTestResult.add(labelTest37);
		stepTestResult.add(labelTest38);
		stepTestResult.add(labelTest39);
		stepTestResult.add(labelTest40);
		stepTestResult.add(labelTest41);
		stepTestResult.add(labelTest42);
		stepTestResult.add(labelTest43);
		stepTestResult.add(labelTest44);
		stepTestResult.add(labelTest45);
		stepTestResult.add(labelTest46);
		stepTestResult.add(labelTest47);
		stepTestResult.add(labelTest48);
		stepTestResult.add(labelTest49);
	}

	@When("click the FHQ Home button")
	public void click_the_FHQ_Home_button() {

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		fHQSurveyPortalPage.homeButton.click();

		StepTestResult stepTestResult = new StepTestResult("The FHQ Home button is clicked to go to Family Grid page");

		stepTestResult.add(homeButtonTest);
		scenarioReportList.add(stepTestResult);

	}
	
	@When("the ExtentReport is generated")
	public void the_ExtentReport_is_generated() {

		String path =System.getProperty("user.dir")+"\\CBIIT-Test-Automation\\reports\\FHQRegression.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("FHQ Regression Automation Results");

		reporter.config().setDocumentTitle("FHQ Regression Results");

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Sonika jain");
	}

	@When("Partner FHQ results are added to the ExtentReport")
	public void partner_FHQ_results_are_added_to_the_ExtentReport() {
		
		 extent.createTest("Initial Demo");


		System.out.println(scenarioReportList);
		

		

		extent.flush();
	}

}
