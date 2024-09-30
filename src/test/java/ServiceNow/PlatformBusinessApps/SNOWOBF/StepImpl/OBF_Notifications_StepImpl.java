package ServiceNow.PlatformBusinessApps.SNOWOBF.StepImpl;

import ServiceNow.PlatformBusinessApps.SNOWOBF.Pages.OBF_NCI_NV_Form_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.Pages.OBF_NCI_Portal_Form_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.Pages.OBF_Notifications_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.Pages.NCISP_Portal_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
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
        PlaywrightUtils.page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.servicesLink);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.servicesLink).setExact(true)).click();
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.cbiit_BusinessServicesLink);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.cbiit_BusinessServicesLink)).first().click();
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.administrative_BusinessServicesLinkLocator)).containsText(NCISP_Portal_Page.administrative_BusinessServicesLink);
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.administrative_BusinessPageLink)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        PlaywrightUtils.page.getByText(NCISP_Portal_Page.obf_SystemsSupportPageLink).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop).getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForClearField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForFieldLocator).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForFieldSearchText).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForName);
        PlaywrightUtils.page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForName).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownSelectOneStreamBus)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicField);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCField).isHidden();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour)).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD, new Locator.GetByTextOptions().setExact(true)).click();
        assertThat(PlaywrightUtils.page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RadioButtonsSelectOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).click();
        assertThat(PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox)).isVisible();
        PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBoxInput);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCField).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCName);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCName)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).click();
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmittedText)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     *  THIS METHOD SUBMIT AN OBF TICKET FOR NEW REQUEST FOR ACCESS
     *  AND APPROVES IT
     */
    public static void i_submit_a_ticket_for_and_the_ticket_is_approved() {
        OBF_Notifications_StepImpl.submitATicketForNewUserAccess();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).isVisible();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).isVisible();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label).selectOption(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_select_Option);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Label).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Body_Locator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        CommonUtils.sleep(20000);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Preview_Record_Ticket_Number).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).isVisible();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).fill(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Form_Header_Locator).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Save_Button)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Approval_Label, new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(OBF_Notifications_Page.obf_NV_Form_Approval_Label_Value_Requested);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Locator).getByText(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Label).isVisible();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Locator).getByText(OBF_Notifications_Page.obf_NV_Form_Approvers_Tab_Label).click();
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Page_Approvers_Tab_Preview_Record)).isVisible();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Page_Approvers_Tab_Preview_Record).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true)).click();
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Locator)).hasValue(OBF_Notifications_Page.obf_NV_Form_Approval_Label_Value_Requested);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Locator)).containsText(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Text);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_Approve_Button_Locator).click();
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Locator)).hasValue(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Value_Approved);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label).isVisible();
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label)).containsText(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Back_Button_Label).click();
        CommonUtils.sleep(1000);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Approval_Label, new FrameLocator.GetByLabelOptions().setExact(true)).isVisible();
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Approval_Label, new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(OBF_Notifications_Page.obf_NV_Approval_Page_State_Text_Box_Value_Approved);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * THIS METHOD WAITS FOR A APPROVAL NOTIFICATION EMAIL
     * AND VERIFY THE APPROVAL EMAIL CONTENT
     * AND DELETE THE RECORD
     */
    public static void the_requested_for_should_get_a_notification() {
        ticketNumber = PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Form_Ticket_Number_Text_Box_Locator).getAttribute(OBF_Notifications_Page.obf_NV_Form_Ticket_Number_Text_Box_Value);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Number_Label, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        CommonUtils.sleep(20000); //wait for an approval email
        PlaywrightUtils.page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).isVisible();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        PlaywrightUtils.page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).click();
        PlaywrightUtils.page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).fill(OBF_Notifications_Page.obf_NV_Search_SystemLogs);
        PlaywrightUtils.page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label).press(OBF_Notifications_Page.press_Enter_Key);
        assertThat(PlaywrightUtils.page.getByPlaceholder(OBF_Notifications_Page.obf_NV_Emails_Search_Filter_Label)).hasValue(OBF_Notifications_Page.obf_NV_Search_SystemLogs);
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs))).isVisible();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs)).click();
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs))).isVisible();
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.HEADING)).containsText(OBF_Notifications_Page.obf_NV_Search_Emails_Under_SystemLogs);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Hide_Show_Filter_Button)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_First_Row_Search_Drop_Down_Field).setExact(true)).locator(OBF_Notifications_Page.nv_Email_First_Row_Search_Drop_Down_Field_Locator).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Search_Drop_Down_Field_Choose_Option).setExact(true)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Search_Drop_Down_Field_Choose_Option).setExact(true)).fill(OBF_Notifications_Page.nv_Email_Search_Recipients_Option);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Search_Drop_Down_Field_Choose_Option).setExact(true)).press(OBF_Notifications_Page.press_Enter_Key);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_First_Row_Operator_Condition).selectOption(OBF_Notifications_Page.nv_Email_Operator_Condition_Select_Option_IS);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_Search_Recipients_Option, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_Search_Recipients_Option, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_Notifications_Page.nv_Email_First_Row_Recipient_Email);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_Add_AND_Condition_For_Second_Row).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Second_Row_Search_Drop_Down_Field).setExact(true)).locator(OBF_Notifications_Page.nv_Email_First_Row_Search_Drop_Down_Field_Locator).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Search_Drop_Down_Field_Choose_Option)).fill(OBF_Notifications_Page.nv_Email_Search_Email_Subject_Option);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Search_Drop_Down_Field_Choose_Option)).press(OBF_Notifications_Page.press_Enter_Key);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_Second_Row_Operator_Condition).selectOption(OBF_Notifications_Page.nv_Email_Operator_Condition_Select_Option_IS);
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_Search_Email_Subject_Option, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_Search_Email_Subject_Option, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_Notifications_Page.obf_Approval_Email_Subject(ticketNumber));
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Run_Filter_Button).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Email_Preview_Record).first()).isVisible();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.obf_NV_Form_Email_Preview_Record).first().click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true))).isVisible();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Open_Record_Button).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_Notifications_Page.obf_NV_Email_Page_Subject_Locator)).containsText(OBF_Notifications_Page.nv_Email_Search_Email_Subject_Option);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_Notifications_Page.nv_Email_Search_Email_Subject_Option)).hasValue(OBF_Notifications_Page.obf_Approval_Email_Subject(ticketNumber));
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Page_Preview_Email_Link)).scrollIntoViewIfNeeded();
        PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(OBF_Notifications_Page.nv_Email_Page_Preview_Email_Link)).click();
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).getByRole(AriaRole.PARAGRAPH)).containsText(OBF_Notifications_Page.nv_Email_Notification_Content_Greeting_Hello);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.obf_Approval_Email_Subject(ticketNumber));
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Approval_Email_Notification_Content_Line_Three);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Details_of_your_request_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Ticket_Number_Line(ticketNumber));
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Requested_For_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Opened_By_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Opened_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Application_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Topic_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Short_description_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Preview_Email_Body_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Description_Content_Line);
        assertThat(PlaywrightUtils.page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).frameLocator(OBF_Notifications_Page.nv_Email_Preview_Email_IFrame_Locator).locator(OBF_Notifications_Page.nv_Email_Notification_Html_Locator)).containsText(OBF_Notifications_Page.nv_Email_Notification_Email_Signature_Content);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
        OBF_NCI_NV_Form_StepImpl.deleteTheOBFTicketAutomationRecord();
    }
}