package PLATFORM_BUSINESS.SNOWOBF.stepsImpl;

import ServiceNow.PLATFORM_BUSINESS.SNOWOBF.Pages.NCISP_Portal_Page;
import ServiceNow.PLATFORM_BUSINESS.SNOWOBF.Pages.OBF_NCI_NV_Form_Page;
import ServiceNow.PLATFORM_BUSINESS.SNOWOBF.Pages.OBF_NCI_Portal_Form_Page;
import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import ServiceNow.PLATFORM_BUSINESS.SNOWOBF.StepImpl.OBF_Notifications_StepImpl;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OBF_NCI_NV_Form_StepImpl {

    /**
     * THIS METHOD LOGS INTO SIDE DOOR AND IMPERSONATE TO OBF SYSTEMS SUPPORT FULFILLER
     */
    public static void i_am_an_authenticated_obf_fulfiller_user() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(OBF_NCI_NV_Form_Page.obf_Fulfiller_User_Name);
    }

    /**
     * THIS METHOD NAVIGATES TO OBF SYSTEMS SUPPORT NATIVE VIEW PAGE
     * @param obfSystemsSupport
     */
    public static void i_navigate_to_the_native_view_and_type_in_the_navigation_search_window(String obfSystemsSupport) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(obfSystemsSupport, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        assertThat(page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support);
    }

    /**
     * THIS METHOD VERIFIES THE OBF SYSTEMS SUPPORT NATIVE VIEW PAGE MENU OPTIONS
     * @param allTickets
     * @param openTickets
     * @param closedTickets
     * @param oneStreamBus
     */
    public static void i_should_see_the_following_options_in_the_obf_systems_support_module(String allTickets, String openTickets, String closedTickets, String oneStreamBus) {
        page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator).click();
        assertThat(page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        assertThat(page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Menu_Open_Tickets_Option);
        assertThat(page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Menu_Closed_Tickets_Option);
        assertThat(page.getByRole(AriaRole.LIST)).containsText(OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Menu_OneStream_BUS_Option);
        assertThat(page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(allTickets);
        assertThat(page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(openTickets);
        assertThat(page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(closedTickets);
        assertThat(page.locator(OBF_NCI_NV_Form_Page.obf_App_NV_Search_Menu_Locator)).containsText(oneStreamBus);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * THIS METHOD SUBMITS THE NEW USER ACCESS TICKET AND NAVIGATES TO IT
     */
    public static void i_navigate_to_the_new_or_open_ticket_for_obf_systems_solution_in_native_view() {
        OBF_Notifications_StepImpl.submitATicketForNewUserAccess();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label).selectOption(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Label).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Body_Locator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//a[@aria-label='Preview record: ']").click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//a[normalize-space()='Open Record']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * THIS METHOD VERIFIES EACH FIELD OF THE TICKET AS A FULFILLER
     */
    public static void i_should_see_the_following_layout_for_the_ticket() {
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Number_Label).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Number_Label).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Number_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Number_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Approval_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Approval_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Approval_Label);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Requested_For_Label).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Requested_For_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Requested_For_Label);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Opened_By_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Opened_By_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Opened_By_Label);
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Assignment_Group_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Assignment_Group_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Assignment_Group_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Priority_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Priority_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Priority_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Watch_List_Label, new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Watch_List_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Watch_List_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Short_Description_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Short_Description_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Short_Description_Label);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Request_Details_TAB_Label_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Request_Details_Label).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Request_Details_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Request_Details_TAB_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Request_Details_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Application_Label, new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Application_Label, new FrameLocator.GetByLabelOptions().setExact(true))).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Selected_Application_OneStream_BUS_Value);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"label\\.x_g_nci_obf_tickets\\.topic\"]")).containsText("Topic");
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"x_g_nci_obf_tickets\\.topic\"]")).hasValue("New Request for Access");
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"x_g_nci_obf_tickets\\.topic\"]")).containsText("New Request for Access");
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Access_Requested_For_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Access_Requested_For_Label, new FrameLocator.GetByLabelOptions().setExact(true))).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Selected_Budget_Analyst_Value);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Access_Requested_For_Label, new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(OBF_NCI_NV_Form_Page.obf_NV_Page_Selected_Budget_Analyst_Value);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_User_Provisioned_Doc_Label, new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_User_Provisioned_Doc_Label, new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBoxInput);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Description_Label, new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Description_Label, new FrameLocator.GetByLabelOptions().setExact(true))).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Description_Label, new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Request_Details_TAB_Label_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Customer_Details_Label).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Customer_Details_Label).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Requested_For_Label, new Locator.GetByLabelOptions().setExact(true))).hasValue(OBF_NCI_NV_Form_Page.obf_NV_Page_Requested_For_Selected_Value_As_Ben_Foulkes);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Supervisor_Label, new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(OBF_NCI_NV_Form_Page.obf_NV_Page_Supervisor_Selected_Value_As_Maria_Chaudhry);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_ARC_Director_Label, new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(OBF_NCI_NV_Form_Page.obf_NV_Page_ARC_Director_Selected_Value_As_Barbara_Davidson);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Request_Details_TAB_Label_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Comments_Notes_Activities_Label).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Work_notes_list_Label, new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Work_notes_list_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Work_notes_list_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Additional_comments_Or_Work_Notes_Label_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Additional_comments_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Additional_comments_Or_Work_Notes_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Additional_comments_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Additional_comments_Label))).isEmpty();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Additional_comments_Or_Work_Notes_Label_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Work_notes_Label)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Additional_comments_Or_Work_Notes_Label_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Work_notes_Label);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByPlaceholder(OBF_NCI_NV_Form_Page.obf_NV_Page_Work_notes_Label)).isEmpty();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_Activities_Label)).isVisible();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Comments, Notes & Activities form section").locator("td")).containsText("Activities");
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Text_Box)).fill(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.CELL, new FrameLocator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Assigned_To_Fulfiller)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Form_Header_Locator).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Save_Button)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label)).hasValue(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Value_One);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Option_Open);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Cancel_Ticket_Locator)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Cancel_Ticket_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Cancel_Ticket);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Form_Header_Locator).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Start_Work_Button))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByRole(AriaRole.NAVIGATION)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Start_Work_Button);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Form_Header_Locator).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Start_Work_Button)).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label)).hasValue(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Value_Two);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Option_Work_In_Progress);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Cancel_Ticket_Locator)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Cancel_Ticket_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Cancel_Ticket);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Form_Header_Locator).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Resolved_Button)).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label)).hasValue(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Value_Three);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Form_Section).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_State_Option_Closed_Complete);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Cancel_Ticket_Locator)).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ashley Eng: available")).click();
        assertThat(page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("End impersonation"))).isVisible();
        assertThat(page.locator(OBF_NCI_NV_Form_Page.nv_Page_User_Menu_Locator)).containsText(OBF_NCI_NV_Form_Page.nv_Page_End_Impersonation_Link);
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.nv_Page_End_Impersonation_Link)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        deleteTheOBFTicketAutomationRecord();
    }

    /**
     * THIS METHOD NAVIGATES TO NATIVE VIEW AS A NCI USER
     * AND SEARCH FOR THE SUBMITTED OBF TICKET
     * AND DELETES IT
     */
    public static void deleteTheOBFTicketAutomationRecord(){
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption(OBF_NCI_NV_Form_Page.obf_App_NV_Search_OBF_Systems_Support, OBF_NCI_NV_Form_Page.obf_App_NV_OBF_Systems_Support_Search_Options);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label).selectOption(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Label).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Body_Locator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//a[@aria-label='Preview record: ']").click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator("//a[normalize-space()='Open Record']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Delete_Button_Locator).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Delete_Button_Locator).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_Delete_Button_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Delete_Button);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Delete_Confirmation_Pop_Up_Label).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(OBF_NCI_NV_Form_Page.obf_NV_Page_Delete_Button)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_BREADCRUMB_Locator).click();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label).selectOption(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_By_Label)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Drop_Down_Description_Option);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByLabel(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box, new FrameLocator.GetByLabelOptions().setExact(true)).press(OBF_NCI_NV_Form_Page.obf_NV_Page_Search_Text_Box_Enter);
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).getByText(OBF_NCI_NV_Form_Page.obf_NV_Page_No_records_to_display_Text)).isVisible();
        assertThat(page.frameLocator(OBF_NCI_NV_Form_Page.nv_Page_Frame_Locator).locator(OBF_NCI_NV_Form_Page.obf_NV_Page_OBF_Tickets_Results_Locator)).containsText(OBF_NCI_NV_Form_Page.obf_NV_Page_No_records_to_display_Text);
        CucumberLogUtils.playwrightScreenshot(page);
    }
}