package ServiceNow.CHARMS.Steps;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
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

public class FHQpatientRecordProducerSteps extends PageInitializer {

	private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

	@Given("a user lands on FHQ Survey Page using the Test Account credentials in Test side door login page")
	public void a_user_lands_on_FHQ_Survey_Page_using_the_Test_Account_credentials_in_Test_side_door_login_page()
			throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeViewSideDoor"));

		WebDriverUtils.webDriver.switchTo()
				.frame(WebDriverUtils.webDriver.findElement(By.xpath("//iframe[@id='gsft_main']")));

		CommonUtils.waitForClickability(nativeViewSideDoorLoginPage.nativeViewSideDoorLogInButton);

		nativeViewSideDoorLoginPage.enterUsername(nativeViewSideDoorLoginPage.nativeViewSideDoorUserName,
				"sideDoorUserName");

		nativeViewSideDoorLoginPage.enterPassword(nativeViewSideDoorLoginPage.nativeViewSideDoorPassword,
				"sideDoorPassword");

		nativeViewSideDoorLoginPage.clickSignInButton();

	}

	@Given("logs in Rasopathy page via Okta with username {string} and password {string}")
	public void logs_in_Rasopathy_page_via_Okta_with_username_and_password(String username, String password) {
		MiscUtils.sleep(300);
		CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
		myRASLoginPage.loginToMyRASButton.click();
		oktaLoginPage.usernameTxtBox.sendKeys(username);
		oktaLoginPage.passwordTxtBox.sendKeys(password);
		CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
		oktaLoginPage.loginBtn.click();
		MiscUtils.sleep(300);
		oktaLoginPage.agreeBtn.click();

	}

	@When("the user navigates to CHARMS FHQ Survey page and opens FHQ Landing Page Qualtrics")
	public void the_user_navigates_to_CHARMS_FHQ_Survey_page_and_opens_FHQ_Landing_Page_Qualtrics()
			throws TestingException {

		WebDriverUtils.webDriver.get("https://service-test.nci.nih.gov/myras?id=fmi_landing");
		CommonUtils.maximizeWindow();

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyHealthBanner1,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.startYourFamilyHealthQuiestionnaireLink1,
				"Click here to start your family health questionnaire");

		CommonUtils.waitForVisibility(fHQSurveyPortalPage.startYourFamilyHealthQuiestionnaireLink1);

		fHQSurveyPortalPage.startYourFamilyHealthQuiestionnaireLink.click();

		MiscUtils.sleep(300);
		StepTestResult stepTestResult = new StepTestResult(
				"User navigates to CHARMS FHQ Survey page and opens FHQ Landing Page");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(bannerTest);
		stepTestResult.add(labelTest);

		scenarioReportList.add(stepTestResult);

	}

	@When("the user navigates to CHARMS FHQ Survey page and opens FHQ Landing Page")
	public void the_user_navigates_to_CHARMS_FHQ_Survey_page_and_opens_FHQ_Landing_Page() throws TestingException {

		WebDriverUtils.webDriver.get("https://service-test.nci.nih.gov/ncifamily");
		CommonUtils.maximizeWindow();

		StepTestResult stepTestResult = new StepTestResult(
				"User navigates to CHARMS FHQ Survey page and opens FHQ Landing Page");

		scenarioReportList.add(stepTestResult);

	}

	@When("Start your family health questionnaire Link is visible and clicked")
	public void Start_your_family_health_questionnaire_Link_is_visible_and_clicked() {

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyHealthBanner,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.startYourFamilyHealthQuiestionnaireLink,
				"Click here to start your family health questionnaire");

		CommonUtils.waitForVisibility(fHQSurveyPortalPage.startYourFamilyHealthQuiestionnaireLink);

		fHQSurveyPortalPage.startYourFamilyHealthQuiestionnaireLink.click();

		MiscUtils.sleep(300);

		StepTestResult stepTestResult = new StepTestResult(
				"Clicked the link Start your family health questionnaire to take to the Participant FHQ page");

		stepTestResult.add(bannerTest);
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Verify the New Details of participant immediate family banner is visible on the page")
	public void verify_the_New_Details_of_participant_immediate_family_banner_is_visible_on_the_page() {

		MiscUtils.sleep(300);

		ComponentTestResult charmsBannerTest = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.familyCohortStudyManagementSystemLabel,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult homeButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.homeButton, "FHQ Home");

		ComponentTestResult formViewButtonTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.formViewButton, "Form View");

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyHealthBanner,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult bannerTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantBanner, "Participant");

		ComponentTestResult bannerTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantInformationBanner,
				"You are currently filling out information for the participant.");

		ComponentTestResult bannerTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantFamilyBanner,
				"This form will ask questions about the participant and their children and siblings.");

		ComponentTestResult bannerTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantProbandBanner,
				"If you are filling out this form for your self, you are the participant.");

		StepTestResult stepTestResult = new StepTestResult(
				"Verifed the New Details of participant immediate family and participant banners are visible on the page");

		stepTestResult.add(charmsBannerTest);
		stepTestResult.add(homeButtonTest);
		stepTestResult.add(formViewButtonTest);
		stepTestResult.add(bannerTest);
		stepTestResult.add(bannerTest1);
		stepTestResult.add(bannerTest2);
		stepTestResult.add(bannerTest3);
		stepTestResult.add(bannerTest4);

		scenarioReportList.add(stepTestResult);
	}

	@Then("selects option To confirm your identity, please indicate your relationship to the participant drop-down")
	public void selects_option_To_confirm_your_identity_please_indicate_your_relationship_to_the_participant_drop_down() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationshipToParticipantLabel,
				"Please indicate your relationship to the participant.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown,
				FHQSurveyPageConstants.RELATIONSHIP_TO_PARTICIPANT, 1);

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant relationship Informations are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);

		scenarioReportList.add(stepTestResult);

	}

	@Then("Sex assigned at birth, Gender Identity information of the participant are filled")
	public void sex_assigned_at_birth_Gender_Identity_information_of_the_participant_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.studyParticipantLabel,
				"The following questions are about the study participant.");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.sexAssignedAtBirthLabel,
				"Sex assigned at birth");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.SEX_ASSIGNED_AT_BIRTH, 2);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.genderIdentityLabel,
				"Gender Identity");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.GENDER_IDENTITY, 7);

		MiscUtils.sleep(300);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.otherGenderLabel, "Other gender");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.otherGenderTextBox, "");

		fHQSurveyPortalPage.otherGenderTextBox.sendKeys("Other Gender added for the Participant");

		StepTestResult stepTestResult = new StepTestResult(
				"The Sex assigned at birth and Gender Identity information details for this Participant are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);

		scenarioReportList.add(stepTestResult);

	}

	@Then("Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of the participant are filled")
	public void total_Miscarriages_Total_Still_births_Total_Induced_Abortions_Total_Tubal_Ectopic_Molar_Pregnancies_details_of_the_participant_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantPregnanciesLabel,
				"Has the participant ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies?");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER, 1);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalMiscarriagesLabel,
				"Total number of Miscarriages");

		ComponentTestResult bannerTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalMiscarriagesBanner,
				"(less than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.numberUpToN(20), 4);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyMiscarriageLabel,
				"Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyMiscarriageTextBox,
				"");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalStillbirthsLabel,
				"Total number of Stillbirths");

		ComponentTestResult bannerTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.parentTotalStillbirthsBanner,
				"(more than 20 weeks of pregnancy)");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.numberUpToN(20), 4);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyTotalStillbirthLabel,
				"Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyStillbirthTextBox, "");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.totalInducedAbortionsLabel,
				"Total number of Induced Abortions");

		ComponentTestResult dropdownTest3 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.numberUpToN(20), 4);

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyInducedAbortionLabel,
				"Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.");

		ComponentTestResult labelTest9 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyInducedAbortionTextBox,
				"");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.totalTubalEctopicMolarPregnanciesLabel1,
				"Total number of Tubal/Ectopic/Molar Pregnancies");

		ComponentTestResult dropdownTest4 = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.numberUpToN(20), 4);

		ComponentTestResult labelTest11 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyEctopicMolarLabel,
				"Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.");

		ComponentTestResult labelTest12 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerPregnancyEctopicMolarTextBox,
				"");

		StepTestResult stepTestResult = new StepTestResult(
				"The Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of the participant are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(bannerTest1);
		stepTestResult.add(dropdownTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(bannerTest2);
		stepTestResult.add(dropdownTest2);
		stepTestResult.add(labelTest5);
		stepTestResult.add(labelTest6);
		stepTestResult.add(labelTest7);
		stepTestResult.add(dropdownTest3);
		stepTestResult.add(labelTest8);
		stepTestResult.add(labelTest9);
		stepTestResult.add(labelTest10);
		stepTestResult.add(dropdownTest4);
		stepTestResult.add(labelTest11);
		stepTestResult.add(labelTest12);

		scenarioReportList.add(stepTestResult);
	}

	@When("Participant Total children details are filled")
	public void participant_Total_children_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantTotalChildrenHaveLabel,
				"How many total children (alive and deceased) has the participant had?");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantTotalChildrenHaveBanner,
				"Please include living and deceased children. You may include biologic and non-biologic (e.g. step, adopted, etc.) children. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.numberUpToN(20), 4);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childMRVSbanner, "Child");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childMRVSAddbutton, "Add");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.removeAllbutton, "Remove All");

		fHQSurveyPortalPage.childMRVSAddbutton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Total Children Information details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);

		scenarioReportList.add(stepTestResult);
		
		JavascriptUtils.scrollDownByPage();

	}

	@When("Participant Child MRVS details are filled")
	public void participant_Child_MRVS_details_are_filled() {

		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.addChildRowBanner, "Add Row");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildFirstNameLabel,
				"First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildFirstNameTextbox, "");

		fHQSurveyPortalPage.addRowChildFirstNameTextbox.sendKeys("Participant Child FN");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildFirstInitialOfLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowChildFirstInitialOfLastNameDropDown,
				FHQSurveyPageConstants.firstInitialLastName(), 1);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowChildVitalStatusLabel,
				"Vital Status");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowChildVitalStatusDropDown, FHQSurveyPageConstants.VITAL_STATUS_LIST, 1);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowCancelButton, "Cancel");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowsaveButton, "Add");

		fHQSurveyPortalPage.addRowsaveButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Child MRVS Information details are filled and verified");

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

	@Then("Participant Child MRVS table are verified")
	public void participant_Child_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.childActionsBanner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childFirstNameBanner, "First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childFirstInitialOfLastNameBanner,
				"First Initial of LAST Name");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childVitalStatusBanner,
				"Vital Status");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childActionsEdit, "");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childActionsDelete, "");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childFirstNameBannerValue,
				"Participant Child FN");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childFirstInitialOfLastNameBannerValue,
				"A");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.childVitalStatusBannerValue, "Alive");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Child MRVS Information tables are filled and verified");

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

	@When("Participant Partner details are filled")
	public void participant_Partner_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantDifferentPartnerLabel,
				"How many total different partners has the participant had biological children with?");

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantDifferentPartnerBanner,
				"We will ask about donor materials (i.e. sperm, egg) as well as adoptive children in a later question. Please do not count them here.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.numberUpToNStartingWithOne(10), 3);

		MiscUtils.sleep(300);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerMRVSBanner, "Partner");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantPartnerMRVSAddButton,
				"Add");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.patientsPartnerMRVSRemoveAllbutton,
				"Remove All");

		fHQSurveyPortalPage.participantPartnerMRVSAddButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Partner Information details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(bannerTest);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(labelTest3);

		scenarioReportList.add(stepTestResult);

	}

	@When("Participant Partner MRVS details are filled")
	public void participant_Partner_MRVS_details_are_filled() {

		CommonUtils.maximizeWindow();

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.addPartnerRowBanner, "Add Row");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowPartnerFirstNameLabel,
				"First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowPartnerFirstNameTextbox, "");

		fHQSurveyPortalPage.addRowPartnerFirstNameTextbox.sendKeys("Participant Partner FN");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(
				fHQSurveyPortalPage.addRowPartnerFirstInitialOfLastNameLabel, "First Initial of LAST Name");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowPartnerFirstInitialOfLastNameDropDown,
				FHQSurveyPageConstants.firstInitialLastName(), 2);

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowPartnerVitalStatusLabel,
				"Vital Status");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.addRowPartnerVitalStatusDropDown, FHQSurveyPageConstants.VITAL_STATUS_LIST, 2);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowPartnerCancelRowButton,
				"Cancel");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.addRowPartnersaveRowButton, "Add");

		fHQSurveyPortalPage.addRowPartnersaveRowButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Partner MRVS Information details are filled and verified");

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

	@Then("Participant Partner MRVS table are verified")
	public void participant_Partner_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerActionsBanner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerFirstNameBanner, "First Name");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerFirstInitialOfLastNameBanner,
				"First Initial of LAST Name");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerVitalStatusBanner,
				"Vital Status");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerActionsEdit, "");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerActionsDelete, "");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerFirstNameBannerValue,
				"Participant Partner FN");

		ComponentTestResult labelTest7 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.partnerFirstInitialOfLastNameBannerValue, "B");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.partnerVitalStatusBannerValue,
				"Deceased");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Partner MRVS Information tables are filled and verified");

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

	@Then("Participant Siblings details are filled")
	public void participant_Siblings_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantSiblingsDetailsBanner,
				"We would like to ask you some questions about Siblings details");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantTotalSiblingsHaveLabel,
				"How many siblings does the participant have?");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantSiblingsDetailsBanner1,
				"Please include all full and half siblings, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(fHQSurveyPortalPage.fHQFieldDropDown1,
				FHQSurveyPageConstants.numberUpToN(12), 4);

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSBanner, "Siblings");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantSiblingMRVSAddButton,
				"Add");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantSiblingMRVSRemoveAllButton,
				"Remove All");

		fHQSurveyPortalPage.participantSiblingMRVSAddButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Siblings Information details are filled and verified");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		stepTestResult.add(dropdownTest);
		stepTestResult.add(labelTest3);
		stepTestResult.add(labelTest4);
		stepTestResult.add(labelTest5);

		scenarioReportList.add(stepTestResult);

	}

	@Then("Participant Sibling MRVS details are filled")
	public void participant_Sibling_MRVS_details_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSAddRowPageLabel, "Add Row");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSAddRowSiblingsTypeLabel,
				"Types of Sibling relation");

		ComponentTestResult dropdownTest = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.siblingMRVSAddRowSiblingsTypeDropDown, FHQSurveyPageConstants.TYPES_OF_SIBLING, 2);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSAddRowFirstNameSiblingLabel,
				"First name of sibling");

		ComponentTestResult labelTest3 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.siblingMRVSAddRowFirstNameSiblingTextBox, "");

		fHQSurveyPortalPage.siblingMRVSAddRowFirstNameSiblingTextBox.sendKeys("Participant Sibling FN");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSFirstInitialLastNameLabel,
				"First Initial of LAST Name");

		ComponentTestResult dropdownTest1 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.siblingMRVSFirstInitialLastNameDropDopwn,
				FHQSurveyPageConstants.firstInitialLastName(), 3);

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSVitalStatusLabel,
				"Vital Status of sibling");

		ComponentTestResult dropdownTest2 = FHQUtil.verifySelect2DropDowns(
				fHQSurveyPortalPage.siblingMRVSVitalStatusDropDown, FHQSurveyPageConstants.VITAL_STATUS_LIST, 4);

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSAddRowCancelButton,
				"Cancel");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingMRVSAddRowAddButton, "Add");

		fHQSurveyPortalPage.siblingMRVSAddRowAddButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Sibling MRVS Information details are filled and verified");

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

	@Then("Participant Sibling MRVS table are verified")
	public void participant_Sibling_MRVS_table_are_verified() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingActionsBanner, "Actions");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingTypesBanner,
				"Types of Sibling relation");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingFirstNameBanner,
				"First name of sibling");

		ComponentTestResult labelTest3 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingFirstInitialOfLastNameBanner,
				"First Initial of LAST Name");

		ComponentTestResult labelTest4 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingVitalStatusBanner,
				"Vital Status of sibling");

		ComponentTestResult labelTest5 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingActionsEdit, "");

		ComponentTestResult labelTest6 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingActionsDelete, "");

		ComponentTestResult labelTest7 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingTypesBannerValue, "Brother");

		ComponentTestResult labelTest8 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingFirstNameBannerValue,
				"Participant Sibling FN");

		ComponentTestResult labelTest9 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.siblingFirstInitialOfLastNameBannerValue, "C");

		ComponentTestResult labelTest10 = FHQUtil.verifyLabel(fHQSurveyPortalPage.siblingVitalStatusBannerValue,
				"Prefer not to answer");

		StepTestResult stepTestResult = new StepTestResult(
				"The Participant Sibling MRVS Information tables are filled and verified");

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

	@Then("Participant additional Informations are filled")
	public void participant_additional_Informations_are_filled() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.anythingElseAboutThisParticipantLabel,
				"Is there anything else you would like us to know about the participant?");

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPortalPage.anythingElseAboutThisParticipantTextBox, "");

		fHQSurveyPortalPage.anythingElseAboutThisParticipantTextBox
				.sendKeys("There is nothing else to tell about this Participant");

		StepTestResult stepTestResult = new StepTestResult(
				"If there is anything else you would like us to know about the participant details are filled and verified ");

		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);

		scenarioReportList.add(stepTestResult);
	}

	@Then("finally the Complete-Submit Button is clicked to submit the Participant Personal record producer")
	public void finally_the_Complete_Submit_Button_is_clicked_to_submit_the_Participant_Personal_record_producer() {

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.participantCompleteAndSubmitButton,
				"Complete and Submit");

		fHQSurveyPortalPage.participantCompleteAndSubmitButton.click();

		MiscUtils.sleep(5000);

		StepTestResult stepTestResult = new StepTestResult(
				"Finally clicked the Complete-Submit Button to submit the Participant Personal record producer");

		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Generate Scenario Report for the Initial visit of the Participant on the FHQ Survey landing page")
	public void generate_Scenario_Report_for_the_Initial_visit_of_the_Participant_on_the_FHQ_Survey_landing_page() {

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());

		}

	}

	@Then("Grid View page is verified")
	public void grid_View_page_is_verified() {

		ComponentTestResult bannerTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyCohortHealthBanner,
				"Family Cohort Study Management System: RASopathies");

		ComponentTestResult bannerTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.familyHealthBanner1,
				"We know families come in various configurations. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.");

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPortalPage.statusBanner, "Status");

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(fHQSurveyPortalPage.relationBanner, "Relation");

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPortalPage.recordsBanner, "Records");

		StepTestResult stepTestResult = new StepTestResult("Grid View page is verified");

		stepTestResult.add(bannerTest);
		stepTestResult.add(bannerTest1);
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);

		scenarioReportList.add(stepTestResult);

	}
}
