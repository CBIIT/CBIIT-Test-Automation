package AnalysisTools.FORGEdb.playwright.StepsImplementation;

import AnalysisTools.FORGEdb.playwright.Pages.FORGEdbPage;
import AnalysisTools.FORGEdb.playwright.Utils.FORGEdb_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class FORGEdbStepsImpl extends PageInitializer {

    /**
     * CLICK HOME TAB IN FORGEEDB
     */
    public static void clickHomeTabInForgedb() {
        PlaywrightUtils.page.locator(FORGEdbPage.homeTabElement).click();
        CommonUtils.sleep(2000);
    }

    /**
     * CLICK FORGE2 LINK AND THEN CLICK RUN BUTTON
     */
    public static void clickForge2LinkAndRunButton() {
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(FORGEdbPage.forge2LinkLocator)).getByRole(AriaRole.LINK).click();});
        CommonUtils.sleep(2000);
        assertThat(newPage1).hasTitle(FORGEdb_Constants.FORGEDB2_TITLE);
        newPage1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(FORGEdbPage.runButton)).click();
        CommonUtils.sleep(10000);
        assertThat(newPage1.locator("thead")).containsText(FORGEdbPage.runningText);
        CommonUtils.sleep(55000);
        try {
            String str = newPage1.locator("#col3_content").textContent();
            SoftAssert soft = new SoftAssert();
            soft.assertEquals(str, FORGEdbPage.doneText);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        newPage1.close();
    }

    /**
     * CLICK NCI LINK AND THEN VERIFY IT
     */
    public static void clickNCILinkAndVerify() {
        Page page8 = PlaywrightUtils.page.waitForPopup(() -> {
            PlaywrightUtils.page.locator("li").filter(new Locator.FilterOptions().setHasText(FORGEdbPage.nci)).getByRole(AriaRole.LINK).click();
        });
        CommonUtils.sleep(2000);
        assertThat(page8).hasTitle(FORGEdb_Constants.NCI_PAGE_TITLE);page8.close();
    }

    public static String  baseUrlDataset;
    public static String  baseUrlVersionedDataset;
    public static String  baseUrlVersionedDatasetForAnRSID;

    /**
     * SETTING REST HELP CLASS BASE URL
     */
    public static void setApiBaseUrlForAllVersionedDataset() {
        baseUrlDataset = "https://forgedb-qa.cancer.gov/api/datasets.json";
    }

    /**
     * VERIFY THE RESPONSE IS 200
     */
    public static void verifyAPIResponseForAllVersionedDataset() {
        RestAssured.baseURI = baseUrlDataset;
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    /**
     * SETTING REST HELP CLASS BASE URL
     */
    public static void setBaseUrlForADataSet() {
        baseUrlVersionedDataset = "https://forgedb-qa.cancer.gov/api/closest_gene/v1.0/schema.json";
    }

    /**
     * VERIFY THE RESPONSE IS 200
     */
    public static void verifyAPIResponseForADataset() {
        RestAssured.baseURI = baseUrlVersionedDataset;
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    /**
     * SETTING REST HELP CLASS BASE URL
     */
    public static void setBaseUrlForAVersionedDataSetForAnRSID() {
        baseUrlVersionedDatasetForAnRSID = "https://forgedb-qa.cancer.gov/api/closest_gene/v1.0/rs12203592.json";
    }

    /**
     * VERIFY THE RESPONSE IS 200
     */
    public static void verifyAPIResponseForAVersionedDataSetForAnRSID() {
        RestAssured.baseURI = baseUrlVersionedDatasetForAnRSID;
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}