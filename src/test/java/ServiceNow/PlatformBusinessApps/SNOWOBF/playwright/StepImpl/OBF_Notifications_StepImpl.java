package ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.StepImpl;

import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.NCISP_Portal_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.OBF_NCI_NV_Form_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.OBF_NCI_Portal_Form_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.OBF_Notifications_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OBF_Notifications_StepImpl {

    public static String ticketNumber;

    /**
     * THIS METHOD LOGS IN TO NATIVE VIEW
     */
    public static void i_am_an_authenticated_user_with_nci_credentials() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
//        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(OBF_NCI_NV_Form_Page.obf_Fulfiller_User_Name);
    }

    /**
     * THIS METHOD NAVIGATES TO OBF Systems Support PORTAL PAGE
     * AND SUBMITS THE OBF TICKET AS REQUESTED FOR NCI AUTHENTICATE USER AS BEN FOLUKES
     * SELECTS SUPERVISOR AS AN NCI USER AS MARIA CHAUDHRY
     * AND FOR NEW USER ACCESS
     */
    public static void submitATicketForNewUserAccess(){
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("ServiceNow NCISP"));
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.servicesLink).setExact(true)).click();
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.servicesLink);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.cbiit_BusinessServicesLink)).first().click();
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.cbiit_BusinessServicesLink);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.administrative_BusinessServicesLink)).click();
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.administrative_BusinessServicesLink);
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        CucumberLogUtils.playwrightScreenshot();
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop).getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForClearField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForFieldLocator).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForFieldSearchText).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForName);
        PlaywrightUtils.page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForName).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName)).click();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownSelectOneStreamBus)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicField);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorField).isHidden();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour)).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD, new Locator.GetByTextOptions().setExact(true)).click();
        assertThat(PlaywrightUtils.page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RadioButtonsSelectOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).click();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).click();
        assertThat(PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox)).isVisible();
        PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBoxInput);
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorField).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorName);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorName)).click();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).click();
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField)).click();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmittedText)).click();
        CucumberLogUtils.playwrightScreenshot();
    }

    public static void i_submit_a_ticket_for_and_the_ticket_is_approved(String newRequestForAccess) {
//        submitATicketForNewUserAccess();
//        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
//        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
//        MiscUtils.sleep(200);
//
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("#x_g_nci_obf_tickets_breadcrumb").isVisible();
//
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search a specific field of").selectOption("description");
//
//        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search a specific field of")).containsText("Description");
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
//
//
//        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("OBF Tickets.").locator("tbody")).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
//
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Preview record: OBF").click();
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open Record").setExact(true)).click();

        OBF_NCI_NV_Form_StepImpl.i_navigate_to_the_new_or_open_ticket_for_obf_systems_solution_in_native_view();

        //if assigned to is empty then assigned the ticket
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).click();
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).fill("Ashley Eng");
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName("Ashley Eng")).click();
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();



//        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).wait();

        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).isVisible();

        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).fill(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Form_Header_Locator).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Save_Button)).click();
        CucumberLogUtils.playwrightScreenshot();


        //Approve the request
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Approval", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("requested");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("#tabs2_list").getByText("Approvers").isVisible();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("#tabs2_list")).containsText("Approvers");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("#tabs2_list").getByText("Approvers").click();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Preview record: OBF Tickets:")).isVisible();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Preview record: OBF Tickets:").click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open Record").setExact(true)).click();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"sysapproval_approver\\.state\"]")).hasValue("requested");
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("#approve")).containsText("Approve");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("#approve").click();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"sysapproval_approver\\.state\"]")).hasValue("approved");
        CucumberLogUtils.playwrightScreenshot();


//        MiscUtils.sleep(2000);


//          assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"sysapproval_approver\\.do\"]")).containsText("Approved OBF Tickets:");
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByText("Info MessageApproved OBF").click();
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Close Messages")).click();

        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Back")).isVisible();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Back")).containsText("Back");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Back").click();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Approval", new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Approval", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("approved");
        CucumberLogUtils.playwrightScreenshot();
        MiscUtils.sleep(20000);



    }

    public static void the_requested_for_should_get_a_notification(String docString) {
        ticketNumber =  PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("//input[@id='x_g_nci_obf_tickets.number']").getAttribute("value");

        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Number", new FrameLocator.GetByLabelOptions().setExact(true)).click();

        PlaywrightUtils.page.getByPlaceholder("Filter").isVisible();
        PlaywrightUtils.page.getByPlaceholder("Filter").click();
        PlaywrightUtils.page.getByPlaceholder("Filter").fill("System Logs");
        PlaywrightUtils.page.getByPlaceholder("Filter").press("Enter");
        assertThat(PlaywrightUtils.page.getByPlaceholder("Filter")).hasValue("System Logs");
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails"))).isVisible();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails")).click();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Emails"))).isVisible();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.HEADING)).containsText("Emails");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(" Show / hide filter")).click();


        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName("All of these conditions must be met. Created").setExact(true)).locator("a").click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Choose option").setExact(true)).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Choose option").setExact(true)).fill("recipients");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Choose option").setExact(true)).press("Enter");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Operator For Condition 1:").selectOption("=");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Recipients", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Recipients", new FrameLocator.GetByLabelOptions().setExact(true)).fill("ben.foulkes@nih.gov");
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Recipients", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");

        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Add AND Condition To").click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName("All of these conditions must be met. -- choose field --").setExact(true)).locator("a").click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Choose option")).fill("subject");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Choose option")).press("Enter");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Operator For Condition 2:").selectOption("=");
//        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Subject", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Subject", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Subject", new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_Notifications_Page.obf_Approval_Email_Subject);
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Run filter").click();
        CucumberLogUtils.playwrightScreenshot();

        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Preview record: Your").first()).isVisible();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Preview record: Your").first().click();
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open Record").setExact(true))).isVisible();

        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Email", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("Open Record");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open Record").setExact(true)).click();

        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Subject")).hasValue(OBF_Notifications_Page.obf_Approval_Email_Subject);

        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(20000);







    }

}
