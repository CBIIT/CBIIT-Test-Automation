package PLATFORM_BUSINESS.SNOWOBF.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import PLATFORM_BUSINESS.SNOWOBF.pages.NCISP_Portal_Page;
import PLATFORM_BUSINESS.SNOWOBF.pages.OBF_NCI_NV_Form_Page;
import PLATFORM_BUSINESS.SNOWOBF.pages.OBF_NCI_Portal_Form_Page;
import PLATFORM_BUSINESS.SNOWOBF.pages.OBF_Notifications_Page;
import PLATFORM_BUSINESS.SNOWOBF.stepsImpl.OBF_NCI_NV_Form_StepImpl;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class OBF_Role_User_Access_Steps {

    public static String requestItemNumber;

    /**
     * Logs into native view using the side door test account and impersonates OBF user.
     * Parameterize the user's name as a string argument.
     *
     * @param ashlyEng the name of the user to impersonate
     */
    @Given("I am an authenticated OBF user {string}")
    public void i_am_an_authenticated_obf_user(String ashlyEng) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(ashlyEng);
    }

    /**
     * OBF User/fulfiller "Ashley Eng" Navigates to the OBF request form
     * and submits a request with the BUS application
     * and topic is "New Request for Access".
     * The Requested for and opened by is "Ashley Eng".
     * The supervisor is "Paul Lyons" to approve the request.
     */
    @When("a user submits an obf request where the application is BUS & topic is New Request for Access")
    public void a_user_submits_an_obf_request_where_the_application_is_bus_topic_is_new_request_for_access() {
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.servicesLink);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.servicesLink).setExact(true)).click();
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.cbiit_BusinessServicesLink);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.cbiit_BusinessServicesLink)).first().click();
        assertThat(page.locator(NCISP_Portal_Page.administrative_BusinessServicesLinkLocator)).containsText(NCISP_Portal_Page.administrative_BusinessServicesLink);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.administrative_BusinessPageLink)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        page.getByText(NCISP_Portal_Page.obf_SystemsSupportPageLink).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        CucumberLogUtils.playwrightScreenshot(page); page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.servicesLink);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.servicesLink).setExact(true)).click();
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.cbiit_BusinessServicesLink);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.cbiit_BusinessServicesLink)).first().click();
        assertThat(page.locator(NCISP_Portal_Page.administrative_BusinessServicesLinkLocator)).containsText(NCISP_Portal_Page.administrative_BusinessServicesLink);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.administrative_BusinessPageLink)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        page.getByText(NCISP_Portal_Page.obf_SystemsSupportPageLink).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop).getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownSelectOneStreamBus)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicField);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCField).isHidden();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour)).click();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD, new Locator.GetByTextOptions().setExact(true)).click();
        assertThat(page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RadioButtonsSelectOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).click();
        assertThat(page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox)).isVisible();
        page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBoxInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCField).isVisible();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCField).click();
        page.locator("//input[@id='s2id_autogen8_search']").fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCName);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCName)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).click();
        page.getByLabel("Description", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Description", new Page.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").scrollIntoViewIfNeeded();
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- OBF TICKET SUBMITTED SUCCESSFULLY AND LOG OUT AS OBF USER ----");
        Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * Method to handle the approval of a request.
     * Impersonates a Supervisor "Paul Lyons" to approve the ticket
     *
     */
    @When("that request gets approved")
    public void that_request_gets_approved() {

        CucumberLogUtils.scenario.log("---- LOG IN AS SUPERVISOR TO APPROVE THE REQUEST ----");
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Paul Lyons");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label).selectOption(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_select_Option);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Label).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Body_Locator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//td[@class='list_decoration_cell col-small col-center ']//child::a").click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//a[normalize-space()='Open Record']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).click();
        CommonUtils.sleep(9000); //wait for assigned to field to load
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").fill(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Field value has changed since"))).isVisible();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Field value has changed since"))).hasValue("Paul Lyons");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save"))).isVisible();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);
        CommonUtils.sleep(5000); //wait for save to complete
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Locator).getByText(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Label).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Locator).getByText(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Label).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Page_Approvers_Tab_Preview_Record)).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Page_Approvers_Tab_Preview_Record).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true)).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Locator)).hasValue(OBF_Notifications_Page.obf_NV_Form_Approval_Label_Value_Requested);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Locator)).containsText(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Text);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Locator).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Locator)).hasValue(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Value_Approved);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label)).containsText(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Waits for a requested item to be created and validates its status and visibility in the system.
     * Once the requested item is created, it retrieves the item number for further verification.
     */
    @Then("a Requested Item should get created")
    public void a_requested_item_should_get_created() {
        CommonUtils.sleep(9000); //wait for request item to be created
        assertThat(page.locator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).contentFrame().getByLabel("Approval", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("approved");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save"))).isVisible();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName("Requested Items (1)")).scrollIntoViewIfNeeded();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName("Requested Items (1)"))).isVisible();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_list").getByText("Requested Items (1)").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- GET THE REQUESTED ITEM CREATED FOR CURRENT RUN ----");
        requestItemNumber = page.frameLocator("iframe[name='gsft_main']").locator("(//a[@class='btn btn-icon table-btn-lg icon-info list_popup'])[2]").getAttribute("data-popover-title");
        System.out.println("---- REQUESTED ITEM NUMBER CREATED FOR CURRENT RUN: " + requestItemNumber + " ----");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Asserts that the provided user "Tim Siford" is added to the watchlist of the requested item.
     *
     * @param timSiford the user to be added to the watchlist
     */
    @Then("{string} should be added to the watchlist of the requested item")
    public void should_be_added_to_the_watchlist_of_the_requested_item(String timSiford) {

        CucumberLogUtils.scenario.log("---- OPEN THE REQUESTED ITEM AND VERIFY THAT 'TIM SIFORD' IS ADDED TO WATCH LIST ----");
        page.frameLocator("iframe[name='gsft_main']").locator("(//a[@class='btn btn-icon table-btn-lg icon-info list_popup'])[2]").hover();
        page.frameLocator("iframe[name='gsft_main']").locator("(//a[@class='btn btn-icon table-btn-lg icon-info list_popup'])[2]").click();
        page.frameLocator("iframe[name='gsft_main']").locator("//a[normalize-space()='Open Record']").click();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"sc_req_item\\.watch_list_label\"]")).containsText(timSiford);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- LOG OUT AS SUPERVISOR ----");
        Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * Performs necessary actions for an authenticated user "Tim Siford" to access an existing OBF ticket which was submitted earlier.
     *
     * @param timSiford the name of the authenticated user
     */
    @Then("when an authenticated user {string} access to an existing OBF ticket submitted above")
    public void when_an_authenticated_user_access_to_an_existing_obf_ticket_submitted_above(String timSiford) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(timSiford);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label).selectOption(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_select_Option);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Label).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Body_Locator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//td[@class='list_decoration_cell col-small col-center ']//child::a").click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//a[normalize-space()='Open Record']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to ensure that Tim has both Read and Write access to all OBF tickets by updating the submitted ticket.
     * This method verifies that Tim can update the assigned to field to 'Brian Johnson' and save the changes.
     * It also verifies that Tim can update the 'Access Requested For' field under the Request Details section.
     * Finally, it asserts that Tim can update the 'Access Requested For' field to 'Budget Supervisor' and save the changes.
     * It also asserts that the new value is not equal to the previous value.
     * Finally, it ends impersonation as Tim and deletes the automation record as CBIIT Test Admin user.
     */
    @Then("Tim should have Read and Write Access to all OBF tickets by updating the submitted ticket")
    public void tim_should_have_read_and_write_access_to_all_obf_tickets_by_updating_the_submitted_ticket() {

        CucumberLogUtils.scenario.log("---- UPDATE THE ASSIGNED TO FIELD TO 'BRIAN JOHNSON' ----");
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).click();
        CommonUtils.sleep(9000); //wait for assigned to field to load
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").fill("Brian Johnson");
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").press("Enter");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Field value has changed since"))).isVisible();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Field value has changed since"))).hasValue("Brian Johnson");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save"))).isVisible();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- UPDATE THE 'ACCESS REQUESTED FOR' FIELD UNDER THE REQUEST DETAILS SECTION ----");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Request Details")).isVisible();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#tabs2_section").getByText("Request Details").click();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByText("Access Requested For")).isVisible();

        CucumberLogUtils.scenario.log("---- VERIFY AND RETRIEVED THE PREVIOUS VALUE OF THE 'ACCESS REQUESTED FOR' FIELD AND PRINT TO COMPARE----");
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//select[@id='x_g_nci_obf_tickets.access_requested_for']").isVisible();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Access Requested For", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("Budget Analyst");
        String previousValue = page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Access Requested For", new FrameLocator.GetByLabelOptions().setExact(true)).inputValue();
        System.out.println("---- PREVIOUS VALUE: " + previousValue + " ----");
        Assert.assertEquals(previousValue, "Budget Analyst", "---- ASSERTS THAT PREVIOUS VALUE IS EQUAL TO 'Budget Analyst' ---- ");

        CucumberLogUtils.scenario.log("---- UPDATE THE 'ACCESS REQUESTED FOR' FIELD TO 'Budget Supervisor' AND SAVE ----");
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Access Requested For", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption("Budget Supervisor");
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//select[@id='x_g_nci_obf_tickets.access_requested_for']").press("Enter");
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();

        CucumberLogUtils.scenario.log("---- VERIFY AND RETRIEVED THE NEW VALUE OF THE 'ACCESS REQUESTED FOR' FIELD AND PRINT TO COMPARE----");
        String newValue = page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Access Requested For", new FrameLocator.GetByLabelOptions().setExact(true)).inputValue();
        System.out.println("---- NEW VALUE: " + newValue + " ----");
        Assert.assertEquals(newValue, "Budget Supervisor", "---- ASSERTS THAT NEW VALUE IS EQUAL TO 'Budget Supervisor' ---- ");

        CucumberLogUtils.scenario.log("---- ASSERTS THAT NEW VALUE IS NOT EQUAL TO PREVIOUS VALUE ----");
        Assert.assertNotEquals(newValue, previousValue, "---- ASSERTS THAT NEW VALUE IS NOT EQUAL TO PREVIOUS VALUE ---- ");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- END IMPERSONATE AS TIM AND DELETE THE AUTOMATION RECORD AS CBIIT TEST ADMIN USER  ----");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Tim Siford: available")).click();
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("End impersonation")).click();
        CommonUtils.sleep(1000);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Native View")).click();
        OBF_NCI_NV_Form_StepImpl.deleteTheOBFTicketAutomationRecord();
        Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
    }
}