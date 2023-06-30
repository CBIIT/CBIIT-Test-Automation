package ServiceNow.CHARMS.Steps;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
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

public class FHQPartnerRecordProducerSteps extends PageInitializer {

	private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

	@Given("a user is logged on FHQ Family Cohort Study Management Page")
	public void a_user_is_logged_on_FHQ_Family_Cohort_Study_Management_Page() throws TestingException {

		WebDriverUtils.webDriver.get("https://service-test.nci.nih.gov/myras?id=fmi_landing");
		CommonUtils.maximizeWindow();

		StepTestResult stepTestResult = new StepTestResult(
				"A user is logged on FHQ Family Cohort Study Management Page");

		scenarioReportList.add(stepTestResult);

	}

	@Given("verifies FHQ Family Cohort Study Management Page")
	public void verifies_FHQ_Family_Cohort_Study_Management_Page() {

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyHealthBanner1,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.statusBanner, "Status");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationBanner, "Relation");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.recordsBanner, "Records");

		StepTestResult stepTestResult = new StepTestResult("verifies FHQ Family Cohort Study Management Page");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(bannerTest);
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);

	}

	@Given("user clicks the Partner Grid link on FHQ Grid page to land on the FHQ Partners list view page")
	public void user_clicks_the_Partner_Grid_link_on_FHQ_Grid_page_to_land_on_the_FHQ_Partners_list_view_page() {

		fHQSurveyPortalPage.partnersLinkOnFamilyGrid.click();
		
		MiscUtils.sleep(300);

		StepTestResult stepTestResult = new StepTestResult(
				"User clicked the Partner Grid link on FHQ Grid page to land on the FHQ Partners list view page");

		scenarioReportList.add(stepTestResult);
	}

	@Given("verifies the Partner List View details")
	public void verifies_the_Partner_List_View_details() {

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listViewButton, "List View");

		ComponentTestResult contextMenuTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerContextMenuButton, "");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerBanner, "Partners");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.newButtonLinkOnListView, "New");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.rowsDetailsOnListView,
				"The blue highlighted rows represent the incompleted family records");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnListView, "First Name");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLastNameOnListView,
				"First Initial of LAST Name");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusOnListView, "Vital Status");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnListView,
				"Year of Birth");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationToPatientOnListView,
				"Relation to patient");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerFirstNameOnListViewValue,
				"Participant Partner FN");

		ComponentTestResult labelTest10 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.partnerFirstInitialOfLastNameOnListViewValue, "B");

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerVitalStatusOnListViewValue,
				"Deceased");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerYearOfBirthOnListView, "");

		ComponentTestResult labelTest13 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.partnerRelationToPatientOnListViewValue, "Participants Partner");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Partner details on the List View page are verified");

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

		scenarioReportList.add(stepTestResult);

	}

	@When("clicks the New button on the FHQ Partners list view page it lands on the New FHQ Partner record producer page")
	public void clicks_the_New_button_on_the_FHQ_Partners_list_view_page_it_lands_on_the_New_FHQ_Partner_record_producer_page() {

		fHQSurveyPortalPage.newButtonLinkOnListView.click();

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.formViewButton, "Form View");

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyHealthBanner,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.PartnerBanner, "Partner");

		ComponentTestResult partnerRelationBanner = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerRelationBanner,
				"You are currently filling out information for the participants partner.");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.shortDescriptionInformationBanner,
				"Please provide what information you can about this partner");

		StepTestResult stepTestResult = new StepTestResult(
				"Clicked the New button on the FHQ Partners list view page to lands on the FHQ Participant New Partner record producer page");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(bannerTest);
		stepTestResult.add(labelTest);
		stepTestResult.add(partnerRelationBanner);
		stepTestResult.add(labelTest1);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the First Name, First Initial of LAST name information of the Partner related to the Patient")
	public void fills_the_First_Name_First_Initial_of_LAST_name_information_of_the_Partner_related_to_the_Patient() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.isThisYourCurrentPartnerLabel,
				"Is this your (the participant's) current partner?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.isThisYourCurrentPartnerDropDown,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameLabel, "First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameTextBox, "");

		fHQSurveyPortalPage.firstNameTextBox.sendKeys("New Partner FN");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.firstInitialLastNameOfPartnerDropDown,
				FHQSurveyPageConstants.firstInitialLastName(), 13);

		StepTestResult stepTestResult = new StepTestResult(
				"The First Name, First Initial of LAST name information of the Participant Partner is filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(dropdownTest1);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the Year of Birth, Current Age of the Partner related to the Patient")
	public void fills_the_Year_of_Birth_Current_Age_of_the_Partner_related_to_the_Patient() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthLabel, "Year of Birth");

		ComponentTestResult estimatedAgeBanner1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthdateLabelBanner,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.yearOfBirthOfPartnerDropDown, FHQSurveyPageConstants.yearOfBirthOrDeathAfter1900(),
				65);

		StepTestResult stepTestResult = new StepTestResult(
				"The Year of Birth and Current Age information details of the Participant Partner is filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(estimatedAgeBanner1);
		stepTestResult.add(dropdownTest);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the Vital Status,Year of Death, Age of Death information of the Partner related to the Patient")
	public void fills_the_Vital_Status_Year_of_Death_Age_of_Death_information_of_the_Partner_related_to_the_Patient() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.vitalStatusLabel, "Vital Status");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.vitalStatusOfPartnerDropDown, FHQSurveyPageConstants.VITAL_STATUS_LIST, 2);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOrAgeLabel,
				"Please provide the year of death or the age of death");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.YEAR_OR_AGE_OF_DEATH, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathLabel, "Year of Death");

		ComponentTestResult estimatedAgeBanner2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthdateLabelBanner1,
				"An estimated age is preferred over \"Don't Know\". Examples: early 40s = 42; mid-40s = 45; late 40s = 48.");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.yearOfBirthOrDeathAfter1900(), 90);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfThisRelativeDeathLabel,
				"What was the cause of this relative death?");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathInformation,
				"If you don't know, you can write \"don't know\" in the text box.");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathTextBox1, "");

		fHQSurveyPortalPage.causeOfDeathTextBox1.sendKeys("Participant Partner Reason of Death is not Known");

		StepTestResult stepTestResult = new StepTestResult(
				"The Vital Status,Year of Death, Age of Death information details of the Participant Partner is filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(estimatedAgeBanner2);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}

	@When("fills the Sex assigned at birth, Gender Identity information of the partner related to the Patient")
	public void fills_the_Sex_assigned_at_birth_Gender_Identity_information_of_the_partner_related_to_the_Patient() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthLabel,
				"Sex assigned at birth");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.SEX_ASSIGNED_AT_BIRTH, 2);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityLabel,
				"Gender Identity");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.GENDER_IDENTITY, 2);

		StepTestResult stepTestResult = new StepTestResult(
				"The Sex assigned at birth and Gender Identity information of the Participant Partner is filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest1);

		scenarioReportList.add(stepTestResult);
	}

	@When("fills if the participant is blood-related to this person details")
	public void fills_if_the_participant_is_blood_related_to_this_person_details() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.isParticipantBloodRelatedToThisPersonLabel,
				"Is the participant blood-related to this person?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.isParticipantBloodRelatedToThisPersonBanner,
				"If you are filling out this form for your self you are the participant.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantRelatedToThisPartnerLabel,
				"Please describe how the participant is related to this person");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantRelatedToThisPartnerTextBox,
				"");

		fHQSurveyPortalPage.participantRelatedToThisPartnerTextBox.sendKeys(" Uncle Niece Relation");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.anyAdditionalInformationRelatedToThisPartnerLabel,
				"Is there any additional information you would like us to know or understand about this relative?");

		ComponentTestResult labelTest5 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.anyAdditionalInformationRelatedToThisPartnerTextBox, "");

		fHQSurveyPortalPage.anyAdditionalInformationRelatedToThisPartnerTextBox
				.sendKeys(" Yes, There is additional information about this partner");

		StepTestResult stepTestResult = new StepTestResult(
				"The participant is blood-related to this person Information details is filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}

	@When("finally click the Complete and Submit Button to submit the New FHQ Partner of the Patient Record Producer")
	public void finally_click_the_Complete_and_Submit_Button_to_submit_the_New_FHQ_Partner_of_the_Patient_Record_Producer() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.CompleteAndSubmitButton,
				"Complete and Submit");

		fHQSurveyPortalPage.CompleteAndSubmitButton.click();

		MiscUtils.sleep(5000);

		StepTestResult stepTestResult = new StepTestResult(
				"Finally clicked the Complete/Submit Button to submit the New FHQ Partner of the Participant Record Producer");

		stepTestResult.add(labelTest);

		scenarioReportList.add(stepTestResult);

	}

	@Then("Generate Scenario Report for the details of the Patient Partner in the FHQ Survey")
	public void generate_Scenario_Report_for_the_details_of_the_Patient_Partner_in_the_FHQ_Survey_page() {

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());

		}
	}

	@When("Partner list view page is updated and verified")
	public void partner_list_view_page_is_updated_and_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerFirstNameOnListViewValue1,
				"New Partner FN");

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.partnerFirstInitialOfLastNameOnListViewValue1, "M");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerVitalStatusOnListViewValue1,
				"Deceased");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerYearOfBirthOnListViewValue1,
				"1962");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerRelationToPatientOnListViewValue1,
				"Participants Partner");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Child(SonDaughter) list view page is updated and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);

		scenarioReportList.add(stepTestResult);

	}

	@When("click the new Partner added and verify the completed record producer data")
	public void click_the_new_Partner_added_and_verify_the_completed_record_producer_data() {

		fHQSurveyPortalPage.partnerFirstNameOnListViewValue1.click();

		MiscUtils.sleep(300);

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult listViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.listView1Button, "List View");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.completedFormViewButton,
				"Complete Form View");

		ComponentTestResult partnerNameTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerfirstNameBannerOnCRP,
				"New Partner FN");

		Assert.assertTrue("First Name Banner do not match",
				fHQSurveyPortalPage.partnerfirstNameBannerOnCRP.getText().contentEquals("New Partner FN"));

		System.out.println("First Name Banner Matched");

		ComponentTestResult currentpartnerNameTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.currentPartnerOnCRP,
				"Is this your (the participant's) current partner");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.currentPartnerOnCRPValue, "Yes");

		Assert.assertTrue("Is this your (the participant's) current partner do not match",
				fHQSurveyPortalPage.currentPartnerOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Is this your (the participant's) current partner Matched");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnCRP, "First Name");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstNameOnCRPValue,
				"New Partner FN");

		Assert.assertTrue("First Name do not match",
				fHQSurveyPortalPage.firstNameOnCRPValue.getAttribute("value").contentEquals("New Partner FN"));

		System.out.println("First Name Matched");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLASTNameOnCRP,
				"First Initial of LAST Name");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.firstInitialOfLASTNameOnCRPValue, "M");

		Assert.assertTrue("First Initial of LAST Name do not match ",
				fHQSurveyPortalPage.firstInitialOfLASTNameOnCRPValue.getAttribute("value").contentEquals("M"));

		System.out.println("First Initial of LAST Name Matched");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnCRP, "Year of Birth");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfBirthOnCRPValue, "1962");

		Assert.assertTrue("Year of Birth do not match ",
				fHQSurveyPortalPage.yearOfBirthOnCRPValue.getAttribute("value").contentEquals("1962"));

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

		ComponentTestResult labelTest13 = FHQUtil.verifyLabel(fHQSurveyPortalPage.yearOfDeathOnCRPValue, "1987");

		Assert.assertTrue("Year of death do not match ",
				fHQSurveyPortalPage.yearOfDeathOnCRPValue.getAttribute("value").contentEquals("1987"));

		System.out.println("Year of death Matched");

		ComponentTestResult labelTest14 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathOnCRP,
				"What was the cause of this relative death?");

		ComponentTestResult labelTest15 = FHQUtil.verifyLabel(fHQSurveyPortalPage.causeOfDeathOnCRPValue,
				"Participant Partner Reason of Death is not Known");

		Assert.assertTrue("The cause of this relative death do not match ", fHQSurveyPortalPage.causeOfDeathOnCRPValue
				.getAttribute("value").contentEquals("Participant Partner Reason of Death is not Known"));

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

		ComponentTestResult labelTest19 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityOnCRPValue, "Female");

		Assert.assertTrue("Gender Identity do not match ",
				fHQSurveyPortalPage.genderIdentityOnCRPValue.getText().contentEquals("Female"));

		System.out.println("Gender Identity Matched");

		ComponentTestResult labelTest20 = FHQUtil.verifyLabel(fHQSurveyPortalPage.bloodRelativeOnCRP,
				"Is the participant blood-related to this person?");

		ComponentTestResult labelTest21 = FHQUtil.verifyLabel(fHQSurveyPortalPage.bloodRelativeOnCRPValue, "Yes");

		Assert.assertTrue("Is the participant blood-related to this person do not match ",
				fHQSurveyPortalPage.bloodRelativeOnCRPValue.getText().contentEquals("Yes"));

		System.out.println("Is the participant blood-related to this person Matched");

		ComponentTestResult labelTest22 = FHQUtil.verifyLabel(fHQSurveyPortalPage.howParticipantRelatedOnCRP,
				"Please describe how the participant is related to this person");

		ComponentTestResult labelTest23 = FHQUtil.verifyLabel(fHQSurveyPortalPage.howParticipantRelatedOnCRPValue,
				"Uncle Niece Relation");

		Assert.assertTrue("Please describe how the participant is related to this person do not match ",
				fHQSurveyPortalPage.howParticipantRelatedOnCRPValue.getAttribute("value")
						.contentEquals("Uncle Niece Relation"));

		System.out.println("Please describe how the participant is related to this person Matched");

		ComponentTestResult labelTest24 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInfoOnCRP,
				"Is there anything else you would like us to know about this relative?");

		ComponentTestResult labelTest25 = FHQUtil.verifyLabel(fHQSurveyPortalPage.additionalInfoOnCRPValue,
				"Yes, There is additional information about this partner");

		Assert.assertTrue("Is there anything else you would like us to know about this relative do not match ",
				fHQSurveyPortalPage.additionalInfoOnCRPValue.getAttribute("value")
						.contentEquals("Yes, There is additional information about this partner"));

		System.out.println("Is there anything else you would like us to know about this relative Matched");

		StepTestResult stepTestResult = new StepTestResult(
				"Verified the new Partner added and all the field data in the completed record producer");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(listViewButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(partnerNameTest);
		stepTestResult.add(currentpartnerNameTest);
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
		
		scenarioReportList.add(stepTestResult);
	}
}