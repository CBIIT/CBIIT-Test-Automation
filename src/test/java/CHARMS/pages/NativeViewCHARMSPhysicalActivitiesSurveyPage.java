package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSPhysicalActivitiesSurveyPage {

    /**
     * Frequency of walking or hiking in the last 12 months dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.past_year_walk_hike_often')]")
    public WebElement frequencyOfWalkingHikingLast12MonthsDropdown;

    /**
     * Time per day spent walking or hiking per day dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.walk_hike_time_spent')]")
    public WebElement timeSpentWalkingHikingLastPerDayDropdown;

    /**
     * Frequency of light household chores in the past 12 months dropdown
     */
    @FindBy(css = "select[name='x_naci_family_coho_physical_activity_questionnaire.light_household_chores_past_12_months']")
    public WebElement frequencyOfLightHouseholdChoresLast12MonthsDropdown;

    /**
     * Frequency of moderate to vigorous household chores in the past 12 months dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.moderate_vigorous_household')]")
    public WebElement frequencyOfModerateToVigorousHouseholdChoresLast12MonthsDropdown;

    /**
     * Frequency of caring for pets dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.caring_for_pets')]")
    public WebElement frequencyOfCaringForPetsDropdown;

    /**
     * Frequency of caring for children or adults dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.caring_for_children_or_adults')]")
    public WebElement frequencyOfCaringForChildrenOrAdultsDropdown;

    /**
     * Frequency of walking while shopping or doing errands dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.walking_while_shopping_errands')]")
    public WebElement frequencyOfWalkingWhileShoppingErrandsDropdown;

    /**
     * Time spent doing light household chores (cooking, cleaning up, laundry, dusting) dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.time_spent_light_household_chore')]")
    public WebElement timeSpentDoingLightHouseholdChoresDropdown;

    /**
     * Time spent doing moderate to vigorous household chores (vacuuming, sweeping, etc) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_physical_activity_questionnaire.time_spent_moderate_to_vig_house_chore']")
    public WebElement timeSpentDoingModerateToVigorousHouseholdChoresDropdown;

    /**
     * Time spent caring for pets (walking dogs, feeding, playing, grooming) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_physical_activity_questionnaire.time_spent_caring_for_pets']")
    public WebElement timeSpentCaringForPetsDropdown;

    /**
     * Time spent caring for children or adults (pushing stroller or wheelchair) dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.time_spent_caring_for_children')]")
    public WebElement timeSpentCaringForChildrenOrAdultsDropdown;

    /**
     * Time spent walking (other than exercise) dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.time_spent_shopping')]")
    public WebElement timeSpentWalkingOtherThanExerciseDropdown;

    /**
     * Frequency of strenuous activities (per week) dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_physical_activity_questionnaire.frequency_stren_activities')]")
    public WebElement frequencyOfStrenuousActivitiesDropdown;

    /**
     * Age Group - Strenuous Activities dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_physical_activity_questionnaire.select_age_range']")
    public WebElement ageGroupStrenuousActivitiesDropdown;

    /**
     * Frequency of moderate activities (per week) dropdown
     */
    @FindBy(css = "select[name='x_naci_family_coho_physical_activity_questionnaire.average_hours_per_week_2']")
    public WebElement frequencyOfModerateActivitiesDropdown;

    /**
     * Age Group - Moderate Activities dropdown
     */
    @FindBy(css = "select[name='x_naci_family_coho_physical_activity_questionnaire.select_age_group_2']")
    public WebElement ageGroupModerateActivitiesDropdown;

    public NativeViewCHARMSPhysicalActivitiesSurveyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}