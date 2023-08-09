package com.nci.automation.utils;

public class FrameworkConstants {
    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/src/main/resources/conf/localEnv.properties";

    public static final String GET_OS_NAME = System.getProperty("os.name");

    // Browser identifiers
    public static final String BROWSER_EDGE = "edge";
    public static final String BROWSER_FIREFOX = "firefox";
    public static final String BROWSER_CHROME = "chrome";
    public static final String BROWSER_SAFARI = "safari";
    public static final String BROWSER_MOBILE = "mobile";
    public static final String ANDROID_MOBILE = "android";
    public static final String IOS_MOBILE = "ios";


    // Common Regular Expressions
    public static final String REG_EX_WILD_CARD_CHAR = "(.)*";
    public static final String REG_EX_EXTRA_SPACE = "\\s+";

    // Common Values
    public static final String TRUE = "TRUE";
    public static final String FALSE = "FALSE";
    public static final String YES = "Yes";

    // Common Strings
    public static final String BLANK = "";
    public static final String WHITE_SPACE = " ";
    public static final String COMMA = ",";
    public static final String ACTIVE = "active";
    public static final String XPATH = "xpath";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String NO = "No";
    public static final String CURRENT_TIMESTAMP = "currentTimestamp";
    public static final String EARLIER_TIMESTAMP = "earlierTimestamp";
    public static final String NOT_NULL = "Not Null";
    public static final String ASCENDING = "asc";
    public static final String TODAY = "Today";

    // Operating System Enum
    public static enum OSType {
        Windows, MacOS, Unix, Other
    };
}
