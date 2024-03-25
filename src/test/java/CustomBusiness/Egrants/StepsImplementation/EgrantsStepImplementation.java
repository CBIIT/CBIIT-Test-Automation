package CustomBusiness.Egrants.StepsImplementation;

import CustomBusiness.Egrants.Pages.EgrantsQuickLinkAndManagementMenuPage;
import CustomBusiness.Egrants.Utils.Egrants_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import org.testng.Assert;

public class EgrantsStepImplementation extends PageInitializer {

	/***
	 * THIS METHOD LOGS INTO eGrants
	 * @param
	 */
	public static void user_is_logged_in_the_application_and_is_on_the_landing_page(){
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("Egrants"));
		iTrustLoginPageImpl.loginToITrust();
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD EXPANDS QUICK LINKS MENU
	 * @param
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
				Assert.assertEquals(actualPMSPageTitle, expectedPMSPageTitle);
				CucumberLogUtils.logScreenshot();
				MiscUtils.sleep(3000);
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
		Assert.assertEquals(actualUser, user);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SEARCHES FOR A STRING IN THE SEARCHBOX
	 * @param string
	 */
	public static void searches_for(String string) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchBox);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.searchBox,string);
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchButton);
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(2000);
	}

	/***
	 * THIS METHOD VERIFIES THE PROJECT TITLE
	 * @param
	 */
	public static void verifies_the_project_title_as() {
		String actualProjectTitle = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.projectTitle);
		String expectedProjectTitle = Egrants_Constants.PROJECT_TITLE;
		Assert.assertEquals(actualProjectTitle, expectedProjectTitle);
		System.out.println(expectedProjectTitle);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD VERIFIES THE INSTITUTION NAME
	 * @param
	 */
	public static void verifies_the_institution_name_as() {
		String actualInstitutionName = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.institutionName);
		String expectedInstitutionName = Egrants_Constants.INSTITUTION_NAME;
		Assert.assertEquals(actualInstitutionName, expectedInstitutionName);
		System.out.println(expectedInstitutionName);
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(3000);
	}

	/***
	 * THIS METHOD SELECTS GRANT YEAR
	 * @param year
	 */
	public static void clicks_on_year(Integer year) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.year18MainGrantHeader);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD VERIFIES THE USER IS ON THE INTENDED GRANT FOLDER
	 * @param string
	 */
	public static void verifies_is_the_landed_grant_folder(String string) {
		String actualFullGrantSerialNumber = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.fullGrantSerialNumber);
		Assert.assertEquals(actualFullGrantSerialNumber, string);
		System.out.println(string);
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(2000);
	}

	/***
	 * THIS METHOD CLICKS ON ADD DOCUMENT BUTTON
	 * @param
	 */
	public static void clicks_on_add_document_button() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.addDocumentButton);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SEARCHES FOR STRING WITHIN THE SEARCHBOX
	 * @param string
	 */

	public static void searches_for_grant(String string) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchBoxAddDocumentPage);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.searchBoxAddDocumentPage,string);
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchButtonOnAddDocumentPage);
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(2000);
	}

	/***
	 * THIS METHOD SELECTS A GRANT YEAR FROM A DROPDOWN
	 * @param
	 */
	public static void selects_grant_year() {
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.grantsDropdown, 1);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS APPLICATON FILE AS THE DOCUMENT CATEGORY
	 * @param
	 */
	public static void selects_category_as_application_file() {
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.categoryDropdown, 2);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD PASSES A STRING AS SUBCATEGORY
	 * @param string
	 */
	public static void passes_as_subcategory(String string) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.subCategory);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.subCategory,string);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SWITCHES DOCUMENT UPLOAD OPTION AS LOCATE FILE AND UPLOAD
	 * @param
	 */
	public static void clicks_on_locate_file_and_upload_tab() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.locateFileAndUploadTab);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD UPLOADS A FILE DEFINED IN THE CONSTANT CLASS
	 * @param
	 */
	public static void uploads_a_file() {
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.chooseFile, Egrants_Constants.TEST_FILE_PATH);
		MiscUtils.sleep(5000);
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.addFileButton);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD VERIFIES THE DOCUMENT UPLOAD MESSAGE
	 * @param string
	 */
	public static void verifies_the_success_message(String string) {
		String actualSuccessMessage = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.successMessage);
		Assert.assertEquals(actualSuccessMessage, string);
		System.out.println(string);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SWITCHES WINDOWS TO OPEN THE UPLOADED FILE
	 * @param
	 */
	public static void clicks_on_uploaded_document() {
		String emWindowHandle = WebDriverUtils.webDriver.getWindowHandle();
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.checkDocumentButton);
		CommonUtils.switchToNextWindow();
		MiscUtils.sleep(3000);
		CommonUtils.webDriver.close();
		MiscUtils.sleep(3000);
	}

	/***
	 * THIS METHOD CLICKS ON INSTITUTIONAL FILES MENU
	 * @param
	 */

	public static void user_clicks_on_institutional_files(){
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.institutionalFiles);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS AN INSTITUTION
	 * @param
	 */
	public static void user_selects_aavogen(){
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.aavogeninc);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD CLICKS ON CREATE A NEW DOCUMENT
	 * @param
	 */
	public static void clicks_on_create_new_document_link() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.createNewDocumentLink);
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(3000);
	}

	/***
	 * THIS METHOD SELECTS ORGANIZATION DOCUMENT FROM DROPDOWN
	 * @param
	 */
	public static void selects_organization_document_from_category_dropdown()  {
		CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.documentCategoryDropdown, 3);
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(3000);
	}

	/***
	 * THIS METHOD ADDS A SUBCATEGORY FOR THE SELECTED CATEGORY
	 * @param string
	 */
	public static void provides_as_a_subcategory(String string) {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.subCategoryInstitutionalFiles);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.subCategoryInstitutionalFiles, string);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD CREATES A NEW DOCUMENT
	 * @param
	 */

	public static void clicks_on_create_new_button() {
		CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.createNewButton);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD NAVIGATES TO MANAGEMENT MENU
	 * @param
	 */
	public static void clicks_on_management_menu() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.managementMenu);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS QC REASON FROM DROPDOWN
	 * @param
	 */
	public static void selects_qc_reason() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.qcReason);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.qcReason, "Change");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS QC PERSON FROM DROPDOWN
	 * @param
	 */

	public static void selects_qc_person() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.qcPerson);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.qcPerson, "3928");
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD ASSIGNS THE SELECTED QC PERSON
	 * @param
	 */
	public static void clicks_on_assign_button() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.assignButton);
		MiscUtils.sleep(2000);
		if (CommonUtils.getAlertText().contentEquals("Are you sure that you want to assign QC Change documents to Test, User?")){
			MiscUtils.sleep(2000);
			CommonUtils.acceptAlert();
			System.out.println("Alert Present");
			CucumberLogUtils.logScreenshot();
		} else {
			CommonUtils.dismissAlert();
			System.out.println("Alert Not Present");
		}
	}

	/***
	 * THIS METHOD SELECTS THE "FROM" USER
	 * @param
	 */
	public static void clicks_on_from_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.fromQC);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.fromQC, "122");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS THE "TO" USER
	 * @param
	 */
	public static void clicks_on_to_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.toQC);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.toQC, "3928");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD SELECTS DOCUMENT PERCENTAGE
	 * @param
	 */
	public static void clicks_on_percentage_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.percentageQC);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.percentageQC, "10");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * THIS METHOD ROUTES THE DOCUMENTS
	 * @param
	 */
	public static void clicks_on_route_button() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.routeButton);
		MiscUtils.sleep(2000);
		if (CommonUtils.getAlertText().contentEquals("Are you sure that you want to route 10%  QC documents from D'Avella, Joseph to Test, User?")){
			MiscUtils.sleep(2000);
			CommonUtils.acceptAlert();
			System.out.println("Alert Present");
			CucumberLogUtils.logScreenshot();
		} else {
			CommonUtils.dismissAlert();
			System.out.println("Alert Not Present");
		}
	}
}