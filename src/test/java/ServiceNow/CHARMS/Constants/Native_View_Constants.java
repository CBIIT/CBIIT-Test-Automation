package ServiceNow.CHARMS.Constants;

import java.util.ArrayList;
import java.util.List;

public class Native_View_Constants {

    /**
     * Participant study Subject Flags Columns
     */
    public static final List<String> subjectFlagsColumns = new ArrayList<>() {
        {
            add("Study");
            add("Participant");
            add("Participation Status");
            add("Eligible for Clinic");
            add("Age Group");
            add("Individual Affected Status");
            add("Individual Genetic Status");
        }
    };

    /**
     * Participant consent record "Cohort" dropdown options
     */
    public static final List<String> consentRecordCohortDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Clinical");
            add("Field");
        }
    };

    /**
     * Participant consent record "Consent Form" dropdown options
     */
    public static final List<String> consentRecordConsentFormDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Clinical");
            add("Field");
        }
    };

    /**
     * Participant consent record "Collection Method" dropdown options
     */
    public static final List<String> consentRecordCollectionMethodDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("CHARMS e-consent");
            add("Participant upload to portal");
            add("Mail/Fax/Email/Other");
            add("iMed");
        }
    };

    /**
     * Participant consent record "Consent/Assent Status" dropdown options
     */
    public static final List<String> consentRecordConsentAssentStatusDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Pending");
            add("Assented, pending Consent");
            add("Consented, pending Assent");
            add("Consented only");
            add("Declined");
            add("N/A");
        }
    };

    /**
     * Participant consent record "Consent/Assent Category" dropdown options
     */
    public static final List<String> consentRecordConsentAssentCategoryDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Under 7");
            add("Aged 7 - 10, verbal assent required");
            add("Aged 11 - 13, signed assent required");
            add("Aged 14 - 17, signed consent required");
            add("Adult");
            add("Adult - Needs LAR");
        }
    };

    /**
     * Participant consent record "Parent/Guardian Status" dropdown options
     */
    public static final List<String> consentRecordParentGuardianStatusDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Parents, Married");
            add("Parents, Separated - Joint Custody");
            add("Parent, Separated or Widowed - Single Custody");
            add("Other Legal Guardian - 1");
            add("Other Guardian - 2");
            add("N/A");
        }
    };

    /**
     * Participant consent record "Number of Guardian Signatures Required" dropdown options
     */
    public static final List<String> consentRecordGuardianSignaturesRequiredDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("1");
            add("2");
            add("None");
        }
    };

    /**
     * Participant consent record Parent/Guardian 1/2 Signed dropdown options
     */
    public static final List<String> consentRecordGuardianSignedDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Pending");
            add("Yes");
            add("No");
            add("N/A");
        }
    };

    /**
     * Participant consent record "Number of LARs" dropdown options
     */
    public static final List<String> consentRecordNumberOfLarsDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("1");
            add("2");
            add("N/A");
        }
    };

    /**
     * Participant consent record LAR 1/2 Signed dropdown options
     */
    public static final List<String> consentRecordLARSignedDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Pending");
            add("Yes");
            add("No");
            add("N/A");
        }
    };

    /**
     * Participant consent record "Was verbal assent obtained?" dropdown options
     */
    public static final List<String> consentRecordWasVerbalAssentObtainedDropdownOptions = new ArrayList<>() {
        {
            add("No");
            add("Yes");
        }
    };

    /**
     * Participant consent record "Current/Previous" dropdown options
     */
    public static final List<String> consentRecordCurrentPreviousDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Current");
            add("Previous");
        }
    };

    /**
     * Participant consent record None/Yes/No question dropdown options
     */
    public static final List<String> consentRecordYesNoQuestionDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("No");
            add("Yes");
        }
    };

    /**
     * Participant consent record "Interpreter Signed" dropdown options
     */
    public static final List<String> consentRecordInterpreterSignedDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("N/A");
            add("No");
            add("Yes");
        }
    };

    /**
     * Participant consent record "Interpreter Witness?" dropdown options
     */
    public static final List<String> consentRecordInterpreterWitnessDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("No");
            add("Yes");
        }
    };

    /**
     * Participant consent record "Future Use of Specimens and Data by NIH" dropdown options
     */
    public static final List<String> consentRecordFutureUseOfSpecimensAndDataByNIHDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Dead End by PI");
            add("Dead End by Study Manager");
            add("No");
            add("Yes");
        }
    };

    /**
     * Participant consent record "Future Use by Collaborators" dropdown options
     */
    public static final List<String> consentRecordFutureUseByCollaboratorsDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Dead End by PI");
            add("Dead End by Study Manager");
            add("No");
            add("Yes");
        }
    };

    /**
     * Participant consent record "Future Identifiable Use by Collaborators" dropdown options
     */
    public static final List<String> consentRecordFutureIdentifiableUseByCollaboratorsDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Dead End by PI");
            add("Dead End by Study Manager");
            add("No");
            add("Yes");
        }
    };

    /**
     * Participant consent record "Return of Genetic Findings" dropdown options
     */
    public static final List<String> consentRecordReturnOfGeneticFindingsDropdownOptions = new ArrayList<>() {
        {
            add("No (verbal opt-out)");
            add("Yes (default)");
        }
    };
}