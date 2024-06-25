package ServiceNow.PlatformBusinessApps.OFFBOARD.StepsImplementation;

import ServiceNow.PlatformBusinessApps.OFFBOARD.Constants.CBIIT_OFFBOARD_FORM_Constants;
import ServiceNow.PlatformBusinessApps.OFFBOARD.Pages.NCISP_Page;
import ServiceNow.PlatformBusinessApps.OFFBOARD.Pages.OFFBOARD_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.BoundingBox;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OFFBOARD_StepsImpl {

    /**
     * THIS METHOD NAVIGATES TO CBIIT OFFBOARDING PORTAL PAGE
     */
    public static void i_navigate_to_to_the_offboarding_request_form_to_put_in_a_request_to_off_board_or_transfer_an_employee() {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("ServiceNow NCISP"));
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Page.servicesLink).setExact(true)).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Page.cbiit_Business_ServicesLink_Locator)).first().click();
        assertThat(PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CATEGORY_TEXT, new Page.GetByLabelOptions().setExact(true))).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_BUSINESS_SERVICESLINK);
        PlaywrightUtils.page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_PAGE_LINK_TEXT).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * Executes the offboarding requester action by logging into the native view using the side door test account.
     */
    public static void i_am_an_offboarding_requester() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    /**
     * This method navigates to the offboarding request form and fills in Requester For fields.
     */
    public static void i_open_the_offboarding_request_form() {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("ServiceNow NCISP"));
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Page.servicesLink).setExact(true)).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Page.cbiit_Business_ServicesLink_Locator)).first().click();
        assertThat(PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CATEGORY_TEXT, new Page.GetByLabelOptions().setExact(true))).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_BUSINESS_SERVICESLINK);
        PlaywrightUtils.page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_PAGE_LINK_TEXT).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingFormTitleTextOnTheTopLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_TEXT_PAGE_TITLE);
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingFormTRequestedForTextBoxLocator).click();
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingFormRequestedForSearchTextBoxLocator).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_REQUESTED_FOR_NAME);
        PlaywrightUtils.page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_REQUESTED_FOR_NAME).click();
        PlaywrightUtils.page.getByLabel(OFFBOARD_Page.cbiit_OffBoardingNonNihEmailTextBoxGetByLabel, new Page.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.getByLabel(OFFBOARD_Page.cbiit_OffBoardingNonNihEmailTextBoxGetByLabel, new Page.GetByLabelOptions().setExact(true)).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_REQUESTED_FOR_NON_NIH_EMAIL);
        PlaywrightUtils.page.getByLabel(OFFBOARD_Page.cbiit_OffBoardingNonNihEmailTextBoxGetByLabel, new Page.GetByLabelOptions().setExact(true)).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        PlaywrightUtils.page.getByPlaceholder(OFFBOARD_Page.cbiit_OffBoardingPhoneTextBoxGetByPlaceHolder).click();
        PlaywrightUtils.page.getByPlaceholder(OFFBOARD_Page.cbiit_OffBoardingPhoneTextBoxGetByPlaceHolder).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_PHONE_NUMBER_ENTERED);
        PlaywrightUtils.page.getByPlaceholder(OFFBOARD_Page.cbiit_OffBoardingPhoneTextBoxGetByPlaceHolder).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * Verifies that the specified departure or transfer field is visible on the page.
     *
     * @param departureOrTransferField the text of the departure or transfer field
     */
    public static void i_should_see_field(String departureOrTransferField) {
        PlaywrightUtils.page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator)).containsText(departureOrTransferField);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingDepartureOrTransferRequestDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_DEPARTURE_OPTION_SELECTED)).click();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingBeforeFivePMLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_BEFORE_FIVE_PM_TEXT);
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingBeforeFivePMDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        PlaywrightUtils.page.waitForSelector(OFFBOARD_Page.cbiit_DateAndTimeOfOffboardingFieldLocator);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_DateAndTimeOfOffboardingFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_DATE_AND_TIME_OF_OFFBOARDING_FIELD_TEXT);
        PlaywrightUtils.page.getByLabel(OFFBOARD_Page.cbiit_ShowCalendarForDateAndTimeFieldLocator).click();
        PlaywrightUtils.page.getByLabel(OFFBOARD_Page.cbiit_DateTimePickerIsOpenedFieldLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_OK_OPTION_SELECTED)).click();
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingFormPointOfContactSearchTextBoxLocator).click();
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingFormPointOfContactSearchLocator).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_POINT_OF_CONTACT_NAME);
        PlaywrightUtils.page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_POINT_OF_CONTACT_NAME).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * If the user selects "No" for the "isTheEmployeeLocatedOnSiteField", then show the "fedexLabelNeeded" field.
     * This method interacts with the page and verifies certain conditions.
     */
    public static void if_user_selects_no_for_the_isTheEmployeeLocatedOnSiteField_then_show_the_fedexLabelNeeded_field() {
        PlaywrightUtils.page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingFormIsTheEmployeeLocatedOnSiteLocator);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_EmployeeAddressFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT)).isHidden();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_FIELD_TEXT)))).isHidden();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingFormIsTheEmployeeLocatedOnSiteDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_NO_OPTION_SELECTED).setExact(true)).click();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_EmployeeAddressFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT)).isVisible();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_TEXT);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_FIELD_TEXT)))).isVisible();
        PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT).click();
        PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_ADDRESS_ENTERED);
        PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * Verifies that the "FedEx Label Needed" field is positioned below the "Employee Address" field.
     *
     * @throws Exception if the bounding box cannot be retrieved for one or both fields
     */
    public static void the_fedexLabelNeeded_field_should_be_under_employeeAddress_field() throws Exception {
        BoundingBox fedexLabelNeededFieldBounds = PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator).boundingBox();
        BoundingBox employeeAddressFieldBounds = PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_EmployeeAddressFieldLocator).boundingBox();
        if (fedexLabelNeededFieldBounds == null || employeeAddressFieldBounds == null) {
            throw new Exception("Could not retrieve bounding box for one or both fields.");
        }
        Assert.assertTrue(fedexLabelNeededFieldBounds.y > employeeAddressFieldBounds.y, "The “FedEx Label Needed” field is under “Employee Address” field");
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * If the user selects "Yes" for the "Fedex Label Needed" field, then show the "Are Boxes Needed
     * for Items to be returned" field.
     */
    public static void if_user_selects_yes_for_the_fedexLabelNeeded_field_then_show_the_areBoxesNeededForItemsToBeReturned_field() {
        PlaywrightUtils.page.waitForSelector(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_FIELD_TEXT)))).isHidden();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_FIELD_TEXT)))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_TEXT);
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededTextBoxFieldLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_FIELD_TEXT)))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_AreBoxesNeededForItemsToBeReturnedFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_TEXT);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * If the user selects "Yes" for the "Are Boxes Needed for Items to be returned" field,
     * then show the "Number of Boxes Needed" field.
     * This method interacts with the page and verifies certain conditions.
     */
    public static void if_user_selects_yes_for_the_areBoxesNeededForItemsToBeReturned_field_then_show_numberOfBoxesNeeded_field() {
        PlaywrightUtils.page.waitForSelector(OFFBOARD_Page.cbiit_AreBoxesNeededForItemsToBeReturnedFieldLocator);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_AreBoxesNeededForItemsToBeReturnedFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_TEXT);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT)).isHidden();
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededTextBoxFieldLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT)).isVisible();
        PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT).click();
        PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT_BOX_VALUE);
        PlaywrightUtils.page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * If the user selects "Yes" for the "Hardware Return Ticket Already Created" field,
     * then just show the "Hardware Return Ticket Number" field.
     * This method interacts with the page and verifies certain conditions.
     */
    public static void if_user_selects_yes_for_the_hardwareReturnTicketAlreadyCreated_field_then_just_show_hardwareReturnTicketNumber_field() {
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_ALREADY_CREATED_FIELD_TEXT)))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isHidden();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_aLocator).filter(new Locator.FilterOptions().setHasText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_NONE_OPTION)).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_S_TEXT);
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberTextBoxFieldLocator).click();
        PlaywrightUtils.page.getByText(CBIIT_OFFBOARD_FORM_Constants.cbiit_Hardware_Return_Ticket_NumberTextBoxValue).click();
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_SUBMIT_BUTTON))).isVisible();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_SUBMIT_BUTTON)).click();
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_SERVICESLINK).setExact(true))).isVisible();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }
}