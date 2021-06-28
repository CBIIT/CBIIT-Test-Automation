package com.nci.automation.common;

import java.io.File;

/**
 * This class contains automation related system level constants.
 */
public class Constants {

	// Browser identifiers
	public static final String BROWSER_IE = "ie";
	public static final String BROWSER_FIREFOX = "firefox";
	public static final String BROWSER_CHROME = "chrome";
	public static final String BROWSER_HTML_UNIT_DRIVER = "htmlunitdriver";
<<<<<<< Updated upstream
	public static final String BROWSER_SAFARI = "safari";
=======
<<<<<<< HEAD
=======
	public static final String BROWSER_SAFARI = "safari";
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public static final String BROWSER_PHANTOM = "phantomjs";
	public static final String BROWSER_MOBILE = "mobile";
	public static final String ANDROID_MOBILE = "android";
	public static final String IOS_MOBILE = "ios";

	// Browser keys
//	public static final String CHROME_KEY = "webdriver.chrome.driver";
//	public static final String FIREFOX_KEY = "webdriver.gecko.driver";
//	public static final String IE_KEY = "webdriver.ie.driver";
//	public static final String PHANTOM_KEY = "phantomjs.binary.path";

	// Browser paths
//	public static final String CHROME_PATH = "src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"drivers"+File.separator+"chromedriver";
//	public static final String FIREFOX_PATH = "src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"drivers"+File.separator+"geckodriver";
//	public static final String IE_PATH = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"drivers"+File.separator+"IEDriverServer";
//	public static final String PHANTOM_PATH = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"drivers"+File.separator+"phantomjs";
	
	
	public static final String GET_OS_NAME=System.getProperty("os.name");
	
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
<<<<<<< Updated upstream
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
