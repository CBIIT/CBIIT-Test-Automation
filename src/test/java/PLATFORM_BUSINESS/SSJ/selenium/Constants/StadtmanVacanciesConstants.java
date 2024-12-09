package PLATFORM_BUSINESS.SSJ.selenium.Constants;

import com.nci.automation.web.CommonUtils;

public class StadtmanVacanciesConstants {
    public static final String VACANCY_TITLE = "Stadtman " + CommonUtils.lastNameRandomizer();
    public static final String VACANCY_DESCRIPTION = "Stadtman Test Description";
    public static final String TODAYS_DATE = CommonUtils.getDateAsString();
    public static final String VACANCY_CLOSE_DATE = "11/24/2024";
    public static final String VACANCY_SCORING_DUE_DATE = "11/24/2024";
    public static final String VACANCY_POSITION_CLASSIFICATION = "N/A";
    public static final String VACANCY_ORGANIZATIONAL_CODE = "HNA1";
    public static final String VACANCY_APPOINTMENT_PACKAGE_INITIATOR = "Roland Owens";
    public static final int VACANCY_RECOMMENDATIONS = 2;
    public static final String VACANCY_COMMITTEE_CHAIR = "Adriaan Bax";
    public static final String VACANCY_COMMITTEE_EXECUTIVE_SECRETARY = "Lisa Mirabello";
    public static final String AT_LEAST_ONE_COMMITTEE_TEXT = "At least one committee member must be of the role 'Executive Secretary'";
    public static final String AT_LEAST_ONE_EMAIL_TEMPLATE_TEXT = "At least one email template must be active and have content.";
    public static final String VACANCY_INSTITUTE = "Stadtman";
}


