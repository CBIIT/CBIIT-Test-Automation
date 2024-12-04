package CHARMS.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Native_View_Constants {

    /***************************************************************************
     *                                                                         *
     *                              SUBJECT FLAGS                              *
     *                                                                         *
     ***************************************************************************/

    /**
     * Subject Flags "Participation Status" dropdown options
     */
    public static final List<String> participationStatusDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("TBD");
            add("Eligible to Participate");
            add("Participating");
            add("Not Participating");
            add("Use Proxy");
            add("Proxy not in Study");
            add("Hold");
        }
    };

    /**
     * Subject Flags "Non-Participation Reason" dropdown options
     */
    public static final List<String> nonParticipationDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Too ill, no proxy");
            add("Deceased, no proxy");
            add("Lost to Follow-up");
            add("PI Exclude");
            add("Final Refusal by Patient");
            add("Final Refusal by Proxy");
            add("Language Problem");
            add("Do Not Contact");
            add("Not able to Locate");
        }
    };

    /**
     * Subject Flags "Age Group" dropdown options
     * WORK IN PROGRESS -- WAITING FOR BUG FIX
     */
    public static final List<String> ageGroupDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Adult");
            add("Minor Consent 14-17");
            add("Minor Assent 11-13");
            add("Child<11");
        }
    };

    /**
     * Subject Flags "Eligible for Clinic" dropdown options
     */
    public static final List<String> eligibleForClinicDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("TBD");
            add("Yes");
            add("No");
            add("No - PI Decision");
            add("No - Participant Refused");
        }
    };

    /**
     * Subject Flags "Individual Affected Status" dropdown options
     */
    public static final List<String> individualAffectedStatusDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Clinically Affected");
            add("Clinically Unaffected");
            add("Clinical Status Unknown");
            add("Provisionally Affected");
        }
    };

    /**
     * Subject Flags "Individual Genetic Status" dropdown options
     */
    public static final List<String> individualGeneticStatusDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Variant Positive");
            add("Variant Negative");
            add("Not Tested");
            add("Obligate Carrier");
            add("Single Variant Identified");
            add("Non-Bloodline");
            add("Normal by Pedigree");
            add("Not Applicable");
        }
    };

    /**
     * IBMFS Affected Status dropdown options
     */
    public static final List<String> IBMFSAffectedStatusDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("AR Homozygote - Clinical");
            add("AR Heterozygote by Pedigree");
            add("AR Unknown");
            add("AR Homozygote by Genetic Testing");
            add("AR Homozygote - One mutation detected");
            add("AR Normal by Genetic Testing");
            add("AD Heterozygote - Clinical");
            add("AD Heterozygote by Pedigree");
            add("AD Normal by Pedigree");
            add("AD Unknown");
            add("AD Normal by Genetic Testing");
            add("XLR Male - Clinical");
            add("XLR Female Heterozygote by Pedigree");
            add("XLR Normal by Pedigree");
            add("XLR Unknown");
            add("XLR Male Hemiz by Genetic Testing - Affected Clinically");
            add("XLR Male - Normal by Genetic Testing");
            add("XLR Female - Normal by Genetic Testing");
            add("Unknown - Clinically Affected");
            add("Unknown by Pedigree");
            add("Not in Bloodline");
            add("AR Normal by Pedigree");
            add("Mitochondrial - Clinical");
            add("Mitochondrial Normal by Pedigree");
            add("Mitochondrial Unknown");
            add("Mitochondrial by Genetic Testing");
            add("Mitochondrial Normal by Genetic Testing");
            add("AR het by Genetic Testing - Affected Clinically");
            add("AR het by Genetic Testing - Unaffected Clinically");
            add("AD het by Genetic Testing - Affected Clinically");
            add("AD het by Genetic Testing - Unaffected Clinically");
            add("XLR Female het by Genetic Testing - Affected Clinically");
            add("XLR Female het by Genetic Testing - Unaffected Clinically");
            add("AR Undocumented Positive - Affected Clinically");
            add("AR Undocumented Positive - Unaffected Clinically");
            add("AR Undocumented Carrier - Affected Clinically");
            add("AR Undocumented Carrier - Unaffected Clinically");
            add("AR Undocumented Negative");
            add("AD Undocumented Positive - Affected Clinically");
            add("AD Undocumented Positive - Unaffected Clinically");
            add("AD Undocumented Negative");
            add("XLR Female Undocumented Positive - Affected Clinically");
            add("XLR Female Undocumented Positive - Unaffected Clinically");
            add("XLR Undocumented Negative");
            add("Mitochondrial Undocumented Positive - Affected Clinically");
            add("Mitochondrial Undocumented Positive - Unaffected Clinically");
            add("Mitochondrial Undocumented Negative");
            add("XLR Male hemiz by Genetic Testing - Unaffected Clinically");
            add("XLR Male Undocumented Positive - Affected Clinically");
            add("XLR Male Undocumented Positive - Unaffected Clinically");
        }
    };

    /**
     * Subject Flags "Family Genetic Status" dropdown options
     */
    public static final List<String> familyGeneticStatusDropdownOptions = new ArrayList<>() {
        {
            add("-- None --");
            add("Positive");
            add("Negative");
            add("VUS");
            add("Not Tested");
            add("Tumor Only");
            add("Research Exome");
            add("Not Applicable");
        }
    };

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

    /****************************************************************************
     *                                                                          *
     *                              CONSENT RECORD                              *
     *                                                                          *
     ****************************************************************************/

    /**
     * Mapping of sheet name to Participant Consent/Assent category
     */
    public static final Map<String, String> consentAssentCategoryBySheetMap = new HashMap<>() {{
        put("screenerScenarioAgeUnder7", "Under 7");
        put("screenerScenarioAge7-10", "Aged 7 - 10, verbal assent required");
        put("screenerScenarioAge11-13", "Aged 11 - 13, signed assent required");
        put("screenerScenarioAge14-17", "Aged 14 - 17, signed consent required");
        put("screenerScenarioAdult", "Adult");
        put("screenerScenarioAdult-NeedsLAR", "Adult - Needs LAR");
    }};

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
            add("Consented and Assented");
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

    /*********************************************************************************
     *                                                                               *
     *                              PARTICIPANT STUDIES                              *
     *                                                                               *
     *********************************************************************************/

    /**
     * Participant Studies table list view columns
     */
    public static final List<String> participantStudiesListViewColumns = new ArrayList<>() {
        {
            add("Subject ID");
            add("Participant");
            add("First Name");
            add("Last Name");
            add("Family");
            add("Study");
            add("Eligibility Status");
            add("Enrollment Status");
            add("Cohort");
            add("Vital Status");
            add("Date of Birth");
            add("Date of Death");
            add("NIH MRN Number");
            add("Ever Consented");
            add("Updated");
            add("Created");
        }
    };
}