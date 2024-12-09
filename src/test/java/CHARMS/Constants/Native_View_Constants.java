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
            add("Final Refusal by Family Contact");
            add("Other Reason");
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
            add("Screener");
            add("Cohort");
            add("Vital Status");
            add("Date of Birth");
            add("Date of Death");
            add("NIH MRN number");
            add("Ever Consented");
            add("Updated");
            add("Created");
        }
    };

    /*********************************************************************************
     *                                                                               *
     *                              PARTICIPANT DETAILS                              *
     *                                                                               *
     *********************************************************************************/

    /**
     * Participant Details - Permission to contact
     */
    List<String> permissionToContactDropdownOptions = new ArrayList<String>() {{
        add("Yes");
        add("No");
        add("Unknown");
        add("Conditional");
    }};

    /**
     * Personal Information Tab - Relationship to Proband dropdown options
     */
    List<String> relationshipToProbandDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("Unknown");
        add("Proband");
        add("Mother");
        add("Father");
        add("Sister");
        add("Brother");
        add("Half-Brother (same mother)");
        add("Half-Brother (same father)");
        add("Half-Sister (same mother)");
        add("Half-Sister (same father)");
        add("Mother's Mother");
        add("Mother's Father");
        add("Father's Mother");
        add("Father's Father");
        add("Child");
        add("Grandchild");
        add("Maternal Uncle");
        add("Paternal Uncle");
        add("Maternal Aunt");
        add("Paternal Aunt");
        add("Cousin (mom's side)");
        add("Cousin");
        add("Cousin (dad's side)");
        add("Niece");
        add("Nephew");
        add("Great Nephew");
        add("Great Niece");
        add("Sister In Law");
        add("Brother In Law");
        add("Step Mother");
        add("Great Aunt");
        add("Step Father");
        add("Great Uncle");
        add("Other");
    }};

    /**
     * Demographics Tab - Biological Gender dropdown options
     */
    List<String> biologicalGenderDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("Female");
        add("Male");
        add("Unknown/Unsure");
        add("Prefer not to answer");
    }};

    /**
     * Demographics Tab - Identified Gender dropdown options
     */
    List<String> identifiedGenderDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("Female");
        add("Male");
        add("Transgender");
        add("I use a different term:");
        add("Unknown/Unsure");
        add("Prefer not to answer");
    }};

    /**
     * Demographics Tab - Ethnicity dropdown options
     */
    List<String> ethnicityDropdownOptions = new ArrayList<String>() {{
        add("Not answered");
        add("Don't know");
        add("Not Hispanic/Latino");
        add("Hispanic/Latino");
        add("Prefer not to answer");
    }};

    /**
     * Demographics Tab - Pronouns dropdown options
     */
    List<String> pronounsDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("She/her");
        add("He/him");
        add("They/them");
        add("I use a different term");
        add("Unknown/Unsure");
        add("Prefer not to answer");
    }};

    /**
     * Demographics Tab - Is the participant adopted? dropdown options
     */
    List<String> isTheParticipantAdoptedDropdownOptions = new ArrayList<String>() {{
        add("Unknown");
        add("Yes");
        add("No");
        add("Prefer not to answer");
    }};

    /**
     * Demographics Tab - Vital Status dropdown options
     */
    List<String> vitalStatusDropdownOptions = new ArrayList<String>() {{
        add("Unknown");
        add("Not answered");
        add("Alive");
        add("Dead");
    }};

    /**
     * Demographics Tab - If Date of Birth is unkown, is this person 18 years old or older dropdown options
     */
    List<String> dobUnknownIsThisPerson18YearsOldOrOlderDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("Unknown");
        add("No");
        add("Yes");
    }};

    /**
     * Contact Info Tab - What is your relationship to the participant? dropdown options
     */
    List<String> whatIsYourRelationshipToTheParticipantDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("Self");
        add("I am the person's parent");
        add("I am the person's sibling");
        add("I am the person's child");
        add("I am the person's cousin");
        add("I am the person's aunt/uncle");
        add("I am the person's spouse/long term partner");
        add("I am this person's grandparent");
        add("Other");
    }};

    /**
     * Contact Info Tab - Are you the legal guardian of this person? dropdown options
     */
    List<String> areYouTheLegalGuardianOfThisPersonDropdownOptions = new ArrayList<String>() {{
        add("Yes");
        add("No");
    }};

    /**
     * Contact Info Tab - Does the participant need legal representation? dropdown options
     */
    List<String> doesParticipantNeedLegalRepresentationDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("Yes, minor under 18");
        add("Yes, adult needing LAR");
        add("No");
        add("Don't Know");
    }};

    /**
     * Contact Info Tab - Contact Country dropdown options
     */
    List<String> contactCountryDropdownOptions = new ArrayList<String>() {{
        add("-- None --");
        add("AE");
        add("AR");
        add("AT");
        add("AU");
        add("BE");
        add("BM");
        add("BR");
        add("CA");
        add("CD");
        add("CH");
        add("CL");
        add("CN");
        add("CO");
        add("CZ");
        add("DE");
        add("DK");
        add("DO");
        add("EC");
        add("ES");
        add("ET");
        add("FI");
        add("FR");
        add("GB");
        add("GR");
        add("GT");
        add("GU");
        add("HK");
        add("HN");
        add("HR");
        add("HU");
        add("ID");
        add("IE");
        add("IL");
        add("IN");
        add("IR");
        add("IS");
        add("IT");
        add("JM");
        add("JP");
        add("KR");
        add("KY");
        add("LB");
        add("LT");
        add("MA");
        add("MU");
        add("MX");
        add("MY");
        add("NA");
        add("NL");
        add("NO");
        add("NZ");
        add("PE");
        add("PH");
        add("PR");
        add("PT");
        add("PY");
        add("RO");
        add("RU");
        add("SA");
        add("SD");
        add("SE");
        add("SK");
        add("SV");
        add("TH");
        add("TR");
        add("TW");
        add("UA");
        add("US");
        add("VE");
        add("VI");
        add("YE");
        add("ZA");
        add("United States of America");
        add("Afghanistan");
        add("Albania");
        add("Algeria");
        add("Andorra");
        add("Angola");
        add("Antigua and Barbuda");
        add("Argentina");
        add("Armenia");
        add("Australia");
        add("Austria");
        add("Azerbaijan");
        add("Bahamas");
        add("Bahrain");
        add("Bangladesh");
        add("Barbados");
        add("Belarus");
        add("Belgium");
        add("Belize");
        add("Benin");
        add("Bhutan");
        add("Bolivia");
        add("Bosnia and Herzegovina");
        add("Botswana");
        add("Brazil");
        add("Brunei Darussalam");
        add("Bulgaria");
        add("Burkina Faso");
        add("Burundi");
        add("Cambodia");
        add("Cameroon");
        add("Canada");
        add("Cape Verde");
        add("Central African Republic");
        add("Chad");
        add("Chile");
        add("China");
        add("Colombia");
        add("Comoros");
        add("Congo, Republic of the");
        add("Costa Rica");
        add("Côte d'Ivoire");
        add("Croatia");
        add("Cuba");
        add("Cyprus");
        add("Czech Republic");
        add("Democratic Republic of the Congo");
        add("Denmark");
        add("Djibouti");
        add("Dominica");
        add("Dominican Republic");
        add("Ecuador");
        add("Egypt");
        add("El Salvador");
        add("Equatorial Guinea");
        add("Eritrea");
        add("Estonia");
        add("Ethiopia");
        add("Fiji");
        add("Finland");
        add("France");
        add("Gabon");
        add("Gambia");
        add("Georgia");
        add("Germany");
        add("Ghana");
        add("Greece");
        add("Grenada");
        add("Guatemala");
        add("Guinea");
        add("Guinea-Bissau");
        add("Guyana");
        add("Haiti");
        add("Honduras");
        add("Hong Kong (S.A.R.)");
        add("Hungary");
        add("Iceland");
        add("India");
        add("Indonesia");
        add("Iran");
        add("Iraq");
        add("Ireland");
        add("Israel");
        add("Italy");
        add("Jamaica");
        add("Japan");
        add("Jordan");
        add("Kazakhstan");
        add("Kenya");
        add("Kiribati");
        add("Kuwait");
        add("Kyrgyzstan");
        add("Lao People's Democratic Republic");
        add("Latvia");
        add("Lebanon");
        add("Lesotho");
        add("Liberia");
        add("Libyan Arab Jamahiriya");
        add("Liechtenstein");
        add("Lithuania");
        add("Luxembourg");
        add("Madagascar");
        add("Malawi");
        add("Malaysia");
        add("Maldives");
        add("Mali");
        add("Malta");
        add("Marshall Islands");
        add("Mauritania");
        add("Mauritius");
        add("Mexico");
        add("Micronesia, Federated States of");
        add("Monaco");
        add("Mongolia");
        add("Montenegro");
        add("Morocco");
        add("Mozambique");
        add("Myanmar");
        add("Namibia");
        add("Nauru");
        add("Nepal");
        add("Netherlands");
        add("New Zealand");
        add("Nicaragua");
        add("Niger");
        add("Nigeria");
        add("North Korea");
        add("Norway");
        add("Oman");
        add("Pakistan");
        add("Palau");
        add("Panama");
        add("Papua New Guinea");
        add("Paraguay");
        add("Peru");
        add("Philippines");
        add("Poland");
        add("Portugal");
        add("Qatar");
        add("Republic of Moldova");
        add("Romania");
        add("Russian Federation");
        add("Rwanda");
        add("Saint Kitts and Nevis");
        add("Saint Lucia");
        add("Saint Vincent and the Grenadines");
        add("Samoa");
        add("San Marino");
        add("Sao Tome and Principe");
        add("Saudi Arabia");
        add("Senegal");
        add("Serbia");
        add("Seychelles");
        add("Sierra Leone");
        add("Singapore");
        add("Slovakia");
        add("Slovenia");
        add("Solomon Islands");
        add("Somalia");
        add("South Africa");
        add("South Korea");
        add("Spain");
        add("Sri Lanka");
        add("Sudan");
        add("Suriname");
        add("Swaziland");
        add("Sweden");
        add("Switzerland");
        add("Syrian Arab Republic");
        add("Tajikistan");
        add("Thailand");
        add("The former Yugoslav Republic of Macedonia");
        add("Timor-Leste");
        add("Togo");
        add("Tonga");
        add("Trinidad and Tobago");
        add("Tunisia");
        add("Turkey");
        add("Turkmenistan");
        add("Tuvalu");
        add("Uganda");
        add("Ukraine");
        add("United Arab Emirates");
        add("United Kingdom of Great Britain and Northern Ireland");
        add("United Republic of Tanzania");
        add("Uruguay");
        add("Uzbekistan");
        add("Vanuatu");
        add("Venezuela, Bolivarian Republic of");
        add("Viet Nam");
        add("Yemen");
        add("Zambia");
        add("Zimbabwe");
    }};
}