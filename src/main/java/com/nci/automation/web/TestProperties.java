package com.nci.automation.web;

public class TestProperties {

        // Local values that can be edited by testers
        private static String localEnv = "test";
        private static String localBrowser = "chrome";
        private static boolean localHeadless = false;

        // The values that will actually be used in tests
        public static String ENV = System.getProperty("ENV_VAR") != null ? System.getProperty("ENV_VAR") : localEnv;
        public static String BROWSER = System.getProperty("BROWSER_VAR") != null ? System.getProperty("BROWSER_VAR") : localBrowser;
        public static boolean HEADLESS = System.getProperty("HEADLESS_VAR") != null ? Boolean.parseBoolean(System.getProperty("HEADLESS_VAR")) : localHeadless;
        public static int SET_SLOW_MO_TIME = 1000;

        // SIDE-DOOR TEST ACCOUNT
        public static String SIDE_DOOR_USERNAME = "CBIITTestAccount";
        public static String SIDE_DOOR_PASSWORD = "Tester123@";

        //iTrust Login Credentials
        public static String I_TRUST_USERNAME = "juarezds";
        public static String I_TRUST_PASSWORD = "QXZlbmdlcnNBc3NlbWJsZTk5Pw==";

        // URLs
        public static final String NATIVE_VIEW_SIDE_DOOR_STAGE_URL = "https://service-stage.nci.nih.gov/side_door.do";
        public static final String NATIVE_VIEW_SIDE_DOOR_TEST_URL = "https://service-test.nci.nih.gov/side_door.do";
        public static String NATIVE_VIEW_SIDE_DOOR_URL;

        public static final String SSJ_STAGE_URL = "https://service-stage.nci.nih.gov/nih-ssj.do";
        public static final String SSJ_TEST_URL = "https://service-test.nci.nih.gov/nih-ssj.do";
        public static String SSJ_URL;

        public static String getNativeViewSideDoorUrl() {
                switch (ENV.toLowerCase()) {
                        case "stage":
                                NATIVE_VIEW_SIDE_DOOR_URL = NATIVE_VIEW_SIDE_DOOR_STAGE_URL;
                                break;
                        case "test":
                                NATIVE_VIEW_SIDE_DOOR_URL = NATIVE_VIEW_SIDE_DOOR_TEST_URL;
                                break;
                }
                return NATIVE_VIEW_SIDE_DOOR_URL;
        }

        public static String getSSJUrl() {
                switch (ENV.toLowerCase()) {
                        case "stage":
                                SSJ_URL = SSJ_STAGE_URL;
                                break;
                        case "test":
                                SSJ_URL = SSJ_TEST_URL;
                                break;
                }
                return SSJ_URL;
        }
}