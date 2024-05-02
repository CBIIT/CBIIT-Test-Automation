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
}
