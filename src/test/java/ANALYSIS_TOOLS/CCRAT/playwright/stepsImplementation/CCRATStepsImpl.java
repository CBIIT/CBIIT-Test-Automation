package ANALYSIS_TOOLS.CCRAT.playwright.stepsImplementation;

import ANALYSIS_TOOLS.CCRAT.playwright.pages.CCRATPage;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CCRATStepsImpl extends PageInitializer {

    /**
     * Clicking on link and verifying the title of it
     */
    public static void clickAndAssertLink(String locator, String title){
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(locator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(title);
        PlaywrightUtils.page.goBack();
    }

    /**
     * Clicking on the colorectal cancer link
     */
    public static void checkColorectalCancerLink() {
        clickAndAssertLink("Colorectal Cancer-Health Professional Version", "Colorectal Cancer—Health Professional Version - NCI");
    }

    /**
     * Clicking on the test to detect colorectal cancer link
     */
    public static void checkTestToDetectColorectalCancerLink() {
        clickAndAssertLink("Tests to Detect Colorectal Cancer and Polyps", "Screening Tests to Detect Colorectal Cancer and Polyps - NCI");
    }

    /**
     * Validating that selected fields are unselected now
     */
    public static void verifyFieldsAreUnselected() {
        boolean isSelected = PlaywrightUtils.page.isChecked("//form//section//div//input[@id='hispanicNo']/..//div//span");
        Assert.assertFalse(isSelected);
    }

    /**
     * Entering all the required details to do the risk calculation
     */
    public static void entersMandatoryDetails() {
        PlaywrightUtils.page.locator(CCRATPage.selectingHispanic).click();
        PlaywrightUtils.page.locator("//div[normalize-space()='White']//span[@class='removeOutline']").click();
        PlaywrightUtils.page.locator("//select[@id='age']").selectOption("45");
        PlaywrightUtils.page.locator("//div[@id='femaleFocus']//span[@class='removeOutline']").click();
        PlaywrightUtils.page.locator("//input[@id='height_ft']").fill("5");
        PlaywrightUtils.page.locator("//input[@id='height_in']").fill("10");
        PlaywrightUtils.page.locator("//input[@id='weight']").fill("60");
        PlaywrightUtils.page.locator("//select[@id='veg_servings']").selectOption("None");
        PlaywrightUtils.page.locator("//select[@id='moderate_months']").selectOption("0");
        PlaywrightUtils.page.locator("//select[@id='vigorous_months']").selectOption("0");
        PlaywrightUtils.page.locator("//div[@aria-labelledby='exam']//div[@role='radio'][normalize-space()='No']//span[@class='removeOutline']").click();
        PlaywrightUtils.page.locator("//div[@aria-labelledby='aspirin']//div[@role='radio'][normalize-space()='No']//span[@class='removeOutline']").click();
        PlaywrightUtils.page.locator("//div[@aria-labelledby='medications']//div[@role='radio'][normalize-space()='No']//span[@class='removeOutline']").click();
        PlaywrightUtils.page.locator("//div[@class='female spaceBetweenQuestions removeOutline show']//div[@class='responseOptions spaceBetweenFirstQuestionAndResponse removeOutline']//span[@class='removeOutline']").click();
        PlaywrightUtils.page.locator("//div[@aria-labelledby='family_cancer']//div[@role='radio'][normalize-space()='No']//span[@class='removeOutline']").click();
    }
}