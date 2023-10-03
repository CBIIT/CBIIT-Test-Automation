package ServiceNow.SCSS.Constants;

import com.nci.automation.web.CommonUtils;

public class OWMVacanciesConstants {
    public static final String VACANCY_TITLE = "OWM " + CommonUtils.lastNameRandomizer();
    public static final String VACANCY_DESCRIPTION = "Test Description";
    public static final String TODAYS_DATE = CommonUtils.getDateAsString();
    public static final String VACANCY_CLOSE_DATE = "11/24/2024";
    public static final String VACANCY_SCORING_DUE_DATE = "11/24/2024";
    public static final String VACANCY_POSITION_CLASSIFICATION = "N/A";
    public static final String VACANCY_ORGANIZATIONAL_CODE = "HNC14Q5";
    public static final String VACANCY_APPOINTMENT_PACKAGE_INITIATOR = "Susan Greenhouse";
    public static final int VACANCY_RECOMMENDATIONS = 2;
    public static final String VACANCY_COMMITTEE_CHAIR = "David Rampulla";
    public static final String VACANCY_COMMITTEE_EXECUTIVE_SECRETARY = "Jason Levine";
    public static final String AT_LEAST_ONE_COMMITTEE_TEXT = "At least one committee member must be of the role 'Executive Secretary'";
    public static final String AT_LEAST_ONE_EMAIL_TEMPLATE_TEXT = "At least one email template must be active and have content.";
    public static final String REVIEW_AND_FINALIZE_TEXT = "Review and Finalize";
    public static final String READY_T0_FINALIZE_VACANCY_TEXT = "Ready to finalize vacancy?";
    public static final String VACANCY_FINALIZED_TEXT = "Vacancy finalized";

    public static final String[] VACANCY_POSITION_CLASSIFICATIONS = {"Research Fellow", "Senior Research Fellow", "Staff Scientist 1", "Investigator 1", "Clinical Fellow", "Senior Clinical Fellow",
            "Assistant Clinical Investigator 1", "Staff Clinician 1", "Science Policy Leader Tier 2", "Science Program Leader Tier 2", "Senior Investigator", "Senior Investigator (HS)", "Investigator 2",
            "Investigator (HS)", "Senior Clinician", "Senior Clinician (HS)", "Senior Scientist", "Assistant Clinical Investigator 2",  "Assistant Clinical Investigator (HS)", "Staff Clinician 2", "Staff Clinician (HS)",
            "Staff Scientist 2", "Staff Scientist 2 (Clinical)", "Staff Scientist 2 (Facility Head)", "Scientific Executive", "Senior Scientific Officer","SBRBPAS", "N/A"};
}


