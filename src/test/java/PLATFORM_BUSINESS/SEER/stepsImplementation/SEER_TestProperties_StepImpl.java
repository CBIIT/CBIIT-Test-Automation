package PLATFORM_BUSINESS.SEER.stepsImplementation;

import static com.nci.automation.web.TestProperties.ENV;

public class SEER_TestProperties_StepImpl {

    /**
     * SEER ODS NATIVE VIEW CUSTOMERS UNDER SEER URL
     */
    public static final String SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_STAGE_URL = "https://service-stage.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_seer_data_customer_list.do%3Fsysparm_userpref_module%3D1a5b18501b5418102701b913cc4bcbc5";
    public static final String SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_TEST_URL = "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_seer_data_customer_list.do%3Fsysparm_userpref_module%3D1a5b18501b5418102701b913cc4bcbc5";
    public static final String SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_seer_data_customer_list.do%3Fsysparm_userpref_module%3D1a5b18501b5418102701b913cc4bcbc5";
    public static String SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String getNativeViewFilterNavCustomerUnderSEERUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_URL = SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_STAGE_URL;
                break;
            case "test":
                SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_URL = SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_TEST_URL;
                break;
            case "sandbox":
                SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_URL = SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_SANDBOX_URL;
                break;
        }
        return SEER_ODS_NATIVE_VIEW_CUSTOMERS_UNDER_SEER_URL;
    }

    /**
     * SEER INCIDENT DATA NATIVE VIEW FILTER NAVIGATION SENT UNDER MAILBOX URL
     */
    public static final String SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_STAGE_URL = "https://service-stage.nci.nih.gov/now/nav/ui/classic/params/target/sys_email_list.do%3Fsysparm_query%3D%26sysparm_first_row%3D1%26sysparm_view%3Doutbox";
    public static final String SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_TEST_URL = "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sys_email_list.do%3Fsysparm_query%3D%26sysparm_first_row%3D1%26sysparm_view%3Doutbox";
    public static final String SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/now/nav/ui/classic/params/target/sys_email_list.do%3Fsysparm_query%3D%26sysparm_first_row%3D1%26sysparm_view%3Doutbox";
    public static String SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String getNativeViewFilterNavSentUnderMailBoxUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_URL = SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_STAGE_URL;
                break;
            case "test":
                SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_URL = SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_TEST_URL;
                break;
            case "sandbox":
                SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_URL = SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_SANDBOX_URL;
                break;
        }
        return SEER_INCIDENT_DATA_NATIVE_VIEW_FILTER_NAVIGATION_SENT_UNDER_MAILBOX_URL;
    }

    /**
     * SEER RESEARCH USER DUA URL
 * THIS URL IS CREATED EVERY TIME THE ENVIRONMENT IS CLONED FOR TESTING THE DUA AGREEMENTS FOR SEER RESEARCH USERS
     */
    public static final String SEER_DATA_ACCESS_REQUEST_STAGE_URL = "https://service-stage.nci.nih.gov/seer-data-access?id=seer_data_access_request&sysparm_user=";
    public static final String SEER_DATA_ACCESS_REQUEST_TEST_URL = "https://service-test.nci.nih.gov/seer-data-access?id=seer_data_access_request&sysparm_user=57a59d848758d610ad46326d3fbb3586";
    public static final String SEER_DATA_ACCESS_REQUEST_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/seer-data-access?id=seer_data_access_request&sysparm_user=Be16e2288727da104d2a8599cebb35f0";
    public static String SEER_DATA_ACCESS_REQUEST_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String seerResearchUserDUAAgreementURL() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SEER_DATA_ACCESS_REQUEST_URL = SEER_DATA_ACCESS_REQUEST_STAGE_URL;
                break;
            case "test":
                SEER_DATA_ACCESS_REQUEST_URL = SEER_DATA_ACCESS_REQUEST_TEST_URL;
                break;
            case "sandbox":
                SEER_DATA_ACCESS_REQUEST_URL = SEER_DATA_ACCESS_REQUEST_SANDBOX_URL;
                break;
        }
        return SEER_DATA_ACCESS_REQUEST_URL;
    }

    /**
     * SEER RESEARCH PLUS USER DUA URL
     * THIS URL IS CREATED EVERY TIME THE ENVIRONMENT IS CLONED FOR TESTING THE DUA AGREEMENTS FOR SEER RESEARCH PLUS USERS
     */
    public static final String SEER_DATA_ACCESS_REQUEST_INSTITUTION_STAGE_URL = "";
    public static final String SEER_DATA_ACCESS_REQUEST_INSTITUTION_TEST_URL = "https://service-test.nci.nih.gov/seer-data-access?id=seer_data_access_request&sysparm_user=bff1cdcc8794d610ad46326d3fbb352c";
    public static final String SEER_DATA_ACCESS_REQUEST_INSTITUTION_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/seer-data-access?id=seer_data_access_request&sysparm_user=58cf2ea48767da104d2a8599cebb3557";
    public static String SEER_DATA_ACCESS_REQUEST_INSTITUTION_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String seerResearchPlusUserDUAAgreementURL() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SEER_DATA_ACCESS_REQUEST_INSTITUTION_URL = SEER_DATA_ACCESS_REQUEST_INSTITUTION_STAGE_URL;
                break;
            case "test":
                SEER_DATA_ACCESS_REQUEST_INSTITUTION_URL = SEER_DATA_ACCESS_REQUEST_INSTITUTION_TEST_URL;
                break;
            case "sandbox":
                SEER_DATA_ACCESS_REQUEST_INSTITUTION_URL = SEER_DATA_ACCESS_REQUEST_INSTITUTION_SANDBOX_URL;
                break;
        }
        return SEER_DATA_ACCESS_REQUEST_INSTITUTION_URL;
    }

    /**
     * SSEER ODS NATIVE VIEW ACCESS REQUEST UNDER SEER URL
     */
    public static final String SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_STAGE_URL = "https://service-stage.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_seer_data_access_list.do%3Fsysparm_userpref_module%3Daffbd4901b5418102701b913cc4bcbdc%26sysparm_clear_stack%3Dtrue%26sysparm_clear_stack%3Dtrue";
    public static final String SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_TEST_URL = "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_seer_data_access_list.do%3Fsysparm_userpref_module%3Daffbd4901b5418102701b913cc4bcbdc%26sysparm_clear_stack%3Dtrue";
    public static final String SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_seer_data_access_list.do%3Fsysparm_userpref_module%3Daffbd4901b5418102701b913cc4bcbdc%26sysparm_clear_stack%3Dtrue";
    public static String SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String getNativeViewFilterNavViewAccessRequestUnderSEERUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_URL = SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_STAGE_URL;
                break;
            case "test":
                SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_URL = SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_TEST_URL;
                break;
            case "sandbox":
                SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_URL = SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_SANDBOX_URL;
                break;
        }
        return SEER_ODS_NATIVE_VIEW_ACCESS_REQUEST_UNDER_SEER_URL;
    }

    /**
     * NATIVE VIEW EMAILS UNDER SYSTEM LOGS URL
     */
    public static final String NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_STAGE_URL = "https://service-stage.nci.nih.gov/now/nav/ui/classic/params/target/sys_email_list.do%3Fsysparm_userpref_module%3D8d620b63c611227b008368697b0b8d7b%26sysparm_query%3Dsys_created_onONToday%2540javascript%253Ags.daysAgoStart%25280%2529%2540javascript%253Ags.daysAgoEnd%25280%2529%255EEQ%26sysparm_clear_stack%3Dtrue";
    public static final String NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_TEST_URL = "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sys_email_list.do%3Fsysparm_userpref_module%3D8d620b63c611227b008368697b0b8d7b%26sysparm_query%3Dsys_created_onONToday%2540javascript%253Ags.daysAgoStart%25280%2529%2540javascript%253Ags.daysAgoEnd%25280%2529%255EEQ%26sysparm_clear_stack%3Dtrue";
    public static final String NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/now/nav/ui/classic/params/target/sys_email_list.do%3Fsysparm_userpref_module%3D8d620b63c611227b008368697b0b8d7b%26sysparm_query%3Dsys_created_onONToday%2540javascript%253Ags.daysAgoStart%25280%2529%2540javascript%253Ags.daysAgoEnd%25280%2529%255EEQ%26sysparm_clear_stack%3Dtrue";
    public static String NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String getNativeViewFilterNavEmailUnderSystemLogsUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_URL = NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_STAGE_URL;
                break;
            case "test":
                NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_URL = NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_TEST_URL;
                break;
            case "sandbox":
                NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_URL = NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_SANDBOX_URL;
                break;
        }
        return NATIVE_VIEW_EMAILS_UNDER_SYSTEM_LOGS_URL;
    }
}