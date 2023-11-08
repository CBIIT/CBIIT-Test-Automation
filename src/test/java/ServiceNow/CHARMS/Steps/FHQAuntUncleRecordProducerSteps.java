package ServiceNow.CHARMS.Steps;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.CHARMS.Constants.FHQSurveyPageConstants;
import ServiceNow.CHARMS.Utils.ComponentTestResult;
import ServiceNow.CHARMS.Utils.FHQUtil;
import ServiceNow.CHARMS.Utils.StepTestResult;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FHQAuntUncleRecordProducerSteps extends PageInitializer {

	private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

	@Given("user clicks the AuntUncle Grid link on FHQ Grid page to land on the FHQ AuntUncle list view page")
	public void user_clicks_the_AuntUncle_Grid_link_on_FHQ_Grid_page_to_land_on_the_FHQ_AuntUncle_list_view_page() {

		fHQSurveyPortalPage.auntUncleLinkOnFamilyGrid.click();

		StepTestResult stepTestResult = new StepTestResult(
				"User clicked the AuntUncle Grid link on FHQ Grid page to land on the FHQ AuntUncle list view page");

		scenarioReportList.add(stepTestResult);

	}

	@Given("verifies the AuntUncle List View details")
	public void verifies_the_AuntUncle_List_View_details() {

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listViewButton, "List View");

		ComponentTestResult contextMenuTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleContextMenuButton, "");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntsUnclesBanner, "Aunt/Uncles");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.newButtonLinkOnListView, "New");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rowsDetailsOnListView,
				"The blue highlighted rows represent the incompleted family records");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnListView, "First Name");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLastNameOnListView,
				"First Initial of LAST Name");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusOnListView, "Vital Status");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnListView,
				"Year of Birth");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationToPatientOnListView1,
				"Relation to Patient");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleFirstNameOnListViewValue,
				"Parent Sibling FN");

		ComponentTestResult labelTest12 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.auntUncleFirstInitialOfLastNameOnListViewValue, "C");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleVitalStatusOnListViewValue,
				"Prefer not to answer");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleYearOfBirthOnListViewValue,
				"");

		ComponentTestResult labelTest15 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.auntUncleRelationToPatientOnListViewValue, "");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle details on the List View page are verified");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(contextMenuTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
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

		scenarioReportList.add(stepTestResult);

	}

	@When("clicks the New button on the FHQ AuntUncle list view page it lands on the New FHQ AuntUncle record producer page")
	public void clicks_the_New_button_on_the_FHQ_AuntUncle_list_view_page_it_lands_on_the_New_FHQ_Parent_record_producer_page() {

		fHQSurveyPortalPage.newButtonLinkOnListView.click();

		StepTestResult stepTestResult = new StepTestResult(
				"Clicked the New button on the FHQ AuntUncle list view page to lands on the New FHQ AuntUncle record producer page");

		scenarioReportList.add(stepTestResult);

	}

	@Then("fills the AuntUncle information")
	public void fills_the_AuntUncle_information() {

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.formViewButton, "Form View");

		ComponentTestResult headerBanner = FHQUtil.verifyLabel(fHQSurveyPortalPage.headerBanner,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleBanner, "Aunt/Uncle");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.shortDescriptionInformationBanner,
				"Aunts/Uncles Details");

		ComponentTestResult auntUncleRelationBanner = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleRelationBanner,
				"You are currently filling out information for the participants aunt/uncle.");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.shortDescriptionInformationBanner1,
				"Please enter one record per each family member for whom you have knowledge: ");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.relativeParticipantsMotherOrFatherSiblingLabel,
				"Is this relative the participant's mother's sibling or their father's sibling");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.relativeParticipantsMotherOrFatherSiblingBanner,
				"If you are filling out this form for your self you are the participant.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.relativeParticipantsMotherOrFatherSiblingDropDown,
				FHQSurveyPageConstants.PARENT_SIBLING, 0);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleTypeOfSiblingToParentLabel,
				"Please define the type of sibling?");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleTypeOfSiblingToParentDropDown, FHQSurveyPageConstants.TYPES_OF_SIBLINGS,
				1);

		StepTestResult stepTestResult = new StepTestResult("The AuntUncle information details are filled and verified");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(headerBanner);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(auntUncleRelationBanner);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest5);
		stepTestResult.add(dropdownTest1);
		scenarioReportList.add(stepTestResult);

	}

	@When("fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the AuntUncle related to the Patient")
	public void fills_the_First_Name_First_Initial_of_LAST_name_Year_of_Birth_Vital_Status_Year_of_Death_Age_of_Death_information_of_the_AuntUncle_related_to_the_Patient() {

		MiscUtils.sleep(300);
		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameLabel, "First Name");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameTextBox, "");

		fHQSurveyPortalPage.firstNameTextBox.sendKeys("Participant AuntUncle FN");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUnclefirstInitialLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.firstInitialLastName1(), 4);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthLabel, "Year of Birth");

		ComponentTestResult banner2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.dateLabelBanner2,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.yearOfBirthOrDeathAfter1900(),58);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusLabel, "Vital Status");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.VITAL_STATUS_LIST, 2);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOrAgeLabel,
				"Please provide the year of death or the age of death");

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.YEAR_OR_AGE_OF_DEATH, 1);

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathLabel, "Year of Death");

		ComponentTestResult banner3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.dateLabelBanners,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.yearOfBirthOrDeathAfter1900(), 98);

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfThisRelativeDeathLabel,
				"What was the cause of this relative death?");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathInformationBanner,
				"If you don't know, you can write \"don't know\" in the text box.");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfThisAuntUncleDeathTextBox, "");

		fHQSurveyPortalPage.causeOfThisAuntUncleDeathTextBox.sendKeys("Reason of Death of this relative is not Known");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest3);
		stepTestResult.add(banner2);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest5);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest6);
		stepTestResult.add(banner3);
		stepTestResult.add(dropdownTest4);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the Sex assigned at birth, Gender Identity information for the AuntUncle")
	public void fills_the_Sex_assigned_at_birth_Gender_Identity_information_for_the_AuntUncle() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthLabel,
				"Sex assigned at birth");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleSexAssignedAtBirthDropDown, FHQSurveyPageConstants.SEX_ASSIGNED_AT_BIRTH,
				2);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityLabel,
				"Gender Identity");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleGenderIdentitydDropDown, FHQSurveyPageConstants.GENDER_IDENTITY, 7);
		
		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.otherGenderIdentityLabel,
				"Other gender");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.otherGenderTextBox, "");

		fHQSurveyPortalPage.otherGenderTextBox.sendKeys("Other Gender Details");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Sex assigned at birth, Gender Identity information details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);

	}

	@When("fills the Type of birth Information for the AuntUncle")
	public void fills_the_Type_of_birth_Information_for_the_AuntUncle() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.isThisRelativeTwinOrMultipleBirthLabel,
				"Is this relative a twin or part of a multiple birth?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleTwinOrMultipleBirthDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfBirthLabel, "Type of birth");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleTypeOfBirthDropDown, FHQSurveyPageConstants.TYPE_OF_BIRTH, 3);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Type of birth Information details are filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);

	}

	@When("fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this AuntUncle")
	public void fills_Total_Miscarriages_Total_Still_births_Total_Induced_Abortions_Total_Tubal_Ectopic_Molar_Pregnancies_details_of_this_AuntUncle() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.pregnanciesLabel,
				"Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUnclepregnanciesDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalMiscarriagesLabel,
				"Total number of Miscarriages");

		ComponentTestResult bannerTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalMiscarriagesBanner,
				"(less than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleTotalMiscarriagesDropDown, FHQSurveyPageConstants.numberUpToN(20), 3);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalStillbirthsLabel,
				"Total number of Stillbirths");

		ComponentTestResult bannerTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalStillbirthsBanner,
				"(more than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleTotalStillbirthsDropDown, FHQSurveyPageConstants.numberUpToN(20), 4);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalInducedAbortionsLabel,
				"Total number of Induced Abortions");

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleTotalInducedAbortionsDropDown, FHQSurveyPageConstants.numberUpToN(20), 5);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.totalTubalEctopicMolarPregnanciesLabel1,
				"Total number of Tubal/Ectopic/Molar Pregnancies");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleTotalTubalEctopicMolarPregnanciesDropDown,
				FHQSurveyPageConstants.numberUpToN(20), 6);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle details on Total Live Births, Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies are filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(bannerTest1);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(bannerTest2);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest4);

		scenarioReportList.add(stepTestResult);

	}

	@Then("fills the Patient AuntUncle Resopathy details")
	public void fills_the_Patient_AuntUncle_Resopathy_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithRasopathyLabel,
				"Has this relative been diagnosed with a RASopathy?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithRasopathyBanner,
				"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncleResopathyDianosisDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rasopathyAddButtonInfoBanner,
				"Please select the 'Add' button below to add each RASopathy this relative has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Resopathy details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);
	}

	@When("AuntUncle Rasopathy MRVS details are filled")
	public void auntUncle_Rasopathy_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.rASopathyLabel, "RASopathy");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRasopathyButton, "Add");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllRasopathyButton,
				"Remove All");

		fHQSurveyPortalPage.addRasopathyButton.click();

		MiscUtils.sleep(1000);

		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowTypeOfDiagnosisLabel,
				"RASopathy");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowTypeOfDiagnosisDropDown, FHQSurveyPageConstants.RESOPATHY_TYPE, 7);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisLabel,
				"Specify other RASopathy");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox, "");

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other Rasopathy for AuntUncle");

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

		MiscUtils.sleep(300);

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
				"The Participant AuntUncle RASopathy MRVS details are filled and verified ");

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

	@When("AuntUncle Rasopathy MRVS table are verified")
	public void auntUncle_Rasopathy_MRVS_table_are_verified() {

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

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.auntUncleSpecifyOtherRASopathyBannerValue, "Other Rasopathy for AuntUncle");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosisBannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosisBannerValue, "");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosisBannerValue, "18");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformationBannerValue,
				"Additional Rasopathy Information Details added");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Aunt/Uncle Rasopathy MRVS tables are verified");

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

	@Then("fills the Patient AuntUncle Cancer details")
	public void fills_the_Patient_AuntUncle_Cancer_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithCancerLabel,
				"Has this relative ever been diagnosed with cancer?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithCancerBanner,
				"If yes, please enter a date or age of diagnosis if possible.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUnclediagnosedWithCancerDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.auntUnclediagnosedWithCancerAddButtonInfo,
				"Please select the 'Add' button below to add each cancer this relative has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Cancer details are filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);
	}

	@When("AuntUncle Cancer MRVS details are filled")
	public void auntUncle_Cancer_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cancerLabel, "Cancer(s)");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addCancerButton, "Add");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllCancerButton, "Remove All");

		fHQSurveyPortalPage.addCancerButton.click();

		MiscUtils.sleep(200);
		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowTypeOfDiagnosisLabel, "Cancer");

		MiscUtils.sleep(500);
		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowTypeOfDiagnosisDropDown, FHQSurveyPageConstants.CANCER_TYPE, 41);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisLabel,
				"Specify other cancer");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox, "");

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other Cancer for AuntUncle");

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

		fHQSurveyPortalPage.addRowsaveButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Cancer MRVS details are filled and verified");

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

	@When("AuntUncle Cancer MRVS table are verified")
	public void AuntUncle_Cancer_MRVS_table_are_verified() {

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

		ComponentTestResult labelTest10 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.auntUncleSpecifyOtherCancerBannerValue, "Other Cancer for AuntUncle");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosis1BannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosis1BannerValue, "");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosis1BannerValue, "29");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformation1BannerValue,
				"Additional Cancer Information Details added");

		StepTestResult stepTestResult = new StepTestResult("The Participant AuntUncle Cancer MRVS tables are verified");

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

	@Then("fills the Patient AuntUncle Medical Conditions details")
	public void fills_the_Patient_AuntUncle_Medical_Conditions_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithMedicalConditionsLabel,
				"Has this relative ever been diagnosed with any of the medical conditions listed below?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithMedicalConditionsBanner,
				"Congenital heart disease, developmental disorder, uncommon physical features, other medical conditions.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUnclediagnosedWithMedicalConditionsDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.auntUncleDiagnosedWithMedicalConditionsAddButtonInfo,
				"Please select the 'Add' button below to add each medical condition this relative has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Medical Conditions details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);

	}

	@Then("AuntUncle Medical Conditions MRVS details are filled")
	public void auntUncle_Medical_Conditions_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.medicalConditionsLabel,
				"Medical Condition(s)");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addMedicalConditionsAuntUncleButton,
				"Add");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllMedicalConditionButton,
				"Remove All");

		fHQSurveyPortalPage.addMedicalConditionsAuntUncleButton.click();

		MiscUtils.sleep(500);
		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowTypeOfDiagnosisLabel,
				"Medical Condition");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowTypeOfDiagnosisDropDown, FHQSurveyPageConstants.MEDICAL_CONDITIONS_TYPE, 2);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisLabel,
				"Specify medical condition");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox, "");

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other Developmental disorder Details");

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
				"The Participant AuntUncle Medical Conditions MRVS details are filled and verified");

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

	@When("AuntUncle Medical Conditions MRVS table are verified")
	public void auntUncle_Medical_Conditions_MRVS_table_are_verified() {

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

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childMedicalConditionBannerValue,
				"Developmental disorder");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.childSpecifyMedicalConditionBannerValue, "Other Developmental disorder Details");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosis2BannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosis2BannerValue, "");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosis2BannerValue, "26");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Medical Conditions MRVS tables are verified");

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

	@Then("AuntUncle Total children details are filled")
	public void auntUncle_Total_children_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.auntUncletotalChildrenThisRelativeHadLabel,
				"How many total children (alive and deceased) has this relative had?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.includeAllChildrenBanner,
				"Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.auntUncletotalChildrenThisRelativeHadDropDown,
				FHQSurveyPageConstants.numberUpToN(20), 4);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.addButtonEachChildThisRelativeHasBanner,
				"Please select the 'Add' button below to add each Child this relative has had.");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childLabel, "Child");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleAddChildMRVSButton, "Add");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleRemoveAllChildMRVSButton,
				"Remove All");

		fHQSurveyPortalPage.auntUncleAddChildMRVSButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Total children details are filled");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}

	@When("AuntUncle Child MRVS details are filled")
	public void AuntUncle_Child_MRVS_details_are_filled() {

		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.addChildRowBanner, "Add Row");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildFirstNameLabel,
				"First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildFirstNameTextbox, "");

		fHQSurveyPortalPage.addRowChildFirstNameTextbox.sendKeys("Aunt Child FN");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildFirstInitialOfLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowChildFirstInitialOfLastNameDropDown,
				FHQSurveyPageConstants.firstInitialLastName(), 5);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildVitalStatusLabel,
				"Vital Status");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowPatientChildVitalStatusDropDown, FHQSurveyPageConstants.VITAL_STATUS_LIST, 3);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowCancelButton, "Cancel");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowsaveButton, "Add");

		fHQSurveyPortalPage.addRowsaveButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Child MRVS details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);

		scenarioReportList.add(stepTestResult);

	}

	@When("AuntUncle child MRVS table are verified")
	public void auntUncle_child_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.actions3Banner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childFirstNameBanner, "First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childFirstInitialOfLastNameBanner,
				"First Initial of LAST Name");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childVitalStatusBanner,
				"Vital Status");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsEdit3, "");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.actionsDelete3, "");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleFirstNameBannerValue,
				"Aunt Child FN");

		ComponentTestResult labelTest7 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.auntUncleFirstInitialOfLastNameBannerValue, "E");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleVitalStatusBannerValue,
				"Don't Know");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle Child MRVS tables Information is verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the additional Information about the AuntUncle")
	public void fills_the_additional_Information_about_the_AuntUncle() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.anythingElseAboutThisRelativeLabel,
				"Is there anything else you would like us to know about this relative?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.anythingElseAboutAuntUncleTextBox, "");

		fHQSurveyPortalPage.anythingElseAboutAuntUncleTextBox
				.sendKeys("There is nothing else to say about this AuntUncle");

		StepTestResult stepTestResult = new StepTestResult(
				"Is there anything else you would like us to know about Aunt Uncle details are filled");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);

		scenarioReportList.add(stepTestResult);
	}

	@Then("Generate Scenario Report for the details of the patient AuntUncle in the FHQ Survey")
	public void generate_Scenario_Report_for_the_details_of_the_patient_AuntUncle_in_the_FHQ_Survey_page() {

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());

		}
	}

	@Then("finally click the Complete-Submit Button to submit the patient AuntUncle record producer")
	public void finally_click_the_Complete_Submit_Button_to_submit_the_patient_AuntUncle_record_producer() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.CompleteAndSubmitButton,
				"Complete and Submit");

		fHQSurveyPortalPage.CompleteAndSubmitButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"Finally clicked the Complete-Submit Button to submit the Participant Aunt-Uncle record producer");

		stepTestResult.add(labelTest);

		scenarioReportList.add(stepTestResult);

	}

	@When("AuntUncle list view page is updated and verified")
	public void auntUncle_list_view_page_is_updated_and_verified() {

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleFirstNameOnListViewValue1,
				"Participant AuntUncle FN");

		ComponentTestResult labelTest2 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.auntUncleFirstInitialOfLastNameOnListViewValue1, "D");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleVitalStatusOnListViewValue1,
				"Deceased");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleYearOfBirthOnListViewValue1,
				"1955");

		ComponentTestResult labelTest5 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.auntUncleRelationToPatientOnListViewValue1, "Aunt");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant AuntUncle list view page is updated and verified");

		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}

	@When("click the new AuntUncle added and verify the completed record producer data")
	public void click_the_new_AuntUncle_added_and_verify_the_completed_record_producer_data() {

		fHQSurveyPortalPage.auntUncleFirstNameOnListViewValue1.click();

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel1,
				"\n"
				+ "    Family Cohort Study Management System: RASopathies \n"
				+ "   ");

		MiscUtils.sleep(300);

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.completedFormViewButton,
				"Complete Form View");

		ComponentTestResult childNameTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.auntUncleFirstNameBannerOnCRP,
				"Participant AuntUncle FN");

		Assert.assertTrue("First Name Banner do not match",
				fHQSurveyPortalPage.auntUncleFirstNameBannerOnCRP.getText().contentEquals("Participant AuntUncle FN"));

		System.out.println("First Name Banner Matched");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingToOnCRP, "Sibling to");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingToOnCRPValue,
				"FHQ Parent: Participant Mother FN");

		Assert.assertTrue("Parent of this relative do not match",
				fHQSurveyPortalPage.siblingToOnCRPValue.getText().contentEquals("FHQ Parent: Participant Mother FN"));

		System.out.println("Parent of this relative Matched");

		ComponentTestResult typeSiblingTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfSiblingOnCRP,
				"Type of sibling");

		ComponentTestResult typeSiblingOptionTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfSiblingOnCRPValue,
				"Sister");

		Assert.assertTrue("Type of sibling do not match",
				fHQSurveyPortalPage.typeOfSiblingOnCRPValue.getText().contentEquals("Sister"));

		System.out.println("Type of sibling Matched");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnCRP, "First Name");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnCRPValue,
				"Participant AuntUncle FN");

		Assert.assertTrue("First Name do not match ", fHQSurveyPortalPage.firstNameOnCRPValue.getAttribute("value")
				.contentEquals("Participant AuntUncle FN"));

		System.out.println("First Name Matched");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLASTNameOnCRP,
				"First Initial of LAST Name");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLASTNameOnCRPValue, "D");

		Assert.assertTrue("First Initial of LAST Name do not match ",
				fHQSurveyPortalPage.firstInitialOfLASTNameOnCRPValue.getAttribute("value").contentEquals("D"));

		System.out.println("First Initial of LAST Name Matched");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnCRP, "Year of Birth");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnCRPValue, "1955");

		Assert.assertTrue("Year of Birth do not match ",
				fHQSurveyPortalPage.yearOfBirthOnCRPValue.getAttribute("value").contentEquals("1955"));

		System.out.println("Year of Birth Matched");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusOnCRP, "Vital Status");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusOnCRPValue, "Deceased");

		Assert.assertTrue("Vital Status do not match ",
				fHQSurveyPortalPage.vitalStatusOnCRPValue.getText().contentEquals("Deceased"));

		System.out.println("Vital Status Matched");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOrAgeOfDeathOnCRP,
				"Please provide the year of death or the age of death");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOrAgeOfDeathOnCRPValue,
				"Year of Death");

		Assert.assertTrue("The year of death or the age of death do not match ",
				fHQSurveyPortalPage.yearOfDeathOrAgeOfDeathOnCRPValue.getText().contentEquals("Year of Death"));

		System.out.println("The year of death or the age of death Matched");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOnCRP, "Year of Death");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOnCRPValue, "1995");

		Assert.assertTrue("Year of Death do not match ",
				fHQSurveyPortalPage.yearOfDeathOnCRPValue.getAttribute("value").contentEquals("1995"));

		System.out.println("Year of Death Matched");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathOnCRP,
				"What was the cause of this relative death?");

		ComponentTestResult labelTest15 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathOnCRPValue2,
				"Reason of Death of this relative is not Known");

		Assert.assertTrue("The cause of this relative death do not match ", fHQSurveyPortalPage.causeOfDeathOnCRPValue2
				.getAttribute("value").contentEquals("Reason of Death of this relative is not Known"));

		System.out.println("The cause of this relative death Matched");

		ComponentTestResult labelTest16 = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthOnCRP,
				"Sex assigned at birth");

		ComponentTestResult labelTest17 = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthOnCRPValue,
				"Female");

		Assert.assertTrue("Sex assigned at birth do not match ",
				fHQSurveyPortalPage.sexAssignedAtBirthOnCRPValue.getText().contentEquals("Female"));

		System.out.println("Sex assigned at birth Matched");

		ComponentTestResult labelTest18 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityOnCRP,
				"Gender Identity");

		ComponentTestResult labelTest19 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityOnCRPValue1,
				"Additional gender category (write in)");

		Assert.assertTrue("Gender Identity do not match ", fHQSurveyPortalPage.genderIdentityOnCRPValue1.getText()
				.contentEquals("Additional gender category (write in)"));

		System.out.println("Gender Identity Matched");

		ComponentTestResult labelTest20 = FHQUtil.verifyLabel(fHQSurveyPortalPage.otherGenderOnCRP, "Other gender");

		ComponentTestResult labelTest21 = FHQUtil.verifyLabel(fHQSurveyPortalPage.otherGenderOnCRPValue,
				"Other Gender Details");

		Assert.assertTrue("Other gender do not match ",
				fHQSurveyPortalPage.otherGenderOnCRPValue.getAttribute("value").contentEquals("Other Gender Details"));

		System.out.println("Other gender Matched");

		ComponentTestResult labelTest22 = FHQUtil.verifyLabel(fHQSurveyPortalPage.twinOnCRP,
				"Is this relative a twin or part of a multiple birth?");

		ComponentTestResult labelTest23 = FHQUtil.verifyLabel(fHQSurveyPortalPage.twinOnCRPValue1, "Yes");

		Assert.assertTrue("Is this relative a twin or part of a multiple birth do not match ",
				fHQSurveyPortalPage.twinOnCRPValue1.getText().contentEquals("Yes"));

		System.out.println("Is this relative a twin or part of a multiple birth Matched");

		ComponentTestResult labelTest24 = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfBirthOnCRP, "Type of birth");

		ComponentTestResult labelTest25 = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfBirthOnCRPValue1,
				"Identical Triplet");

		Assert.assertTrue("Type of birth do not match ",
				fHQSurveyPortalPage.typeOfBirthOnCRPValue1.getText().contentEquals("Identical Triplet"));

		System.out.println("Type of birth Matched");

		ComponentTestResult labelTest26 = FHQUtil.verifyLabel(fHQSurveyPortalPage.miscarriageStillBirthsOnCRP,
				"Has this relative ever had any miscarriages, stillbirths, induced abortions ...");

		ComponentTestResult labelTest27 = FHQUtil.verifyLabel(fHQSurveyPortalPage.miscarriageStillBirthsOnCRPValue,
				"Yes");

		Assert.assertTrue("Has this relative ever had any miscarriages, stillbirths, induced abortions do not match ",
				fHQSurveyPortalPage.miscarriageStillBirthsOnCRPValue.getText().contentEquals("Yes"));

		System.out.println(
				"Has this relative ever had any miscarriages, stillbirths, induced abortions do not match Matched");

		ComponentTestResult labelTest28 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfMiscarriagesOnCRP,
				"Total number of Miscarriages");

		ComponentTestResult labelTest29 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfMiscarriagesOnCRPValue1,
				"0");

		Assert.assertTrue("Total number of Miscarriages do not match ",
				fHQSurveyPortalPage.totalNumberOfMiscarriagesOnCRPValue1.getAttribute("value").contentEquals("0"));

		System.out.println("Total number of Miscarriages Matched");

		ComponentTestResult labelTest30 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totaNumberOfStillbirthsOnCRP,
				"Total number of Stillbirths");

		ComponentTestResult labelTest31 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totaNumberOfStillbirthsOnCRPValue1,
				"1");

		Assert.assertTrue("Total number of Stillbirths do not match ",
				fHQSurveyPortalPage.totaNumberOfStillbirthsOnCRPValue1.getAttribute("value").contentEquals("1"));

		System.out.println("Total number of Stillbirths Matched");

		ComponentTestResult labelTest32 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfInducedAbortionsOnCRP,
				"Total number of Induced Abortions");

		ComponentTestResult labelTest33 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.totalNumberOfInducedAbortionsOnCRPValue1, "2");

		Assert.assertTrue("Total number of Tubal/Ectopic/Molar Pregnancies do not match ",
				fHQSurveyPortalPage.totalNumberOfInducedAbortionsOnCRPValue1.getAttribute("value").contentEquals("2"));

		System.out.println("Which best describes this relative Matched");

		ComponentTestResult labelTest34 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfTubalOnCRP1,
				"Total number of Tubal/Ectopic/Molar Pregnancies");

		ComponentTestResult labelTest35 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfTubalOnCRPValue2, "3");

		Assert.assertTrue("Total number of Tubal/Ectopic/Molar Pregnancies do not match ",
				fHQSurveyPortalPage.totalNumberOfTubalOnCRPValue2.getAttribute("value").contentEquals("3"));

		System.out.println("Total number of Tubal/Ectopic/Molar Pregnancies Matched");

		ComponentTestResult labelTest36 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithRASopathyOnCRP,
				"Has this relative been diagnosed with a RASopathy?");

		ComponentTestResult labelTest37 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithRASopathyOnCRPValue,
				"Yes");

		Assert.assertTrue("Has this relative been diagnosed with a RASopathy? do not match ",
				fHQSurveyPortalPage.diagnosedWithRASopathyOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative been diagnosed with a RASopathy Matched");

		ComponentTestResult labelTest38 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithCancerOnCRP,
				"Has this relative ever been diagnosed with cancer?");

		ComponentTestResult labelTest39 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithCancerOnCRPValue, "Yes");

		Assert.assertTrue("Has this relative ever been diagnosed with cancer do not match ",
				fHQSurveyPortalPage.diagnosedWithCancerOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative ever been diagnosed with cancer Matched");

		ComponentTestResult labelTest40 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithMedicalConditionsOnCRP,
				"Has this relative ever been diagnosed with any medical conditions?");

		ComponentTestResult labelTest41 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.diagnosedWithMedicalConditionsOnCRPValue1, "Yes");

		Assert.assertTrue("Has this relative ever been diagnosed with any medical conditions do not match ",
				fHQSurveyPortalPage.diagnosedWithMedicalConditionsOnCRPValue1.getText().contentEquals("Yes"));

		System.out.println("Has this relative ever been diagnosed with any of the medical conditions");

		ComponentTestResult labelTest42 = FHQUtil.verifyLabel(fHQSurveyPortalPage.howManyChildrenOnCRP1,
				"How many total children (alive and deceased) does this relative have?");

		ComponentTestResult labelTest43 = FHQUtil.verifyLabel(fHQSurveyPortalPage.howManyChildrenOnCRPValue2, "1");

		Assert.assertTrue("How many total children (alive and deceased) has this relative had do not match ",
				fHQSurveyPortalPage.howManyChildrenOnCRPValue2.getText().contentEquals("1"));

		System.out.println("How many total children (alive and deceased) does this relative have?");

		 ComponentTestResult labelTest44 =
		 FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInfoOnCRP,
		 "Is there anything else you would like us to know about this relative?");

		ComponentTestResult labelTest45 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInfoOnCRPValue2,
				"There is nothing else to say about this AuntUncle");

		Assert.assertTrue("Is there anything else you would like us to know about this relative do not match ",
				fHQSurveyPortalPage.additionalInfoOnCRPValue2.getAttribute("value")
						.contentEquals("There is nothing else to say about this AuntUncle"));

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
				"Verified the new AuntUncle added and all the field data in the completed record producer");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(childNameTest);
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(typeSiblingTest);
		stepTestResult.add(typeSiblingOptionTest);
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

		scenarioReportList.add(stepTestResult);

	}

}
