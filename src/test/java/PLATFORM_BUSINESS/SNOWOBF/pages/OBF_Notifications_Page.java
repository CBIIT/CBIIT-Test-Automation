package PLATFORM_BUSINESS.SNOWOBF.pages;

import ServiceNow.PLATFORM_BUSINESS.SNOWOBF.Pages.OBF_NCI_NV_Form_Page;
import ServiceNow.PLATFORM_BUSINESS.SNOWOBF.Pages.OBF_NCI_Portal_Form_Page;

public class OBF_Notifications_Page {

    /***
     * OBF APPROVAL EMAIL SUBJECT
     */
    public static String obf_Approval_Email_Subject (String ticketNumber2){
        return "Your Budget Unification System (BUS) request - " + ticketNumber2 + " has been approved.";
    }

    /**
     * NV EMAIL NOTIFICATION TICKET NUMBER LINE
     * @param ticketNumber2
     * @return
     */
    public static String nv_Email_Notification_Ticket_Number_Line(String ticketNumber2){
        return "Number: " + ticketNumber2;
    }

    /***
     * OBF NV FORM TICKET NUMBER TEXT BOX LOCATOR
     */
    public static String obf_NV_Form_Ticket_Number_Text_Box_Locator = "//input[@id='x_g_nci_obf_tickets.number']";

    /***
     * OBF NV FORM TICKET NUMBER TEXT BOX GET ATTRIBUTE VALUE
     */
    public static String obf_NV_Form_Ticket_Number_Text_Box_Value = "value";

    /***
     * OBF NV EMAIL PAGE SUBJECT LOCATOR
     */
    public static String obf_NV_Email_Page_Subject_Locator = "[id=\"label\\.sys_email\\.subject\"]";

    /***
     * OBF NV FORM EMAIL PREVIEW RECORD
     */
    public static String obf_NV_Form_Email_Preview_Record = "Preview record: Your";

    /***
     * OBF NV FORM APPROVAL LABEL
     */
    public static String obf_NV_Form_Approval_Label = "Approval";

    /***
     * OBF NV FORM APPROVAL LABEL VALUE REQUEST
     */
    public static String obf_NV_Form_Approval_Label_Value_Requested = "requested";

    /***
     * OBF NV FORM APPROVERS TAB LOCATOR
     */
    public static String obf_NV_Form_Approvers_Tab_Locator = "#tabs2_list";

    /***
     * OBF NV FORM APPROVERS TAB LABEL
     */
    public static String obf_NV_Form_Approvers_Tab_Label = "Approvers";

    /***
     *  OBF NATIVE VIEW PAGE APPROVERS TAB PREVIEW RECORD
     */
    public static String obf_NV_Page_Approvers_Tab_Preview_Record = "Preview record: OBF Tickets:";

    /***
     *  OBF NATIVE VIEW APPROVAL PAGE STATE TEXT BOX LOCATOR
     */
    public static String obf_NV_Approval_Page_State_Text_Box_Locator = "[id=\"sysapproval_approver\\.state\"]";

    /***
     *  OBF NATIVE VIEW APPROVAL PAGE APPROVE BUTTON LOCATOR
     */
    public static String obf_NV_Approval_Page_Approve_Button_Locator = "#approve";

    /***
     *  OBF NATIVE VIEW APPROVAL PAGE APPROVE BUTTON TEXT
     */
    public static String obf_NV_Approval_Page_Approve_Button_Text = "Approve";

    /***
     *  OBF NATIVE VIEW APPROVAL PAGE STATE TEXT BOX VALUES APPROVED
     */
    public static String obf_NV_Approval_Page_State_Text_Box_Value_Approved = "approved";

    /***
     * OBF NV FORM BACK BUTTON LABEL
     */
    public static String obf_NV_Form_Back_Button_Label = "Back";

    /***
     * OBF NV EMAILS SEARCH FILTER LABEL
     */
    public static String obf_NV_Emails_Search_Filter_Label = "Filter";

    /***
     * OBF NV SEARCH SYSTEM LOGS
     */
    public static String obf_NV_Search_SystemLogs = "System Logs";

    /***
     * OBF NV SEARCH EMAILS UNDER SYSTEM LOGS
     */
    public static String obf_NV_Search_Emails_Under_SystemLogs = "Emails";

    /***
     * PRESS ENTER KEY
     */
    public static String press_Enter_Key = "Enter";

    /***
     * NV SHOW AND HIDE FILTER BUTTON
     */
    public static String nv_Hide_Show_Filter_Button = " Show / hide filter";

    /***
     * NV EMAILS FIRST ROW SEARCH DROP DOWN FIELD
     */
    public static String nv_Email_First_Row_Search_Drop_Down_Field = "All of these conditions must be met. Created";

    /***
     * NV EMAILS SEARCH DROP DOWN FIELD CHOOSE OPTION
     */
    public static String nv_Email_Search_Drop_Down_Field_Choose_Option = "Choose option";

