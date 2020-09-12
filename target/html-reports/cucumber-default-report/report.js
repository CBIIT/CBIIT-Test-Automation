$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature");
formatter.feature({
  "name": "COVIDCode Follow Up Form Scenarios",
  "description": "Description: This feature file contains scenarios related to the Follow Up Form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Follow Up Form - Verifying \u0027Drug Treatments\u0027 section - Service Portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sprint8"
    },
    {
      "name": "@COVID-116"
    },
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a COVIDCode provider is on the Disease Course section on the Follow Up Form",
  "keyword": "When "
});
formatter.match({
  "location": "FollowUpFormSteps.a_COVIDCode_provider_is_on_the_Disease_Course_section_on_the_Follow_Up_Form()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat java.base/java.io.Reader.\u003cinit\u003e(Reader.java:167)\n\tat java.base/java.io.InputStreamReader.\u003cinit\u003e(InputStreamReader.java:109)\n\tat org.apache.commons.io.IOUtils.copy(IOUtils.java:2440)\n\tat org.apache.commons.io.IOUtils.toString(IOUtils.java:1084)\n\tat org.apache.commons.io.IOUtils.toString(IOUtils.java:1064)\n\tat com.nci.automation.xml.JDomXmlUtils.getXMLContentFromResourcePath(JDomXmlUtils.java:77)\n\tat com.nci.automation.xml.JDomXmlUtils.getValueByXpathFromResourcePath(JDomXmlUtils.java:53)\n\tat com.nci.automation.web.EnvUtils.getConfigValue(EnvUtils.java:136)\n\tat com.nci.automation.web.EnvUtils.getApplicationUrl(EnvUtils.java:23)\n\tat ServiceNow.COVIDCode.StepsImplementation.FollowUpFormPageImpl.accessingFollowUpForm(FollowUpFormPageImpl.java:19)\n\tat ServiceNow.COVIDCode.Steps.FollowUpFormSteps.a_COVIDCode_provider_is_on_the_Disease_Course_section_on_the_Follow_Up_Form(FollowUpFormSteps.java:232)\n\tat ✽.a COVIDCode provider is on the Disease Course section on the Follow Up Form(file:src/test/java/ServiceNow/COVIDCode/Features/FollowUpForm.feature:71)\n",
  "status": "failed"
});
formatter.step({
  "name": "\"Drug Treatments\" section should display along with the values \"None\", \"Azithromycin\", \"Chloroquine\", \"Corticosteroids\", \"Hydroxycholoquine\", \"JAK Inhibitor\", \"Remdesivir\", \"Tocilizumab\", \"Other\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FollowUpFormSteps.section_should_display_along_with_the_values(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});