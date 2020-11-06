$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/CICDBuild/Features/ESR.feature");
formatter.feature({
  "name": "ESR Automated Build Deployment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "CICD DevOps Application Automated Build Deployment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ESR_Application_Build"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.AssertionError: 2020-11-06 11:09:02: FAIL: Unsupported browser in localConf.properties file! Browser has to be \u0027ie\u0027 or \u0027firefox\u0027 or \u0027phantomjs\u0027\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat com.nci.automation.utils.CucumberLogUtils.logFail(CucumberLogUtils.java:124)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:98)\n\tat ServiceNow.CICDBuild.Steps.HooksSteps.genericSetUp(HooksSteps.java:35)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:377)\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:138)\n\tat org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:465)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:451)\n",
  "status": "failed"
});
formatter.step({
  "name": "login to the CICD_Dev_Ops application in Native View is successful with username \"DevOpsUsername\" and password \"DevOpsPassword\"",
  "keyword": "Given "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.login_to_the_CICD_Dev_Ops_application_in_Native_View_is_successful_with_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "selecting the \"esr\" application",
  "keyword": "When "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_the_application(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "selecting \"Application\" as the deployment type",
  "keyword": "And "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.selecting_as_the_deployment_type(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "build is able to be executed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DevOpsApplicationBuildSteps.build_is_able_to_be_executed_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});