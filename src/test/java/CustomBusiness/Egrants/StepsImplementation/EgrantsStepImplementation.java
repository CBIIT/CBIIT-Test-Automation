package CustomBusiness.Egrants.StepsImplementation;

import CustomBusiness.Egrants.Pages.EgrantsQuickLinkAndManagementMenuPage;
import CustomBusiness.Egrants.Utils.Egrants_Constants;
import Hooks.Hooks;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;

import static com.nci.automation.web.TestProperties.getEGrantsUrl;

public class EgrantsStepImplementation extends PageInitializer {

	/***
	 * THIS METHOD LOGS INTO eGrants
	 */
	public static void user_is_logged_in_the_application_and_is_on_the_landing_page(){
		WebDriverUtils.webDriver.get(getEGrantsUrl());
		iTrustLoginPageImpl.loginToITrust();
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD EXPANDS QUICK LINKS MENU
	 */
	public static void clicks_on_quickLinks() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.quickLinks);
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.expandQlink);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD VERIFIES THE HYPERLINKS IN QUICKLINKS
	 * @param linkText
	 */
	public static void is_able_to_navigate_to_hyperlink(String linkText) {
		String emWindowHandle = WebDriverUtils.webDriver.getWindowHandle();
		switch (linkText) {
			case "PMS":
				CommonUtils.clickOnElement(EgrantsQuickLinkAndManagementMenuPage.dynamicLinkLocator(linkText));
				CommonUtils.switchToNextWindow();
				String actualPMSPageTitle = WebDriverUtils.webDriver.getTitle();
				String expectedPMSPageTitle = Egrants_Constants.PMS_PAGE_TITLE;
				Hooks.softAssert.assertEquals(actualPMSPageTitle, expectedPMSPageTitle, "Page title does not match");
				CucumberLogUtils.logScreenshot();
				CommonUtils.sleep(3000);
				WebDriverUtils.webDriver.switchTo().window(emWindowHandle);
				break;
		}
	}

	/***
	 * THIS METHOD VERIFIES THE LOGGED IN USER NAME
	 * @param user
	 */
	public static void verifies_that_the_logged_in_user_is_shown(String user) {
		String actualUser = egrantsQuickLinkAndManagementMenuPage.dynamicUserTextLocator(user).getText();
		Hooks.softAssert.assertEquals(actualUser, user, "User name does not match");
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * THIS METHOD SEARCHES FOR A STRING IN THE SEARCHBOX
	 * @param grantSerialNumber
	 */
	public static void searches_for(String grantSerialNumber) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchBox);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.searchBox,grantSerialNumber);
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD VERIFIES THE PROJECT TITLE
	 */
	public static void verifies_the_project_title_as() {
		String actualProjectTitle = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.projectTitle);
		String expectedProjectTitle = Egrants_Constants.PROJECT_TITLE;
		Hooks.softAssert.assertEquals(actualProjectTitle, expectedProjectTitle, "Project title does not match");
		System.out.println(expectedProjectTitle);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD VERIFIES THE INSTITUTION NAME
	 */
	public static void verifies_the_institution_name_as() {
		String actualInstitutionName = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.institutionName);
		String expectedInstitutionName = Egrants_Constants.INSTITUTION_NAME;
		Hooks.softAssert.assertEquals(actualInstitutionName, expectedInstitutionName, "Institution name does not match");
		System.out.println(expectedInstitutionName);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
}

	/***
	 * THIS METHOD SELECTS GRANT YEAR
	 * @param year
	 */
	public static void clicks_on_year(Integer year) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.year18MainGrantHeader);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * THIS METHOD VERIFIES THE USER IS ON THE INTENDED GRANT FOLDER
	 * @param grantFolder
	 */
	public static void verifies_is_the_landed_grant_folder(String grantFolder) {
		String actualFullGrantSerialNumber = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.fullGrantSerialNumber);
		Hooks.softAssert.assertEquals(actualFullGrantSerialNumber, grantFolder, "Grant folder does not match");
		System.out.println(grantFolder);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD CLICKS ON ADD DOCUMENT BUTTON
	 */
	public static void clicks_on_add_document_button() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.addDocumentButton);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * THIS METHOD SEARCHES FOR STRING WITHIN THE SEARCHBOX
	 * @param grant_serial_number
	 */
	public static void searches_for_grant(String grant_serial_number) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchBox);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.searchBox, Egrants_Constants.TEST_GRANT_SERIAL_NUMBER);
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS A GRANT YEAR FROM A DROPDOWN
	 */
	public static void selects_grant_year() {
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.grantsDropdown, 6);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS APPLICATON FILE AS THE DOCUMENT CATEGORY
	 */
	public static void selects_category_as_application_file() {
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.categoryDropdown, 2);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * THIS METHOD PASSES A STRING AS SUBCATEGORY
	 * @param subCategoryText
	 */
	public static void passes_as_subcategory(String subCategoryText) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.subCategory);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.subCategory,subCategoryText);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SWITCHES DOCUMENT UPLOAD OPTION AS LOCATE FILE AND UPLOAD
	 */
	public static void clicks_on_locate_file_and_upload_tab() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.locateFileAndUploadTab);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD UPLOADS A FILE DEFINED IN THE CONSTANT CLASS
	 */
	public static void uploads_a_file() {
		CommonUtils.sleep(7000);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.chooseFile, Egrants_Constants.TEST_FILE_PATH);
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.addFileButton);
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * THIS METHOD VERIFIES THE DOCUMENT UPLOAD MESSAGE
	 * @param uploadSuccessMessage
	 */
	public static void verifies_the_success_message(String uploadSuccessMessage) {
		String actualSuccessMessage = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.successMessage);
		Hooks.softAssert.assertEquals(actualSuccessMessage, uploadSuccessMessage);
		System.out.println(uploadSuccessMessage);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SWITCHES WINDOWS TO OPEN THE UPLOADED FILE
	 */
	public static void clicks_on_uploaded_document() {
		String emWindowHandle = WebDriverUtils.webDriver.getWindowHandle();
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.checkDocumentButton);
		CommonUtils.switchToNextWindow();
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.webDriver.close();
	}

	/***
	 * THIS METHOD SELECTS DOCUMENT CATEGORY
	 */
	public static void selects_funding_category() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.categoryDropdown);
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.categoryDropdown,Egrants_Constants.FUNDING_CATEGORY);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS DOCUMENT SUBCATEGORY AND THE DATE
	 */
	public static void selects_transition_approval_subCategory_and_date() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.subCategoryforFunding);
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.subCategoryforFunding, Egrants_Constants.FUNDING_SUBCATEGORY);
		String formattedDate = CommonUtils.getTodayDate();
		egrantsSearchandFileManagementScenariosPage.calendar.clear();
		CommonUtils.sleep(1000);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.calendar, formattedDate);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.calendar, Keys.ENTER);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD CLICKS ON UPDATE DOCUMENT CATEGORY BUTTON
	 */
	public static void click_on_update_document_category_button() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.updateButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD CLICKS ON INSTITUTIONAL FILES MENU
	 */
	public static void user_clicks_on_institutional_files(){
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.institutionalFiles);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS AN INSTITUTION
	 */
	public static void user_selects_aavogen(){
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.aavogeninc);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD CLICKS ON CREATE A NEW DOCUMENT
	 */
	public static void clicks_on_create_new_document_link() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.createNewDocumentLink);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS ORGANIZATION DOCUMENT FROM DROPDOWN
	 */
	public static void selects_organization_document_from_category_dropdown()  {
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.documentCategoryDropdown, 3);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * THIS METHOD ADDS A SUBCATEGORY FOR THE SELECTED CATEGORY
	 * @param docSubCat
	 */
	public static void provides_as_a_subcategory(String docSubCat) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.subCategoryInstitutionalFiles);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.subCategoryInstitutionalFiles, docSubCat);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD CREATES A NEW DOCUMENT
	 */
	public static void clicks_on_create_new_button() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.createNewButton);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD NAVIGATES TO MANAGEMENT MENU
	 */
	public static void clicks_on_management_menu() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.managementMenu);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS QC REASON FROM DROPDOWN
	 */
	public static void selects_qc_reason() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.qcReason);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.qcReason, Egrants_Constants.QC_REASON_CHANGE);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS QC PERSON FROM DROPDOWN
	 */
	public static void selects_qc_person() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.qcPerson);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.qcPerson, Egrants_Constants.QUALITY_ASSOCIATES_USER);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD ASSIGNS THE SELECTED QC PERSON
	 */
	public static void clicks_on_assign_button() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.assignButton);
		CommonUtils.sleep(2000);
		if (CommonUtils.getAlertText().contentEquals(Egrants_Constants.ASSIGN_BUTTON_ALERT_MESSAGE)){
			CommonUtils.sleep(2000);
			CommonUtils.acceptAlert();
			System.out.println("Alert Present and condition is true");
			CucumberLogUtils.logScreenshot();
		} else {
			CommonUtils.dismissAlert();
			System.out.println("Alert Not Present");
		}
	}

	/***
	 * THIS METHOD SELECTS THE "FROM" USER
	 */
	public static void clicks_on_from_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.fromQC);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.fromQC, Egrants_Constants.OGA_EMPLOYEE);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS THE "TO" USER
	 */
	public static void clicks_on_to_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.toQC);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.toQC, Egrants_Constants.QUALITY_ASSOCIATES_USER);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS DOCUMENT PERCENTAGE
	 */
	public static void clicks_on_percentage_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.percentageQC);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.percentageQC, Egrants_Constants.DOCUMENT_ROUTING_PERCENTAGE);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD ROUTES THE DOCUMENTS
	 */
	public static void clicks_on_route_button() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.routeButton);
		CommonUtils.sleep(2000);
		if (CommonUtils.getAlertText().contentEquals(Egrants_Constants.ROUTE_BUTTON_ALERT_MESSAGE)){
			CommonUtils.sleep(2000);
			CommonUtils.acceptAlert();
			System.out.println("Alert Present and condition is true");
			CucumberLogUtils.logScreenshot();
		} else {
			CommonUtils.dismissAlert();
			System.out.println("Alert Not Present");
		}
	}

	/***
	 * THIS METHOD SEARCHES FOR A GRANT NUMBER ON ADD NEW DOCUMENT PAGE
	 * @param grantNum
	 */
	public static void searches_for_grant_on_add_document_page(String grantNum) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchBoxAddDocumentPage);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.searchBoxAddDocumentPage, Egrants_Constants.SERIAL_NUMBER);
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchButtonOnAddDocPage);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD EXPANDS DOCUMENT ROWS AND CLICKS ON DELETE BUTTON
	 */
	public static void expand_document_rows() {
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.expandIconFirstRow);
		CommonUtils.sleep(2000);
		if (CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.createdOnTextFirstRow).contains(Egrants_Constants.DOC_CREATOR_NAME)) {
			CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.deleteButtonFirstRow);
			CommonUtils.sleep(2000);
		} else if (CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.createdOnTextSecondRow).contains(Egrants_Constants.DOC_CREATOR_NAME)) {
			CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.expandIconSecondRow);
			CommonUtils.sleep(1000);
			CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.deleteButtonSecondRow);
		}
	}

	/***
	 * THIS METHOD CONFIRMS FILE DELETION IF CONDITION IS MET ELSE DISMISSES THE ALERT
	 */
	public static void confirm_document_deletion() {
		if (CommonUtils.getAlertText().contentEquals(Egrants_Constants.DELETE_ALERT_MESSAGE)){
			CucumberLogUtils.logScreenshot();
			CommonUtils.acceptAlert();
			System.out.println("Alert Present and condition is true");
		} else {
			CommonUtils.dismissAlert();
			CucumberLogUtils.logScreenshot();
			System.out.println("Condition is not true");
		}
	}

	/***
	 * THIS METHOD CLICKS ON UPDATE ICON FOR AN UPLOADED ORGANIZATION DOCUMENT
	 */
	public static void enters_subcategory_for_institutional_file() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.subCategoryInstitutionalFiles);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.subCategoryInstitutionalFiles,Egrants_Constants.FOLLOWUP_SUBCATEGORY);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD DELETES AN UPLOADED DOCUMENT FROM THE INSTITUTIONAL FILES
	 */
	public static void click_on_delete_button_institutional_files() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.deleteIconInstitutionalFiles);
		EgrantsStepImplementation.confirm_document_deletion();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS CREATE GRANT YEAR
	 */
	public static void selects_create_grant_year() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.grantsDropdown);
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(egrantsSearchandFileManagementScenariosPage.createNewGrantYearText);
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.grantsDropdown, Egrants_Constants.CREATE_GRANT_YEAR);
		CucumberLogUtils.logScreenshot();
		CommonUtils.switchToNextWindow();
	}

	/***
	 * THIS METHOD SELECTS APPLICATION TYPE
	 * @param type
	 */
	public static void selects_application_type(Integer type) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.applicationType);
		CommonUtils.sleep(2000);
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.applicationType, Egrants_Constants.APPLICATION_TYPE);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS ACTIVITY CODE
	 */
	public static void selects_activity_code() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.activityCode);
		CommonUtils.sleep(2000);
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.activityCode, Egrants_Constants.ACITIVTY_CODE);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD ENTERS GRANT YEAR
	 */
	public static void enters_grant_year() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.yearTextBox);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.yearTextBox, Egrants_Constants.GRANT_YEAR);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD ENTERS SUFFIX CODE
	 */
	public static void enters_suffix_code() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.suffixCodeTextBox);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.suffixCodeTextBox, Egrants_Constants.SUFFIX_CODE);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD VERIFIES THE CREATED GRANT YEAR AND IF IT ALREADY EXISTS, IT CREATES A NEW ONE
	 */
	public static void verifies_the_created_grant_year() {
		String actualGrantYearMessage = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.grantYearHasBeenCreated);
		if (actualGrantYearMessage.contentEquals(Egrants_Constants.GRANT_YEAR_HAS_BEEN_CREATED_MESSAGE)){
			System.out.println(actualGrantYearMessage);
			CucumberLogUtils.logScreenshot();
		} else if (actualGrantYearMessage.contentEquals(Egrants_Constants.DUPLICATE_GRANT_YEAR_EXISTS_MESSAGE)){
			System.out.println(actualGrantYearMessage+" Creating a new grant year");
			CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.applicationType, Egrants_Constants.APPLICATION_TYPE);
			CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.activityCode, Egrants_Constants.ACITIVTY_CODE);
			CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.yearTextBox);
			CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.yearTextBox, Egrants_Constants.GRANT_YEAR);
			CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.suffixCodeTextBox, Egrants_Constants.SUFFIX_CODE_S2);
			CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.createNewGrantYearButton);
			CucumberLogUtils.logScreenshot();
		}
	}

	/***
	 * THIS METHOD VERIFIES THE SUCCESS ICON FOR DOWNLOADED FILES
	 */
	public static void verifies_the_success_message_for_downloaded_files() {
		CommonUtils.waitForVisibility(egrantsSearchandFileManagementScenariosPage.downloadSuccessMessage);
		Hooks.softAssert.assertTrue(egrantsSearchandFileManagementScenariosPage.downloadSuccessMessage.isDisplayed());
		CucumberLogUtils.logScreenshot();
	}
}