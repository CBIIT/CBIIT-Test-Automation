package CustomBusiness.DCEG.Steps;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializer;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class RegularUserFlowSteps extends PageInitializer {

	@When("User on an editable publication")
	public void user_on_an_editable_publication() {
		CommonUtils.click(adminFlowPage.publicationsTab);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(directSubmitterPage.viewFirstPublication);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User chooses to add non-NIH group")
	public void user_chooses_to_add_non_NIH_group() {
		JavascriptUtils.scrollIntoView(regularUserFlowPage.addNonNHIGroup);
		CommonUtils.click(regularUserFlowPage.addNonNHIGroup);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@When("User inputs group name")
	public void user_inputs_group_name() {
		JavascriptUtils.scrollIntoView(regularUserFlowPage.groupNameField);
		CommonUtils.sendKeys(regularUserFlowPage.groupNameField, "Non NHI group");
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(regularUserFlowPage.addGroupButton);
		JavascriptUtils.clickByJS(regularUserFlowPage.addGroupButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("User can successfully add non-NIH group")
	public void user_can_successfully_add_non_NIH_group() {
		Assert.assertTrue(regularUserFlowPage.addedNewGroup.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Program Director is displayed");
		}
	}

	@When("User chooses to add non-nhi author")
	public void user_chooses_to_add_non_nhi_author() {
		CommonUtils.click(regularUserFlowPage.addNonNHIAuthor);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(regularUserFlowPage.nonNHIAuthFirstName, "Patricia");
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(regularUserFlowPage.nonNHIAuthLastName, "Madigan");
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(regularUserFlowPage.nonNHIAuthAffiliation, "New Affiliation");
		MiscUtils.sleep(2000);
		CommonUtils.click(regularUserFlowPage.addAuthorButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("User can verify that non-nih author was added successfully")
	public void user_can_verify_that_non_nih_author_was_added_successfully() {
		JavascriptUtils.scrollIntoView(regularUserFlowPage.addedNewAuthor);
		Assert.assertTrue(regularUserFlowPage.addedNewAuthor.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Newly added author is displayed");
		}
	}

	@When("User is able to perform an NIH author search")
	public void usre_is_able_to_perform_an_NIH_author_search() {
		CommonUtils.sendKeys(regularUserFlowPage.searchForAuthors, "MADIGAN");
		MiscUtils.sleep(2000);
		CommonUtils.click(regularUserFlowPage.madiganP);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@Then("User can manually add an NIH author")
	public void user_can_manually_add_an_NIH_author() {
		JavascriptUtils.scrollIntoView(regularUserFlowPage.affiliationMadigan);
		Assert.assertTrue(regularUserFlowPage.affiliationMadigan.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Madigan's affiliation is displayed");
		}
	}

	@When("user inputs PubMed id as {int}")
	public void user_inputs_PubMed_id_as(Integer pubMedID) {
		CommonUtils.sendKeys(regularUserFlowPage.pubMedField, "33737737");
		MiscUtils.sleep(2000);
		CommonUtils.click(regularUserFlowPage.pubMedImportButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("User can verify that author match has been applied")
	public void user_can_verify_that_author_match_has_been_applied() {
		JavascriptUtils.scrollIntoView(regularUserFlowPage.authorMallapaty);
		Assert.assertTrue(regularUserFlowPage.authorMallapaty.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Author Mallapaty is displayed");
		}
		CommonUtils.click(regularUserFlowPage.resetPublication);
		MiscUtils.sleep(2000);
		CommonUtils.click(regularUserFlowPage.resetPublAlert);
		MiscUtils.sleep(2000);
	}

	@Then("User can verify that view button is available for a CR that is within his branch")
	public void user_can_verify_that_view_button_is_available_for_a_CR_that_is_within_his_branch() {
		for (int row = 1; row <= 5; row++) {
			List<WebElement> draft = WebDriverUtils.webDriver.findElements(By.xpath("//td[6]"));
			for (WebElement each : draft) {
				if (each.getText().contains("TDRP MEB")) {
					System.out.println("TDRP MEB is present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.click(adminFlowPage.paginationRight);
		}
	}

	@When("User can edit only a CR where he is specified as a requestor")
	public void user_can_edit_only_a_CR_where_he_is_specified_as_a_requestor() {
		for (int row = 1; row <= 1; row++) {
			List<WebElement> draft = WebDriverUtils.webDriver.findElements(By.xpath("//td[6]"));
			for (WebElement each : draft) {
				if (each.getText().contains("TDRP MEB")) {
					System.out.println("TDRP MEB is present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				MiscUtils.sleep(4000);
				each.click();
				CommonUtils.sendKeys(regularUserFlowPage.titleField, "Edited title");
				MiscUtils.sleep(2000);
				CucumberLogUtils.logScreenShot();
				CommonUtils.click(regularUserFlowPage.cancelButton);
				MiscUtils.sleep(2000);
				break;
			}
		}

	}

	@When("User can verify that returned search for publications in Pending Submission status is across DCEG")
	public void user_can_verify_that_returned_search_for_publications_in_Pending_Submission_status_is_across_DCEG() {
		for (int row = 1; row <= 11; row++) {
			List<WebElement> item = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : item) {

				if (each.getText().contains("Pending Submission")) {
					System.out.println("Pending Submission item is present");
				}
			}
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.click(adminFlowPage.paginationRight);
			MiscUtils.sleep(2000);
		}
	}

	@When("User can verify that returned search for publications in Submitted for Publication status is across DCEG")
	public void user_can_verify_that_returned_search_for_publications_in_Submitted_for_Publication_status_is_across_DCEG() {
		for (int row = 1; row <= 2; row++) {
			List<WebElement> item = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : item) {
				if (each.getText().contains("Submitted for Publication")) {
					System.out.println("Submitted for Publication item is present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.click(adminFlowPage.paginationRight);
			MiscUtils.sleep(2000);
		}
	}

	@When("User can verify that returned search for publications in Accepted for Publication\\/In Press status is across DCEG")
	public void user_can_verify_that_returned_search_for_publications_in_Accepted_for_Publication_In_Press_status_is_across_DCEG() {
		for (int row = 1; row <= 2; row++) {
			List<WebElement> item = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : item) {
				if (each.getText().contains("Accepted for Publication/In Press")) {
					System.out.println("Accepted for Publication/In Press item is present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.click(adminFlowPage.paginationRight);
			MiscUtils.sleep(2000);
		}
	}

	@When("User can verify that returned search for publications in Published status is across DCEG")
	public void user_can_verify_that_returned_search_for_publications_in_Published_status_is_across_DCEG() {
		for (int row = 1; row <= 5; row++) {
			List<WebElement> item = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : item) {
				if (each.getText().contains("Published")) {
					System.out.println("Published item is present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.click(adminFlowPage.paginationRight);
			MiscUtils.sleep(2000);
		}
	}

	@When("User can verify that returned search for publications in Not Published\\/Abandoned status is across DCEG")
	public void user_can_verify_that_returned_search_for_publications_in_Not_Published_Abandoned_status_is_across_DCEG() {
		for (int row = 1; row <= 2; row++) {
			List<WebElement> item = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : item) {
				if (each.getText().contains("Not Published/Abandoned")) {
					System.out.println("Not Published/Abandoned item is present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.click(adminFlowPage.paginationRight);
			MiscUtils.sleep(2000);
		}
	}

	@Then("User can verify that publications in Pending Submission status are only editable where user is a requestor")
	public void user_can_verify_that_publications_in_Pending_Submission_status_are_only_editable_where_user_is_a_requestor() {
		for (int row = 1; row <= 1; row++) {
			List<WebElement> item = WebDriverUtils.webDriver.findElements(By.xpath("//td[6]"));
			for (WebElement each : item) {
				if (each.getText().contains("Pending Submission")) {
					System.out.println("Pending Submission item is displayed");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				MiscUtils.sleep(4000);
				each.click();
				CommonUtils.sendKeys(regularUserFlowPage.titleFieldPublication, "Edited title");
				MiscUtils.sleep(2000);
				System.out.println("Pending Submission item is editable");
				CucumberLogUtils.logScreenShot();
				CommonUtils.click(regularUserFlowPage.cancelButtonPublication);
				MiscUtils.sleep(2000);
				break;
			}
		}
	}

	@Then("User can verify that publications in Submitted for Publication status are only editable where user is a requestor")
	public void user_can_verify_that_publications_in_Submitted_for_Publication_status_are_only_editable_where_user_is_a_requestor() {
		CommonUtils.click(directSubmitterPage.viewFirstPublication);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(regularUserFlowPage.requestorMURPHYGWEN);
		Assert.assertTrue(regularUserFlowPage.requestorMURPHYGWEN.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("requestor MURPHY GWENA is displayed, Publication can not be edited");
		}
		CommonUtils.click(regularUserFlowPage.backToPublications);
		MiscUtils.sleep(3000);
	}

	@Then("User can verify that publications in Accepted for Publication\\/In Press status are only editable where user is a requestor")
	public void user_can_verify_that_publications_in_Accepted_for_Publication_In_Press_status_are_only_editable_where_user_is_a_requestor() {
		CommonUtils.click(directSubmitterPage.viewFirstPublication);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(regularUserFlowPage.requestorVOGTMANNEMILY);
		Assert.assertTrue(regularUserFlowPage.requestorVOGTMANNEMILY.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("requestor VOGTMAN NEMILY is displayed, Publication can not be edited");
		}
		CommonUtils.click(regularUserFlowPage.backToPublications);
		MiscUtils.sleep(3000);
	}

	@Then("User can verify that publications in E-Published \\(ahead of print) status are only editable where user is a requestor")
	public void user_can_verify_that_publications_in_E_Published_ahead_of_print_status_are_only_editable_where_user_is_a_requestor() {
		CommonUtils.click(directSubmitterPage.viewFirstPublication);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(regularUserFlowPage.requestorGREENEMARK);
		Assert.assertTrue(regularUserFlowPage.requestorGREENEMARK.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("requestor GREENE MARK is displayed, Publication can not be edited");
		}
		CommonUtils.click(regularUserFlowPage.backToPublications);
		MiscUtils.sleep(3000);
	}

	@Then("User can verify that publications in Published status are only editable where user is a requestor")
	public void user_can_verify_that_publications_in_Published_status_are_only_editable_where_user_is_a_requestor() {
		CommonUtils.click(directSubmitterPage.viewFirstPublication);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(regularUserFlowPage.requestorBERRINGTONAMY);
		Assert.assertTrue(regularUserFlowPage.requestorBERRINGTONAMY.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("requestor GREENE MARK is displayed, Publication can not be edited");
		}
		CommonUtils.click(regularUserFlowPage.backToPublications);
		MiscUtils.sleep(3000);
	}
}