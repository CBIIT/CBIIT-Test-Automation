package ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages;

public class Profile_Tab_Page {

    /**
     * PROFILE TAB
     */
    public static String profileTab = "//a[normalize-space()='Profile']";

    /**
     * FIRST NAME TEXT BOX
     */
    public static String firstNameTextBox = "(//input[@type='text'])[1]";

    /**
     * LAST NAME TEXT BOX
     */
    public static String lastNameTextBox = "(//input[@type='text'])[3]";

    /**
     * MIDDLE NAME TEXT BOX
     */
    public static String middleNameTextBox = "(//input[@type='text'])[2]";

    /**
     * EMAIL TEXT BOX
     */
    public static String emailTextBox = "Email";

    /**
     * PHONE NUMBER TEXT BOX
     */
    public static String phoneNumberTextBox = "(//input[@name='phone'])[1]";

    /**
     * BUSINESS PHONE NUMBER TEXT BOX
     */
    public static String businessPhoneNumberTextBox = "(//input[@name='businessPhone'])[1]";

    /**
     * HIGHEST LEVEL OF EDUCATION DROPDOWN
     */
    public static String highestLevelOfEducationDropDown = "Highest Level of Education";

    /**
     * YES RADIO BUTTON
     */
    public static String are_You_A_US_Citizen_Yes_Radio_Button = "Yes";

    /**
     * ADDRESS TEXT BOX
     */
    public static String addressTextBox = "Address";

    /**
     * APARTMENT OR SUITE NUMBER TEXT BOX
     */
    public static String apartmentOrSuiteNumberTextBox = "(//input[@type='text'])[6]";

    /**
     * CITY TEXT BOX
     */
    public static String cityTextBox = "City";

    /**
     * STATE/PROVINCE TEXT BOX
     */
    public static String stateTextBox = "State/Province";

    /**
     * COUNTRY TEXT BOX
     */
    public static String countryTextBox = "Country";

    /**
     * ZIP/POSTAL CODE TEXT BOX
     */
    public static String zipCodeTextBox = "Zip/Postal Code";

    /**
     * SAVE BUTTON
     */
    public static String saveButton = "//button[@type='submit']";
}
