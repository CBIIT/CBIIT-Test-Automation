package CHARMS.scenariosData;

import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class RAS_Physical_Activities_Survey_TestDataManager {

    /*
     * PHYSICAL ACTIVITIES SURVEY VARIABLES
     */
    public Map<String, String> TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY;

    public String IN_THE_PAST_12_MONTHS_HOW_OFTEN_DID_YOU_WALK_OR_HIKE_FOR_EXERCISE;
    public String ON_THE_DAYS_THAT_YOU_WALKED_OR_HIKED_ABOUT_HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_THIS_ACTIVITY;

    public String HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_LIGHT_HOUSEHOLD_CHORES_SUCH_AS_COOKING_TIDYING_UP_LAUNDRY_OR_DUSTING;
    public String HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_MODERATE_TO_VIGOROUS_HOUSEHOLD_CHORES_SUCH_AS_VACUUMING_OR_SWEEPING;
    public String HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_CARING_FOR_PETS_WALKING_DOGS_FEEDING_PLAYING_GROOMING;
    public String HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_CARING_FOR_CHILDREN_OR_ADULTS_PUSHING_STROLLER_OR_WHEELCHAIR_LIFTING_BATHING;
    public String HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_WALKING_WHILE_SHOPPING_OR_DOING_ERRANDS_DO_NOT_COUNT_WALKING_FOR_EXERCISE;

    public String HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_LIGHT_HOUSEHOLD_CHORES_SUCH_AS_COOKING_CLEANING_UP_LAUNDRY_OR_DUSTING;
    public String HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_MODERATE_TO_VIGOROUS_HOUSEHOLD_CHORES_SUCH_AS_VACUUMING_OR_SWEEPING;
    public String HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_CARING_FOR_PETS_WALKING_DOGS_FEEDING_PLAYING_GROOMING;
    public String HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_CARING_FOR_CHILDREN_OR_ADULTS_PUSHING_STROLLER_OR_WHEELCHAIR_LIFTING_BATHING;
    public String HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_WALKING_WHILE_SHOPPING_OR_DOING_ERRANDS_DO_NOT_COUNT_WALKING_FOR_EXERCISE;

    public String DID_YOU_DO_ANY_OF_THESE_ACTIVITIES_OUTSIDE_OF_WORK_MODERATE_OUTDOOR_CHORES_SUCH_AS_WEEDING_RAKING_OR_MOWING_THE_LAWN;
    public String DID_YOU_DO_ANY_OF_THESE_ACTIVITIES_OUTSIDE_OF_WORK_VIGOROUS_OUTDOOR_CHORES_SUCH_AS_DIGGING_CARRYING_LUMBER_OR_SNOW_SHOVELING;
    public String DID_YOU_DO_ANY_OF_THESE_ACTIVITIES_OUTSIDE_OF_WORK_HOME_REPAIR_SUCH_AS_PAINTING_PLUMBING_OR_REPLACING_CARPETING;
    public String HOW_OFTEN_DID_YOU_PARTICIPATE_IN_STRENUOUS_ACTIVITIES_OR_SPORTS_AVERAGE_HOURS_PER_WEEK;
    public String HOW_OFTEN_DID_YOU_PARTICIPATE_IN_MODERATE_ACTIVITIES_OR_SPORTS_AVERAGE_HOURS_PER_WEEK;

    /**
     * Initializes data for the Physical Activities Survey from an Excel sheet.
     *
     * @param sheetName the name of the Excel sheet containing the data
     */
    public void dataInitializerPhysicalActivitiesSurvey(String sheetName) {
        TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.QBANK_SURVEYS, sheetName);

        IN_THE_PAST_12_MONTHS_HOW_OFTEN_DID_YOU_WALK_OR_HIKE_FOR_EXERCISE = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("In the past 12 months how often did you walk or hike for exercise?");
        ON_THE_DAYS_THAT_YOU_WALKED_OR_HIKED_ABOUT_HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_THIS_ACTIVITY = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("On the days that you walked or hiked, about how much time per day did you spend doing this activity?");
        HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_LIGHT_HOUSEHOLD_CHORES_SUCH_AS_COOKING_TIDYING_UP_LAUNDRY_OR_DUSTING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, about how often did you do each of these household or shopping activities outside of work? Light household chores (such as cooking, tidying up, laundry, or dusting)");
        HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_MODERATE_TO_VIGOROUS_HOUSEHOLD_CHORES_SUCH_AS_VACUUMING_OR_SWEEPING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, about how often did you do each of these household or shopping activities outside of work? Moderate to Vigorous household chores (such as vacuuming or sweeping)");
        HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_CARING_FOR_PETS_WALKING_DOGS_FEEDING_PLAYING_GROOMING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, about how often did you do each of these household or shopping activities outside of work? Caring for pets (walking dogs, feeding, playing, grooming)");
        HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_CARING_FOR_CHILDREN_OR_ADULTS_PUSHING_STROLLER_OR_WHEELCHAIR_LIFTING_BATHING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, about how often did you do each of these household or shopping activities outside of work? Caring for children or adults (pushing stroller or wheelchair, lifting, bathing)");
        HOW_OFTEN_DID_YOU_DO_EACH_OF_THESE_HOUSEHOLD_OR_SHOPPING_ACTIVITIES_OUTSIDE_OF_WORK_WALKING_WHILE_SHOPPING_OR_DOING_ERRANDS_DO_NOT_COUNT_WALKING_FOR_EXERCISE = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, about how often did you do each of these household or shopping activities outside of work? Walking while shopping or doing errands (do not count walking for exercise)");

        HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_LIGHT_HOUSEHOLD_CHORES_SUCH_AS_COOKING_CLEANING_UP_LAUNDRY_OR_DUSTING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("When you did household tasks or shopping, how much time per day did you spend doing each activity? Light household chores (such as cooking, cleaning up, laundry, or dusting.)");
        HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_MODERATE_TO_VIGOROUS_HOUSEHOLD_CHORES_SUCH_AS_VACUUMING_OR_SWEEPING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("When you did household tasks or shopping, how much time per day did you spend doing each activity? Moderate to vigorous household chores (such as vacuuming or sweeping)");
        HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_CARING_FOR_PETS_WALKING_DOGS_FEEDING_PLAYING_GROOMING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("When you did household tasks or shopping, how much time per day did you spend doing each activity? Caring for pets (walking dogs, feeding, playing, grooming)");
        HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_CARING_FOR_CHILDREN_OR_ADULTS_PUSHING_STROLLER_OR_WHEELCHAIR_LIFTING_BATHING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("When you did household tasks or shopping, how much time per day did you spend doing each activity? Caring for children or adults (pushing stroller or wheelchair, lifting, bathing)");
        HOW_MUCH_TIME_PER_DAY_DID_YOU_SPEND_DOING_EACH_ACTIVITY_WALKING_WHILE_SHOPPING_OR_DOING_ERRANDS_DO_NOT_COUNT_WALKING_FOR_EXERCISE = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("When you did household tasks or shopping, how much time per day did you spend doing each activity? Walking while shopping or doing errands (do not count walking for exercise)");

        DID_YOU_DO_ANY_OF_THESE_ACTIVITIES_OUTSIDE_OF_WORK_MODERATE_OUTDOOR_CHORES_SUCH_AS_WEEDING_RAKING_OR_MOWING_THE_LAWN = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, did you do any of these activities outside of work? Moderate outdoor chores (such as weeding, raking or mowing the lawn)");
        DID_YOU_DO_ANY_OF_THESE_ACTIVITIES_OUTSIDE_OF_WORK_VIGOROUS_OUTDOOR_CHORES_SUCH_AS_DIGGING_CARRYING_LUMBER_OR_SNOW_SHOVELING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, did you do any of these activities outside of work? Vigorous outdoor chores (such as digging, carrying lumber, or snow shoveling)");
        DID_YOU_DO_ANY_OF_THESE_ACTIVITIES_OUTSIDE_OF_WORK_HOME_REPAIR_SUCH_AS_PAINTING_PLUMBING_OR_REPLACING_CARPETING = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("During the past 12 months, did you do any of these activities outside of work? Home repair (such as painting, plumbing, or replacing carpeting)");
        HOW_OFTEN_DID_YOU_PARTICIPATE_IN_STRENUOUS_ACTIVITIES_OR_SPORTS_AVERAGE_HOURS_PER_WEEK = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("How often did you participate in STRENUOUS activities or sports? Average Hours per week");
        HOW_OFTEN_DID_YOU_PARTICIPATE_IN_MODERATE_ACTIVITIES_OR_SPORTS_AVERAGE_HOURS_PER_WEEK = TEST_DATA_FOR_RAS_PHYSICAL_ACTIVITIES_SURVEY.get("How often did you participate in MODERATE activities or sports? Average Hours per week");
    }
}
