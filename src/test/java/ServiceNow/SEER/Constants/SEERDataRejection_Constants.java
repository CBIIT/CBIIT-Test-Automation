package ServiceNow.SEER.Constants;

import com.nci.automation.web.CommonUtils;

public class SEERDataRejection_Constants {

    /** --------------- SEER USER REGISTRATION FORM CONSTANTS--------------- */

    /* FIRST NAME */
    public static final String FIRST_NAME = "RFirst";

    /* LAST NAME */
    public static final String LAST_NAME = CommonUtils.lastNameRandomizer();

    /* ORGANIZATION NAME */
    public static final String ORGANIZATION_NAME = "American University";

    /* COUNTRY NAME */
    public static final String COUNTRY_NAME = "United States of America";

    /* STREET ADDRESS */
    public static final String STREET_ADDRESS = "9520 Burning Branch Road";

    /* CITY NAME */
    public static final String CITY_NAME = "Burke";

    /* STATE */
    public static final String STATE = "VA";

    /* ZIP CODE */
    public static final String ZIP_CODE = "22015";

    /* PHONE NUMBER */
    public static final String PHONE_NUMBER = "703-687-5816";

    public static final String IT_IS_UNCLEAR_EMAIL_TEXT = "It is unclear who the Signing Official at your Institution is.The Requestor and Signing Official should not be the same individual. If there is no other person designated as Signing Official in your organization, please contact us.  Refer toSEER Data FAQs for help determining";

    /** --------------- MISC REGISTRATION FORM CONSTANTS--------------- */

    /* GENERAL PURPOSE FOR USING THE DATA */
    public static final String GENERAL_PURPOSE_FOR_USING_THE_DATA = "General Public";
}