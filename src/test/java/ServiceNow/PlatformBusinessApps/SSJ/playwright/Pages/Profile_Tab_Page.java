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
     * Demographics (optional) tab
     */
    public static String demographicsOptionalTab = "//div[@id='rc-tabs-0-tab-demographics']";

    /**
     * Demographics (optional) Edit Button
     */
    public static String demographicsEditButton = "//span[.='Edit']";

    /**
     * SAVE BUTTON
     */
    public static String saveButton = "//button[@type='submit']";

    /**
     * Sex Male option
     */
    public static String sexMaleOption = "//input[@value='Male']";

    /**
     * Ethnicity option Hispanic or Latino
     */
    public static String ethnicityChoiceHispanicLatino = "//span[.='Hispanic or Latino']";

    /**
     * Race option American Indian or Alaska
     */
    public static String raceOptionAmericanIndianAlaska = "//input[@value='American Indian']";

    /**
     * Disability Choice Deaf or serious difficulty
     */
    public static String disabilityChoiceDeafSeriousDifficulty = "//input[@value='Deaf']";

    /**
     * Save Demographics section
     */
    public static String SaveDemographicsSection = "//button[@type='submit']";

    /**
     * I WANT TO SHARE DEMOGRAPHICS RADIO BUTTON
     */
    public static String shareDemographicsRadioButton = "I want to share my";

    /**
     * I DO NOT WANT TO SHARE DEMOGRAPHICS RADIO BUTTON
     */
    public static String shareNotDemographicsRadioButton = "I do not want to answer the";
}
