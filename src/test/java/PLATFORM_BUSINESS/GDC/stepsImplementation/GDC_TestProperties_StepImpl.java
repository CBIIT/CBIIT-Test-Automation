package PLATFORM_BUSINESS.GDC.stepsImplementation;

import static com.nci.automation.web.TestProperties.ENV;

public class GDC_TestProperties_StepImpl {

    /**
     * GDC NATIVE VIEW FILTER NAVIGATION ALL UNDER GDC URL
     */
    public static final String GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_STAGE_URL = "https://service-stage.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_gdc_case_list.do%3Fsysparm_userpref_module%3D0e8c0e791bd43190e541631ee54bcbd5%26sysparm_view%3DGDC";
    public static final String GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_TEST_URL = "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_gdc_case_list.do%3Fsysparm_userpref_module%3D0e8c0e791bd43190e541631ee54bcbd5%26sysparm_view%3DGDC";
    public static final String GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_gdc_case_list.do%3Fsysparm_userpref_module%3D0e8c0e791bd43190e541631ee54bcbd5%26sysparm_view%3DGDC";
    public static String GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String getNativeViewFilterNavAllUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_URL = GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_STAGE_URL;
                break;
            case "test":
                GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_URL = GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_TEST_URL;
                break;
            case "sandbox":
                GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_URL = GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_SANDBOX_URL;
                break;
        }
        return GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_URL;
    }

    /**
     * GDC NATIVE VIEW FILTER NAVIGATION ALL UNDER GDC URL
     */
    public static final String GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_STAGE_URL = "https://service-stage.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_gdc_case.do%3Fsys_id%3D-1%26sysparm_stack%3Dx_g_nci_gdc_case_list.do%26sysparm_view%3DDefault%2Bview";
    public static final String GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_TEST_URL = "https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_gdc_case.do%3Fsys_id%3D-1%26sysparm_stack%3Dx_g_nci_gdc_case_list.do%26sysparm_view%3DDefault%2Bview";
    public static final String GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_gdc_case.do%3Fsys_id%3D-1%26sysparm_stack%3Dx_g_nci_gdc_case_list.do%26sysparm_view%3DDefault%2Bview";
    public static String GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_URL;

    /**
     * Determines the appropriate URL for the Native View filter navigation based on the environment.
     *
     * @return The URL for the Native View filter navigation based on the environment configuration.
     */
    public static String getNativeViewFilterNavCreateNewUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_URL = GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_STAGE_URL;
                break;
            case "test":
                GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_URL = GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_TEST_URL;
                break;
            case "sandbox":
                GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_URL = GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_SANDBOX_URL;
                break;
        }
        return GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_URL;
    }
}