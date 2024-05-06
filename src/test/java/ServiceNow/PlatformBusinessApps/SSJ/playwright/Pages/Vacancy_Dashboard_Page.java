package ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages;

public class Vacancy_Dashboard_Page {

    /**
     * CLOSE DATE CALENDAR
     */
    public static String closeDateCalendar = "(//input[@placeholder='Select date'])[2]";

    /**
     * OPEN DATE CALENDAR
     */
    public static String openDateCalendar = "(//input[@placeholder='Select date'])[1]";

    /**
     * OPEN DATE CALENDAR OPTIONS
     */
    public static String openDateCalendarOptions = "//html/body/div[*]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td";

    /**
     * CLOSE DATE CALENDAR OPTIONS
     */
    public static String closeDateCalendarOptions = "//html/body/div[*]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td";

    /**
     * SCORING DUE BY DATE CALENDAR
     */
    public static String scoringDueByDateCalendar = "(//input[@id='BasicInfo_scoringDueByDate'])[1]";

    /**
     * CALENDAR OPTIONS
     */
    public static String calendarOptions = "//html/body/div[*]/div/div/div/div/div[1]/div[2]/table/tbody/tr/td";

    /**
     * COVER LETTER CHECK BOX
     */
    public static String coverLetterCheckBox = "(//input[@id='BasicInfo_applicationDocuments_1_isDocumentOptional'])[1]";

    /**
     * ADD ANOTHER DOCUMENT TEXT BOX
     */
    public static String addDocumentTextBox = "(//input[@id='BasicInfo_applicationDocuments_4_document'])[1]";

    /**
     * REFERENCES SLIDER
     */
    public static String referencesSlider = "//div[@class='ant-slider Slider ant-slider-horizontal ant-slider-with-marks']//div[@role='slider']";

    /**
     * SLIDER OPTIONS
     */
    public static String sliderOptions = "(//div[@class='ant-slider-mark'])[1]//*[contains(@class,'ant-slider-mark-text')]";
}
