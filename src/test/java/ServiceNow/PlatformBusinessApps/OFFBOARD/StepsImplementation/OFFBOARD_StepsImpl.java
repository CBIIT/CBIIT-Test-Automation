package ServiceNow.PlatformBusinessApps.OFFBOARD.StepsImplementation;

import ServiceNow.PlatformBusinessApps.OFFBOARD.Constants.CBIIT_OFFBOARD_FORM_Constants;
import ServiceNow.PlatformBusinessApps.OFFBOARD.Pages.OFFBOARD_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.BoundingBox;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.TestProperties;
import org.testng.Assert;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OFFBOARD_StepsImpl {
    public static Page returnHardwarePage;
    public static String returnHardwarePageUrl;

    /**
     * THIS METHOD NAVIGATES TO CBIIT OFFBOARDING PORTAL PAGE
     */
    public static void i_navigate_to_to_the_offboarding_request_form_to_put_in_a_request_to_off_board_or_transfer_an_employee() {
        page.navigate(TestProperties.getNCISPUrl());
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Business Services")).first().click();
        assertThat(page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CATEGORY_TEXT, new Page.GetByLabelOptions().setExact(true))).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_BUSINESS_SERVICESLINK);
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_PAGE_LINK_TEXT).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method navigates to the offboarding request form and fills in Requester For fields.
     */
    public static void i_open_the_offboarding_request_form() {
        page.navigate(TestProperties.getNCISPUrl());
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Business Services")).first().click();
        assertThat(page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CATEGORY_TEXT, new Page.GetByLabelOptions().setExact(true))).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_BUSINESS_SERVICESLINK);
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_PAGE_LINK_TEXT).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingFormTitleTextOnTheTopLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_TEXT_PAGE_TITLE);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingFormTRequestedForTextBoxLocator).click();
        page.locator("//input[@id='sp_formfield_requested_for_off']").fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_REQUESTED_FOR_NAME);
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_REQUESTED_FOR_NAME).click();
        page.getByLabel(OFFBOARD_Page.cbiit_OffBoardingNonNihEmailTextBoxGetByLabel, new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel(OFFBOARD_Page.cbiit_OffBoardingNonNihEmailTextBoxGetByLabel, new Page.GetByLabelOptions().setExact(true)).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_REQUESTED_FOR_NON_NIH_EMAIL);
        page.getByLabel(OFFBOARD_Page.cbiit_OffBoardingNonNihEmailTextBoxGetByLabel, new Page.GetByLabelOptions().setExact(true)).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        page.getByPlaceholder(OFFBOARD_Page.cbiit_OffBoardingPhoneTextBoxGetByPlaceHolder).click();
        page.getByPlaceholder(OFFBOARD_Page.cbiit_OffBoardingPhoneTextBoxGetByPlaceHolder).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_PHONE_NUMBER_ENTERED);
        page.getByPlaceholder(OFFBOARD_Page.cbiit_OffBoardingPhoneTextBoxGetByPlaceHolder).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified departure or transfer field is visible on the page.
     *
     * @param departureOrTransferField the text of the departure or transfer field
     * @param departure                the departure value
     */
    public static void i_should_see_field_to_put_in_a_request_for_an_employee(String departureOrTransferField, String departure) {
        page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator)).containsText(departureOrTransferField);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingDepartureOrTransferRequestDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(departure)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingBeforeFivePMLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_BEFORE_FIVE_PM_TEXT);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingBeforeFivePMDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        page.waitForSelector(OFFBOARD_Page.cbiit_DateAndTimeOfOffboardingFieldLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_DateAndTimeOfOffboardingFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_DATE_AND_TIME_OF_OFFBOARDING_FIELD_TEXT);
        page.getByLabel(OFFBOARD_Page.cbiit_ShowCalendarForDateAndTimeFieldLocator).click();
        page.getByLabel(OFFBOARD_Page.cbiit_DateTimePickerIsOpenedFieldLocator).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_OK_OPTION_SELECTED)).click();
        assertThat(page.getByLabel("Required - Point of Contact")).containsText("Point of Contact");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_POINT_OF_CONTACT_NAME).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * If the user selects "No" for the "isTheEmployeeLocatedOnSiteField", then show the "fedexLabelNeeded" field.
     * This method interacts with the page and verifies certain conditions.
     */
    public static void if_user_selects_no_for_the_isTheEmployeeLocatedOnSiteField_then_show_the_fedexLabelNeeded_field() {
        page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingFormIsTheEmployeeLocatedOnSiteLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_EmployeeAddressFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT)).isHidden();
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_FIELD_TEXT)))).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingFormIsTheEmployeeLocatedOnSiteDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_NO_OPTION_SELECTED).setExact(true)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_EmployeeAddressFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT)).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_TEXT);
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_FIELD_TEXT)))).isVisible();
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT).click();
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_ADDRESS_ENTERED);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_EMPLOYEE_ADDRESS_FIELD_TEXT).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the "FedEx Label Needed" field is positioned below the "Employee Address" field.
     *
     * @throws Exception if the bounding box cannot be retrieved for one or both fields
     */
    public static void the_fedexLabelNeeded_field_should_be_under_employeeAddress_field() {
        try {
            BoundingBox fedexLabelNeededFieldBounds = page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator).boundingBox();
            BoundingBox employeeAddressFieldBounds = page.locator(OFFBOARD_Page.cbiit_EmployeeAddressFieldLocator).boundingBox();
            if (fedexLabelNeededFieldBounds == null || employeeAddressFieldBounds == null) {
                throw new Exception("Could not find the element location for one or both fields on the page");
            }
            Assert.assertTrue(fedexLabelNeededFieldBounds.y > employeeAddressFieldBounds.y, "The “FedEx Label Needed” field is under “Employee Address” field");
            CucumberLogUtils.playwrightScreenshot(page);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * If the user selects "Yes" for the "Fedex Label Needed" field, then show the "Are Boxes Needed
     * for Items to be returned" field.
     */
    public static void if_user_selects_yes_for_the_fedexLabelNeeded_field_then_show_the_areBoxesNeededForItemsToBeReturned_field() {
        page.waitForSelector(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_FIELD_TEXT)))).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_FIELD_TEXT)))).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_FEDEX_LABEL_NEEDED_TEXT);
        page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededTextBoxFieldLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_FIELD_TEXT)))).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_AreBoxesNeededForItemsToBeReturnedFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the "Are Boxes Needed for Items to be returned?" field is positioned under the "FedEx Label Needed" field.
     *
     * @throws Exception if the bounding box cannot be retrieved for one or both fields
     */
    public static void the_areBoxesNeededForItemsToBeReturned_field_should_be_under_fedexLabelNeeded() {
        try {
            BoundingBox areBoxesNeededForItemsToBeReturnedFieldBounds = page.locator(OFFBOARD_Page.cbiit_AreBoxesNeededForItemsToBeReturnedFieldLocator).boundingBox();
            BoundingBox fedexLabelNeededFieldBounds = page.locator(OFFBOARD_Page.cbiit_FedexLabelNeededFieldLocator).boundingBox();
            if (areBoxesNeededForItemsToBeReturnedFieldBounds == null || fedexLabelNeededFieldBounds == null) {
                throw new Exception("Could not find the element location for one or both fields on the page");
            }
            Assert.assertTrue(areBoxesNeededForItemsToBeReturnedFieldBounds.y > fedexLabelNeededFieldBounds.y, "The “Are Boxes Needed for Items to be returned?” field is under “FedEx Label Needed” field");
            CucumberLogUtils.playwrightScreenshot(page);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method checks if the user selects "No" for the "areBoxesNeededForItemsToBeReturned" field,
     * then the "numberOfBoxesNeeded" field should not be displayed.
     */
    public static void if_user_selects_no_for_the_areBoxesNeededForItemsToBeReturned_field_then_numberOfBoxesNeeded_field_does_not_display() {
        page.waitForSelector(OFFBOARD_Page.cbiit_AreBoxesNeededForItemsToBeReturnedFieldLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_AreBoxesNeededForItemsToBeReturnedFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_ARE_BOXES_NEEDED_FOR_ITEMS_TO_BE_RETURNED_TEXT);
        assertThat(page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT)).isHidden();
        page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededTextBoxFieldLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_NO_OPTION_SELECTED).setExact(true)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT)).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * If the user selects "Yes" for the "Are Boxes Needed for Items to be returned" field,
     * then show the "Number of Boxes Needed" field.
     */
    public static void if_user_selects_yes_for_the_areBoxesNeededForItemsToBeReturned_field_then_show_numberOfBoxesNeeded_field() {
        page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededTextBoxFieldLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_NumberOfBoxesNeededFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT)).isVisible();
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT).click();
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT_BOX_VALUE);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_NUMBER_OF_BOXES_NEEDED_TEXT).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method select "yes" for the "Hardware Return Ticket Already Created" field
     * and selects the "Hardware Return Ticket Number(s)"
     * and submits the Travel request
     * As part of new enhancement, "Hardware Return Ticket Number(s)" field will be displayed
     * even if the user selects "None", "Yes" or "No" for the "Hardware Return Ticket Already Created" field
     */
    public static void if_user_selects_yes_for_the_hardwareReturnTicketAlreadyCreated_field_then_just_show_hardwareReturnTicketNumber_field() {
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_ALREADY_CREATED_FIELD_TEXT)))).isVisible();

        //updated for the field "Hardware Return Ticket Number(s)" is being displayed as a new enhancement
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("#s2id_sp_formfield_already_created a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_S_TEXT);
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#hardware_ticket_number")).containsText("Hardware Return Ticket Number(s)");
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Required Hardware Return")).click();
        page.locator("//input[@id='s2id_autogen11']").fill("NCI-RITM0472526");
        page.getByText("NCI-RITM0472526").click();
        assertThat(page.locator("#additional_info")).containsText("Additional Information");
        page.getByLabel("Additional Information", new Page.GetByLabelOptions().setExact(true)).fill("test");
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        page.waitForSelector("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']");
        assertThat(page.locator("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified departure or transfer field is visible on the page and performs certain interactions with the page.
     *
     * @param departureOrTransferField the text of the departure or transfer field
     * @param transfer                 the transfer value
     */
    public static void i_should_see_field_to_put_in_a_request(String departureOrTransferField, String transfer) {
        page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator)).containsText(departureOrTransferField);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingDepartureOrTransferRequestDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(transfer)).click();
        assertThat(page.locator("#within_or_outside_transfer")).containsText("Is this transfer within or outside of NCI?");
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Is this transfer within or outside of NCI\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_within_or_outside_transfer a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Within NCI")).click();
        assertThat(page.getByLabel(OFFBOARD_Page.cbiit_RequestDetails).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_DATE_OF_TRANSFER_TEXT)).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_DateOfTransferFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_DATE_OF_TRANSFER_TEXT);
        page.getByLabel(OFFBOARD_Page.cbiit_ShowCalendarForDateOfTransferFieldLocator).click();
        page.getByLabel(OFFBOARD_Page.cbiit_DatePickerIsOpenedFieldLocator).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_OK_OPTION_SELECTED)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_HnSacTransferToFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).click();
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT_BOX_Value);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        assertThat(page.getByLabel("Required - Point of Contact")).containsText("Point of Contact");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_POINT_OF_CONTACT_NAME).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * If the user selects "Yes" for the answer to the "isTheEmployeeLocatedOnSite" field,
     * this method shows the "onsiteLocation" field and performs certain interactions with the page.
     */
    public static void if_user_select_yes_for_the_answer_to_isTheEmployeeLocatedOnSite_field_show_onsiteLocation_field() {
        page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingFormIsTheEmployeeLocatedOnSiteLocator);
        page.waitForSelector("//span[normalize-space()='Is the employee located On Site?']");
        assertThat(page.locator("//span[@aria-label='Onsite Location']").getByText("Onsite Location")).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#onsite_offsite")).containsText("Is the employee located On Site?");
        page.locator("#s2id_sp_formfield_onsite_offsite a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();
        page.locator("//span[@aria-label='Onsite Location']").scrollIntoViewIfNeeded();
        assertThat(page.locator("//span[@aria-label='Onsite Location']")).containsText("Onsite Location");
        assertThat(page.locator("//span[@aria-label='Onsite Location']").getByText("Onsite Location")).isVisible();
        page.locator("#s2id_sp_formfield_location").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_ONSITE_LOCATION_SELECTED_DROP_DOWN_VALUE)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * if the user selects "No" for the "hardware Return Ticket Already Created" field.
     * then shows both the "return Hardware Request" link and "hardware Return Ticket Number(s)" field
     */
    public static void if_user_selects_no_for_the_hardwareReturnTicketAlreadyCreated_field_then_show_both_the_returnHardwareRequest_link_and_hardwareReturnTicketNumber_field() {
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_ALREADY_CREATED_FIELD_TEXT)))).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isHidden();
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_RETURN_HARDWARE_FORM_URL_TEXT))).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Already_CreatedTextBoxFieldLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_NO_OPTION_SELECTED).setExact(true)).click();
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_RETURN_HARDWARE_FORM_URL_TEXT))).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Return_Hardware_Form_URL_FieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_RETURN_HARDWARE_FORM_URL_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_RETURN_HARDWARE_FORM_URL_TEXT)).scrollIntoViewIfNeeded();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        assertThat(page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT);
        assertThat(page.locator("#hardware_url")).isVisible();
    }

    /**
     * Verifies that the URL of the "Return Hardware Request" link is as expected.
     *
     * @param expectedURL the expected URL of the "Return Hardware Request" link
     */
    public static void verify_that_the_hardware_request_link_url_should_be(String expectedURL) {
        assertThat(page.locator("#hardware_url")).containsText("Return Hardware Form URL");
        returnHardwarePage = page.waitForPopup(() -> {
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_RETURN_HARDWARE_FORM_URL_TEXT)).click();
        });
        CucumberLogUtils.playwrightScreenshot(returnHardwarePage);
        returnHardwarePageUrl = returnHardwarePage.url();
        Assert.assertEquals(returnHardwarePageUrl, expectedURL, "Verifies that the URL of the 'Return Hardware Request' link is as expected.");
        returnHardwarePage.close();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_RETURN_HARDWARE_FORM_URL_TEXT)).scrollIntoViewIfNeeded();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_S_TEXT);
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#hardware_ticket_number")).containsText("Hardware Return Ticket Number(s)");
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Hardware Return Ticket Number")).click();
        page.locator("//input[@id='s2id_autogen11']").fill("NCI-RITM0472526");
        page.getByText("NCI-RITM0472526").click();
        assertThat(page.locator("#additional_info")).containsText("Additional Information");
        page.getByLabel("Additional Information", new Page.GetByLabelOptions().setExact(true)).fill("test");
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        page.waitForSelector("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']");
        assertThat(page.locator("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * User logs in and access to Off Boarding Form
     */
    public static void i_am_an_authenticated_user_with_nci_credential() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        i_open_the_offboarding_request_form();
    }

    /**
     * Fills out an offboarding form for a "Departure" request under the "Departure or Transfer Request" field.
     *
     * @param departure                 the departure value
     * @param departureOrTransferRequest the text of the departure or transfer field
     */
    public static void i_fill_out_an_offboarding_form_for_request_under_the_field(String departure, String departureOrTransferRequest) {
        page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator)).containsText(departureOrTransferRequest);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingDepartureOrTransferRequestDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(departure)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingBeforeFivePMLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_BEFORE_FIVE_PM_TEXT);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingBeforeFivePMDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_YES_OPTION_SELECTED)).click();
        page.waitForSelector(OFFBOARD_Page.cbiit_DateAndTimeOfOffboardingFieldLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_DateAndTimeOfOffboardingFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_DATE_AND_TIME_OF_OFFBOARDING_FIELD_TEXT);
        page.getByLabel(OFFBOARD_Page.cbiit_ShowCalendarForDateAndTimeFieldLocator).click();
        page.getByLabel(OFFBOARD_Page.cbiit_DateTimePickerIsOpenedFieldLocator).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_OK_OPTION_SELECTED)).click();
        assertThat(page.getByLabel("Required - Point of Contact")).containsText("Point of Contact");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_POINT_OF_CONTACT_NAME).click();
        CucumberLogUtils.playwrightScreenshot(page);
        if_user_select_yes_for_the_answer_to_isTheEmployeeLocatedOnSite_field_show_onsiteLocation_field();
    }

    /**
     * This method selects "Yes" for a field "Hardware Return Ticket Already created" in the Off Boarding form.
     *
     * @param yes                              the option to be selected
     * @param hardwareReturnTicketAlreadyCreated the value of the hardware return ticket already created field
     */
    public static void select_for_field(String yes, String hardwareReturnTicketAlreadyCreated) {
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_ALREADY_CREATED_FIELD_TEXT)))).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Already_CreatedFieldLocator)).containsText(hardwareReturnTicketAlreadyCreated);
        page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Already_CreatedTextBoxFieldLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(yes)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the 'Hardware Return Ticket Number(s)' field is required for departure request.
     *
     * @param hardwareReturnTicketNumbers the value of the hardware return ticket number(s) field
     */
    public static void should_be_required_only_for_departure_request(String hardwareReturnTicketNumbers) {
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(hardwareReturnTicketNumbers);
        assertThat(page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_REQUIRED_TEXT))).isVisible();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_ErrorLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_REQUIRED_FIELDS_ARE_INCOMPLETE_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        String actualAttributeValue = page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Required_FieldLocator).getAttribute(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Required_FieldAttribute);
        Assert.assertEquals(actualAttributeValue, CBIIT_OFFBOARD_FORM_Constants.MANDATORY_FIELD,
                "---- VERIFY THAT 'HARDWARE RETURN TICKET NUMBER(S)' FIELD IS REQUIRED WHEN AN EMPLOYEE SUBMITS DEPARTURE REQUEST ----");
        assertThat(page.locator("#hardware_ticket_number")).containsText("Hardware Return Ticket Number(s)");
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Required Hardware Return")).click();
        page.locator("//input[@id='s2id_autogen11']").fill("NCI-RITM0472526");
        page.getByText("NCI-RITM0472526").click();
        assertThat(page.locator("#additional_info")).containsText("Additional Information");
        page.getByLabel("Additional Information", new Page.GetByLabelOptions().setExact(true)).fill("test");
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        page.waitForSelector("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']");
        assertThat(page.locator("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Fills out an offboarding form for a "Transfer" request under the "Departure or Transfer Request" field.
     *
     * @param transfer                  the value to be selected for the "Transfer" option
     * @param departureOrTransferRequest the text of the departure or transfer field
     */
    public static void i_fill_out_an_offboarding_form_for_under_the_field(String transfer, String departureOrTransferRequest) {
        page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator)).containsText(departureOrTransferRequest);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingDepartureOrTransferRequestDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(transfer)).click();
        assertThat(page.locator("#within_or_outside_transfer")).containsText("Is this transfer within or outside of NCI?");
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Is this transfer within or outside of NCI\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_within_or_outside_transfer a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Within NCI")).click();
        assertThat(page.getByLabel(OFFBOARD_Page.cbiit_RequestDetails).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_DATE_OF_TRANSFER_TEXT)).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_DateOfTransferFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_DATE_OF_TRANSFER_TEXT);
        page.getByLabel(OFFBOARD_Page.cbiit_ShowCalendarForDateOfTransferFieldLocator).click();
        page.getByLabel(OFFBOARD_Page.cbiit_DatePickerIsOpenedFieldLocator).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_OK_OPTION_SELECTED)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_HnSacTransferToFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).click();
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT_BOX_Value);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        assertThat(page.getByLabel("Required - Point of Contact")).containsText("Point of Contact");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_POINT_OF_CONTACT_NAME).click();
        CucumberLogUtils.playwrightScreenshot(page);
        if_user_select_yes_for_the_answer_to_isTheEmployeeLocatedOnSite_field_show_onsiteLocation_field();
    }

    /**
     * Verifies that the 'Hardware Return Ticket Number(s)' field is not required for a transfer request except "transfer outside of NCI".
     *
     * @param hardwareReturnTicketNumbers the value of the hardware return ticket number(s) field
     */
    public static void should_not_be_required_for_transfer_request(String hardwareReturnTicketNumbers) {
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isVisible();
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(hardwareReturnTicketNumbers);
        assertThat(page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_REQUIRED_TEXT))).isHidden();
        String actualAttributeValue = page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Non_Required_FieldLocator).getAttribute(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Required_FieldAttribute);
        Assert.assertNotEquals(actualAttributeValue, CBIIT_OFFBOARD_FORM_Constants.MANDATORY_FIELD,
                "-- VERIFY THAT 'HARDWARE RETURN TICKET NUMBER(S)' FIELD IS NOT REQUIRED WHEN AN EMPLOYEE SUBMITS TRANSFER REQUEST --");
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        page.waitForSelector("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']");
        assertThat(page.locator("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}