package ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages;

public class Profile_Tab_Page {

    public static String profileTab = "//a[normalize-space()='Profile']";
    public static String firstNameTextBox = "(//input[@type='text'])[1]";
    public static String lastNameTextBox = "(//input[@type='text'])[3]";
    public static String middleNameTextBox = "(//input[@type='text'])[2]";
    public static String emailTextBox = "Email";
    public static String phoneNumberTextBox = "(//input[@name='phone'])[1]";
    public static String businessPhoneNumberTextBox = "(//input[@name='businessPhone'])[1]";
    public static String highestLevelOfEducationDropDown = "Highest Level of Education";
    public static String are_You_A_US_Citizen_Yes_Radio_Button = "Yes";
    public static String addressTextBox = "Address";
    public static String apartmentOrSuiteNumberTextBox = "(//input[@type='text'])[6]";
    public static String cityTextBox = "City";
    public static String stateTextBox = "State/Province";
    public static String countryTextBox = "Country";
    public static String zipCodeTextBox = "Zip/Postal Code";
    public static String saveButton = "//button[@type='submit']";
}
