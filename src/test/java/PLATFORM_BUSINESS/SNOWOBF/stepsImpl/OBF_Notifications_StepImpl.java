package PLATFORM_BUSINESS.SNOWOBF.stepsImpl;

import PLATFORM_BUSINESS.SNOWOBF.pages.OBF_NCI_NV_Form_Page;
import PLATFORM_BUSINESS.SNOWOBF.pages.OBF_NCI_Portal_Form_Page;
import PLATFORM_BUSINESS.SNOWOBF.pages.OBF_Notifications_Page;
import PLATFORM_BUSINESS.SNOWOBF.pages.NCISP_Portal_Page;
import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import static APPS_COMMON.Pages.Playwright_Common_Locators.iframeLocator;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class OBF_Notifications_StepImpl {

    public static String ticketNumber;

    /**
     * THIS METHOD LOGS IN TO NATIVE VIEW AS A NCI TEST USER
     */
    public static void i_am_an_authenticated_user_with_nci_credentials() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    /**
     * THIS METHOD NAVIGATES TO OBF Systems Support PORTAL PAGE
     * AND SUBMITS THE OBF TICKET AS REQUESTED FOR NCI AUTHENTICATE USER AS BEN FOLUKES
     * SELECTS SUPERVISOR AS AN NCI USER AS MARIA CHAUDHRY
     * AND FOR NEW USER ACCESS
     */
    public static void submitATicketForNewUserAccess(){
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
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop).getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForClearField).click();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForFieldLocator).click();
        page.locator("//input[@id='s2id_autogen5_search']").fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForName);
        page.locator("//div[contains(text(),'Ben Foulkes')]").click();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorField).click();
        page.locator("//input[@id='s2id_autogen6_search']").fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName)).click();
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
    }

    /**
     *  THIS METHOD SUBMIT AN OBF TICKET FOR NEW REQUEST FOR ACCESS
     *  AND APPROVES IT
     */
    public static void i_submit_a_ticket_for_and_the_ticket_is_approved() {
        OBF_Notifications_StepImpl.submitATicketForNewUserAccess();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        page.frameLocator(iframeLocator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(iframeLocator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).isVisible();
        page.frameLocator(iframeLocator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label).selectOption(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_select_Option);
        assertThat(page.frameLocator(iframeLocator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        page.frameLocator(iframeLocator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(iframeLocator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        page.frameLocator(iframeLocator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(page.frameLocator(iframeLocator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Label).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Body_Locator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(iframeLocator).locator("//td[@class='list_decoration_cell col-small col-center ']//child::a").click();
        page.frameLocator(iframeLocator).locator("//a[normalize-space()='Open Record']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(iframeLocator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).isVisible();
        page.frameLocator(iframeLocator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).click();
        CommonUtils.sleep(10000);
        page.frameLocator(iframeLocator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").fill(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller);
        page.frameLocator(iframeLocator).locator("//input[@id='sys_display.x_g_nci_obf_tickets.assigned_to']").click();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save"))).isVisible();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("[id=\"x_g_nci_obf_tickets\\.form_header\"]").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);
        CommonUtils.sleep(1000);
        page.frameLocator(iframeLocator).locator(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Locator).getByText(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Label).isVisible();
        page.frameLocator(iframeLocator).locator(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Locator).getByText(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Label).click();
        assertThat(page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.obf_NV_Page_Approvers_Tab_Preview_Record)).isVisible();
        page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.obf_NV_Page_Approvers_Tab_Preview_Record).click();
        page.frameLocator(iframeLocator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true)).click();
        assertThat(page.frameLocator(iframeLocator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Locator)).hasValue(OBF_Notifications_Page.obf_NV_Form_Approval_Label_Value_Requested);
        assertThat(page.frameLocator(iframeLocator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Locator)).containsText(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Text);
        page.frameLocator(iframeLocator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Locator).click();
        assertThat(page.frameLocator(iframeLocator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Locator)).hasValue(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Value_Approved);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label).isVisible();
        assertThat(page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label)).containsText(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label);
        page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label).click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * THIS METHOD WAITS FOR A APPROVAL NOTIFICATION EMAIL
     * AND VERIFY THE APPROVAL EMAIL CONTENT
     * AND DELETE THE RECORD
     */
    public static void the_requested_for_should_get_a_notification() {
        ticketNumber = page.frameLocator(iframeLocator).locator(OBF_Notifications_Page.obf_NV_Form_Ticket_Number_Text_Box_Locator).getAttribute(OBF_Notifications_Page.obf_NV_Form_Ticket_Number_Text_Box_Value);
        System.out.println("---- TICKET NUMBER FOR CURRENT RUN: " + ticketNumber + " ----");
        CommonUtils.sleep(20000); //WAIT FOR AN APPROVAL EMAIL
        page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).click();
        page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).fill(OBF_Notifications_Page.obf_NV_Search_SystemLogs);
        page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).press(OBF_Notifications_Page.press_Enter_Key);
        assertThat(page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label)).hasValue(OBF_Notifications_Page.obf_NV_Search_SystemLogs);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs))).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs)).click();
        assertThat(page.frameLocator(iframeLocator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs))).isVisible();
        assertThat(page.frameLocator(iframeLocator).getByRole(AriaRole.HEADING)).containsText(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs);
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(" Show / hide filter")).click();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#s2id_autogen1 a").click();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("select2-results").getByRole(AriaRole.OPTION, new Locator.GetByRoleOptions().setName("Recipients")).click();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Operator For Condition 1:").selectOption("=");
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//input[@aria-label='Recipients']").click();
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//input[@aria-label='Recipients']").fill("ben.foulkes@nih.gov");
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Add AND Condition To").click();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("a").filter(new Locator.FilterOptions().setHasText("-- choose field --")).click();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#select2-result-label-62").click();
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Operator For Condition 2:").selectOption("=");
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//input[@aria-label='Subject']").click();
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//input[@aria-label='Subject']").fill(OBF_Notifications_Page.obf_Approval_Email_Subject(ticketNumber));
        page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.nv_Run_Filter_Button).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Email_Preview_Record).first()).isVisible();
        page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Email_Preview_Record).first().click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(iframeLocator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true))).isVisible();
        page.frameLocator(iframeLocator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(iframeLocator).locator("//span[normalize-space()='Subject']")).containsText(OBF_Notifications_Page.nv_Email_Search_Email_Subject_Option);
        assertThat(page.frameLocator(iframeLocator).getByLabel(OBF_Notifications_Page.nv_Email_Search_Email_Subject_Option)).hasValue(OBF_Notifications_Page.obf_Approval_Email_Subject(ticketNumber));
        page.frameLocator(iframeLocator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Page_Preview_Email_Link)).scrollIntoViewIfNeeded();
        page.frameLocator(iframeLocator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Page_Preview_Email_Link)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).getByRole(AriaRole.PARAGRAPH)).containsText(OBF_Notifications_Page.nv_Email_Notification_Content_Greeting_Hello);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.obf_Approval_Email_Subject(ticketNumber));
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Approval_Email_Notification_Content_Line_Three);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Details_of_your_request_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Ticket_Number_Line(ticketNumber));
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Requested_For_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Opened_By_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Opened_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Application_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Topic_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Short_description_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Description_Content_Line);
        assertThat(page.frameLocator(iframeLocator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Notification_Html_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Email_Signature_Content);
        CucumberLogUtils.playwrightScreenshot(page);
        OBF_NCI_NV_Form_StepImpl.deleteTheOBFTicketAutomationRecord();
    }
}