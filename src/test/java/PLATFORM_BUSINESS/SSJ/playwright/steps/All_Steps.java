package PLATFORM_BUSINESS.SSJ.playwright.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import PLATFORM_BUSINESS.SSJ.playwright.stepsImplementation.ApplicantProfileStepsImpl;
import PLATFORM_BUSINESS.SSJ.playwright.utils.SSJ_Constants;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getSSJUrl;

public class All_Steps {


    @Given("a registered Okta SSJ user is on the SSJ Landing page")
    public void a_registered_okta_ssj_user_is_on_the_ssj_landing_page() {
        page.navigate(getSSJUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Given("logs in with Okta account username {string}")
    public void logs_in_with_okta_account_username(String text) {
        page.locator("//span[normalize-space()='Login']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//span[normalize-space()='Click here']").click();
        page.locator("//input[@autocomplete='username']").fill(text);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//input[@value='Next']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//input[@type='password']").fill(SSJ_Constants.OKTA_TEMP_PWD);
        page.locator("//input[@value='Verify']").click();
        page.waitForLoadState();
    }

    @Given("clicks on Vacancy {string}")
    public void clicks_on_vacancy(String vacancy) {
        page.locator("//a[normalize-space()='" + vacancy + "']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("selects two focus areas")
    public void selects_two_focus_areas() {
        page.waitForLoadState();
        page.locator("//div[@class='ant-select-selection-overflow']").click();
        page.locator("//div[@class='ant-select-item-option-content' and text()='Cancer Biology']").click();
        page.locator("//div[@class='ant-select-item-option-content' and text()='Cell Biology']").click();
        page.locator("//div[@class='ant-select-selection-overflow']").click();
    }

    @Then("if reference three is required then user enters Reference Three first name {string}")
    public void if_reference_three_is_required_then_user_enters_reference_three_first_name(String referenceThreeFirstName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[13]");
            page.locator("(//input[@placeholder='Please Enter'])[13]").fill(referenceThreeFirstName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("enters Reference Three middle name {string}")
    public void enters_reference_three_middle_name(String referenceThreeMiddleName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[14]");
            page.locator("(//input[@placeholder='Please Enter'])[14]").fill(referenceThreeMiddleName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("enters Reference Three last name {string}")
    public void enters_reference_three_last_name(String referenceThreeLastName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[15]");
            page.locator("(//input[@placeholder='Please Enter'])[15]").fill(referenceThreeLastName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("enters Reference Three email address {string}")
    public void enters_reference_three_email_address(String referenceThreeEmailAddress) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[16]");
            page.locator("(//input[@placeholder='Please Enter'])[16]").fill(referenceThreeEmailAddress);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("enters Reference Three phone number {string}")
    public void enters_reference_three_phone_number(String referenceThreePhoneNumber) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='(123) 456-7890'])[3]");
            page.locator("(//input[@placeholder='(123) 456-7890'])[3]").fill(referenceThreePhoneNumber);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("selects Reference Three relationship as Co-worker")
    public void selects_reference_three_relationship_as_co_worker() {
        try {
            page.locator("(//input[@role='combobox'])[3]").click();
            page.locator("(//input[@role='combobox'])[3]").focus();
            for (int i = 0; i < 1; i++) {
                page.keyboard().press("ArrowDown");
                page.waitForTimeout(200);
            }
            page.keyboard().press("Enter");
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("enters Reference Three position title {string}")
    public void enters_reference_three_position_title(String referenceThreePositionTitle) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[17]");
            page.locator("(//input[@placeholder='Please Enter'])[17]").fill(referenceThreePositionTitle);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("enters Reference Three organization name {string}")
    public void enters_reference_three_organization_name(String referenceThreeOrganizationName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[18]");
            page.locator("(//input[@placeholder='Please Enter'])[18]").fill(referenceThreeOrganizationName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE THREE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("clicks {string} for the Stadtman Scope Testing vacancy")
    public void clicks_for_the_stadtman_scope_testing_vacancy(String text) {
        CommonUtils.sleep(2000);
        ApplicantProfileStepsImpl.clicks(text);
    }
}
