$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CHARMS/Features/ProbandScenarios.feature");
formatter.feature({
  "name": "Proband Scenarios",
  "description": "  Description: This feature file contains Proband related scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.step({
  "name": "fills out all Demographic Information \"\u003cBiologicalSex\u003e\", \"\u003cDOB\u003e\", \"\u003cCountryOfBirth\u003e\",\"\u003cCity\u003e\", \"\u003cState\u003e\" \"\u003cEthnicity\u003e\", \"\u003cRace\u003e\", \"\u003cBiologicalMothersEthnicity\u003e\", \"\u003cBilogicalMothersRace\u003e\", \"\u003cBiologicalFathersEthnicity\u003e\", \"\u003cBiologicalFathersRace\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "fills out all Contact Information with \"\u003cPhoneNumber\u003e\", \"\u003cStreetAddress\u003e\", \"\u003cCity\u003e\", \"\u003cState\u003e\", \"\u003cZipCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.step({
  "name": "adds Personal Cancer information \"\u003cCancerType\u003e\", \"\u003cAgeResearchParticipantWasDiagnosed\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\u003cTestedGenes\u003e\", \"\u003cTestResult\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.step({
  "name": "adds Family Cancer information \"\u003cFamilyCancerType\u003e\", \"\u003cRelationshipToParticipant\u003e\", \"\u003cNameOfHospital\u003e\", \"\u003cHospitalCountry\u003e\", \"\u003cHospitalCity\u003e\", \"\u003cHospitalState\u003e\", \"\u003cRelativesName\u003e\", \"\u003cRelativesDateOfBirth\u003e\", \"\u003cRelativesAgeWhenDiagnosed\u003e\", \"\u003cisRelativeAlive\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\u003cSecondRelativesName\u003e\", \"\u003cFamilyMemberGeneticTestsRelationshipToParticipant\u003e\", \"\u003cGenesSyndromesWithPositiveResults\u003e\", \"\u003cRelativesTestResult\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\u003cHowDidYouHearAboutStudy\u003e\", \"\u003chasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy\u003e\", \"\u003careRelativesReceivingCancerCare\u003e\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.step({
  "name": "test account is reset to be reused for next execution",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "BiologicalSex",
        "DOB",
        "CountryOfBirth",
        "City",
        "State",
        "Ethnicity",
        "Race",
        "BiologicalMothersEthnicity",
        "BilogicalMothersRace",
        "BiologicalFathersEthnicity",
        "BiologicalFathersRace",
        "PhoneNumber",
        "StreetAddress",
        "City",
        "State",
        "ZipCode",
        "CancerType",
        "AgeResearchParticipantWasDiagnosed",
        "TestedGenes",
        "TestResult",
        "FamilyCancerType",
        "RelationshipToParticipant",
        "NameOfHospital",
        "HospitalCountry",
        "HospitalCity",
        "HospitalState",
        "RelativesName",
        "RelativesDateOfBirth",
        "RelativesAgeWhenDiagnosed",
        "isRelativeAlive",
        "SecondRelativesName",
        "FamilyMemberGeneticTestsRelationshipToParticipant",
        "GenesSyndromesWithPositiveResults",
        "RelativesTestResult",
        "HowDidYouHearAboutStudy",
        "hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy",
        "areRelativesReceivingCancerCare",
        "comments"
      ]
    },
    {
      "cells": [
        "Female",
        "04/01/2000",
        "U.S.A",
        "Burke",
        "Virginia",
        "Hispanic/Latino",
        "American Indian/Alaskan Native",
        "Hispanic/Latino",
        "American Indian/Alaskan Native",
        "Hispanic/Latino",
        "American Indian/Alaskan Native",
        "7036875816",
        "1234 Street Address Road",
        "Burke",
        "Virginia",
        "22015",
        "Adrenal gland (adrenocortical carcinoma)",
        "18",
        "BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)",
        "Positive",
        "Adrenocortical Carcinoma",
        "Aunt (mom\u0027s sister)",
        "Inova Fairfax Hospital",
        "USA",
        "Fairfax",
        "Virginia",
        "Thelma",
        "11/01/1967",
        "18",
        "No",
        "James",
        "Aunt (mom’s sister)",
        "BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)",
        "Positive",
        "Web Search",
        "No",
        "No",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.write("2020-11-16 16:58:52: Screenshot: ");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.write("2020-11-16 16:59:04: Screenshot: ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("2020-11-16 16:59:07: Screenshot: ");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.the_probands_selects_on_screener_to_submit_a_screener()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.selects_to_filling_questionnaire_out_for_someone_else(String)"
});
formatter.write("2020-11-16 16:59:20: Screenshot: ");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out all Demographic Information \"Female\", \"04/01/2000\", \"U.S.A\",\"Burke\", \"Virginia\" \"Hispanic/Latino\", \"American Indian/Alaskan Native\", \"Hispanic/Latino\", \"American Indian/Alaskan Native\", \"Hispanic/Latino\", \"American Indian/Alaskan Native\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.fills_out_all_Demographic_Information(String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.write("2020-11-16 16:59:40: Screenshot: ");
formatter.embedding("image/png", "embedded4.png");
formatter.write("2020-11-16 16:59:56: Screenshot: ");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills out all Contact Information with \"7036875816\", \"1234 Street Address Road\", \"Burke\", \"Virginia\", \"22015\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.fills_out_all_Contact_Information_with(String,String,String,String,String)"
});
formatter.write("2020-11-16 17:00:06: Screenshot: ");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.on_the_Personal_Cancer_History_section_selects_to_a_physician_diagnosing_the_research_participant_with_cancer(String)"
});
formatter.write("2020-11-16 17:00:15: Screenshot: ");
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds Personal Cancer information \"Adrenal gland (adrenocortical carcinoma)\", \"18\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.adds_Personal_Cancer_information(String,String)"
});
formatter.write("2020-11-16 17:00:26: Screenshot: ");
formatter.embedding("image/png", "embedded8.png");
formatter.write("2020-11-16 17:00:31: Screenshot: ");
formatter.embedding("image/png", "embedded9.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.on_the_Personal_Genetic_Tests_sections_selects_to_being_genetically_tested_for_inherited_cancer_syndromes(String)"
});
formatter.write("2020-11-16 17:00:38: Screenshot: ");
formatter.embedding("image/png", "embedded10.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)\", \"Positive\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.adds_Personal_Genetic_Tests_information(String,String)"
});
formatter.write("2020-11-16 17:00:49: Screenshot: ");
formatter.embedding("image/png", "embedded11.png");
formatter.write("2020-11-16 17:00:54: Screenshot: ");
formatter.embedding("image/png", "embedded12.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.on_Family_Members_Cancer_History_selects_to_having_any_biological_relatives_being_diagnosed_with_cancer(String)"
});
formatter.write("2020-11-16 17:01:01: Screenshot: ");
formatter.embedding("image/png", "embedded13.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds Family Cancer information \"Adrenocortical Carcinoma\", \"Aunt (mom\u0027s sister)\", \"Inova Fairfax Hospital\", \"USA\", \"Fairfax\", \"Virginia\", \"Thelma\", \"11/01/1967\", \"18\", \"No\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.adds_Family_Cancer_information(String,String,String,String,String,String,String,String,String,String)"
});
formatter.write("2020-11-16 17:01:25: Screenshot: ");
formatter.embedding("image/png", "embedded14.png");
formatter.write("2020-11-16 17:01:28: Screenshot: ");
formatter.embedding("image/png", "embedded15.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.on_the_Family_Members_Genetic_Tests_selects_to_having_any_relatives_being_genetically_tested_for_inherited_cancer_syndromes(String)"
});
formatter.write("2020-11-16 17:01:36: Screenshot: ");
formatter.embedding("image/png", "embedded16.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"James\", \"Aunt (mom’s sister)\", \"BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)\", \"Positive\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.adds_Relatives_with_Genetic_Tests_information(String,String,String,String)"
});
formatter.write("2020-11-16 17:01:52: Screenshot: ");
formatter.embedding("image/png", "embedded17.png");
formatter.write("2020-11-16 17:01:56: Screenshot: ");
formatter.embedding("image/png", "embedded18.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"Web Search\", \"No\", \"No\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.on_the_Final_Information_section_selects_the_following_information(String,String,String,String)"
});
formatter.write("2020-11-16 17:02:12: Screenshot: ");
formatter.embedding("image/png", "embedded19.png");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.submits_the_Screener_Questionnaire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "test account is reset to be reused for next execution",
  "keyword": "And "
});
formatter.match({
  "location": "ProbandScreenerSubmissionSteps.test_account_is_reset_to_be_reused_for_next_execution()"
});
formatter.write("2020-11-16 17:02:32: Screenshot: ");
formatter.embedding("image/png", "embedded20.png");
formatter.write("2020-11-16 17:02:37: Screenshot: ");
formatter.embedding("image/png", "embedded21.png");
formatter.write("2020-11-16 17:02:44: Screenshot: ");
formatter.embedding("image/png", "embedded22.png");
formatter.write("2020-11-16 17:02:57: Screenshot: ");
formatter.embedding("image/png", "embedded23.png");
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: Delete\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NCI-02195279-ML\u0027, ip: \u0027fe80:0:0:0:1c28:1850:a065:c92d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002715.0.1\u0027\nDriver info: driver.version: unknown\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\n\tat com.nci.automation.web.CommonUtils.selectDropDownValue(CommonUtils.java:98)\n\tat ServiceNow.CHARMS.StepsImplementation.TestAccountResetImpl.deleteAccountFromCHARMSreferralsShowList(TestAccountResetImpl.java:45)\n\tat ServiceNow.CHARMS.StepsImplementation.ProbandScreenerSubmissionImpl.fullTestAccountReset(ProbandScreenerSubmissionImpl.java:616)\n\tat ServiceNow.CHARMS.Steps.ProbandScreenerSubmissionSteps.test_account_is_reset_to_be_reused_for_next_execution(ProbandScreenerSubmissionSteps.java:148)\n\tat ✽.test account is reset to be reused for next execution(file:src/test/java/ServiceNow/CHARMS/Features/ProbandScenarios.feature:28)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});