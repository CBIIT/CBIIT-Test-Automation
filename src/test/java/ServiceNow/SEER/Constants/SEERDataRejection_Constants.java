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

    /** --------------- SEER REJECTION EMAIL CONSTANTS--------------- */

    public static final String REJECTED_EMAIL_HEADER = "SEER Incidence Data: Data Request Rejected";

    /* REJECTION EMAIL TEXT PART 1 */
    public static final String REJECTION_EMAIL_TEXT_THANK_YOU = "Thank you for submitting your request for SEER Research Plus Data access.Requests for SEER Research Plus Data must meet the following requirements:Use an institution-affiliated email address.List an institution in the “Organization” field.Use an appropriate Signing Official affiliated with your institution.This request has been rejected based on one or more of the possible issues listed below.  Please review and determine which is applicable to your request: ";

    /* REJECTION EMAIL TEXT PART 2 */
    public static final String EMAIL_ADDRESS_FOR_THE_SIGNING_OFFICIAL = "Email addresses for the Signing Official and Requestor must be affiliated with the Institution/University/Company of the requestor.Requests using open email accounts such as Gmail, iCloud, 163.com, qq.com, etc. will be rejected until the correct email address is listed.";

    /* REJECTION EMAIL TEXT PART 3 */
    public static final String IT_IS_UNCLEAR_EMAIL_TEXT = "It is unclear who the Signing Official at your Institution is.The Requestor and Signing Official should not be the same individual. If there is no other person designated as Signing Official in your organization, please contact us.  Refer toSEER Data FAQs for help determining";

    /* REJECTION EMAIL TEXT PART 4 */
    public static final String THE_ORGANIZATION_FIELD_WAS_LEFT_BLANK = "The Organization field was left blank. The Institution/University/Company of the requestor must be listed.";

    /* REJECTION EMAIL TEXT PART 5 */
    public static final String TO_RESUBMIT_YOUR_REQUEST = "To resubmit your request, please go tohttps://seerdataaccess.cancer.gov/seer-data-accessNote:you cannot edit your email address after you’ve already submitted a request.  If your request was rejected because of your email address, please contactseerstat@imsweb.comfor help.";

    /** --------------- MISC REGISTRATION FORM CONSTANTS--------------- */

    /* GENERAL PURPOSE FOR USING THE DATA */
    public static final String GENERAL_PURPOSE_FOR_USING_THE_DATA = "General Public";
}