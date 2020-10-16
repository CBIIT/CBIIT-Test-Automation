$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CHARMS/Features/ProbandScenarios.feature");
formatter.feature({
  "name": "Proband Scenarios",
  "description": "  Description: This feature file contains Proband related scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Proband LFS Okta Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \"Clinical Genetics Branch\" page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "ProbandLoginSteps.the_page_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
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
  "name": "adds Relatives with Genetic Tests information \"\u003cRelativesName\u003e\", \"\u003cRelationshipToParticipant\u003e\", \"\u003cGenesSyndromesWithPositiveResults\u003e\", \"\u003cRelativesTestResult\u003e\"",
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
        "RelativesName",
        "RelationshipToParticipant",
        "GenesSyndromesWithPositiveResults",
        "RelativesTestResult",
        "HowDidYouHearAboutStudy",
        "hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy",
        "areRelativesReceivingCancerCare"
      ]
    },
    {
      "cells": [
        "Female",
        "04/01/2000",
        "U.S.A",
        "Burke",
        "VA",
        "Hispanic/Latino",
        "American Indian/Alaskan Native",
        "Hispanic/Latino",
        "American Indian/Alaskan Native",
        "Hispanic/Latino",
        "American Indian/Alaskan Native",
        "7036875816",
        "1234 Street Address Road",
        "Burke",
        "VA",
        "22015",
        "Adrenal gland (adrenocortical carcinoma)",
        "",
        "BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)",
        "Positive",
        "Adrenocortical Carcinoma",
        "Aunt (mom\u0027s sister)",
        "",
        "USA",
        "",
        "",
        "",
        "",
        "",
        "No",
        "",
        "Aunt (mom’s sister)",
        "BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)",
        "Positive",
        "Web Search",
        "No",
        "No"
      ]
    },
    {
      "cells": [
        "Male",
        "04/02/2000",
        "",
        "",
        "",
        "Not Hispanic/Latino",
        "Asian",
        "Not Hispanic/Latino",
        "Asian",
        "Not Hispanic/Latino",
        "Asian",
        "",
        "",
        "",
        "",
        "",
        "Breast cancer, Left breast",
        "",
        "MLH1, MSH2, MSH6, PMS2, EPCAM (Lynch syndrome)",
        "Negative",
        "Brain",
        "Aunt (dad\u0027s sister)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Yes",
        "",
        "Aunt (dad’s sister)",
        "MLH1, MSH2, MSH6, PMS2, EPCAM (Lynch syndrome)",
        "Negative",
        "Genetic Counselor",
        "Yes",
        "Don\u0027t Know"
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "Don\u0027t Know",
        "Black/African American",
        "Don\u0027t Know",
        "Black/African American",
        "Don\u0027t Know",
        "Black/African American",
        "",
        "",
        "",
        "",
        "",
        "Breast cancer, Right breast",
        "",
        "TP53 (Li-Fraumeni syndrome)",
        "Indeterminate",
        "Breast",
        "Brother (full)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Don\u0027t Know",
        "",
        "Brother (full)",
        "TP53 (Li-Fraumeni syndrome)",
        "Indeterminate",
        "Physician",
        "Don\u0027t Know",
        "Not answered"
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "Not answered",
        "Native Hawaiian/Other Pacific Islander",
        "Not answered",
        "Native Hawaiian/Other Pacific Islander",
        "Not answered",
        "Native Hawaiian/Other Pacific Islander",
        "",
        "",
        "",
        "",
        "",
        "Brain cancer",
        "",
        "PTEN (PTEN Hamartoma Tumor syndrome, Cowden syndrome)",
        "A variant of unknown significance",
        "Choroid Plexus Carcinoma",
        "Brother (half – mom)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Brother (half – mom)",
        "PTEN (PTEN Hamartoma Tumor syndrome, Cowden syndrome)",
        "A variant of unknown significance",
        "PI",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "White",
        "",
        "White",
        "",
        "White",
        "",
        "",
        "",
        "",
        "",
        "Bone cancer, Osteosarcoma",
        "",
        "Other genes/syndromes or Unsure",
        "",
        "Colon",
        "Brother (half – dad)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Brother (half – dad)",
        "Other genes/syndromes or Unsure",
        "",
        "Advertisement",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Bone cancer, Chrondrosarcoma",
        "",
        "",
        "",
        "Leukemia",
        "Cousin (mom’s side)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Cousin (mom’s side)",
        "",
        "",
        "Family Member",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Bone cancer, Ewing\u0027s sarcoma",
        "",
        "",
        "",
        "Lung",
        "Cousin (dad’s side)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Cousin (dad’s side)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Soft tissue sarcoma, Rhabdomyosarcoma",
        "",
        "",
        "",
        "Lymphoma",
        "Daughter",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Daughter",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Soft tissue sarcoma, Liposarcoma",
        "",
        "",
        "",
        "Melanoma",
        "Father",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Father",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Soft tissue sarcoma, Fibrosarcoma",
        "",
        "",
        "",
        "Osteosarcoma (bone)",
        "Granddaughter",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Granddaughter",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Soft tissue sarcoma, Leiomyosarcoma",
        "",
        "",
        "",
        "Ovarian",
        "Grandfather (mom’s dad)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Grandfather (mom’s dad)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Soft tissue sarcoma, Malignant Fibrous Histiocytoma",
        "",
        "",
        "",
        "Prostate",
        "Grandfather (dad’s dad)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Grandfather (dad’s dad)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Colon or rectal cancer",
        "",
        "",
        "",
        "Sarcoma",
        "Grandmother (mom’s mom)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Grandmother (mom’s mom)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Lung or bronchus cancer, Left lung or bronchus",
        "",
        "",
        "",
        "Stomach",
        "Grandmother (dad’s mom)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Grandmother (dad’s mom)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Lung or bronchus cancer, Right lung or bronchus",
        "",
        "",
        "",
        "Uterine/Endometrial",
        "Grandson",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Grandson",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Leukemia (blood cancer), AML",
        "",
        "",
        "",
        "Don\u0027t Know",
        "Mother",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Mother",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Leukemia (blood cancer), ALL",
        "",
        "",
        "",
        "Other",
        "Sister (full)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Sister (full)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Leukemia (blood cancer), CML",
        "",
        "",
        "",
        "",
        "Sister (half – mom)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Sister (half – mom)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Leukemia (blood cancer), CLL",
        "",
        "",
        "",
        "",
        "Sister (half – dad)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Sister (half – dad)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Bladder (urinary)",
        "",
        "",
        "",
        "",
        "Son",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Son",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Cervix",
        "",
        "",
        "",
        "",
        "Uncle (mom\u0027s brother)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Uncle (mom’s brother)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Choroid plexus carcinoma",
        "",
        "",
        "",
        "",
        "Uncle (dad’s brother)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Uncle (dad’s brother)",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Esophagus",
        "",
        "",
        "",
        "",
        "Other",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Head,neck,throat",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Hodgkin\u0027s lymphoma",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Kidney",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Liver",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Non-Hodgkin\u0027s lymphoma",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Ovary",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Pancreas",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Prostate",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Skin – basal or squamous cell carcinoma",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Skin – Melanoma",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Stomach (gastric)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Testicular",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Thyroid",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Other: Uterus (endometrial)",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
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
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"Female\", \"04/01/2000\", \"U.S.A\",\"Burke\", \"VA\" \"Hispanic/Latino\", \"American Indian/Alaskan Native\", \"Hispanic/Latino\", \"American Indian/Alaskan Native\", \"Hispanic/Latino\", \"American Indian/Alaskan Native\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"7036875816\", \"1234 Street Address Road\", \"Burke\", \"VA\", \"22015\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Adrenal gland (adrenocortical carcinoma)\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)\", \"Positive\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Adrenocortical Carcinoma\", \"Aunt (mom\u0027s sister)\", \"\", \"USA\", \"\", \"\", \"\", \"\", \"\", \"No\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Aunt (mom\u0027s sister)\", \"BRCA1, BRCA2 (Hereditary Breast and Ovarian Cancer syndrome)\", \"Positive\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"Web Search\", \"No\", \"No\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"Male\", \"04/02/2000\", \"\",\"\", \"\" \"Not Hispanic/Latino\", \"Asian\", \"Not Hispanic/Latino\", \"Asian\", \"Not Hispanic/Latino\", \"Asian\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Breast cancer, Left breast\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"MLH1, MSH2, MSH6, PMS2, EPCAM (Lynch syndrome)\", \"Negative\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Brain\", \"Aunt (dad\u0027s sister)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"Yes\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Aunt (dad\u0027s sister)\", \"MLH1, MSH2, MSH6, PMS2, EPCAM (Lynch syndrome)\", \"Negative\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"Genetic Counselor\", \"Yes\", \"Don\u0027t Know\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"Don\u0027t Know\", \"Black/African American\", \"Don\u0027t Know\", \"Black/African American\", \"Don\u0027t Know\", \"Black/African American\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Breast cancer, Right breast\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"TP53 (Li-Fraumeni syndrome)\", \"Indeterminate\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Breast\", \"Brother (full)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"Don\u0027t Know\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Brother (full)\", \"TP53 (Li-Fraumeni syndrome)\", \"Indeterminate\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"Physician\", \"Don\u0027t Know\", \"Not answered\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"Not answered\", \"Native Hawaiian/Other Pacific Islander\", \"Not answered\", \"Native Hawaiian/Other Pacific Islander\", \"Not answered\", \"Native Hawaiian/Other Pacific Islander\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Brain cancer\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"PTEN (PTEN Hamartoma Tumor syndrome, Cowden syndrome)\", \"A variant of unknown significance\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Choroid Plexus Carcinoma\", \"Brother (half – mom)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Brother (half – mom)\", \"PTEN (PTEN Hamartoma Tumor syndrome, Cowden syndrome)\", \"A variant of unknown significance\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"PI\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"White\", \"\", \"White\", \"\", \"White\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Bone cancer, Osteosarcoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"Other genes/syndromes or Unsure\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Colon\", \"Brother (half – dad)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Brother (half – dad)\", \"Other genes/syndromes or Unsure\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"Advertisement\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Bone cancer, Chrondrosarcoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Leukemia\", \"Cousin (mom’s side)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Cousin (mom’s side)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"Family Member\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Bone cancer, Ewing\u0027s sarcoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Lung\", \"Cousin (dad’s side)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Cousin (dad’s side)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Soft tissue sarcoma, Rhabdomyosarcoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Lymphoma\", \"Daughter\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Daughter\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Soft tissue sarcoma, Liposarcoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Melanoma\", \"Father\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Father\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Soft tissue sarcoma, Fibrosarcoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Osteosarcoma (bone)\", \"Granddaughter\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Granddaughter\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Soft tissue sarcoma, Leiomyosarcoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Ovarian\", \"Grandfather (mom’s dad)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Grandfather (mom’s dad)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Soft tissue sarcoma, Malignant Fibrous Histiocytoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Prostate\", \"Grandfather (dad’s dad)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Grandfather (dad’s dad)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Colon or rectal cancer\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Sarcoma\", \"Grandmother (mom’s mom)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Grandmother (mom’s mom)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Lung or bronchus cancer, Left lung or bronchus\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Stomach\", \"Grandmother (dad’s mom)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Grandmother (dad’s mom)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Lung or bronchus cancer, Right lung or bronchus\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Uterine/Endometrial\", \"Grandson\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Grandson\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Leukemia (blood cancer), AML\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Don\u0027t Know\", \"Mother\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Mother\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Leukemia (blood cancer), ALL\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"Other\", \"Sister (full)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Sister (full)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Leukemia (blood cancer), CML\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"Sister (half – mom)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Sister (half – mom)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Leukemia (blood cancer), CLL\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"Sister (half – dad)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Sister (half – dad)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Bladder (urinary)\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"Son\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Son\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Cervix\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"Uncle (mom\u0027s brother)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Uncle (mom\u0027s brother)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Choroid plexus carcinoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"Uncle (dad’s brother)\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Uncle (dad’s brother)\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Esophagus\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"Other\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"Other\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Head,neck,throat\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Hodgkin\u0027s lymphoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Kidney\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Liver\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Non-Hodgkin\u0027s lymphoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Ovary\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Pancreas\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Prostate\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Skin – basal or squamous cell carcinoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Skin – Melanoma\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Stomach (gastric)\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Testicular\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Thyroid\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Proband Screener Submission - Executed with different sets of data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a Proband is on the CHARMS home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProbandLoginSteps.a_Proband_is_on_the_CHARMS_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Proband logs in with existing valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ProbandLoginSteps.the_Proband_logs_in_with_existing_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the probands selects on screener to submit a screener",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "selects \"No\" to filling questionnaire out for someone else",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Demographic Information \"\", \"\", \"\",\"\", \"\" \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills out all Contact Information with \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Cancer History section selects \"Yes\" to a physician diagnosing the research participant with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Cancer information \"Other: Uterus (endometrial)\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Personal Genetic Tests sections selects \"Yes\" to being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Personal Genetic Tests information \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on Family Members Cancer History selects \"Yes\" to having any biological relatives being diagnosed with cancer",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Family Cancer information \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Family Members Genetic Tests selects \"Yes\" to having any relatives being genetically tested for inherited cancer syndromes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "adds Relatives with Genetic Tests information \"\", \"\", \"\", \"\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "on the Final Information section selects the following information \"\", \"\", \"\", \"\u003cComments\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Submits the Screener Questionnaire",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});