    /***
     * NV EMAILS SEARCH RECIPIENTS OPTION
     */
    public static String nv_Email_Search_Recipients_Option = "Recipients";

    /***
     * NV EMAILS FIRST ROW OPERATOR CONDITION
     */
    public static String nv_Email_First_Row_Operator_Condition = "Operator For Condition 1:";

    /***
     * NV EMAILS OPERATOR CONDITION SELECT OPTION IS
     */
    public static String nv_Email_Operator_Condition_Select_Option_IS = "=";

    /***
     * NV EMAILS FIRST ROW RECIPIENT EMAIL
     */
    public static String nv_Email_First_Row_Recipient_Email = "ben.foulkes@nih.gov";

    /***
     * NV EMAILS ADD AND CONDITION FOR SECOND ROW
     */
    public static String nv_Email_Add_AND_Condition_For_Second_Row = "Add AND Condition To";

    /***
     * NV EMAILS SECOND ROW SEARCH DROP DOWN FIELD
     */
    public static String nv_Email_Second_Row_Search_Drop_Down_Field = "All of these conditions must be met. -- choose field --";

    /***
     * NV EMAILS SEARCH EMAIL SUBJECT OPTION
     */
    public static String nv_Email_Search_Email_Subject_Option = "Subject";

    /***
     * NV EMAILS SECOND ROW OPERATOR CONDITION
     */
    public static String nv_Email_Second_Row_Operator_Condition = "Operator For Condition 2:";

    /***
     * NV EMAILS PREVIEW EMAIL IFRAME LOCATOR
     */
    public static String nv_Email_Preview_Email_IFrame_Locator = "iframe[title=\"Preview Email\"]";

    /***
     * NV EMAILS PREVIEW EMAIL BODY LOCATOR
     */
    public static String nv_Email_Preview_Email_Body_Locator = "body";

    /***
     * NV RUN FILTER BUTTON
     */
    public static String nv_Run_Filter_Button = "Run filter";

    /***
     * NV EMAIL PAGE PREVIEW EMAIL LINK
     */
    public static String nv_Email_Page_Preview_Email_Link = "Preview Email";

    /***
     * NV EMAIL NOTIFICATION CONTENT GREETINGS HELLO
     */
    public static String nv_Email_Notification_Content_Greeting_Hello = "Hello,";

    /***
     * NV EMAIL APPROVAL NOTIFICATION CONTENT LINE THREE
     */
    public static String nv_Approval_Email_Notification_Content_Line_Three = "If you have any questions regarding the approval of your request, please reach out to OBF Systems Support at NCIOBFSystemsTeam@mail.nih.gov for further clarification.";

    /***
     * NV EMAIL NOTIFICATION DETAILS OF YOUR REQUEST CONTENT LINE
     */
    public static String nv_Email_Notification_Details_of_your_request_Content_Line = "Details of your request are displayed below:";

    /***
     * NV EMAIL NOTIFICATION REQUESTED FOR CONTENT LINE
     */
    public static String nv_Email_Notification_Requested_For_Content_Line = "Requested for: " + OBF_NCI_Portal_Form_Page.obf_Request_Form_RequestedForName;

    /***
     * NV EMAIL NOTIFICATION OPENED BY CONTENT LINE
     */
    public static String nv_Email_Notification_Opened_By_Content_Line = "Opened by: CBIIT Test Account";

    /***
     * NV EMAIL NOTIFICATION OPENED CONTENT LINE
     */
    public static String nv_Email_Notification_Opened_Content_Line = "Opened: ";

    /***
     * NV EMAIL NOTIFICATION APPLICATION CONTENT LINE
     */
    public static String nv_Email_Notification_Application_Content_Line = "Application: " + ServiceNow.PLATFORM_BUSINESS.SNOWOBF.Pages.OBF_NCI_NV_Form_Page.obf_NV_Page_Selected_Application_OneStream_BUS_Value;

    /***
     * NV EMAIL NOTIFICATION TOPIC CONTENT LINE
     */
    public static String nv_Email_Notification_Topic_Content_Line = "Topic: " + OBF_NCI_NV_Form_Page.obf_NV_Page_Selected_Topic_New_Request_for_Access_Value;

    /***
     * NV EMAIL NOTIFICATION SHORT DESCRIPTION CONTENT LINE
     */
    public static String nv_Email_Notification_Short_description_Content_Line = "Short description: OBF Systems - Budget Unification System (BUS): New Request for Access";

    /***
     * NV EMAIL NOTIFICATION DESCRIPTION CONTENT LINE
     */
    public static String nv_Email_Notification_Description_Content_Line = "Description: " + OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput;

    /***
     * NV EMAIL NOTIFICATION HTML LOCATOR
     */
    public static String nv_Email_Notification_Html_Locator = "html";

    /***
     * NV EMAIL NOTIFICATION EMAIL SIGNATURE CONTENT
     */
    public static String nv_Email_Notification_Email_Signature_Content = "Thank you, OBF Team Unsubscribe | Notification Preferences";
}