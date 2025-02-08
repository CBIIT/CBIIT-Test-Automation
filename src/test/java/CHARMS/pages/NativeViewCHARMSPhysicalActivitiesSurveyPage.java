package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSPhysicalActivitiesSurveyPage {

    /**
     * Frequency of walking or hiking in the last 12 months dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.past_year_walk_hike_often']")
    public WebElement frequencyOfWalkingHikingLast12MonthsDropdown;

    /**
     * Time per day spent walking or hiking per day dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.walk_hike_time_spent']")
    public WebElement timeSpentWalkingHikingLastPerDayDropdown;

    /**
     * Frequency of light household chores in the past 12 months dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.light_household_chores_past_12_months']")
    public WebElement frequencyOfLightHouseholdChoresLast12MonthsDropdown;

    /**
     * Frequency of moderate to vigorous household chores in the past 12 months dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.moderate_vigorous_household']")
    public WebElement frequencyOfModerateToVigorousHouseholdChoresLast12MonthsDropdown;

    /**
     * Frequency of caring for pets dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.caring_for_pets']")
    public WebElement frequencyOfCaringForPetsDropdown;

    /**
     * Frequency of caring for children or adults dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.caring_for_children_or_adults']")
    public WebElement frequencyOfCaringForChildrenOrAdultsDropdown;

    /**
     * Frequency of walking while shopping or doing errands dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.walking_while_shopping_errands']")
    public WebElement frequencyOfWalkingWhileShoppingErrandsDropdown;

    /**
     * Time spent doing light household chores (cooking, cleaning up, laundry, dusting) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.time_spent_light_household_chore']")
    public WebElement timeSpentDoingLightHouseholdChoresDropdown;

    /**
     * Time spent doing moderate to vigorous household chores (vacuuming, sweeping, etc) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.time_spent_moderate_to_vig_house_chore']")
    public WebElement timeSpentDoingModerateToVigorousHouseholdChoresDropdown;

    /**
     * Time spent caring for pets (walking dogs, feeding, playing, grooming) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.time_spent_caring_for_pets']")
    public WebElement timeSpentCaringForPetsDropdown;

    /**
     * Time spent caring for children or adults (pushing stroller or wheelchair) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.time_spent_caring_for_children']")
    public WebElement timeSpentCaringForChildrenOrAdultsDropdown;

    /**
     * Time spent walking (other than exercise) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.time_spent_shopping']")
    public WebElement timeSpentWalkingOtherThanExerciseDropdown;

    /**
     * Frequency of strenuous activities (per week) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.frequency_stren_activities']")
    public WebElement frequencyOfStrenuousActivitiesDropdown;

    /**
     * Select Age Group dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.select_age_range']")
    public WebElement selectAgeGroupDropdown;

    /**
     * Frequency of moderate activities (per week) dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.average_hours_per_week_2']")
    public WebElement frequencyOfModerateActivitiesDropdown;

    /**
     * Select Age Group dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_question_bank.select_age_group_2']")
    public WebElement selectAgeGroupDropdown2;

    public NativeViewCHARMSPhysicalActivitiesSurveyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}