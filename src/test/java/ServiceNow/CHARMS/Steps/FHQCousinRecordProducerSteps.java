package ServiceNow.CHARMS.Steps;

import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.By;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.CHARMS.Constants.FHQSurveyPageConstants;
import ServiceNow.CHARMS.Pages.FHQSurveyPortalPage;
import ServiceNow.CHARMS.Utils.ComponentTestResult;
import ServiceNow.CHARMS.Utils.FHQUtil;
import ServiceNow.CHARMS.Utils.StepTestResult;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FHQCousinRecordProducerSteps extends PageInitializer {

	private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

	/* ******************** NEW FHQ COUSIN RECORD PRODUCER********************** */

	@Given("user clicks the Cousin Grid link on FHQ Grid page to land on the FHQ Cousin list view page")
	public void user_clicks_the_Cousin_Grid_link_on_FHQ_Grid_page_to_land_on_the_FHQ_Cousin_list_view_page() {

		fHQSurveyPortalPage.cousinsLinkOnFamilyGrid.click();

		StepTestResult stepTestResult = new StepTestResult(
				"User clicked the Cousin link on FHQ Grid page to land on the FHQ Cousin list view page");

		scenarioReportList.add(stepTestResult);

	}

	@Given("verifies the Cousin List View details")
	public void verifies_the_Cousin_List_View_details() {

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel1,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listViewButton, "List View");

		ComponentTestResult contextMenuTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinContextMenuButton, "");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinsBanner, "Cousins");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.newButtonLinkOnListView, "New");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rowsDetailsOnListView,
				"The blue highlighted rows represent the incompleted family records");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.allDetailsOnListView, "All");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.cousinRelationToPatientBannerOnListView, "Relation to patient = Cousin");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnListView, "First Name");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLastNameOnListView,
				"First Initial of Last Name");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusOnListView, "Vital Status");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnListView,
				"Year of Birth");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationToPatientOnListView,
				"Relation to patient");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthOnListView,
				"Sex assigned at birth");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinFirstNameOnListViewValue,
				"Aunt Child FN");

		ComponentTestResult labelTest13 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.cousinFirstInitialOfLastNameOnListViewValue, "E");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinrenVitalStatusOnListViewValue,
				"Don't Know");

		ComponentTestResult labelTest15 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinYearOfBirthOnListViewValue, "");

		ComponentTestResult labelTest16 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.cousinRelationToPatientOnListViewValue, "Cousin");

		ComponentTestResult labelTest17 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.cousinSexAssignedAtBirthtOnListViewValue, "");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousins details on the List View page are verified");

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
		stepTestResult.add(labelTest13);
		stepTestResult.add(labelTest14);
		stepTestResult.add(labelTest15);
		stepTestResult.add(labelTest16);
		stepTestResult.add(labelTest17);

		scenarioReportList.add(stepTestResult);

	}

	@When("clicks the New button on the FHQ Cousin list view page it lands on the New FHQ Cousin record producer page")
	public void clicks_the_New_button_on_the_FHQ_Cousin_list_view_page_it_lands_on_the_New_FHQ_Cousin_record_producer_page() {

		fHQSurveyPortalPage.newButtonLinkOnListView.click();

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel1,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.formViewButton, "Form View");

		ComponentTestResult headerBanner = FHQUtil.verifyLabel(fHQSurveyPortalPage.headerBanner,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinBanner, "Cousin");

		ComponentTestResult childRelationBanner = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinRelationBanner,
				"You are currently filling out information for the participants cousin.");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.fHQChildBanner1,
				"Please make sure you have completed all partner records before completing children records.");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentOfThisCousinLabel,
				"Who is the parent of this cousin?");

		ComponentTestResult banner = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentOfThisCousinBanner,
				"If the aunt/uncle name is not visible in the dropdown, that means the aunt/uncle record is incomplete on the home page. Please return to the homepage and complete the aunt/uncle record(s) before completing the cousin records.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.parentOfThisCousinDropDown, FHQSurveyPageConstants.PARENT_COUSIN, 0);

		MiscUtils.sleep(300);

		StepTestResult stepTestResult = new StepTestResult(
				"Clicked the New button on the FHQ Cousin list view page to lands on the New FHQ Cousin record producer page");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(headerBanner);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(headerBanner);
		stepTestResult.add(labelTest);
		stepTestResult.add(childRelationBanner);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(banner);
		stepTestResult.add(dropdownTest);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Cousin")
	public void fills_the_First_Name_First_Initial_of_LAST_name_Year_of_Birth_Vital_Status_Year_of_Death_Age_of_Death_information_for_the_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinFirstNameLabel, "First Name");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinFirstNameTextBox, "");

		fHQSurveyPortalPage.cousinFirstNameTextBox.sendKeys("Participant Cousin FN");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.firstInitialLastName(), 10);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthLabel, "Year of Birth");

		ComponentTestResult estimatedAgeBanner1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.dateLabelBanner4,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.yearOfBirthOrDeathAfter1900(), 90);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusLabel, "Vital Status");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.VITAL_STATUS_LIST, 2);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOrAgeLabel,
				"Please provide the year of death or the age of death");

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.YEAR_OR_AGE_OF_DEATH, 1);

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathLabel, "Year of Death");

		ComponentTestResult estimatedAgeBanner2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.dateLabelBanner5,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.yearOfBirthOrDeathAfter1900(), 80);

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfThisRelativeDeathLabel,
				"What was the cause of this relatives death?");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathInformationBanner1,
				"If you don't know, you can write \"don't know\" in the text box.");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfThisAuntUncleDeathTextBox, "");

		fHQSurveyPortalPage.causeOfThisAuntUncleDeathTextBox
				.sendKeys("Reason of Death of this Participant's Cousin is not Known");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousin First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information is filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest3);
		stepTestResult.add(estimatedAgeBanner1);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest4);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest5);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest6);
		stepTestResult.add(estimatedAgeBanner2);
		stepTestResult.add(dropdownTest4);
		stepTestResult.add(labelTest7);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the Sex assigned at birth, Gender Identity information for the Cousin")
	public void fills_the_Sex_assigned_at_birth_Gender_Identity_information_for_the_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthLabel,
				"Sex assigned at birth");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.SEX_ASSIGNED_AT_BIRTH, 2);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityLabel,
				"Gender Identity");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.GENDER_IDENTITY, 3);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousin Sex assigned at birth and Gender Identity information is filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);

	}

	@When("fills Which best describes this Cousin and the Type of birth Information for the Cousin related to the Patients")
	public void fills_Which_best_describes_this_Cousin_and_the_Type_of_birth_Information_for_the_Cousin_related_to_the_Patients() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.bestDescribeThisRelativeLabel,
				"Which best describes this relative?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.CHILD_DISCRIPTION, 2);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.isThisRelativeTwinOrMultipleBirthLabel,
				"Is this relative a twin or part of a multiple birth?");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.isThisCousinTwinOrMultipleBirthDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		MiscUtils.sleep(1000);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfBirthLabel, "Type of birth");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.typeOfBirthOfCousinDropDown, FHQSurveyPageConstants.TYPE_OF_BIRTH, 2);

		StepTestResult stepTestResult = new StepTestResult(
				"Which best describes this Cousin and the Type of birth Information details of the Participant's Cousin is filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(dropdownTest2);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Cousin")
	public void fills_Total_Miscarriages_Total_Still_births_Total_Induced_Abortions_Total_Tubal_Ectopic_Molar_Pregnancies_details_of_this_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.BirthsLabel,
				"Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.birthsBanner,
				"Please identify the number of each of the following pregnancy results for this person.");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalMiscarriagesLabel,
				"Total number of Miscarriages");

		ComponentTestResult bannerTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalMiscarriagesBanner,
				"(less than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.numberUpToN(20), 5);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalStillbirthsLabel,
				"Total number of Stillbirths");

		ComponentTestResult bannerTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalStillbirthsBanner,
				"(more than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.numberUpToN(20), 6);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalInducedAbortionsLabel,
				"Total number of Induced Abortions");

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.numberUpToN(20), 7);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalTubalEctopicMolarPregnanciesLabel,
				"Total number of Tubal/Ectopic/Molar Pregnancies");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.numberUpToN(20), 8);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousin Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies information details are filled and verified");

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

	@When("fills the Resopathy details for Cousin")
	public void fills_the_Resopathy_details_for_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.relativeDiagnosedWithRasopathyLabel,
				"Has this relative been diagnosed with a RASopathy?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.diagnosedWithRasopathyInformationBanner,
				"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.personDiagnosedWithRasopathyAddButtonInfo,
				"Please select the 'Add' button below to add each RASopathy this relative has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousin RASopathy details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);

	}

	@When("Rasopathy MRVS details are filled for Cousin")
	public void rasopathy_MRVS_details_are_filled_for_Cousin() {

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

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other Rasopathy for Cousin");

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
				"The Participant's Cousin RASopathy MRVS details are filled and verified ");

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

	@When("Cousin Rasopathy MRVS table are verified")
	public void cousin_Rasopathy_MRVS_table_are_verified() {

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
				.verifyLabel(fHQSurveyPortalPage.cousinSpecifyOtherRASopathyBannerValue, "Other Rasopathy for Cousin");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosisBannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosisBannerValue, "");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosisBannerValue, "18");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformationBannerValue,
				"Additional Rasopathy Information Details added");

		StepTestResult stepTestResult = new StepTestResult("The Participant Cousin Rasopathy MRVS tables are verified");

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

	@When("fills the Cancer details for Cousin")
	public void fills_the_Cancer_details_for_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.relativeDiagnosedWithCancerLabel,
				"Has this relative ever been diagnosed with cancer?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.personDiagnosedWithCancerAddButtonInfo,
				"Please select the 'Add' button below to add each cancer this person has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousin Cancer details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);

		scenarioReportList.add(stepTestResult);

	}

	@When("Cancer MRVS details are filled for Cousin")
	public void cancer_MRVS_details_are_filled_for_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cancerLabel, "Cancer(s)");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addCancerButton, "Add");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllCancerButton, "Remove All");

		fHQSurveyPortalPage.addCancerButton.click();

		MiscUtils.sleep(300);
		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowBanner, "Add Row");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowTypeOfDiagnosisLabel, "Cancer");

		MiscUtils.sleep(500);
		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowTypeOfDiagnosisDropDown, FHQSurveyPageConstants.CANCER_TYPE, 41);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisLabel,
				"Specify other cancer");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox, "");

		fHQSurveyPortalPage.addRowOtherTypeOfDiagnosisTextBox.sendKeys("Other Cancer for Cousin");

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
				"The Participant Cousin Cancer MRVS details are filled and verified");

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

	@When("Cousin Cancer MRVS table are verified")
	public void cousin_Cancer_MRVS_table_are_verified() {

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

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinSpecifyOtherCancerBannerValue,
				"Other Cancer for Cousin");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOrAgeOfDiagnosis1BannerValue,
				"Age of diagnosis");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDiagnosis1BannerValue, "");

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.ageOfDiagnosis1BannerValue, "29");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInformation1BannerValue,
				"Additional Cancer Information Details added");

		StepTestResult stepTestResult = new StepTestResult("The Participant Cousin Cancer MRVS tables are verified");

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

	@When("fills the Medical Conditions details for Cousin")
	public void fills_the_Medical_Conditions_details_for_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.relativeDiagnosedWithMedicalConditionsLabel,
				"Has this relative ever been diagnosed with any of the medical conditions listed below?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.diagnosedWithMedicalConditionsBanner,
				"Congenital heart disease, Developmental disorder, uncommon physical features, Other medical conditions.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.relativeDiagnosedWithMedicalConditionsAddButtonInfo,
				"Please select the 'Add' button below to add each medical condition this person has had.");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousin Medical Conditions details are filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);

	}

	@When("Medical Conditions MRVS details are filled for Cousin")
	public void medical_Conditions_MRVS_details_are_filled_for_Cousin() {

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
				"The Participant Cousin Medical Conditions MRVS details are filled and verified");

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

	@When("Cousin Medical Conditions MRVS table are verified")
	public void child_Medical_Conditions_MRVS_table_are_verified() {

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
				"The Participant Cousin Medical Conditions MRVS tables are verified");

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

	@When("Cousin Total children details are filled")
	public void cousin_Total_children_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalChildrenThisRelativeHadLabel,
				"How many total children (alive and deceased) has this relative had?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.includeAllChildrenBanner,
				"Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown2,
				FHQSurveyPageConstants.numberUpToN(20), 5);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant NieceNephew Total children information details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the additional Information about the Cousin")
	public void fills_the_additional_Information_about_the_Cousin() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.anythingElseAboutThisRelativeLabel,
				"Is there anything else you would like us to know about this relative?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.anythingElseAboutChildTextBox, "");

		fHQSurveyPortalPage.anythingElseAboutChildTextBox
				.sendKeys("There is nothing else to say about this Participant Cousin");

		StepTestResult stepTestResult = new StepTestResult(
				"Is there anything else you would like us to know about this Participant Cousin details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);

		scenarioReportList.add(stepTestResult);
	}

	@Then("Generate Scenario Report for the details of the patient Cousin in the FHQ Survey")
	public void generate_Scenario_Report_for_the_details_of_the_patient_Cousin_in_the_FHQ_Survey_page() {

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());

		}
	}

	@When("finally click the Complete-Submit Button to submit the patient Cousin record producer")
	public void finally_click_the_Complete_Submit_Button_to_submit_the_patient_Cousin_record_producer() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.CompleteAndSubmitButton,
				"Complete and Submit");

		fHQSurveyPortalPage.CompleteAndSubmitButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"Finally clicked the Complete-Submit Button to submit the Participant Cousin record producer");

		stepTestResult.add(labelTest);

		scenarioReportList.add(stepTestResult);

	}

	@When("Cousin list view page is updated and verified")
	public void cousin_list_view_page_is_updated_and_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinFirstNameOnListViewValue1,
				"Participant Cousin FN");

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.cousinFirstInitialOfLastNameOnListViewValue1, "J");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinrenVitalStatusOnListViewValue1,
				"Deceased");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinYearOfBirthOnListViewValue1,
				"1987");

		ComponentTestResult labelTest4 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.cousinRelationToPatientOnListViewValue1, "Cousin");

		ComponentTestResult labelTest5 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.cousinSexAssignedAtBirthtOnListViewValue1, "Female");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Cousin list view page is updated and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}

	@When("click the new Cousin added and verify the completed record producer data")
	public void click_the_new_Cousin_added_and_verify_the_completed_record_producer_data() {

		fHQSurveyPortalPage.cousinFirstNameOnListViewValue1.click();

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel1,
				"Family Cohort Study Management System: RASopathies");

		MiscUtils.sleep(300);

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.completedFormViewButton,
				"Complete Form View");

		ComponentTestResult childNameTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.cousinFirstNameBannerOnCRP,
				"Participant Cousin FN");

		Assert.assertTrue("First Name Banner do not match",
				fHQSurveyPortalPage.cousinFirstNameBannerOnCRP.getText().contentEquals("Participant Cousin FN"));

		System.out.println("First Name Banner Matched");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentOfThisRelativeOnCRP,
				"Parent of this relative");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentOfThisRelativeOnCRPValue,
				"FHQ Aunt/Uncle: Participant AuntUncle FN");

		Assert.assertTrue("Parent of this relative do not match", fHQSurveyPortalPage.parentOfThisRelativeOnCRPValue
				.getText().contentEquals("FHQ Aunt/Uncle: Participant AuntUncle FN"));

		System.out.println("Parent of this relative Matched");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnCRP, "First Name");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnCRPValue,
				"Participant Cousin FN");

		Assert.assertTrue("First Name do not match ",
				fHQSurveyPortalPage.firstNameOnCRPValue.getAttribute("value").contentEquals("Participant Cousin FN"));

		System.out.println("First Name Matched");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLASTNameOnCRP,
				"First Initial of LAST Name");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLASTNameOnCRPValue, "J");

		Assert.assertTrue("First Initial of LAST Name do not match ",
				fHQSurveyPortalPage.firstInitialOfLASTNameOnCRPValue.getAttribute("value").contentEquals("J"));

		System.out.println("First Initial of LAST Name Matched");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnCRP, "Year of Birth");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnCRPValue, "1987");

		Assert.assertTrue("Year of Birth do not match ",
				fHQSurveyPortalPage.yearOfBirthOnCRPValue.getAttribute("value").contentEquals("1987"));

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

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOnCRPValue, "1977");

		Assert.assertTrue("Year of death do not match ",
				fHQSurveyPortalPage.yearOfDeathOnCRPValue.getAttribute("value").contentEquals("1977"));

		System.out.println("Year of death Matched");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathOnCRP,
				"What was the cause of this relative death?");

		ComponentTestResult labelTest15 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathOnCRPValue1,
				"Reason of Death of this Participant's Cousin is not Known");

		Assert.assertTrue("The cause of this relative death do not match ", fHQSurveyPortalPage.causeOfDeathOnCRPValue1
				.getAttribute("value").contentEquals("Reason of Death of this Participant's Cousin is not Known"));

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

		ComponentTestResult labelTest19 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityOnCRPValue2,
				"Transgender man/trans man/female to male (FTM)");

		Assert.assertTrue("Gender Identity do not match ", fHQSurveyPortalPage.genderIdentityOnCRPValue2.getText()
				.contentEquals("Transgender man/trans man/female to male (FTM)"));

		System.out.println("Gender Identity Matched");

		ComponentTestResult labelTest20 = FHQUtil.verifyLabel(fHQSurveyPortalPage.describesThisRelativeOnCRP,
				"Which best describes this relative?");

		ComponentTestResult labelTest21 = FHQUtil.verifyLabel(fHQSurveyPortalPage.describesThisRelativeOnCRPValue,
				"Biological child (adopted out)");

		Assert.assertTrue("Which best describes this relative Name do not match ",
				fHQSurveyPortalPage.describesThisRelativeOnCRPValue.getText()
						.contentEquals("Biological child (adopted out)"));

		System.out.println("Which best describes this relative Matched");

		ComponentTestResult labelTest22 = FHQUtil.verifyLabel(fHQSurveyPortalPage.twinOnCRP,
				"Is this relative a twin or part of a multiple birth?");

		ComponentTestResult labelTest23 = FHQUtil.verifyLabel(fHQSurveyPortalPage.twinOnCRPValue, "Yes");

		Assert.assertTrue("Is this relative a twin or part of a multiple birth do not match ",
				fHQSurveyPortalPage.twinOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Is this relative a twin or part of a multiple birth Matched");

		ComponentTestResult labelTest24 = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfBirthOnCRP, "Type of birth");

		ComponentTestResult labelTest25 = FHQUtil.verifyLabel(fHQSurveyPortalPage.typeOfBirthOnCRPValue,
				"Fraternal Twin");

		Assert.assertTrue("Type of birth do not match ",
				fHQSurveyPortalPage.typeOfBirthOnCRPValue.getText().contentEquals("Fraternal Twin"));

		System.out.println("Type of birth Matched");

		ComponentTestResult labelTest26 = FHQUtil.verifyLabel(fHQSurveyPortalPage.miscarriageStillBirthsOnCRP,
				"Has this relative ever had any miscarriages, stillbirths, induced abortions ...");

		ComponentTestResult labelTest27 = FHQUtil.verifyLabel(fHQSurveyPortalPage.miscarriageStillBirthsOnCRPValue,
				"Yes");

		Assert.assertTrue("Has this relative ever had any miscarriages, stillbirths, induced abortions do not match ",
				fHQSurveyPortalPage.miscarriageStillBirthsOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative ever had any miscarriages, stillbirths, induced abortions do Match");

		ComponentTestResult labelTest28 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfMiscarriagesOnCRP,
				"Total number of Miscarriages");

		ComponentTestResult labelTest29 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfMiscarriagesOnCRPValue,
				"2");

		Assert.assertTrue("Total number of Miscarriages do not match ",
				fHQSurveyPortalPage.totalNumberOfMiscarriagesOnCRPValue.getAttribute("value").contentEquals("2"));

		System.out.println("Total number of Miscarriages Matched");

		ComponentTestResult labelTest30 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totaNumberOfStillbirthsOnCRP,
				"Total number of Stillbirths");

		ComponentTestResult labelTest31 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totaNumberOfStillbirthsOnCRPValue,
				"3");

		Assert.assertTrue("Total number of Stillbirths do not match ",
				fHQSurveyPortalPage.totaNumberOfStillbirthsOnCRPValue.getAttribute("value").contentEquals("3"));

		System.out.println("Total number of Stillbirths Matched");

		ComponentTestResult labelTest32 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfInducedAbortionsOnCRP,
				"Total number of Induced Abortions");

		ComponentTestResult labelTest33 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.totalNumberOfInducedAbortionsOnCRPValue, "4");

		Assert.assertTrue("Total number of Induced Abortions do not match ",
				fHQSurveyPortalPage.totalNumberOfInducedAbortionsOnCRPValue.getAttribute("value").contentEquals("4"));

		System.out.println("Total number of Induced Abortions Matched");

		ComponentTestResult labelTest34 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfTubalOnCRP,
				"Total number of Tubal/Ectopic/Molar Pregnancies");

		ComponentTestResult labelTest35 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalNumberOfTubalOnCRPValue, "5");

		Assert.assertTrue("Total number of Tubal/Ectopic/Molar Pregnancies do not match ",
				fHQSurveyPortalPage.totalNumberOfTubalOnCRPValue3.getAttribute("value").contentEquals("5"));

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
				.verifyLabel(fHQSurveyPortalPage.diagnosedWithMedicalConditionsOnCRPValue, "Yes");

		Assert.assertTrue("Has this relative ever been diagnosed with any medical conditions do not match ",
				fHQSurveyPortalPage.diagnosedWithMedicalConditionsOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Has this relative ever been diagnosed with any medical conditions Matched");

		ComponentTestResult labelTest42 = FHQUtil.verifyLabel(fHQSurveyPortalPage.howManyChildrenOnCRP,
				"How many total children (alive and deceased) has this relative had?");

		ComponentTestResult labelTest43 = FHQUtil.verifyLabel(fHQSurveyPortalPage.howManyChildrenOnCRPValue, "2");

		Assert.assertTrue("How many total children (alive and deceased) has this relative had do not match ",
				fHQSurveyPortalPage.howManyChildrenOnCRPValue.getAttribute("value").contentEquals("2"));

		System.out.println("How many total children (alive and deceased) has this relative had Matched");

		ComponentTestResult labelTest44 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInfoOnCRP,
				"Is there anything else you would like us to know about this relative?");

		ComponentTestResult labelTest45 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInfoOnCRPValue1,
				"There is nothing else to say about this Participant Cousin");

		Assert.assertTrue("Is there anything else you would like us to know about this relative do not match ",
				fHQSurveyPortalPage.additionalInfoOnCRPValue1.getAttribute("value")
						.contentEquals("There is nothing else to say about this Participant Cousin"));

		System.out.println("Is there anything else you would like us to know about this relative Matched");

		ComponentTestResult labelTest46 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relatedListsOnCRPValue,
				"Related Lists");

		Assert.assertTrue("Related Lists do not match ",
				fHQSurveyPortalPage.relatedListsOnCRPValue.getText().contentEquals("Related Lists"));

		System.out.println("Related Lists Matched");

		ComponentTestResult labelTest49 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rASopathiesInfoOnCRPValue,
				"RASopathies 1");

		Assert.assertTrue("RASopathies do not match ",
				fHQSurveyPortalPage.rASopathiesInfoOnCRPValue.getText().contentEquals("RASopathies 1"));

		System.out.println("RASopathies 1 Matched");

		ComponentTestResult labelTest50 = FHQUtil.verifyLabel(fHQSurveyPortalPage.cancersInfoOnCRPValue, "Cancers 1");

		Assert.assertTrue("Cancers 1 do not match ",
				fHQSurveyPortalPage.cancersInfoOnCRPValue.getText().contentEquals("Cancers 1"));

		System.out.println("Cancers 1 Matched");

		ComponentTestResult labelTest51 = FHQUtil.verifyLabel(fHQSurveyPortalPage.medicalConditionsInfoOnCRPValue,
				"Medical Conditions 1");

		Assert.assertTrue("Medical Conditions 1 do not match ",
				fHQSurveyPortalPage.medicalConditionsInfoOnCRPValue.getText().contentEquals("Medical Conditions 1"));

		System.out.println("Medical Conditions 1 Matched");

		StepTestResult stepTestResult = new StepTestResult(
				"Verified the new GrandChild added and all the field data in the completed record producer");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(childNameTest);
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
		stepTestResult.add(labelTest49);
		stepTestResult.add(labelTest50);
		stepTestResult.add(labelTest51);

		scenarioReportList.add(stepTestResult);

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());

		}

	}

}
