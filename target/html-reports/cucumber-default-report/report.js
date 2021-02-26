$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/SEER/Features/LandingPage.feature");
formatter.feature({
  "name": "SEER Data Access Landing Page Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Request Database Access text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \"Request Database Access\" text displays as",
  "keyword": "Then ",
  "doc_string": {
    "value": "Request Database Access\nTo request access to the SEER Incidence Databases, you will need to create a new SEER*Stat account by registering. For immediate access to the SEER Research Plus Databases, you will need to register with your eRA Commons credentials using the Institutional Account Login. If you do not have an eRA commons login and are not affiliated with an Institute, you will need to use the Non-Institutional Account, and will receive access to the SEER Research Database.\nIf you are affiliated with an Institute and have an institutional email account (.edu, .gov, .org), you must use your eRA Commons credentials to request the SEER data.\nExisting SEER*Stat account holders can upgrade access to the Research Plus Databases by logging in with your SEER*Stat Username and registered email address.\nOnly users who have already used this system to request a new, non-Institutional account can upgrade an existing account. All other users should follow steps to create a new account."
  }
});
formatter.match({
  "location": "SEERLandingPageSteps.the_text_displays_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Institutional Accounts, Non-Institutional Accounts, Existing SEER*Stat Account Holders text on landing page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "under \"Institutional Accounts\" the text displayed is",
  "keyword": "Then ",
  "doc_string": {
    "value": "Do you have an account affiliated with a research organization?\nExamples include: eRA commons login, NIH, HHS, etc."
  }
});
formatter.match({
  "location": "SEERLandingPageSteps.under_the_text_displayed_is(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the text displayed is \"* If you are unable to authenticate, please use the Non-institutional option.\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERLandingPageSteps.the_text_displayed_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "under \"Non-Institutional Accounts\", text displayed is",
  "keyword": "And ",
  "doc_string": {
    "value": "For all other accounts, please enter your email to continue.\nExamples include Google or Yahoo accounts."
  }
});
formatter.match({
  "location": "SEERLandingPageSteps.under_text_displayed_is(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "under \"Existing SEER*Stat Account Holders\" text displayed is \"Please enter your current SEER*Stat Username and the email address you used to request access to other databases.\" and \"Request SEER Research Plus Databases\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERLandingPageSteps.under_text_displayed_is_and(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/SEER/Features/SEERDataAccessRequestPage.feature");
formatter.feature({
  "name": "SEER Data Access Request Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Non-Institutional flow - Verifying SEER Data Access Request page contents and agreements for Non-Institutional flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a SEER User Registration has been successfully submitted",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.a_SEER_User_Registration_has_been_successfully_submitted()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_verifies_email_address_by_clicking_on_the_email_verification_link_that_is_sent_to_the_user_after_submitting_a_SEER_User_registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is directed to the \u0027SEER Data Access Request\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_directed_to_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027Requested for\u0027 field contains the name of the requestor in read-only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_field_contains_the_name_of_the_requestor_in_read_only_format(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027Database type\u0027 field displays with \u0027SEER Research Database\u0027 in read-only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_field_displays_with_in_read_only_format(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user can select a general purpose for using the data",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_can_select_a_general_purpose_for_using_the_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "before entering initials for \u0027Data Use Agreement Certification\u0027 the Initials text box displays with the users initials in read-only mode",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.before_entering_initials_for_the_Initials_text_box_displays_with_the_users_initials_in_read_only_mode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Data Use Agreement Certification text agreement displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_Data_Use_Agreement_Certification_text_agreement_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "before entering initials for \u0027Best Practice Assurance\u0027, the users initials display in read only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.before_entering_initials_for_the_users_initials_display_in_read_only_format(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Best Practice Assurance text displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_Best_Practice_Assurance_text_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when the user scrolls down each agreement",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_the_user_scrolls_down_each_agreement()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is able to enter intials",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_able_to_enter_intials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "SEER information is displayed on the bottom of the page as follows:",
  "keyword": "And ",
  "doc_string": {
    "value": "SEER is supported by the Surveillance Research Program (SRP) in NCI\u0027s Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics."
  }
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.seer_information_is_displayed_on_the_bottom_of_the_page_as_follows(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "after entering required information, the user is able to successfully submit the SEER Data Access Request form",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.after_entering_required_information_the_user_is_able_to_successfully_submit_the_SEER_Data_Access_Request_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/ServiceNow/SEER/Features/SEERUserRegistrationPage.feature");
formatter.feature({
  "name": "SEER User Registration Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Undergraduate or Graduate students get directed to landing page when selecting \u0027Undergraduate or Graduate Student\u0027 for \u0027Which of these best describe you?\u0027 on the SEER Registration Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enters an email address as \"test@mail.com\" and continues with the email verification for Non-Institutional Accounts",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_enters_an_email_address_as_and_continues_with_the_email_verification_for_Non_Institutional_Accounts(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "fills out the SEER Registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_the_SEER_Registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "for \u0027Which of these best describe you?\u0027 selects \u0027Undergraduate or Graduate Student\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.for_selects(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is directed back to the landing page with a message indicating the user must request access via the Institutional Accounts option",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_is_directed_back_to_the_landing_page_with_a_message_indicating_the_user_must_request_access_via_the_Institutional_Accounts_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Sate and Zip code fields are required when selecting United States of America for Country field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user proceeds with email verification for a Non-Institutional Account",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.user_proceeds_with_email_verification_for_a_Non_Institutional_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "entering required information",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.entering_required_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "entering and selecting \"United States of America\" for Country field",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.entering_and_selecting_for_Country_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "submitting the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submitting_the_registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is not able to submit the registration form because the State and Zip Code fields are required",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_is_not_able_to_submit_the_registration_form_because_the_State_and_Zip_Code_fields_are_required()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying \"Thank you - your registration is complete.\" page contents",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enters an email address for Non-Institutional Account",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_enters_an_email_address_for_Non_Institutional_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "fills out all required fields on SEER Data registration page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_all_required_fields_on_SEER_Data_registration_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "submits the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submits_the_registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \"Thank you - your registration is complete.\" page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_page_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the page header displays as \"SEER Incidence Database details\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_page_header_displays_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the following text also displays",
  "keyword": "And ",
  "doc_string": {
    "value": "Thank you - your registration is complete.\nYou will recieve a confirmation email with more instructions momentarily.\nOnce the email address you have submitted has been verified you can login and complete the Data Access Request form.\n\nWhat to expect when completing the data access request form:\nThe electronic Data Access Request form requires a brief description of your intended use of the data (based on the type of data being requested). You will also be required to review and agree to the Data Use Agreement (DUA).\nYou will also be required to review and agree to the Best Practices for Securing NCI-supported Registry Data.\nOnce your access is approved, you will receive a username and password for accessing the data through SEER*Stat Software.\nNote for continued or new data release access: Your access will be restricted on April 30th of each year in preparation for the release of updated data. You will need to re-apply for access to the updated database starting April 1st.\n← Back to SEER Database details"
  }
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_following_text_also_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u003c- Back to SEER Database details button displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_Back_to_SEER_Database_details_button_displays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the following SEER information text displays on the bottom of the page",
  "keyword": "And ",
  "doc_string": {
    "value": "SEER is supported by the Surveillance Research Program (SRP) in NCI\u0027s Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics."
  }
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_following_SEER_information_text_displays_on_the_bottom_of_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying \u0027SEER Incidence Database\u0027 bread crumb directs user to https://seer.cancer.gov/data/",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter an email address for a Non-Institutional Account",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_user_enter_an_email_address_for_a_Non_Institutional_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the \u0027SEER User Registration\u0027 page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_on_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "fills out all required fields on the SEER Data registration page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_all_required_fields_on_the_SEER_Data_registration_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "submits the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submits_the_registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is directed to the \u0027Thank you - your registration is complete.\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_is_directed_to_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user confirms their email address by clicking on the email verifation link sent to the users email address",
  "keyword": "When "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_confirms_their_email_address_by_clicking_on_the_email_verifation_link_sent_to_the_users_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is directed to \u0027SEER Data Access Request\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_directed_to_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user has to select a general purpose for using the data",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_has_to_select_a_general_purpose_for_using_the_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "also has to agree by typing initials to the Data Use Agreement Certification and Best Practice Assurance",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.also_has_to_agree_by_typing_initials_to_the_Data_Use_Agreement_Certification_and_Best_Practice_Assurance()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "successfully submitting the SEER Data Request form",
  "keyword": "When "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.successfully_submitting_the_SEER_Data_Request_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the page \u0027Thank you - your data access request is complete.\u0027 displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_page_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying bread crumbs on \"Thank you - your registration is complete.\" page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@juarezds"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:61)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the SEER Data Access landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERLandingPageSteps.a_user_is_on_the_SEER_Data_Access_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters email address for a Non-Institutional Account",
  "keyword": "When "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.user_enters_email_address_for_a_Non_Institutional_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "fills out all required fields on SEER Data registration page",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.fills_out_all_required_fields_on_SEER_Data_registration_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "submits the registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.submits_the_registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is directed to the \u0027Thank you - your registration is complete.\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_is_directed_to_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the following breadcrumbs are displayed \"Home\", \"SEER Data \u0026 Software\", \"SEER Incidence Database\", \"Request SEER Incidence Data\", \"Submission Confirmation\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERUserRegistrationPageSteps.the_following_breadcrumbs_are_displayed(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027SEER Incidence Database\u0027 bread crumb displays",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_bread_crumb_displays(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when clicking, user is directed to \"https://seer.cancer.gov/data/\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_clicking_user_is_directed_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});